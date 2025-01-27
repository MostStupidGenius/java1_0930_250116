package day05.multiarray;

public class ArrayWithFor {

	public static void main(String[] args) {
//		다중for문
//		for문 안에 for문을 작성하는 형태를 이르는 말이다.
//		이때 외부에 작성된 for문은 정해진 횟수만큼 정상적으로 동작하지만
//		for문 안에 있는 내부for문은, 외부for문이 반복을 할 때마다
//		처음부터 반복을 시작한다.
//		즉, 내부for문의 총 반복횟수는
//		외부for문의 반복횟수 x 내부for문의 반복횟수만큼이다.

//		예시1) 시계
//		시계는 시, 분, 초로 세 개의 반복문으로 이루어져 있다.
//		이 중, 시와 분을 이중for문으로 구현해보자.
		for (int hour = 0; hour < 12; hour++) {
			System.out.println("===" + hour + "시 시작===");
			for (int minute = 0; minute < 60; minute++) {
				System.out.println(hour + "시 " + minute + "분");
			}
			System.out.println("===" + hour + "시 끝===");
		}

	}

}
