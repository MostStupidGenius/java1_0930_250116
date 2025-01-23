package day06.method;

public class MethodPractice {

//	메서드 선언 방법
//	기본형
//	public static void [메서드명](){}
	public static void myFirstMethod() { // 입력x 반환x
		System.out.println("메서드 호출하면 나오는 내용");
		return; // 아무 값도 반환(돌려주다)하지 않는다는 의미
	}

//	반환값이 있는 경우, void 대신 반환값의 타입을 명시적으로 작성해주어야 한다.
	public static String hasReturn() {
//		반환값이 정해져 있지 않다면 일단 void를 적어두고
//		어떤 로직을 만들지 결정한 다음에 바꿔도 무방하다.

//		이 메서드는 내 이름을 반환하는 역할을 한다.
		String name = "이준상";
//		반환하고자 하는 값이나 변수를 return 뒤에 적어준다.
		return name;
	}

//	입력값도 있고 출력값도 있는 함수
//	"성"과 "이름"을 받아서 한 사람의 풀네임 문자열을 반환하는
//	함수를 작성해보자.
//	메서드 명 뒤에 붙는 소괄호() 안은
//	메서드가 기능을 수행하는 데 필요한 외부의 정보를
//	임시로 담아서 사용할 변수를 선언하는 공간이다.
//	이러한 임시 변수를 매개변수(parameter)라고 부른다.
	public static String makeFullname(String lastName, String firstName) {
//		System.out.println(lastName + " " + firstName);
		String result = lastName + firstName;
		return result;
	}

	public static void main(String[] args) {
		myFirstMethod();
		String name = hasReturn();
		System.out.println(name);
		System.out.println("==========");
		makeFullname("이", "준상");

	}

}
