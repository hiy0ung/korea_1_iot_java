package chapter04;

// 클래스 생성 (Book, Person, ...)
// : 속성 2개
// : 메서드 1개

class Book {
	// 속성
	String title;
	String author;

	// 메서드
	void bookInfo() {
		System.out.println("책의 제목은 " + title + "이고, 저자는 " + author + "입니다.");
	}

	// 생성자 함수
	// : new 연산자 사용시 호출될 메서드
	// >> 생략 시 속성의 기본값이 할당
	// 일반 타입: int(0), boolean(false), char("")
	// 참조 타입: null
	
	// >> 생략 시 클래스명과 동일하면서 매개변수가 없는 메서드가 됨
	
	Book(String title, String author) { // 매개변수로 받은 데이터로 속성 초기화
		// this 생성자 -> 클래스 속성과 매개변수로 받는 값의 이름이 같을 때 구분
		// this.클래스속성 = 매개변수명;
		this.title = title; // 매개변수로 받아온 값을 Book 클래스 속성에 할당해서 초기화 시켜줘야함 (우항 ~ 좌항)
		this.author = author;
	}
}

public class Object04 {
	public static void main(String[] args) {

		// 위에서 정의한 클래스를 사용하여 객체 인스턴스화
		Book Book1 = new Book("해리포터", "조앤 롤링");
		Book Book2 = new Book("신데렐라", "몰루");

		// 속성 출력
		System.out.println(Book1.title);
		System.out.println(Book1.author);
		
		System.out.println(Book2.title);
		System.out.println(Book2.author);

		// 메서드 호출
		Book1.bookInfo();
		Book2.bookInfo();
		
		Book2.title = "백설공주"; // 속성값 변경
		System.out.println(Book2.title); // 백설공주
	}
}
