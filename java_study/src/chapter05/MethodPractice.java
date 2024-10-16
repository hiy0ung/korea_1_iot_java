package chapter05;
/*
	인스턴스 변수
	선수 이름(name - 문자열)
	타율(battingAverage - 실수)
	홈런 수(homeRuns - 정수)
	
	정적(클래스) 변수
	: 생성된 선수의 총 인원(playerCount - 정수)
	>> 모든 인스턴스에서 공유
	
	생성자 >> 인스턴스 변수 초기화 & 정적 변수 후위 증가(변수명++)
	
	인스턴스 메서드
	선수의 타율과 홈런 수를 업데이트 하는 메서드
	>> 매개변수로 newBattingAverage, newHomeRuns를 받아 기존의 인스턴스 변수에 재할당
	
	야구 선수 3명의 객체 생성
	총 생성된 선수의 수를 출력
	>> 총 생성된 선수의 수: 3
*/

class BaseballPlayer {
	String name;
	double battingAverager;
	int homeRuns;
	
	static int playerCount;
	
	BaseballPlayer(String name, double battingAverager, int homeRuns) {
		// 인스턴스 변수 = 매개변수값;
		this.name = name;
		this.battingAverager = battingAverager;
		this.homeRuns = homeRuns;
		playerCount++; // 선수 생성 시 전체 수 증가
	}
	
	void update (double newBattingAverage, int newHomeRuns) {
		battingAverager = newBattingAverage;
		homeRuns = newHomeRuns;
	}
	
}

public class MethodPractice {
	public static void main(String[] args) {
		BaseballPlayer player1 = new BaseballPlayer("이대호", 0.325, 10);
		BaseballPlayer player2 = new BaseballPlayer("최동원", 0.212, 3);
		BaseballPlayer player3 = new BaseballPlayer("김태형", 0.294, 8);
		
		System.out.println("총 생성된 선수의 수: " + BaseballPlayer.playerCount);
		
	}
}
