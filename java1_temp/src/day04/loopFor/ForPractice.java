package day04.loopFor;

public class ForPractice {

	public static void main(String[] args) {
//		반복문 - for
//		for문은 "★일정 횟수"만큼 반복을 하는 반복문이다.
//		for(int i=0;i<[반복횟수 정수];i++){반복실행할 코드}
//		0부터//초기식
//		초기식은 최초 1회만 실행된다. 주로 반복횟수를 기록한 변수를 선언한다.
//		[반복횟수]만큼 // 조건식
//		[반복횟수]-1까지 // 조건식
//		조건식: 반복할 조건을 설정하는 부분
//		i값이 1씩 증가하며 변화한다. // 증감식
//		증감식: 반복할 조건을 false로 만들기 위해
//		i값을 변화시키는 부분

		// 반복할 횟수를 담은 변수
		int count = 10;

//		for문 시작
		// i값은 0으로 시작하여 count-1까지
		// 그 값이 1씩 증가하며 반복한다.
		for (int i = 0; i < count; i++) {
			System.out.print(i + " "); // 0 1...9
		}

	}

}
