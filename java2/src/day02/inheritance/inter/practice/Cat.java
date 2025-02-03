package day02.inheritance.inter.practice;

public class Cat extends Mammal implements Walk, Swim {

	@Override
	public void swimming() {
		System.out.println("일부 고양잇과 동물은 수영을 할 수 있습니다.");
	}

	@Override
	public void walking() {
		System.out.println("고양이는 네 발로 걷습니다.");
	}

	@Override
	public void eat(String food) {
		System.out.println("고양이는 생선과 일부 고기를 먹습니다.");
	}

}
