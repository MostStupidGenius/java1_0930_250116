package day02.scanner;

import java.util.Scanner;

public class ScannerPratice {

	public static void main(String[] args) {
//		입력문
//		콘솔창을 통해서 직접 값을 입력하고자 할 때
//		사용하는 방법이다.
		Scanner sc = new Scanner(System.in);
//		ctrl + shift + o -> 임포트 정리
//		스캐너 호출하려면 해야 하는 것
//		단순히 Scanner라는 이름만으로 스캐너를
//		사용하기 위해서 import를 하는 것이다.
//		java.util.Scanner와 같이 쓰지 않고
//		Scanner라고 짧게 쓰기 위해서이다.
		
//		입력받기
//		모든 입력은 기본적으로 Enter를 입력 종료로 인식한다.
//		주의)
//		때문에 콘솔창에서 줄바꿈을 하려고 Enter를 치면
//		빈 문자열이 입력된다.
//		공백을 사용하면 공백을 기준으로 값이 분리되어
//		입력된다.
//		1. 정수형 입력받기
//		입력 안내 문구
		System.out.print("정수 입력: ");
		int inputNum = sc.nextInt();
		System.out.println("정수 출력");
		System.out.println(inputNum);
		
//		2. 실수형 입력받기
		System.out.print("실수 입력: ");
		double inputDouble = sc.nextDouble();
		System.out.println("실수출력");
		System.out.println(inputDouble);
		
//		3. 문자열 입력받기
//		3-1. 공백 혹은 줄바꿈(Enter)로 입력받기
//		.next()
//		공백을 사용하면 공백을 기준으로 값이 분리되어
//		입력된다.
		System.out.print("문자열 입력: ");
		String inputStr = sc.next();
		System.out.println(inputStr);
		
//		3-2.
//		.nextLine()
//		줄바꿈(Enter)만으로 입력을 받는 방식으로
//		공백문자도 문자열의 일부로써 입력 값에 포함시킨다.
//		주의) 이전에 next 계열을 사용하여
//		Enter로 입력했다면
//		마지막에 사용한 Enter가 nextLine()으로 전이되어
//		빈문자열이 입력된다.
//		next~랑 nextLine을 혼용할 땐 조심하자.
		sc.nextLine();
		System.out.print("입력: ");
		String inputText = sc.nextLine();
		System.out.println("출력합니다.");
		System.out.println(inputText);
	}

}
