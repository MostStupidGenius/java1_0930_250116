package day02.inheritance.polymorphism.instanceofOper;

public class InstanceofPractice {

	public static void main(String[] args) {
//		instanceof
//		클래스 타입 검사를 위한 연산자로
//		연산자 좌항에는 객체 주소가 담긴 참조 변수가 놓이고
//		우항에는 해당 객체가 가지고 있는지 검사하고자 하는
//		클래스명을 적어준다.
//		참조변수 instanceof 클래스명
		
		// Animal 부모 클래스로 업캐스팅된 객체 배열 선언 및 초기화
		Animal[] animals = new Animal[] {
				new Cat(),
				new Dog(),
				new Animal(),
				new Dog(),
				new Cat(),
				new Animal()
		};
		
		// 각 객체를 검사하기 위한 빠른 for문(foreach)
		for (Animal animal : animals) {
//			instanceof 연산자를 이용한 다운캐스팅과
//			해당 자식클래스의 메서드 사용
//			instanceof 연산자를 조건식으로 하는 조건문의 내부 공간에서는
//			해당 객체가 검사했던 그 클래스 타입으로 인식된다.
//			때문에 검사했던 자식클래스의 그 메서드를 사용할 수 있게 된다.
			
//			업캐스팅된 객체를 안정적으로 다운캐스팅하기 위해서는
//			instanceof 연산자가 필수적이다.
			if(animal instanceof Cat) {
				// 업캐스팅된 객체를 자식 클래스 타입으로
				// 다운캐스팅
				Cat tempcat = (Cat)animal;
				// 다운캐스팅을 해야 자식클래스에만 있는
				// 정보나 기능에 접근할 수 있다.
				tempcat.sound();
			} else if (animal instanceof Dog) {
				Dog tempdog = (Dog)animal;
				tempdog.bark();
			} else {
				System.out.println("Animal 타입입니다.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
