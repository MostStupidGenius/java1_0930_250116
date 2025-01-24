package day07.classConstructor;

public class Person {
//	필드
//	객체마다 보유하는 변수들을 선언하는 곳
	String name;
	int age;

//	모든 객체와 언제 어디서든 접근할 수 있는 공유 변수
	static int index; // 생성된 객체의 개수를 셀 변수

//	스태틱 블록
//	객체 호출과 무관하게 최초 1회 실행되는 코드 블록이다.
	static {
		index = 0;
	}

//	인스턴스 블록
//	객체를 호출할 때마다 실행되는 코드 블록
//	생성자보다 먼저 실행된다.
//	때문에, 서로 다른 생성자를 호출하는 객체들에 대해서
//	공통적으로 실행할 내용을 작성해두는 공간이다.
	{
		index++;
	}

//	생성자
	public Person() {
		;
	}

	public Person(String inputName, int age) {
//		지역변수 inputName과 age의 값을
//		인스턴스 변수 this.name과 this.age로 전달
		this.name = inputName;
		this.age = age;
	}
	
	// 생성자를 통해 객체의 정보값을 세팅하면서
	// 출력하고 싶은 내용을 전달받아 출력하는 기능이 추가된 생성자
	public Person(String name, int age, String msg) {
		// 기존에 정의된 다른 생성자를 호출하면
		// 작성해야 할 코드가 줄어들고 생산성이 향상될 수 있다.
		// 다른 생성자를 호출하려면
		// this()를 사용해야 한다.
		this(name, age); // 기존에 정의된 다른 생성자를 호출
		
		// 이 생성자만의 고유한 내용 추가
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 30);
		Person p2 = new Person("고길동", 40);
		Person p3 = new Person("고길동", 40);
		Person p4 = new Person("고길동", 40);
		Person p5 = new Person("고길동", 40, "5번째로 만들어졌습니다.");

//		공유변수인 index의 값을 출력해보자.
//		static 변수는 클래스이름.변수명으로 접근할 수 있다.
		System.out.println(Person.index);
		p3.index++;
		System.out.println(Person.index);

	}

}
