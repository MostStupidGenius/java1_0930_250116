package day05.multiarray.withFor;

public class MultiArrayWithForTask {

	public static void main(String[] args) {
//		다중 배열을 ifor문과 향상된 for문으로 구현, 출력해보자.
		int[][] arrInts = new int[10][10];
		int index = 1;

		// 이중 배열의 요소에 1부터 1씩 증가하는 등차수열을 차례로
		// 값을 할당, 대입하는 이중for문
		for (int i = 0; i < arrInts.length; i++) {
			for (int j = 0; j < arrInts[i].length; j++) {
				arrInts[i][j] = index++;
			}
		}

		// 이중배열의 구조를 출력하여 시각화해보자.
		System.out.printf("{\n");
		for (int[] is : arrInts) {
			System.out.printf("\t{");
			for (int i : is) {
				System.out.printf("%3d, ", i);
			}
			System.out.printf("},\n");
		}
		System.out.printf("}");

	}

}
