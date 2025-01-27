package day05.array;

public class ArrayDouble {

	public static void main(String[] args) {
//		다차원 배열
//		기존에 배웠던 배열은 1차원 배열로,
//		배열 안에 값이 그대로 나열된 형태였다.
//		2차원 배열부터는 배열 안에 배열이 있는 형태를 말한다.
//		2차원 배열 선언 방법
		int[][] arrInts = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//		외부배열의 2번째 내부배열에서 1번째 값을 접근해보자
		System.out.println(arrInts[2][1]); // 8

//		외부배열만 접근했을 경우 출력
		System.out.println(arrInts);
		// [[I@주소값
		// 위와 같은 형태로 출력된다.

//		내부배열 출력
		System.out.println(arrInts[0]);
		// [I@주소값

	}

}
