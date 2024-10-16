package chapter11;
/*
	이벤트 관리 시스템
	
	이벤트 참가자 명단 관리
	: 사전에 등록, 이벤트 당일에는 추가적인 참가자 등록 X
	>> ArrayList (목록 추가, 삭제 X / 참가자 조회 O)
	
	대기열 관리
	: 이벤트에는 한정된 좌석, 좌석이 모두 차면 추가 도착 참가자들은 대기열에 등록
	>> 위의 이벤트 참가자들이 퇴장하는 경우 입장 가능
	>> LinkedList (목록 추가, 삭제 O / 참가자 조회 X)
*/

import java.util.ArrayList;
import java.util.LinkedList;

class EventManagement {
	// 이벤트 참여자 명단
	ArrayList<String> participantList = new ArrayList<>();
	// 대기열 명단
	LinkedList<String> waitingQueue = new LinkedList<>();
	
	// 1. 참가자 명단에 참가자 추가
	void addParticipant(String name) {
		participantList.add(name);
	}
	
	// 2. 대기열에 참가자 추가
	void addToWaitingQueue(String name) {
		waitingQueue.add(name);
	}
	
	// 3. 참가자가 이벤트를 떠날 때
	// >> 대기열의 인원을 추가
	void leaveParticipant(String name) {
		// 대기열 요소의 수가 0보다 클 때 (명단이 존재할 때)
		if (waitingQueue.size() > 0) {
			String nextParicipant = waitingQueue.remove(0);
			addParticipant(nextParicipant);
		}
	}
	
	// 4. 특정 참가자 조회
	boolean checkParticipant(String name) {
		return participantList.contains(name);
	}
}

public class C_ListPractice {
	public static void main(String[] args) {
		EventManagement event = new EventManagement();
		
		// 참가자 명단에 참가자 추가
		event.addParticipant("이승아");
		event.addParticipant("이도경");
		event.addParticipant("이주헌");
		event.addParticipant("이지희");
		event.addParticipant("이지훈");
		
		// 대기열에 참가자 추가
		event.addToWaitingQueue("윤대휘");
		event.addToWaitingQueue("김소빈");
		event.addToWaitingQueue("정규민");
		
		System.out.println(event.participantList); // [이승아, 이도경, 이주헌, 이지희, 이지훈]
		System.out.println(event.waitingQueue); // [윤대휘, 김소빈, 정규민]
		
		// 참가자가 이벤트를 떠날 때
		event.leaveParticipant("이승아");
		System.out.println(event.participantList); // [이승아, 이도경, 이주헌, 이지희, 이지훈, 윤대휘]
		
		event.leaveParticipant("이주헌");
		System.out.println(event.participantList); // [이승아, 이도경, 이주헌, 이지희, 이지훈, 윤대휘, 김소빈]
		
		System.out.println(event.checkParticipant("이승아")); // true
		System.out.println(event.checkParticipant("윤대휘")); // true
		System.out.println(event.checkParticipant("정규민")); // false
	}
}
