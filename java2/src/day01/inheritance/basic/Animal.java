package day01.inheritance.basic;

public class Animal {
	// 부모 클래스 Animal 정의
	// 이 클래스를 상속받을 자식 클래스를 위해
	// 기본적인 필드와 메서드를 정의해둔다.
	
	// 부모 클래스를 만드는 계기
	// 1. 처음부터 부모 클래스를 만들고 자식클래스가 상속받게
	// 하는 경우-> 하향식
	
	// 2. 클래스를 여러 개 만들었는데, 만들고 보니
	// 공통된 특성이 보여 이 특성을 추출해
	// 새로운 부모 클래스를 만들어서 여러 클래스들이
	// 상속받게 만든다. -> 상향식
	
	private String name;
	private int age;
	
	public void sound() {
		System.out.println("동물은 목으로 소리내어 운다.");
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	// 접근 제어자 protected
	// default와 동일하게 같은 패키지 내의 클래스만
	// 접근 가능하지만
	// 추가로 상속받은 자식 클래스들도 접근이 가능한
	// 접근 제어자이다.
	protected void setAge(int age) {
		this.age = age;
	}
	
}
