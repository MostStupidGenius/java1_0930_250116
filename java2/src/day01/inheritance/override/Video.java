package day01.inheritance.override;

public class Video {
	// 부모 클래스
	// 메서드로 재생하는 기능의 play() 메서드를 정의한다.
	// 자식 클래스에서는 play 메서드를 재정의(override)할 것이다.
	
	public void play() {
		System.out.println("비디오를 실행합니다.");
	}
	
	public void stop() {
		System.out.println("비디오 실행을 중단합니다.");
	}
	
}
