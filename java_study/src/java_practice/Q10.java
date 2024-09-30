package java_practice;

class Person1 {
	private String name;
	protected int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void personInfo() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}

public class Q10 {
	public static void main(String[] args) {
		Person1 p1 = new Person1("선하영", 50);
		
		p1.personInfo();
	}
}
