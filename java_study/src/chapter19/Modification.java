package chapter19;
/*
	람다(Lambda)
	1. 하나의 추상 메서드를 정의하고 있는 인터페이스에서 사용
	2. 매개벼수 타입 생략 가능
	3. 매개변수가 하나면 () 괄호 생략 가능
	4. 다른 명령 구현 없이 바로 리턴 시 {} 괄호 생략 & return 키워드 생략 가능
*/

@FunctionalInterface
// : 해당 인터페이스가 함수형 인터페이스임을 명시적으로 작성

// cf) 함수형 인터페이스
// : 하나의 추상 메서드만 가지는 인터페이스
public interface Modification<T> {
	// 메서드
	// : 반환타입 메서드명(매개변수);
	T modify(T oldData, T newData); // 추상 메서드 (구현부 X)
	
	// T: 반환타입
	// modify: 메서드명
	// (T oldData, T newData): 반환 타입 T를 가지는 매개변수들
	
//	void example(); 
	// >> @FunctionalInterface 어노테이션 사용으로 (함수형 인터페이스임을 명시)
	//	  해당 인터페이스 내부에는 반드시! 단 한 개의 추상 메서드만을 포함해야함!
}
