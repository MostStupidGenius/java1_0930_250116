package day01.inheritance.basic;

public class Dog extends Animal { 
	// 상속은 extends를 사용하여 그 위에 부모클래스 이름을 적는다.
	
	// Animal 클래스를 부모 클래스로 하여 상속받는
	// 자식 클래스 Dog
	
	
	public static void main(String[] args) {
		// 자식 클래스 객체화
		Dog baduki = new Dog();
		baduki.setName("바둑이");
		baduki.setAge(12);
		System.out.println(baduki.getAge());
		
//		System.out.println(baduki.age);
		// not visible 컴파일 오류로 실행 불가
		// - 접근 제어자를 protected 이상으로 바꾸거나
		// - getter를 사용하라는 안내가 나온다.
		
		
		
		
		
		
		
		
	}
}
