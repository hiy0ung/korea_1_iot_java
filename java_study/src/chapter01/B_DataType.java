package chapter01;

public class B_DataType {

	public static void main(String[] args) {
		// 데이터 타입 (자료형, Data Type)
		// : 자바는 강 타입 언어
		// >> 모든 변수 선언 시 반드시 데이터 타입을 명시!
		
//		1. 데이터 타입 종류
//		: 기본 타입
//		>> 변수 선언 시 해당되는 자료형의 크기 만큼 메모리 할당
//		>> 실질적인 데이터가 저장
		
//		: 참조 타입
//		>> 객체의 참조(메모리 주소)를 저장하는 변수 타입
		
//		2. 기본 자료형
//		: 총 8가지의 기본형 타입
		
//		byte(1), short(2), long(8), float(4),
//		int(4), double(8), char(2), boolean(1) ***
		
//		2-1. 숫자형 (나중에 쓰기)
		
		
		int age; // 변수 선언
		age = 30; // 변수 초기화
		
		int height = 169; // 변수 선언과 동시에 초기화
		
		// long 타입은 숫자 뒤에 알파벳 L, l을 써서 Long 형태임을 표시
		long bitNumber = 10000000000L;
		
		// 자동완성 단축키: ctrl + space
		System.out.println(age); // 30
		System.out.println(height); // 169
		
//		2-2. 문자형
//		char*: 하나의 문자를 저장하기 위한 변수를 선언할 때 사용
//		- 문자형의 데이터의 경우 따옴표를 사용해 감싸야함
//		- 2 바이트
//		>> 단일 문자 저장
		char grade = 'A';
		char lastName = '이';
		
//		2-3. 실수형(부동소수점 타입): 소수점 자리가 있는 수
//		float: 4바이트 소수점, 숫자 뒤에 알파벳 F를 써서 float형임을 표시
//		double*(기본): 8바이트 소수점. 기본 실수 타입 > 소수점을 파악하는데 정확도가 더 높음
		
		float weight1 = 70.123234345f;
		double weight2 = 35.123234345;
		
//		2-4. 논리형*: (나중에 쓰기)
		
		boolean isMarried = false;
		boolean isActived = true;
		
//		3. 참조 자료형
//		: 기본 자료형을 기초로 만들어진 자료형
//		>> 실제 데이터 값 X, 데이터가 저장된 주소값을 가지는 자료형
		
//		- 종류
//		>> String: 문자열을 저장하는 데 사용
//		>> Array: 배열을 저장하는데 사용
		String name = "이승아";
		int[] scores = {90, 80, 75};
		
	}

}
