package day04.loopWhile;

public class WhilePractice {

	public static void main(String[] args) {
		// 반복문 - while
//		while문은 기본적인 형태가 if문과 유사하다.
//		때문에 ★진입하는 조건(조건식 검사 후 진입)은 동일하다
//		코드 블록을 실행한 후, if문은 그대로 코드블록을 벗어나 다음 코드를 실행했다.
//		하지만 while문은 코드 블록이 끝나면 내려가지 않고 ★위로 올라가서
//		조건식을 ★다시 검사한다.
//		while(조건식){조건식이 만족하는 동안 실행할 코드 블록}

		// 반복문이 돌아간 횟수를 기록할 변수 선언
		int i = 0;

		// i값이 10 이하인 동안(while)에는 무한 반복
		while (i <= 10) {
			// i값 출력
			System.out.println(i);

			// i가 조건식을 만족하지 않게 해서
			// 반복문을 탈출하기 위해
			// 값을 증가시키는 부분 -> 증감식
			// 아래 코드는 모두 동일한 결과를 도출하는 식들이다.
//			i = i + 1; // 풀어쓴 형태
//			i += 1; // 복합할당 연산자 사용
			i++; // 증감연산자 사용
		}
//		반복문 탈출 후, i의 값 확인
		System.out.println("끝: " + i); // 끝: 11

		System.out.println("===while(true)===");
//		while문의 조건식으로 true를 넣는 경우
//		무한히 반복하기 때문에, 탈출 조건을 while문 코드 블록 안에서
//		설정해주어야 한다.
//		탈출 예약어 -> break;
//		break는 가장 가까운 switch문, while문, for문을 찾아서
//		해당 코드 블록을 탈출한다. -> 가장 가까운 코드 블록"만" 탈출하는 것에 주의한다.
//		주의점: ★if문의 코드 블록은 break의 탈출 대상이 아니다.

//		while(true){} 안에서 탈출 조건을 설정할 때에는
//		if문을 이용하여 break를 걸어준다.

//		반복횟수 초기화
		i = 0;
		while (true) { // 반복할 조건
			System.out.println(i);
			i++;
			if (i > 10) { // 탈출할 조건 -> 반복조건과 정반대
				// i가 10을 초과하면
				break; // while문 탈출
			}
		}
		System.out.println("결과: " + i);

	}

}
