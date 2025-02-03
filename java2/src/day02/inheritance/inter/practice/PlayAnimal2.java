package day02.inheritance.inter.practice;

public class PlayAnimal2 {

	public static void main(String[] args) {
		Mammal[] mams = new Mammal[] {
				new Cat(),
				new Bat(),
				new Dolphin(),
		};
		
		for (Mammal mammal : mams) {
			// 해당 포유류의 정보 출력
			mammal.info();
			if(mammal instanceof Fly) {
				Fly fly = (Fly)mammal;
				fly.flying();
			}
			
			if(mammal instanceof Walk) {
				Walk walk = (Walk)mammal;
				walk.walking();
			}
			
			if(mammal instanceof Swim) {
				Swim swim = (Swim)mammal;
				swim.swimming();
			}
			
			System.out.println("========");
		}
		
		
		
		
		
	}

}
