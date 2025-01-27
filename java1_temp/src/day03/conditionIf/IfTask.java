package day03.conditionIf;

import java.util.Scanner;

public class IfTask {

	public static void main(String[] args) {
//		int타입의 변수 score에 0부터 100사이의 값을 대입한다.
//		도전과제1 > Scanner를 이용하여 점수 값을 입력받아보자.
		Scanner sc = new Scanner(System.in);
//		int score = sc.nextInt(); 정수를 입력받을 수 있다.
//		int score = 70;
		// 입력 안내 문구
		System.out.print("0~100 점수 입력: ");
		int score = sc.nextInt();
		
//		조건문으로 score의 값에 따라 다른 내용을 출력할 것이다.
//		score가 90점 이상, 100점 이하이면 "A" 출력
		if (score >= 90 /* && score <= 100 */) {
			System.out.println("A");
		}
//		80점 이상, 90점 미만 "B"
		else if (score >= 80 /* && score < 90 */) {
			System.out.println("B");
		}
//		70점 이상, 80점 미만 "C"
		else if (score >= 70 /* && score < 80 */) {
			System.out.println("C");
		}
//		70점 미만 "F" -> else
//		else if(score < 70){
		else {
			System.out.println("F");
		}
		
//		도전과제2 > 삼항 연산자로 결과 알파벳(A~F)을 반환하도록 하여
//		문자열 변수 scoreText에 담고 그 값을 출력
		String scoreText = 
				score >= 90 ? "A" :
					score >= 80 ? "B" : 
						score >= 70 ? "C" : "F";
	}

}
