package day06.streamAPI.basic;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamWithArrays {

	public static void main(String[] args) {
//		Arrays 클래스를 활용하여 stream 객체 만들기
//		단순 배열 선언
		String[] arrStr = new String[] { "하나", "둘", "셋", "얍" };

//		기본 자료형 배열을 stream으로 바꾸려면
//		배열을 다루는 클래스인 Arrays의 메서드를 활용해야 한다.
		Stream<String> streamStr = Arrays.stream(arrStr);

//		스트림의 요소를 순차적으로 소모하여 모두 출력
//		- 빠른 참조 연산자를 이용해서 쉽게 출력하는 내용
		streamStr.forEach(System.out::println);

		System.out.println("=== 길이 정해서 ===");
//		배열을 스트림으로 변환할 때 길이를 정해서 만들 수 있다.
//		stream(배열, 시작인덱스, 끝인덱스+1)
//		시작인덱스번째에 있는 요소부터 끝인덱스에 있는 요소까지를
//		스트림의 요소로 설정하여 스트림 객체 생성
		Stream<String> streamStrRange = Arrays.stream(arrStr, 2, arrStr.length);
		streamStrRange.forEach(System.out::println);

		System.out.println("===가변 매개 변수===");
//		가변 매개변수
//		Stream.of()에 인자로 스트림 객체의 요소로 설정할 값들을
//		개수 제한 없이, 타입 제한 없이 전달하는 방식으로 설정할 수 있다.
//		이러한 전달하는 매개변수의 개수가 가변(변할 수 있음)이기 때문에
//		가변 매개변수라고 부른다.
		Stream<Serializable> streams = Stream.of(1, 3, 9, "홍길동", 30, true, new String[] { "안녕", "하세요" });
		streams.forEach(System.out::println);

//		난수로 스트림 만들기
//		Random 클래스의 .ints(), .longs(), .doubles() 등의
//		메서드를 사용하면 난수들을 스트림으로 만들어 사용할 수 있다.
//		만약 개수를 정하지 않고 실행하면 무수히 많은, 무한대의 숫자가
//		생성되므로 주의하여 사용해야 한다.

//		특정 타입의 난수로 이루어진 스트림 생성
		IntStream stream = new Random().ints(4); // 정수 타입의 무작위 값 4개가 스트림의 요소로 설정된다.
//		정수를 처리하는 데 특화된 스트림 클래스 -> IntStream
		stream.forEach(System.out::println);

//		.iterate()함수와 람다식을 조합하여
//		특정 패턴으로 만든 값들을 요소로 하는 스트림을 생성할 수 있다.

		Stream<Integer> streamInt =
//				1부터 1씩 증가하는 등차수열을 무한히 만드는 스트림 객체
				Stream.iterate(1, n -> n + 1);

//		요소를 무한히 만들어내기 때문에 그 개수를 제한해야 한다.
		streamInt.limit(10) // 개수 제한
				.forEach(System.out::println); // 출력

	}

}
