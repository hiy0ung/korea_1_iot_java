package chapter01;

public class E_Operation {
	public static void main(String[] args) {
		// 연산자
		System.out.println("=== 산술 연산자 ===");
		System.out.println(10 + 20); // 30
		System.out.println(10 - 20); // -10
		System.out.println(10 * 20); // 200
		System.out.println(21 / 10); // 2 >> 나눈 결과의 몫을 저장(정수값 출력)

		System.out.println(21 % 10); // 1 >> 나눈 결과의 나머지를 저장

		System.out.println("=== 증감 연산자 ===");
		int number = 10;
		System.out.println(number++); // 10 (+1) == 10
		System.out.println(++number); // (+1) 10 == 12
		System.out.println(++number); // (+1) 12 == 13
		System.out.println(number++); // 13 (+1) == 13
		System.out.println(number); // 14

		System.out.println("=== 대입 연산자 ===");
		int num = 10;
		System.out.println(num += 3); // 13
		System.out.println(num -= 3); // 10
		System.out.println(num *= 3); // 30
		System.out.println(num /= 3); // 10
		System.out.println(num %= 3); // 1

		System.out.println("=== 비교 연산자 ===");
		// : 좌항을 우항과 비교한 결과를 논리(true, false) 값으로 반환
		// ==, !=, <. >, <=, >=

		// cf) 자바는 일치에 대한 연산이 ==(equal 2개)로 작성됨

		System.out.println("=== 논리 연산자 ===");
		// : 논리값(boolean)을 연산

		// &&: and(논리곱)
		System.out.println(true && true); // true
		System.out.println(true && false); // false

		// ||: or(논리합)
		System.out.println(true || true); // true
		System.out.println(true || false); // true

		// !: not(부정논리)
		System.out.println(!true); // false
		System.out.println(!false); // true
		
		System.out.println("=======");
		System.out.println(3 > 2 && 1 == 1); // true
		System.out.println(1 !=  1); // false
		
		System.out.println("=== 조건 연산자 ===");
		// : 삼항 연산자
		System.out.println(3 > 2 ? 10 : 20); // 10
		
		int x = 10;
		int y = 2;
		System.out.println(x % y == 0 ? "2의 배수입니다." : "2의 배수가 아닙니다."); // 2의 배수입니다
		
		System.out.println();
		
		// Window >> Editor >> Toggle Word Wrap 클릭 (옆으로 넘어가는 거 자동 줄바꿈처리)
		// : alt + shift + y
		

	}
}
