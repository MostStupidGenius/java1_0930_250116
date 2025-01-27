package day03.switchBasic;

import java.util.Scanner;

public class SwitchTask {

	public static void main(String[] args) {
//		switch문 실습
		Scanner sc = new Scanner(System.in);
//		문자열을 입력받아서
		System.out.print("등급 입력: ");
		String grade = sc.nextLine();
		// 문자열 변수나 값의 뒤에 .와 함께 toUpperCase()를 입력하면
		// 문자열의 모든 알파벳을 대문자로 바꿔준다.
		// <-> .toLowerCase() 모두 소문자로.
		grade = grade.toUpperCase();
		switch(grade) {
			case "VIP":
//			"VIP"이면 "무제한 듣기 및 평생소장 50곡"를 포함한 하위 혜택 전부 출력
				System.out.println("무제한 듣기 및 평생소장 50곡");
			case "A":
//			"A"이면 "음악 다운로드 50회"을 포함한 하위 혜택 전부 출력
				System.out.println("음악 다운로드 50회");
			case "B":
//			"B"이면 "음악 듣기 30곡"만 출력
				System.out.println("음악 듣기 30곡");
				break;
			case "무료":
//			"무료"이면 "30초 무료 듣기"만 출력
				System.out.println("30초 무료 듣기");
				break;
			default:
//			그외 다른 입력인 경우 "잘못 입력하셨습니다" 출력
				System.out.println("잘못 입력하셨습니다");
		}
		
		
		
		
		
		
		
		
		
	}

}
