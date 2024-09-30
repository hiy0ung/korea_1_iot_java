package java_practice;

class Person {
	String name;
	int age;
	
	void personInfo(String name, int age) {
		System.out.println("이름은 " + name + " 나이는 " + age + "살입니다.");
	}
}

public class Q8 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.personInfo("선하영", 20);
		
	}
}
