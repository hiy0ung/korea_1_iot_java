package chapter20.reservation;

import chapter20.reservation.controller.ReservationController;

/*
	1. 프로젝트 개요
	
	온라인 예약 시스템
	
	1) 기능
	- 사용자 관리: 사용자 등록, 로그인, 로그아웃 기능
	- 예약 관리: 사용자가 특정 시간에 예약할 수 있는 기능
	- 예약 확인: 사용자가 자신의 예약 내역을 확인 할 수 있는 기능
	- 예약 취소: 사용자가 예약을 취소할 수 있는 기능
	
	2) 시스템 구성 요소
	- 모델: 사용자, 예약 정보 클래스
	- 서비스: 예약 관련 비즈니스 로직 처리
	- 컨트롤러: 사용자 요청을 처리하고 응답하는 역할
	- 저장소(리포지토리): 데이터 처리에 사용, 데이터베이스와의 상호작용
	
	3) 프로젝트 구조
	model
	- User / Reservation
	service
	- UserService / ReserationService
	controller
	- ReservationController
	repository
	- UserRepository / ReservationRepository
	
*/
public class Main {
	public static void main(String[] args) {
		ReservationController controller = new ReservationController();
		controller.run();
	}
}
