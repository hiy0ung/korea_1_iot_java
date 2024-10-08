package chapter02;

import java.util.Scanner;

/*
  조건문
  : 프로그램의 흐름을 제어하는 데 사용

  종류
  1. if, else, else if
  2. switch, case, defalut
  +) continue, break
*/
public class A_If {
	public static void main(String[] args) {
		// 1. if문
		int age = 20;
		
		if (age > 19) {
			// 조건이 참일 때 실행될 코드
			System.out.println("성인입니다.");
		} else {
			// 조건이 거짓일 때 실행될 코드
			System.out.println("미성년자입니다.");
		}
		
		// cf) 실행될 코드 블록에 오는 코드가 하나의 구문이면 {} 생략 가능
		if (age > 19) System.out.println("성인");
		else if (age > 13) System.out.println("청소년");
		else System.out.println("어린이");
		
		/*
		  === 조건문 예제 ===
		 : 함수 위치 구하기 문제
		 1. 스캐너를 사용하여 x, y 변수에 데이터를 저장
		 2. x, y 좌표가 1, 2, 3, 4 사분기 중 어느 위치에 있는지 검사
		 >> 조건문
		 
		 각 분기의 위치일 경우 functionScope 변수에 몇 사분면인지 할당
		 EX) functionScope = "제1사분면"
		 
		 조건문 이행 완료 시 
		 "결과 :" + functionScope 출력
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x값 입력: ");
		int x = sc.nextInt();
		System.out.println("y값 입력: ");
		int y = sc.nextInt();
		
		String functionScope = null; // 참조 자료형이기 때문에 아무것도 할당하지 않으면 불안정
		
		// 중괄호 없이 사용 가능 (코드가 하나의 구문이기 때문에)
		if (x > 0 && y > 0) {
			functionScope = "제1사분면";
		} else if (x < 0 && y > 0) {
			functionScope = "제2사분면";
		} else if (x < 0 && y < 0) {
			functionScope = "제3사분면";
		} else {
			functionScope = "제4사분면";
		}
		System.out.println("결과: " + functionScope);
		
		sc.close();
	}
}
