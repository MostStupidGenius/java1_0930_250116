package day02.inheritance.inter.practice;

// 객체화가 불가능한 추상 클래스로 선언
public abstract class Animal {
	String name;
	int age;

	public void sleep() {
		System.out.println("동물은 잠을 잡니다.");
	}

	public abstract void eat(String food);

	public abstract void info();
	
	// 기획
	// 포유류, 어류, 조류
	// Mammal, Fish, Bird
	// 추상 클래스(Animal 상속받은)
	// 일반 클래스로 실제 동물 클래스 만들기(추상 클래스 상속받기)
	// 걷다, 수영하다, 날다
	// Walk, Swim, Fly
	// 인터페이스들을 만들고
	// 여러 동물마다 인터페이스를 상속받게 만든다

}
