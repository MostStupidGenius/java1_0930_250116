package day04.loopFor;

import java.util.Scanner;

public class ForTask {

	public static void main(String[] args) {
//		for문 실습
//		1. 구구단을 출력하려고 한다.
//		이때 몇 단을 출력할지 변수 dan을 선언하여 값을 대입하고
		int dan = 2;
//		2. for문을 이용해서 2부터 9까지의 곱을 출력하는 프로그램 작성
//		도전과제: Scanner이용 -> 단 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("단 수 입력: ");
		dan = sc.nextInt();

//		for(int i=0;i<9;i++) {
//			int gop = i+1; // i가 1부터 시작해야 하기 때문에 1 추가
//			// i 대신 곱할 값을 gop으로 처리
		for (int i = 1; i <= 9; i++) {
//			println 방식
//			System.out.println(dan + " x " + i + " = " + (dan * i));

//			printf 방식
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}

//		출력방법
//		1. .println()을 이용해서 값과 값을 더하는 방식
//		System.out.println(2 + " x " + 1)
//		=> "2 x 1"

//		2. .printf()와 서식문자를 이용해서 출력하는 방식
//		System.out.printf("%d x %d\n", 2, 1);
//		=> "2 x 1"

//		출력 예시
//		2 x 1 = 2
//		2 x 2 = 4
//		...
//		2 x 9 = 18

	}

}
