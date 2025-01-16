package day01;

public class DataType {
	public static void main(String[] args) {
//		자료형(DataType)
//		데이터를 다루기 위한 종류를 의미한다.
//		숫자, 문자 -> 연산? x -> 데이터의 종류를 나눈 것이다.
//		숫자형, 문자형, 논리형
//		1. 숫자형
//		- 정수형: byte, short, "int", long
//			: 소수점 없이 숫자로 이루어진 값
		int num1 = 3;
		// 그냥 숫자만 쓰면 자동으로 int타입으로 인식한다.
		long numLong = 5L;
		// long타입은 숫자 뒤에 l 혹은 L을 적으면
		// long타입 정수로 인식한다.
		
//		- 실수형: float, "double"
//			: 소수점을 표현할 수 있는 숫자로 이루어진 값
//		float: 부동소수점
//		float형 실수값은 뒤에 f를 붙여서 표현한다.
//		소수점 아래 7자리까지 표현할 수 있다.
		float numFloat = 3.123456789012f;
		System.out.println(numFloat);
//		double
//		소수점 있는 숫자를 적으면 자동으로 double로 인식한다.
//		소수점 아래 15자리까지 표현하고 16자리로 반올림한다.
		double numDouble = 3.1234567890123456789;
		System.out.println(numDouble);
		
//		2. 문자형
//		char
//		문자 하나를 나타내기 위한 자료형이다.
//		작은따옴표'로 감싸는 형태로 표현된다.
		char c = 'c';
		c = '홍';
		c = '#';
//		★문자열
//		String
//		기본 자료형은 아니지만 많이 다루는 자료형이다.
//		첫글자가 대문자 -> 클래스
//		큰따옴표"로 감싼 값을 문자열이라고 부른다.
		
		
//		3. 논리형
//		boolean
//		참과 거짓 두 가지 값만 존재한다.
//		true, false
		boolean isTrue = true;
		
//		상수
//		선언과 동시에 값을 초기화하면
//		이후에 값을 변경할 수 없는 저장공간을 말한다.
//		변수 선언과 동일하지만 앞에 final 예약어를 붙인다.
//		상수는 모두 대문자로 작성하며 스네이크 표기법을 사용한다.
		final int SANG_SU = 0;
//		SANG_SU = 3; // 오류
		
	}
}
