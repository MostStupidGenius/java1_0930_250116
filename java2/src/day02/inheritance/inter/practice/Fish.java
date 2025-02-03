package day02.inheritance.inter.practice;

public abstract class Fish extends Animal implements Swim{
	@Override
	public void info() {
		System.out.println("어류는 수상생물입니다.");
	}
	// Swim 인터페이스에서 상속받은
	// swimming 추상 메서드는, Fish 클래스를 상속받는
	// 일반 클래스에서 구현하도록 책임을 넘긴다.
}
