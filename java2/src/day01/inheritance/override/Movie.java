package day01.inheritance.override;

public class Movie extends Video {
	
	// 생성자
	public Movie() {
		// 자식 클래스의 생성자는 직접 호출하지 않더라도
		// 부모 클래스의 기본생성자를 호출한다.(숨겨짐)
		// 부모 클래스의 생성자는 super()와 같은 형식으로 호출할 수 있다.
//		System.out.println();
		// Constructor call must be the first statement in a constructor
		super();
		
		// 이러한 부모 클래스의 생성자는 반드시 자식클래스 생성자의
		// 첫 줄에 작성해야 한다.
		// super()는 this()와 그 용법이 동일하다.
		// 단지 부모 클래스를 대상으로 할 뿐이다.
		
		// 만약 부모 클래스에 기본 생성자가 없다면
		// 자식 클래스의 생성자에서 명시적으로 다른 생성자를
		// 호출해야 한다.
		
	}

	@Override // 부모로부터 상속받은 메서드를 재정의함을
	// 컴퓨터에게 알려주는 역할 -> annotation
	public void play() { // 메서드의 시그니처 동일
		// 부모 클래스를 가리키는 대명사 -> super
		// 부모 클래스의 필드나 메서드에 접근하려면
		// super.으로 접근해야 한다.
		// this와 비슷한 방식으로 사용된다.
//		super.play(); // 부모 클래스의 play() 메서드를 사용
		
		// 부모 클래스의 메서드 대신에 재정의할 내용을 작성한다.
		System.out.println("영화관에서 영화를 시청한다.");
		
	}
	
//	@Override
//	public void stop() {
//		super.stop();
//	}
	
	public static void main(String[] args) {
		// Movie 클래스를 객체화
		Movie m = new Movie();
		
		// Moive 객체의 play() 메서드를 호출
		m.play(); // 재정의한 내용으로 실행
		
		// 재정의 하지 않은 부모 클래스의 메서드 그 자체
		m.stop();
		
		
		
		
		
		
	}
	
}
