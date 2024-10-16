package example;
/*
	1. 클래스
	- 객체를 생성하기 위한 틀
	- 필드(객체의 속성), 메서드(객체의 행동)을 정의함
	
	* 기본구조
		접근제한자 class 클래스명 {
			필드, 생성자, 메서드
		}
		
		
	2. 객체
	- 클래스에 정의된 필드와 메서드를 가진 실체
	- 객체 생성의 과정을 인스턴스화라고 함
	- 실제로 데이터를 메모리에 할당
	
	* 기본 구조
		클래스명 객체명 = new 클래스명(매개변수1, 매개변수2, ...);
	
	
	3. 필드
	- 클래스에 선언된 변수
	- 객체의 속성을 의미
	
	* 기본 구조
		접근제어자 타입 필드명;
	
	
	4. 메서드
	- 클래스 내에서 객체의 행동을 정의하는 함수
	- return 키워드를 통해 값을 반환
	- void 타입의 메서드의 경우 return 값 X
	
	* 기본 구조
		접근제한자 반환타입 메서드명(매개변수1, 매개변수2, ...) {
			코드
			- return 값 작성 
			- void 타입은 return 값 X
		}
	
	
	5. 생성자
	- 클래스명과 동일한 이름을 가진 메서드
	- 객체 생성될 때 호출되는 메서드
	- 객체의 필드를 초기화
	- 반드시 클래스명과 같아야 함
	
	* 기본구조
		접근제한자 클래스명(매개변수1, 매개변수2, ...) {
			코드 
			클래스 필드명(속성)과 매개변수명이 같을 때
			-> this 키워드 사용 
		}


	6. 인스턴스
	- 특정 클래스에서 만들어지는 실체
	- 객체와 거의 유사한 개념 (객체가 조금 더 넓은 범위...?)
	
	* 기본 구조
		클래스명 객체명 = new 클래스명(매개변수1, 매개변수2, ...);
*/

// 클래스 생성
class Student {
	// 필드를 정의
	String name;
	String major;
	int age, student_number;
	
	// 생성자를 정의
	public Student(String name, String major, int age, int student_number) {
		// 필드명과 매개변수명이 같을 때 구분을 위해 this 키워드를 사용
		this.name = name;
		this.major = major;
		this.age = age;
		this.student_number = student_number;
	}
	
	// 메서드를 정의
	public void Info() {
		// 반환값이 없는 void 타입으로 정의
		System.out.println("이름: " + name);
		System.out.println("전공: " + major);
		System.out.println("나이: " + age);
		System.out.println("학번: " + student_number);
	}
}

public class Main {
	public static void main(String[] args) {
		// Student 클래스의 객체 생성 (인스턴스화)
		// student1, student2는 객체의 인스턴스 변수
		Student student1 = new Student("선하영", "컴퓨터", 20, 202401);
		Student student2 = new Student("김자바", "국어국문", 24, 202105);
		
		// 메서드 사용 (메서드 호출)
		student1.Info();
		student2.Info();
		
		// 객체의 필드(속성)값 변경
		student1.major = "전기전자";
		
		// 변경된 정보 호출 
		student1.Info();
	}
}
