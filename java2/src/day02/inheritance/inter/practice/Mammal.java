package day02.inheritance.inter.practice;

public abstract class Mammal extends Animal {
	// 추상 클래스 이상의 추상화된 것들은
	// 기본적으로 그대로 객체화가 불가능하기 때문에
	// 생성자도 불필요하다
	
//	public Mammal() {
//		System.out.println("포유류 생성자");
//	}
	
	// 포유류의 특징
	@Override
	public void info() {
		System.out.println("포유류는 젖먹이 동물입니다.");
	}

}
