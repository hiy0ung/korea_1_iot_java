package chapter05;

// 음식점 클래스
// : 다양한 방법으로 주문을 받는 메서드 정의
class Restaurant {
	// 메서드 정의
	// : placeOrder 주문 메서드
	// >> 메뉴 이름(String dish)
	// >> 메뉴 이름, 수량 제공(int quantity)
	// >> 메뉴 이름, 특별 요청 사항 제공 (String specialRequests)
	// >> 메뉴 이름, 수량 제공, 특별 요청 사항 제공
	// >> 각 메서드에서 매개변수의 데이터값을 출력
	
	void placeOrder(String dish) {
		System.out.println(dish); 
	}
	void placeOrder(String dish, int quantity) { 
		System.out.println(dish + ", " + quantity + "개"); 
	}
	void placeOrder(String dish, String specialRequests) { 
		System.out.println(dish + ", " + specialRequests);
	}
	void placeOrder(String dish, int quantity, String specialRequests) { 
		System.out.println(dish + ", " + quantity + "개, " + specialRequests); 
	}
}

public class Overloading02 {
	public static void main(String[] args) {
		// 인스턴스 생성
		Restaurant order = new Restaurant();
		
		order.placeOrder("스파게티");
		order.placeOrder("스파게티", 2);
		order.placeOrder("스파게티", "포크 1개 더");
		order.placeOrder("스파게티", 2, "포크 1개 더");
	}
}
