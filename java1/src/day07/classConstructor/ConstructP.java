package day07.classConstructor;

public class ConstructP {
	int num;
//	생성자(constructor)
//	생성자란, 클래스에서 객체를 생성할 때, 필요한 정보를 입력받고
//	객체를 생성하는 데 필요한 작업을 수행할 수 있게
//	그 내용을 미리 정의해놓은 특수한 메서드를 가리킨다.
//	생성자의 특징
//	- 메서드의 이름은 클래스의 이름과 동일하게 설정한다.
//	- return 타입은 기입하지 않는다.(void도 쓰지 않는다.)

//	기본 생성자
//	생성자를 정의한 적이 없다면 자바쪽에서 자동으로
//	아무것도 없는 기본 생성자를 자동으로 만들어준다.
	public ConstructP() {
		;
	}

//	오버로딩
//	메서드를 정의할 때, 같은 이름으로 메서드를 정의하는 것을 가리킨다.
//	이때, 같은 이름의 메서드라도
//	시그니처(매개변수의 개수, 종류, 순서)가 다르다면
//	서로 다른 메서드로 인식한다.
//	하지만 같은 이름을 공유하기 때문에 전달되는 값의 시그니처에 따라
//	자동으로 해당 시그니처를 가진 메서드를 선택해준다.

//	생성자 오버로딩
//	생성자도 메서드이기 때문에 같은 이름의 다른 시그니처로
//	여러 개의 생성자를 정의할 수 있다.
	public ConstructP(String name) {

	}

	public static void main(String[] args) {
		ConstructP cp = new ConstructP();
//		원시자료형(기본자료형)과 참조자료형의 차이
//		주소값

//		기본 자료형의 변수는 그 값 자체를 저장하고
//		변수를 사용했을 때 값을 복사하여 전달한다.

//		그런데 참조 자료형의 변수는, 값이 아니라 주소값을 저장하고
//		이 변수를 사용했을 때, 그 안에 담긴 값이 아닌 주소값을 전달한다.
//		이러한 주소값은 값이 위치한 정보를 가지고 있기 때문에
//		같은 주소값을 가진 변수들은 같은 위치를 "바라보게" 되고
//		한쪽에서 그 값을 변경했을 때, 다른 변수도 변경된 값을 볼 수 있게 된다.

//		기본 자료형
		int num1 = 3;

		// 기본 자료형은 값을 복사하여 전달한다.
		// 변수를 저장하는 것이 아니다.
		int num2 = num1;
		num1 = 31;
		System.out.println(num2); // 3

		// 참조 자료형(클래스 자료형)
		ConstructP cp1 = new ConstructP();
		cp1.num = 3;

		ConstructP cp2 = cp1;
		cp1.num = 31;

		System.out.println(cp2.num); // 31

	}

}
