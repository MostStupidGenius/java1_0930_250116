package day07.streamAPI.mediationOper;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MediationOperation {

	public static void main(String[] args) {
		// 중개 연산
		// 스트림의 요소를 연산할 때, 중간에 값을 변경하거나
		// 요소를 걸러내는 등의 동작을 수행하는 연산들을 가리킨다.
		// 중개 연산의 결과로 stream 객체를 반환하기 때문에
		// 이어서 다른 중개 연산이나 최종 연산을 수행할 수 있다.
		
		// 스트림 필터링
		// .filter(e->조건식)
		// 조건식을 전달하여 조건식을 만족하는 요소만
		// 다음 스트림으로 전달한다.
		
		// 스트림 생성
		Stream<Integer> streamInt = Stream
				.iterate(1, n-> n+1)
				// 1로 시작하여 1씩 증가하는 무한한 등차수열
				.limit(100); // 요소의 개수를 100개로 제한
		
		// 스트림 값의 요소 중 짝수인 값만 새로운 스트림으로 만들어
		// 반환
		streamInt
			// 람다식으로 전달된 조건식을 만족하는 요소만
			.filter(e->e % 2 == 0)
			.filter(e->e % 3 == 0)
			// 다음 연산으로 전달
//			.forEach(System.out::println)
			;
		
		// 중복을 제거한 스트림을 반환
		// .distinct()
		// 이전 스트림의 요소 중 중복된 요소를 제거한
		// 스트림을 반환한다.
		
		// 가변매개변수 방식으로 생성
		IntStream streamInt1 = 
				IntStream.of(7, 5, 1, 3, 2, 4, 2, 3, 1, 5, 6);
		
		// 중복 요소 제거
		// 전달했던 순서를 기억하면서 중복 요소를 제거한다.
		streamInt1.distinct()
//			.forEach(System.out::println)
			;
		
		// 요소의 변환
		// .map(e->변환식)
		// 전달되는 요소를 원하는 값으로 변환하여 그 값들로 이루어진
		// 스트림을 새로 생성하여 반환한다.
		
		// 문자열로 이루어진 스트림 생성
		Stream<String> streamStr = Stream
				.of("C", "C++", "Java", "Python");
		
		// 각 문자열의 길이를 추출한 스트림으로 변환
		streamStr
			.map(e->e.length())
//			.filter(e->e%2==0)
//			.forEach(System.out::println)
		;
		
		// 스트림 제한
		// .limit(long)
		// 해당 스트림의 첫번째 요소부터
		// 전달된 파라미터 수 만큼의 요소를 가져와
		// 새로운 스트림을 반환한다.
		
		// 2배로 증가하는 등비수열을 구현한 스트림
		IntStream intStream3 = IntStream
				.iterate(1, n->n*2);
		
		// iterate() 방식으로 만들어낸 스트림은
		// 반드시 길이를 제한해주어
		// 무한 루프에 걸리지 않도록 해야 한다.
		// 길이를 20개로 제한
		intStream3
			.limit(20)
//			.forEach(System.out::println)
		;
		
		// 스트림 정렬
		// .sorted()
		// 전달된 스트림을 정렬한 스트림을 반환하는 함수
		// 인수로 아무것도 전달하지 않으면 사전순으로 정렬되며
		// 비교자(comparator)를 전달하면 비교자의 결과에 맞는
		// 정렬된 스트림을 반환한다.
		Stream<Integer> streamInt4 =
				Stream.of(9, 2, 3, 7, 1, 8, 4);
		
		// 요소 정렬
		streamInt4
			.sorted()
//			.forEach(System.out::println)
		;
		streamInt4 =
				Stream.of(9, 2, 3, 7, 1, 8, 4);
		
		// 숫자형에 대해서 역순으로 정렬
		streamInt4
			.sorted(Comparator.comparing(e->-e))
//			.forEach(System.out::println)
		;
		
		// 스트림 연산 결과 중간 확인
		// .peek()
		// 요소가 어떻게 변해가는지 중간에 확인하기 위해
		// 출력하는 부분
		// 일반적으로 디버깅을 목적으로 사용된다.
		Stream<String> streamStr2 = Stream
				.of("C", "자바", "파이썬", "DBMS");		
		streamStr2
			.map(e->e.repeat(3)) // 문자열을 3번 반복
			.peek(e-> System.out.println("peek: " + e)) // 위 결과를 출력
			
			// case1. 길이로 스트림을 변경
//			.map(e->e.length()) // 문자열의 길이로 스트림 변경
//			.filter(e->e%2==0) // 그 길이가 짝수인 경우만 내보낸다.
			
			// case2. 길이 값을 이용하여 필터링
			// 하지만 값은 여전히 문자열 상태
			.filter(e->e.length()%2==0)
			
			// 최종 연산
//			.forEach(e-> System.out.println("foreach: " + e)) // 최종 출력
		;
		// 최종 연산을 하기 전까지 peek의 내용도 실행되지 않는다.
		
	}

}
