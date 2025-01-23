package day05.multiarray;

import java.util.Scanner;

public class MultiForTask {

	public static void main(String[] args) {
//		이중for문 실습
//		문제
//		구구단을 이중for문으로 출력해보자.
//		1. 2단부터 9단까지 1곱부터 9곱을 각각 출력
//		2. 각 단이 시작할 때, "===2단==="과 같이 출력
//		출력은 printf, println
//		"%d x %d = %d\n",
//		출력예시
//		===2단===
//		2 x 1 = 2
//		2 x 2 = 4
//		...
//		2 x 9 = 18
//		===3단===
//		3 x 1 = 3
//		도전과제1: 입력을 받아서 시작단을 설정, 9단까지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("시작단 입력: ");
		int danMin = sc.nextInt();
//		도전과제2: 시작단과 끝단까지 총 두 개의 정수를 입력받아서 구구단 출력
		System.out.print("끝단 입력: ");
		int danMax = sc.nextInt(); // 마지막 단을 담을 변수 선언 및 초기화
		int gopMin = 1;
		int gopMax = 9; // 마지막 곱을 담을 변수 선언 및 초기화
//		도전과제3: 두 개의 정수를 입력받아서 첫번째 숫자부터 두번째 숫자까지 증가/감소하는 구구단 출력
		boolean dogwa = true; // true -> 도전과제 코드 실행
		// false -> 반드시 min은 작은 값이어야 한다.

//		원본 for문
		if (!dogwa) { // 도전과제가 아닌 코드
			for (int dan = danMin; dan < danMax + 1; dan++) {
//				Enter를 입력할 때마다 다음 단 출력
//				sc.nextLine();

				System.out.println("===" + dan + "단===");
				for (int gop = gopMin; gop <= gopMax; gop++) {
//				System.out.println(dan + " x " + gop + " = " + (dan * gop));
					System.out.printf("%d x %d = %d\n", dan, gop, (dan * gop));
				}
			}
		} else {
//			도전과제3 for문
			// danMax가 danMin보다 클 때(정상 케이스) -> dan++
			// danMin이 danMax보다 클 때(역전 케이스) -> dan--
			// 삼항연산자가 아니라 그냥 비교 연산자만으로 충분하다.
			boolean isMaxBig = danMax >= danMin ? true : false;
			for (int dan = danMin; // 초기식
					isMaxBig ? dan <= danMax : dan >= danMax; // 조건식
					// 삼항연산자 입력 불가로,
					// 증감식은 for문 끝에 직접 작성
					) {
				// Enter를 입력할 때마다 다음 단 출력
				// sc.nextLine();

				System.out.println("===" + dan + "단===");
				for (int gop = gopMin; gop <= gopMax; gop++) {
					// System.out.println(dan + " x " + gop + " = " + (dan * gop));
					System.out.printf("%d x %d = %d\n", dan, gop, (dan * gop));
				}
				// 외부 for문 마지막에 증감식을 직접 작성
				// max가 정상적으로 크다면 1증가
				if (isMaxBig)
					dan++;
				// min이 크다면 1씩 감소
				else
					dan--;
			}
		}

	}

}
