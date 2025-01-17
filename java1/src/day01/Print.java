package day01;

public class Print {

	public static void main(String[] args) {
//		출력문
//		1. .print()
//		소괄호() 안에 전달한 하나의 값을
//		콘솔창에 출력하여 보여주는 기능
//		반드시 값을 소괄호()안에 넣어주어야 한다.
		System.out.print("Hello World\n");
		System.out.print("Hello World");
		System.out.print("Hello World");
		
//		줄바꿈 문자: \n
//		문자열 내에 작성하여 개행, 줄바꿈을 실행하는
//		일종의 명령어
		
//		2. 줄바꿈이 포함된 print
//		.println()
//		syso -> ctrl + space 자동완성 지원
//		값을 전달하지 않고 사용하면 줄바꿈만 실행한다.
		System.out.println(); // 줄바꿈만 추가
//		전달된 값을 출력한 뒤, 자동으로 줄바꿈 하나를 추가한다
		System.out.println("한줄 출력 후 줄바꿈1");
		System.out.println("한줄 출력 후 줄바꿈2");
		
//		3. 서식문자를 사용해 출력 
//		printf
//		서식문자로 문자열 내의 특정 위치에 값을 삽입하는
//		방식으로 출력할 문자열을 동적으로 구성할 수 있는
//		출력문
//		서식문자의 종류
//		%d	: 정수형
//		%f	: 실수형
//		%c	: 문자형
//		%s	: 문자열
//		%o, %x: 8진수 정수, 16진수 정수
		System.out.printf("num: %d\n", 3);
		
		
		String name = "이준상";
		int age = 33;
		double height = 179.9;
		
		System.out.printf(""
				+ "제 이름은 %s이고,\n" 	// %s는 문자열
				+ "나이는 %d살\n"			// %d는 정수형
				+ "키는 %.1fcm입니다.\n"		// %f는 실수형
				+ "", name, age, height);
	}

}
