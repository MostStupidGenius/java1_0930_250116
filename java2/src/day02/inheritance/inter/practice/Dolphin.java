package day02.inheritance.inter.practice;

public class Dolphin extends Mammal implements Swim {
	
	@Override
	public void info() {
		super.info();
		System.out.println("돌고래는 포유류지만 지느러미가 달려있습니다.");
	}
	
	@Override
	public void swimming() {
		System.out.println("돌고래는 바다에서 생활합니다.");
	}

	@Override
	public void eat(String food) {
		System.out.println("물고기를 먹습니다.");
	}

}
