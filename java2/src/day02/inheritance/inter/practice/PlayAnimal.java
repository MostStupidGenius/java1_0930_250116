package day02.inheritance.inter.practice;

public class PlayAnimal {

	public static void main(String[] args) {
//		Cat c = new Cat();
//		Bat b = new Bat();
//		Dolphin d = new Dolphin();
		Walk[] walkers = new Walk[] { new Cat(), // walking, swimming
				new Bat(), // walking, flying
		};

		for (Walk walk : walkers) {
			// instanceof를 이용하여
			// 각각의 일반 클래스 타입을 가지고 있는지
			// 검사하여 그 기능을 쓰도록 하려고 한다.
			if (walk instanceof Cat) {
				Cat tempCat = (Cat) walk;
				tempCat.walking();
			} else if (walk instanceof Bat) {
				Bat tempBat = (Bat) walk;
				tempBat.flying();
			}

		}

	}

}
