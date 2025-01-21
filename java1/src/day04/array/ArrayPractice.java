package day04.array;

public class ArrayPractice {

	public static void main(String[] args) {
//		배열(array)
//		"같은 타입"의 여러 값들을 나열해놓은 데이터의 덩어리를 말한다.
//		배열 선언 방법
//		1.
//		타입[] 변수명 = new 타입[길이];
//		배열의 저장공간 크기를 지정하여 만드는 방법
//		초기값이 자동으로 정해진다.
//		정수,문자 -> 0, 실수 -> 0.0, boolean -> false, String -> null

		// int타입의 값이 10개 들어갈 수 있는 배열 선언
		int[] arrInt = new int[10];
		
		
		// int타입의 값들을 나열할 수 있는 배열 선언
		// 요소를 정하여서 배열을 선언하는 방법
		// 중괄호{} 안에 여러 요소를 반점,을 구분자로 하여
		// 직접 요소를 지정하여 넣을 수 있다.
		int[] arrInt2 = new int[] {3, 1, 2, 3, 5, 2, 1};
		
//		위의 직접 값을 넣는 방식은 짧게 쓸 수도 있다.
//		new 타입[] 부분을 생략하고
//		초기화를 하면서 배열을 넣을 수 있다.
		int[] arrInt3 = {3, 2, 1, 2, 3};
//		단, 이 약식 방식은 초기화를 할 때에만 사용이 가능하다.
//		arrInt3 = {1, 2, 3, 4};// 불가능
//		new 방식은 초기화가 아닐 때에도(대입) 사용이 가능하다
		arrInt3 = new int[] {1, 2, 3, 4}; // 가능
		
//		배열의 요소에 접근하는 방법
//		접근: 값을 수정, 사용
//		변수명[인덱스]

//		0번째 방에 접근하여 값을 31로 바꾼다.
		arrInt[0] = 31;
		System.out.println(arrInt[0]); // 대입한 값 31 출력
		System.out.println(arrInt[1]); // 기본값 0 출력
		
//		arrInt2
		System.out.println(arrInt2[4]); // 4번째 방의 값 5 출력
		

	}

}
