package chapter12;
/*
	MVC 패턴
	: 사용자 인터페이스를 설계하는 소프트웨어 디자인 패턴 중 하나
	: 세 가지 구성 요소로 나누어(역할을 분담하여) 개발을 진행

	Model(모델), Controller(컨트롤러), View(뷰)

	1. Model(모델)
	: 애플리케이션의 데이터와 비즈니스 로직을 담당
	: 데이터베이스, 파일 시스템, 외부 서비스와 통신을 통해 데이터를 저장하고 검색
	- 상태 변경에 대해 뷰와 컨트롤러에게 알릴 수 있는 메커니즘을 제공
	- 뷰와 컨트롤러의 구현 세부사항으로부터 독립적

	2. View(뷰)
	: 사용자에게 데이터를 표시하는 방법을 정의
	: Model의 정보를 표시, 사용자의 액션을 Controller에게 전달
	- 모델이 가진 정보를 사용자가 이해할 수 있는 형태로 변환

	3. Controller(컨트롤러)
	: 사용자의 입력을 처리하고 모델과 뷰 사이의 상호작용을 관리
	: 사용자의 입력에 반응하여 모델을 업데이트하고, 필요한 경우 뷰를 새롭게 출력(재렌더링)

	MVC 패턴의 장점
	- 관심사를 분리: 각 구성 요소는 독립적인 기능과 책임 > 코드의 관리와 확장이 용이
	- 유지보수의 용이성: 애플리케이션의 비즈니스 로직과 사용자 인터페이스가 분리되어 
					, 유지보수가 용이

	MVC 패턴의 단점
	- 복잡성 증가: 간단한 애플리케이션 구현에는 MVC 패턴의 구조가 복잡성을 증가
	- 학습 곡선 높음: 이해하고 사용하기 까지 일정한 학습

	MVC 패턴의 작동 원리
	V > C > M > C > V

	사용자 인터랙션: 뷰를 통해 상호작용
	컨트롤러 처리: 사용자의 행동이 컨트롤러로 전달
	모델 업데이트: 컨트롤러는 모델을 업데이트 하거나 조회하여 필요한 데이터를 얻음
	뷰 업데이트: 컨트롤러는 새로운 데이터와 함께 업데이트를 하라고 지시
	사용자에게 표시: 뷰는 업데이트 된 데이터를 표시

	Spring
	: 자바 기반 통합 웹 개발 프레임워크
	: Spring Boot(Spring MVC)
*/
public class MVC {
	/*
		도서 관리 시스템
		
		== 요구 사항 분석 ==
		1. 새 도서 추가
		2. 모든 도서 정보 출력
		3. 도서 검색 (도서 제목으로 검색)
		
		Model (도서 정보를 담당)
		: Book 클래스 (도서 정보 - 도서 제목, 저자, 출판사)
		
		View (사용자 인터페이스 UI를 담당)
		: BookView 클래스
		(사용자의 입력을 받아, Controller에게 전달 & Controller에서 받은 정보를 출력)
		
		Controller (사용자의 입력을 받아 Model과 View 사이에서 중재)
		: BookController 클래스
		(사용자의 입력에 따라 적절한 Model 메서드를 호출)
	*/ 
}
