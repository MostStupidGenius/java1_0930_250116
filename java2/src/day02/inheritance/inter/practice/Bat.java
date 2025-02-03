package day02.inheritance.inter.practice;

public class Bat extends Mammal implements Walk, Fly {
	
	@Override
	public void info() {
		super.info();
		System.out.println("박쥐는 포유류지만 날 수 있습니다.");
	}
	
	@Override
	public void flying() {
		System.out.println("박쥐는 피막날개로 날아다닙니다.");
	}

	@Override
	public void walking() {
		System.out.println("박쥐는 가끔 걸어다닙니다.");
	}

	@Override
	public void eat(String food) {
		System.out.println("벌레나 일부 동물을 잡아먹습니다.");
	}

}
