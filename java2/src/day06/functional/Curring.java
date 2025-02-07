package day06.functional;

public class Curring {

	String name;
	int age;

	public Curring(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	이 객체의 이름을 출력하고 자기자신 객체의 주소를 반환하는 메서드
//	이 메서드를 사용한 뒤에 다른 메서드를 연쇄적으로 사용할 수 있다.
	public Curring printName() {
		System.out.println("name: " + this.name);
		return this; // 자기 자신 객체를 반환
	}

	public Curring printAge() {
		System.out.println("age: " + this.age);
		return this; // 자기 자신 객체를 반환
	}

	public Curring printGreeting() {
		System.out.println("만나서 반갑습니다.");
		return this;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
//		커링 기법(Currying)
//		함수의 결과로 또다른 함수를 사용할 수 있게 하는 체이닝 기법으로
//		함수의 반환값으로 함수를 반환하여 그 함수의 기능을 연쇄적으로 사용하는 것을
//		가리킨다.
		
//		이러한 커링 기법을 클래스와 결합하려면 
//		return 타입을 해당 클래스 타입으로 하고
//		return 값을 this로 설정하면
//		메서드를 사용한 뒤, 해당 객체의 메서드들을
//		연쇄적으로 사용할 수 있다.
		Curring c = new Curring("홍길동", 30);

		c.printName()
		.printAge()
		.printGreeting();

	}

}
