package day06.classBasic;

public class Animal {
	
//	클래스 범위 안에 변수를 선언하면
//	이러한 변수들을 멤버변수, 인스턴스 변수 등으로 부른다.
//	멤버변수는 각 인스턴스마다 고유하게 존재하는 저장공간이 된다.
	String name;
	int age;
	
//	클래스를 객체화했을 때, 각 객체(인스턴스)가 사용할 수 있는 함수를
//	메서드라고 부른다.
//	이러한 메서드는 기본적으로 객체의 정보에 접근하여 그 값을 사용하거나
//	변경할 수 있다.
	public void printInfo() {
//		객체의 정보에 접근하려면 예약어 this를 사용해야 한다.
//		이 this는 사용하는 main메서드 쪽에서의 객체가 담긴 변수와 동일하다.
		System.out.println(this.name + "님의 나이는 " + this.age);
	}
	
	public static void main(String[] args) {
//		새로운 인스턴스를 만들기 위해서는 new 예약어를 앞에 붙여야 한다.
//		이렇게 만들어진 새로운 객체에 접근하려면
//		해당 객체를 변수에 담아서 써야 한다.
//		그 변수의 타입은 클래스 이름과 동일하게 설정하는 것이 기본이다.
		Animal ani = new Animal();
		
//		객체의 정보에 접근하려면 "하위접근연산자"인 마침표.를
//		객체 바로 뒤에 작성해야 하며,
//		마침표를 적어야 하위정보에 접근할 수 있다.
//		System.out.println();
		ani.age = 3;
		ani.name = "바둑이";
		System.out.println(ani.age);
		
//		객체가 사용하는 메서드
		ani.printInfo();
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
