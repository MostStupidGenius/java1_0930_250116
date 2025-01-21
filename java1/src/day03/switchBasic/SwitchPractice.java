package day03.switchBasic;

public class SwitchPractice {

	public static void main(String[] args) {
//		switch문
//		조건문의 일종인 스위치문은 변수의 값을 확인하여
//		어떤 특정 값일 경우 해당 코드 라인부터 아래로 내려가며(흘러내린다)
//		코드를 실행한다.
//		이러한 흘러내림은 break 예약어를 만나거나 switch문을 벗어나기 전까지
//		지속된다.
//		switch(변수){
//			case 상수값1: 실행할코드;
//			case 상수값2: 실행할코드;
//			default: 위의 어떤 경우도 아닐 경우 실행
//		}
		
		int rating = 1; // 순위를 나타낼 변수 선언
		// 순위의 값에 따라 혜택을 출력한다.
		// + break를 쓰지 않기 때문에 하위의 내용도 출력된다.
		// 1일 경우 "금메달" 출력
		// 2일 경우 "은메달" 출력
		// 3일 경우 "동메달" 출력
		// 3일 경우 마지막에 break를 넣어준다.
		// 위 경우가 아닐 경우 "참가상" 출력
		
		switch(rating) {
			case 1:
				// 1일 경우 "금메달" 출력
				System.out.println("금메달");
			case 2:
				// 2일 경우 "은메달" 출력
				System.out.println("은메달");
			case 3:
				// 3일 경우 "동메달" 출력
				System.out.println("동메달");
				// 3일 경우 마지막에 break를 넣어준다.
				break; // 여기서 코드 흐름이 switch문을 벗어난다.
			default:
				// 위 경우가 아닐 경우 "참가상" 출력
				System.out.println("참가상");
		}
//		위의 내용을 실행하면 1일 경우 금은동 모두 출력하는 걸 볼 수 있다.
//		이는, 금메달 실행코드 아래쪽에 break;를 넣지 않았기 때문에
//		아래의 case문으로 이동하여 코드를 실행하는 것이다.
		
	}

}
