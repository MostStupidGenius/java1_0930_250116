package day04.array;

public class ArrayWithFor {

	public static void main(String[] args) {
//		배열을 for문과 함께 사용하는 방법
//		배열의 인덱스는 0부터 시작해서 길이-1까지의 인덱스로
//		각 요소에 접근한다.
//		for문도 i=0으로 시작하여 반복횟수-1까지의 i을 사용한다.
//		이 둘을 조합하여 인덱스(i)로 각 요소를 가져올 수 있다.
//		이러한 i값을 반복문에서 인덱스가 아닌 방법으로도 사용할 수 있다.

//		정수형 배열 선언
		int[] arrInt = new int[10]; // 10개의 방을 가지는 배열 선언

		// i번째 방에 접근하여 저장공간의 값을 i로 변경
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i*2;
		}
		
		// i번째 방에 접근하여 그 값을 출력에 사용
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		
		System.out.println(arrInt[4]);
		
		
		
		
		
		
		
		

	}

}
