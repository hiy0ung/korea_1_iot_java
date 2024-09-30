package example;

class Parent {
    int x = 100;
    
    // 빈 생성자
    Parent() {
        this(500);
    }
    
    // 사용자 정의 생성자
    Parent(int x) {
        this.x = x;
    }
 
    int getX() {
        return x;
    }
}

/*
	main 메서드 있다고 가정
	Parent p1 = new Parent(); // 빈 생성자 호출
	>> Parent(500); 과 동일
	>> p1.x = 500
	
	Parent p2 = new Parent(300);
	>> p2.x = 300;
	
*/

class Child extends Parent {
    int x = 4000;
    
    // 빈 생성자
    Child() {
    	// super(); 생략 되어있음 >> x = 500
        this(5000);
    }
    // 사용자 정의 생성자
    Child(int x) {
    	// super(); 생략 되어있음
        this.x = x;
    }
    
//    @Override
//    int getX() {
//    	return x;
//    }
}
 
public class SuperThis {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.getX()); // 500 - getX() 는 부모 클래스에 있음, 그래서 부모 클래스의 값이 호출 (부모 클래스로 이동한다고 보면 됨) 
        System.out.println(obj.x); // 5000
    }
}