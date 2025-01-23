package day06.method;

public class MethodTask {

	public static int add(int num1, int num2) {
//		반환할 값을 담아둘 변수를 선언한다.
		int result = 0;

//		로직을 수행할 공간
		result = num1 + num2;

//		결과값을 반환
		return result;
//		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int multi(int num1, int num2) {
		return num1 * num2;
	}

	public static int divide(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
//		계산기 함수들(정수)
//		덧셈
		int added = add(3, 5);
		System.out.println(added); // 8

//		뺄셈
		int subed = sub(10, 3);
		System.out.println(subed);// 7

//		곱셈
		int multied = multi(2, 9);
		System.out.println(multied); // 18

//		나눗셈
		int divided = divide(11, 3);
		System.out.println(divided); // 3

	}

}
