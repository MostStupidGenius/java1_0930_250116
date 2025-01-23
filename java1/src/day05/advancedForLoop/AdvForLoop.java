package day05.advancedForLoop;

public class AdvForLoop {

	public static void main(String[] args) {
//		향상된 for문(for each문)
//		i같은 인덱스를 담는 변수 없이, 배열을 직접 대상으로 삼아
//		그 요소를 하나씩 "임수 변수"에 담아 동일한 로직을 각각 수행하는 반복문이다.
		int[] arrInts = new int[] { 1, 3, 5, 2, 4 };

		// 기존 for문의 i값을 활용한 요소 접근법
		for (int i = 0; i < arrInts.length; i++) {
//			System.out.println(arrInts[i]);
		}

		// 향상된 for문
//		for(타입 임시변수명 : 배열 같이 여러 값이 든 객체) {
		for (int element : arrInts) {
//			System.out.println(element);
		}

//		이중배열을 향상된 for문으로 접근하는 방법
		int[][] arrInts2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 기존 i인덱스 방식
		for (int i = 0; i < arrInts2.length; i++) {
			for (int j = 0; j < arrInts2[i].length; j++) {
				System.out.print(arrInts2[i][j] + ", ");
			}
			System.out.println();
		}

		// foreach 방식
		for (int[] is : arrInts2) {
			for (int is2 : is) {
				System.out.print(is2 + ", ");
			}
			System.out.println();
		}

		// 두 방식의 차이점
		// 1. i인덱스 방식은 이전 요소나 다음 요소 등
//		인접한 다른 요소에 접근할 필요가 있을 때 주로 사용한다.
		// 2. foreach문은 각각의 요소마다 동일한 동작을 수행해야 할 때
//		주로 사용한다. -> 인접한 요소와 상호작용이 필요없을 때

		int[] newArrInts = new int[] { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < newArrInts.length; i++) {
			// 인덱스가 0인 경우 작업을 건너뛴다.
			if (i == 0)
				continue;
			// i-1을 접근해야 하기 때문에 0은 안된다.
			// ★인덱스는 음수일 수 없다.
			// 현재 인덱스 요소의 값에 이전 요소의 값을 더해서 대입
			newArrInts[i] += newArrInts[i - 1];
		}

		for (int i : newArrInts) {
			System.out.println(i);
		}

	}

}
