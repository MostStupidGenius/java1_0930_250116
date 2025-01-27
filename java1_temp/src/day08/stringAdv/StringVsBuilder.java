package day08.stringAdv;

import java.util.stream.Stream;

public class StringVsBuilder {

	public static void main(String[] args) {
		// String 클래스와 StringBuilder의 비교
		// String 클래스 타입의 문자열은 불변형이다(immutable)
		// 문자열과 다른 어떤 값을 + 연산했을 때 나오는 문자열은
		// 새로 생성된 문자열이다.
		// 때문에 문자열에 대해서 수많은 연산을 진행했을 때
		// 매 연산마다 새로운 객체가 생성되고 해제된다.
		// 때문에 메모리상으로 봤을 때 메모리 낭비가 심하고
		// 연산시간이나 효율면에서 떨어진다.
		
		// 반면에 StringBuilder클래스는 
		// 내부적으로 가변객체(mutable)로 이루어져 있기 때문에
		// 새로운 객체를 만들어내지 않고 그 자체의 문자열을 수정한다.
		// 새로운 문자열을 만들어내야 하는 게 아니라면
		// 잦은 문자열 변경이 필요한 경우에는 StringBuilder로
		// 문자열을 다루는 것이 효율적이다.
		
		// 실습 예제
		String str = "Hello"; // 리터럴 문자열(String) 불변형
		String str2 = str + " World!"; // 기존 문자열의 값을 활용한
		
		// 새로운 객체 생성
		System.out.println(str==str2); // 서로 다른 객체이다.
		System.out.println("==================");
		
		// StringBuilder 클래스로 만든 문자열 객체
		StringBuilder sb = new StringBuilder("Hello");
		// 문자열을 뒤에 덧붙인다.
		StringBuilder sb2 = sb.append(" World!");
		System.out.println(sb==sb2);
		
		// String과 Builder의 성능 비교
		// 시간을 측정하여 성능을 비교해보자.
		long times = 10000L;
		
		
		// 현재 시간을 기록
		long startTime1 = System.currentTimeMillis();
		
		// String 타입으로 문자열 연산의 시간을 측정
		String result = "";
		
		for (int i = 0; i < times; i++) {
			result += i; // 각 숫자가 result에 붙으면서 새로운 객체를 생성
		}
		long endTime1 = System.currentTimeMillis();
		long timeOut1 = endTime1 - startTime1;
		System.out.println("String 처리 시간: " + timeOut1);
		
		// ==================StringBuilder=======================
		// 현재 시간을 기록
		long startTime2 = System.currentTimeMillis();
		// StringBuilder 타입으로 선언
		StringBuilder result2 = new StringBuilder("");
		
		for (int i = 0; i < times; i++) {
			result2.append(i); // 기존 문자열의 뒤에 숫자를 붙인다.
			// 기존 문자열을 직접 수정
		}
		long endTime2 = System.currentTimeMillis();
		long timeOut2 = endTime2 - startTime2;
		System.out.println("StringBuilder 처리 시간: " + timeOut2);
	}

}
