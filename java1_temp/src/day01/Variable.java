package day01;

public class Variable {
	public static void main(String[] args) {
		// 주석(comment)
		// ctrl + / -> 커서가 있는 한 줄 주석으로 만들기
//		컴퓨터가 번역(컴파일)할 때 무시하고 넘어가는 부분으로
//		슬래시 두 번 뒤의 내용은 번역하지 않는다.
//		주석의 용도
//		1. 코드를 설명하기 위한 개발자간의 소통 내용을 적어놓을 때
//		2. 임시로 코드의 실행을 막고자 할 때
		
//		변수(variable)
//		값을 저장하는 저장공간
//		"이곳을 저장공간으로 만들고 이름을 붙이겠다"
//		-> 선언
//		선언은 공간을 미리 점유하는 신호다.
//		자료형 변수명;
		int num1; // num1이라는 int 자료형의 저장공간을 선언
//		값을 변수에 저장
//		값을 변수에 저장할 때에는
//		변수명 = 값; // 선언은 두 번 이상 하지 않는다.
//		값을 저장하는 것은 등호= 우측의 값을 복사하여
//		좌측의 저장공간에 넣는 것을 의미한다.
		num1 = 3;
		// 세미콜론;은 한줄의 코드를 마무리하겠다는 의미이다.
		
//		변수의 사용
//		출력문
//		syso -> ctrl + space
//		System.out.println();
		System.out.println(num1);
		
//		초기화(initialize)
//		변수의 선언과 동시에 값을 저장(할당)하는 것을 말한다.
		int num2 = 1; // int자료형 num2에 값 1을 저장한다.
		
//		syso -> ctrl + space
		System.out.println("Hello World");
		
		
		
	}
}
