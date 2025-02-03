package day02.inheritance.inter;

// 인터페이스
// 클래스와 같은 계층으로, 가장 추상화된 형태이다.
// abstract 예약어를 붙이지 않아도 추상적인 것으로 인식된다.
// - 상수, 추상 메서드만 사용 가능하다.
// - 객체화가 불가능하다.
// - 클래스를 상속받는 것이 불가능하다.
// - 인터페이스만 상속받을 수 있다.
public interface Print {
	// 상수 선언 및 초기화
	// 상수는 한번 값이 정해지면 이후에 값을 변경할 수 없는
	// 저장공간이다.
	// 주로 옵션을 설정하거나 변하지 않는 값을 같은 이름으로
	// 사용하기 위해 쓰인다.
	public final int COUNT = 0;

	// 추상 메서드
	// 인터페이스에서는 메서드는 반드시 추상 메서드로만 선언이 가능하다.
	public abstract void print();
	public abstract void print(String text);
	public abstract void print(String text, int times);
	public abstract void print(String text, boolean enter);
	public abstract void print(String text, int times, boolean enter);

	// abstract 예약어와 static 예약어는 같이 사용할 수 없다.
	// why? static은 정의할 때에 그 내용이 있어야만
	// 프로그램 실행시에 메모리에 가장 먼저 올라가서
	// 사용될 준비를 할 수 있기 때문이다.
	// -> 내용이 구현되어있지 않은 static 메서드는
	// 사용할 수 없는 상태이기 때문에 static으로 메모리에 올릴 수가 없다.
//	public static abstract void printSt();

}
