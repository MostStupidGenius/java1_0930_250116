package day03.conditionIf;

public class IfPractice {

	public static void main(String[] args) {
//		조건문 중 if문
//		조건식(condition)의 결과에 따라 코드를 실행하거나 건너뛰는 동작을 수행한다.
//		if(조건식){조건식이 참일 경우 실행할 코드}
//		이때 중괄호{}는 실행할 코드가 한 줄일 경우 생략할 수 있다.

//		5를 변수 num1에 대입
		int num1 = 5;

//		num1의 값이 만약 3보다 크다면 "3보다 큽니다" 출력
		if (num1 > 3) {
			System.out.println("3보다 큽니다");
		}
		// 위의 if문의 조건식이 거짓이라면
		// 아래의 내용만 출력될 것이다.
		System.out.println("if문 아래 코드");

		System.out.println("===if~else===");

//		만약 조건문이 거짓일 경우에 실행하고 싶은 코드가 있다면
//		else를 if 코드 블록 뒤에 이어서 적어, 코드를 실행할 수 있다.
//		if(조건식){참 블록}else {조건식이 거짓일 경우 실행할 코드 블록}
//		else문은 if문이 있어야 작성할 수 있으며,
//		else문이 있는 경우, if문의 코드 블록 혹은 else문의 코드블록 중
//		하나는 반드시 실행된다.
		int numSome = -13;

		// 만약 numSome의 값이 짝수라면 "짝수"출력
		// 짝수가 아니라면(else) "홀수" 출력
		if (numSome % 2 == 0) { // 짝수라면
			System.out.println("짝수");
		} else { // else문은 여집합이기 때문에
			// 소괄호를 열지 않는다(조건식이 필요 없다)
			System.out.println("홀수");
		}

		System.out.println("===if~else if~else");

//		여러 조건문을 작성하는 if문
//		if문을 하나만 작성하는 경우에는, 여러 조건을 검사하려면 else문 안에
//		또다른 if문을 작성해야만 한다.
//		하지만, 모든 조건을 하나씩 순서대로 검사할 때
//		if~ else if문을 사용하여 조건을 여러 개 줄 수 있다.
//		- 아래는 중첩 조건문이다.
		numSome = -1;
//		1. 주어진 값이 양수면 "양수" 출력
//		2. 0이면 "0입니다" 출력
//		3. 음수면 "음수" 출력

//		1. 주어진 값이 양수면 "양수" 출력
		if (numSome > 0) { // 0보다 크면 양수다.
			System.out.println("양수");
		} else {
//			2. 0이면 "0입니다" 출력
			if (numSome == 0) {
				System.out.println("0입니다.");
			} else {
//				3. 음수면 "음수" 출력
				if (numSome < 0) { // 0보다 작으면 음수다.
					System.out.println("음수");
				}
			}
		}

		// 아래는 else if문으로 바꾼 것이다.

//		1. 주어진 값이 양수면 "양수" 출력
		if (numSome > 0) { // 0보다 크면 양수다.
			System.out.println("양수");
		} else if (numSome == 0) {
			// 2. 0이면 "0입니다" 출력
			System.out.println("0입니다.");
		} else if (numSome < 0) { // 0보다 작으면 음수다.
			// 3. 음수면 "음수" 출력
			System.out.println("음수");
		} // 마지막에 else문이 없다면
//		위의 조건들이 모두 거짓일 때, 아무것도 실행하지 않는다.
		
	}

}
