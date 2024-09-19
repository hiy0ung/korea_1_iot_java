package chapter18.practice;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

// 주문 클래스
// 한 명의 고객(Customer)
// 여러 개의 제품(Prodeuct)

@Builder
@ToString
@Getter
public class Order {
	private final String orderId; // 주문 고유 번호
	private final Customer customer;
	private final List<Product> products;
	private final double totalPrice; // 제품 총 가격
	
	// 총 금액을 계산하는 메서드
	public static double calculateTotalPrice(List<Product> products) {
		// 리스트 프레임 워크 데이터를 순회하여 double 타입의 데이터로 반환
		return products.stream().mapToDouble(Product::getPrice).sum();
		
		// 자바스크립트 화살표 함수 == 자바에서 람다(Lambda)라고 부름?
		// (Product product) -> { product.getPrice() } 람다형식의매개변수 -> 람다형식의구현부
		// >> Product product -> product.getPrice() > product 중복
		// >>> Product::getPrice()
	}
}
