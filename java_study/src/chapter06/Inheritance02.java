package chapter06;
/*
	상속에서의 생성자
	: 상속받은 클래스에서 생성자 호출 순서
	>> 부모 - 자식 순서로 진행
	
	자식 클래스의 객체를 생성할 때, 자식 클래스는 자식 생성자를 통해 자식 객체를 생성
	자식 클래스의 생성자 호출 시 항상 부모 클래스 생성자를 호출
	>> 직접적으로 정의된 생성자 호출이 필요하지 X
*/

class Mammel {
	String name = "Parent";
	
	Mammel() {
		System.out.println("빈 부모 생성자 - 인스턴스 생성");
	}
	
	Mammel(String name) {
		// Mammel 클래스로 생성되는 각 객체 (this)
		this.name = name;
	}
	
	void displayMammal() {
		System.out.println(name); // 자식 클래스에서 super()로 name 할당 받은 값 그대로 들어감
	}
}

class Cat extends Mammel {
	String name = "Child";
	
	// super();
	// : 자식 클래스의 기본 생성자는 사용자 정의를 생성자가 없더라도
	// super() 부모 클래스 생성자 호출 키워드가 정의되어 있음(생략)
	
	Cat() {
		// super();가 생략되어있음 
		System.out.println("빈 자식 생성자");
	}
	
	Cat(String name) {
		// super()는 부모 클래스의 생성자를 가지고 오기 때문에
		// : 기본 생성자 또는 사용자 정의 생성자의 형태 그대로를 사용
		super(name); // 부모 클래스를 가리킴
		
//		this.name = name; // 자식 클래스를 가리킴
		System.out.println("자식 클래스가 생성되었습니다.");
	}
	
	// 인스턴스 메서드
	void greet() {
		// 해당 클래스가 가진 인스턴스 변수에 접근 this (생략 O)
		System.out.println("자식: " + this.name);
		
		// 부모 클래스가 가진 인스턴스 변수에 접근 super (생략 X)
		System.out.println("부모: " + super.name);
	}
}

public class Inheritance02 {
	public static void main(String[] args) {
		Cat voidCat = new Cat();
		Cat myCat = new Cat("coco");
		
		voidCat.greet(); // 자식: Child 부모: Parent
		myCat.greet(); // 자식: Child 부모: choco
		myCat.displayMammal(); // choco
	}
}
