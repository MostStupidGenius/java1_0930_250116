package day04.loopWhile;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
//		do-while문
//		같은 while문이긴 한데, 조건식을 검사하고 진입하는 시점이 조금 다르다.
//		do{반복실행할 코드}while(조건식); // 세미콜론; 잊지 말 것
//		코드 블록의 내용을 조건식의 결과와 무관하게
//		★최초 1회는 반드시 실행한다.
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 0);
		System.out.println(i);
		// 예상? 0 1
		// 결과: 0 1

		System.out.println("===dowhile용도===");
//		do-while문의 용도
//		주로 값을 입력받을 때, 입력된 값을 검사할 때 사용한다.
		Scanner sc = new Scanner(System.in);

		// 입력된 값을 담을 변수
		int inputNum = 0;

		do {
//			입력 안내
			System.out.print("1~4 정수 입력:");
			inputNum = sc.nextInt();
			
			if(inputNum == 1 || inputNum == 0) {
				System.out.println("0 또는 1을 입력하셨군요.");
				continue;
				// 코드 흐름이 continue나 break를 만난 순간
				// 해당 예약어 아래쪽의 일반코드는 무시되고 흐름이 다른 곳으로
				// 이동한다.
				// 아래의 코드를 unreachable code, 도달할 수 없는 코드라 부른다.
//				System.out.println("실행되지 않을 코드");
			}
			System.out.println("값을 확인합니다.");
			
			// 입력받은 값이 1보다 크거나 4보다 작다면
			// 잘못 입력한 것이므로, 다시 입력받기 위해
			// 반복조건으로 설정한다.
		} while (inputNum < 1 || inputNum > 4);

		// do-while문 탈출 후 입력값 출력
		System.out.println(inputNum);

	}

}
