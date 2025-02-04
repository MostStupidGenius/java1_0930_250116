package day03.basicAPI;

public class ObjectClassMethod {
	String name;
	int age;

	public ObjectClassMethod(String n, int a) {
		this.name = n;
		this.age = a;
	}

	// 모든 클래스는 어떤 방식으로든
	// Object 최상위 클래스를 상속받게 된다.
	// 이 Object 클래스에는 몇 가지 필수적인 메서드가
	// 정의되어 있다.
	// 이를 재정의하여 사용해보겠다.
	@Override
	public String toString() {
		// 호출 시 문자열을 반환하는 메서드
		// 출력문에서 객체를 직접 출력했을 때
		// 호출되는 메서드다.
//		return super.toString();
		return "name: " + this.name + "\n" + "age: " + this.age;
	}

	public static void main(String[] args) {
		ObjectClassMethod o = new ObjectClassMethod("홍길동", 20);
		// 객체 호출 시 toString()메서드가 호출된다.
		System.out.println(o); // 객체를 바로 출력

	}

}
