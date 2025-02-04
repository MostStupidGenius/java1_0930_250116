package day03.exception;

public class TryExceptionPractice {

//	예외
//	프로그램에 치명적인 손상을 주거나 예상치 못한 값을 처리하려는 경우
//	발생하는 것으로, 자주 접하는 예외의 종류로는
//	- OutOfIndex : 배열의 범위를 벗어난 인덱스를 전달한 경우
//	- zero divide : 0으로 나눌 때 발생하는 오류
//	- 타입 불일치 : 예) Scanner 이용할 때 nextInt()를 사용했는데,
//	정작 입력된 값은 정수형이 아닐 때

	public static int divide(int num1, int num2) {
		int result = 0;

		// 예외처리 구문
		try {
			// 오류가 발생할 수 있는 코드를 작성하는 공간
			// 나눗셈은 오류가 발생할 수 있다.
			result = num1 / num2;
		} catch (ArithmeticException e) {
//			System.err.println("에러 발생: " + e);
//			return 0;
			// 잘못된 인자(인수) 예외를 발생시키는 부분
			// throw는 새로운 예외 객체를 호출하여 예외를 발생시킨다.
			throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			// 모든 예외의 최상위 객체
			// 모든 오류를 잡는 역할을 한다.
			// 실무적으로 프로그램이 종료되어야 하는 경우엔
			// 종료를 시키기 위해서 잘 쓰이진 않는다.
			System.err.println(e);
		} finally {
			// 예외 발생 여부와 무관하게 항상 실행하는 부분
			return result;
		}
	}

	// throws 예약어
	// 메서드의 선언부 뒤쪽에 throws 예약어와 함께
	// 책임을 떠넘기고자 하는 예외 이름을 적어주면
	// 이 메서드를 사용(호출)하는 쪽으로 예외 처리의 책임을 넘겨버린다.
	// - 메서드쪽에서 처리해야 하는 경우도 있지만
	// - 사용(호출)하는 쪽에서 예외를 처리해야 하는 경우도 있다.
	// 때문에 상황에 따라 내부적으로 try/catch 구문을 사용하여
	// 예외처리를 하거나
	// throws를 이용하여 사용(호출)하는 쪽에서
	// 예외 처리를 하게끔 만들 수 있다.
	public static int divideAlt(int a, int b) throws Exception {
		return a / b;
	}

	public static void main(String[] args) {
		// 나눗셈 메서드 사용
		try {
			int result = divide(10, 0);
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("오류 발생: " + e);
		} finally {
			System.out.println("항상 출력될 내용");
		}
		System.err.println("try 이후 코드");

	}

}
