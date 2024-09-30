package java_practice;

class Animal {
	
	public void act() {
		System.out.println("동물이 행동을 냅니다.");
	}
}

class Dog extends Animal {
	
	@Override
	public void act() {
		super.act();
	}
	
	public void move() {
		System.out.println("강아지가 움직입니다.");
	}
}

class Cat extends Animal {
	
	@Override
	public void act() {
		super.act();
	}
	
	public void move() {
		System.out.println("고양이가 움직입니다.");
	}
}


public class Q9 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.act();
		dog.move();
		
		Cat cat = new Cat();
		cat.act();
		cat.move();
	}
}
