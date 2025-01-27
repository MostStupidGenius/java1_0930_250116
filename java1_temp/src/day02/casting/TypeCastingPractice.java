package day02.casting;

public class TypeCastingPractice {

	public static void main(String[] args) {
//		형변환
//		하나의 자료형에서 다른 자료형으로 값의 타입을
//		변경하는 것을 말한다.
//		이때 작은 자료형이 큰 자료형으로 별다른 조치없이
//		자동으로 바뀌는 것을 자동 형변환이라 한다.
//		자료형의 크기
//		문자열 > 실수 > 정수 > 문자형
		
//		정수 -> 실수 자동형변환
		double intToDouble = 13;
//		System.out.println(intToDouble); // 13.0
		
//		문자형 -> 정수
		int charToInt = 'a';
		// 문자형 'a'는 아스키코드에서 97의 값을 가지는 문자형이다.
//		System.out.println(charToInt); // 97
		
//		다른 자료형 -> 문자열
//		문자열과 다른 자료형을 + 하면
//		하나의 문자열로 병합(연결)된다.
		String text = "나이: " + 33;
//		System.out.println(text);
		
		String warning = "나이: " + 30 + 3;
//		System.out.println(warning); // 나이: 303
		
		
//		2. 강제 형변환
//		큰 타입에서 작은 타입으로 형변환을 하고자 할 때
//		데이터 손실의 가능성이 있기 때문에
//		정확히 어떤 타입으로 변환하려는 것인지
//		명시적으로 (자료형)을 해당 값 앞에 입력하는 형변환 방식이다.
		char c = 'a' + 3;
//		단, 문자형의 경우 담는 타입이 char라면
//		정수형 내에서의 연산은 자동형변환을 지원한다.
//		System.out.println(c); // d
		
//		변수에 담지 않으면 문자형이 숫자형으로 형변환된다.
//		System.out.println('a' + 3);
		
//		각 실수형 값에 (int)를 적용하여 소수점을 떼버린다.
		int num1 = (int)3.64 + (int)5.44;
		System.out.println(num1); // 3 + 5 = 8
		
//		실수형을 먼저 연산하고 이를 정수형으로 바꿔 수소점을 떼버린다.
		int num2 = (int)(3.64 + 5.44); // (int)(9.08)
		System.out.println(num2); // 9
		
		
//		오버플로우
		byte b = (byte)128;
		System.out.println(b);
	}

}
