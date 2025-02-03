package day02.inheritance.abstractKey;

// 추상 클래스로 바꾸기 위해서는
// 접근제어자 뒤에 abstract 예약어를 써주어야 한다.
// 추상 메서드가 없더라도 추상 클래스로 만들 수 있다. 
public abstract class AbstractClass {
	// 추상 메서드
	// 추상 메서드가 하나라도 있다면
	// 반드시 추상 클래스로 선언해야 한다.
	
	// abstract 예약어를 접근제어자 뒤에 붙여 추상 메서드로 선언할 수 있다.
	public abstract void abstPrint(String text);
	public abstract void abstPrint(String text, boolean enter);
	
	// 추상 메서드도 결국은 메서드이기 때문에
	// 시그니처가 다르다면 당연히 오버로딩도 가능하다.
	public void abstPrint(String text, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(text);
		}
	}
	
	// 일반 메서드
	public void print(String text) {
		System.out.println(text);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
