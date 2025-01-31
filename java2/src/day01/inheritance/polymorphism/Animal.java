package day01.inheritance.polymorphism;

public class Animal {
	// 동물 클래스
	// 하위 클래스 -> Dog 클래스, Cat 클래스
	// 다형성
	// 부모 클래스를 상속받은 자식 클래스는
	// 부모 클래스의 타입 또한 가지고 있다는 의미로
	// 같은 부모 클래스를 상속받았다면 그 자식 클래스들을
	// 부모 클래스 타입으로 묶어서 관리할 수 있음을 의미한다.
	
	// 이때, 클래스 간의 형변환을 캐스팅이라고 하며
	// 그중 자식 -> 부모로 가는 캐스팅을 업캐스팅이라 부른다.
	// 반대로 부모 -> 자식으로 가는 캐스팅을 다운캐스팅이라 부르며
	// 반드시 업캐스팅이 선행되어야 한다.
	// -> 다운캐스팅의 목표가 되는 클래스 타입을
	// 보유한 객체여야 한다.
	
	public void walk() {
		System.out.println("발로 걷는다.");
	}
	
	public static void main(String[] args) {
		// 자식 객체를 생성
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		// 부모 클래스 타입의 배열로 담는다.
		Animal[] animals = new Animal[] {
				dog, cat
		};
		
		// Animal배열의 요소를 for문으로
		// 각 요소(객체)의 walk() 메서드 실행
		// 자식 클래스에서 재정의한 메서드는
		// 업캐스팅 되더라도 재정의한 대로 실행된다.
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			animal.walk();
		}
		
	}
}
