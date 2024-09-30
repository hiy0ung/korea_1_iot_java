package java_practice;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public abstract int getSalary();
}

class Manager extends Employee {
	int bonus;
	
	public Manager(String name, int salary, int bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	@Override
	public int getSalary() {
		return salary + bonus;
	}
}

class Developer extends Employee{
	int bonus; 
	
	public Developer(String name, int bonus, int salary) {
		super(name, salary);
		this.bonus = bonus;
	}

	@Override 
	public int getSalary( ) {
		return salary + bonus;
	}
}

public class Q12 {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Manager("이승아", 5000, 1000));
		employees.add(new Developer("이도경", 50, 160));
		employees.add(new Manager("이지희", 6000, 1200));
		employees.add(new Developer("이지훈", 60, 170));
		
		for (Employee employee : employees) {
			System.out.println(employee.name + "의 급여: $" + employee.getSalary());
		}
	}
}
