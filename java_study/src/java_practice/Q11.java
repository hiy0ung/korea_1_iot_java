package java_practice;

class Student {
	String name;
	static int count = 0;
	
	public Student(String name) {
		this.name = name;
		count++;
	}
	public void stdName() {
		System.out.println("이름: " + name);
	}
	
	public static void stdCount() {
		System.out.println("전체 학생 수: " + count);
	}
}

public class Q11 {
	public static void main(String[] args) {
		Student std1 = new Student("선하영");
		std1.stdName();
		std1.stdCount();
		
		Student std2 = new Student("홍길동");
		std2.stdName();
		std2.stdCount();
	}
}
