package day07.streamAPI.terminalOper;

import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperation {

	public static void main(String[] args) {
		// Stream API 최종 연산
		// .forEach(System.out::println)
		// 스트림 연산의 마지막에 쓰여 출력하는 용도로 많이 사용된다.
		// 연습 생략
		
		
		// 요소를 소모하여 연산 수행
		// .reduce
		// 첫번째 요소와 두번째 요소를 연산 후,
		// 그 결과를 다음 연산의 첫번째 변수로 설정하고
		// 세번째 요소를 두번째 변수로 설정한다.
		// 계단식으로 요소를 소모하여 연산을 수행하는 함수
		IntStream intStream1 = IntStream
				.iterate(1, e->e+1)
				.limit(10);
		
		// reduce 수행
		// 1부터 10까지의 합을 reduce 연산 방식으로 수행
		OptionalInt optInt = 
				intStream1
				.reduce((before, current) -> before + current)
		;
		// reduce는 연산 결과 Optional형태의 자료형을 반환한다.
		// 그 값을 사용하려면 함수를 이용해 받아와야 한다.
		// getAsInt, getAsDouble,...
		int result = optInt.getAsInt();
//		System.out.println(optInt);
		System.out.println(result);
		
		// 요소의 검사
		// anyMatch()	
		// 하나라도 만족하는 경우
		Stream<Integer> intStream2 = Stream.of(70, 80, 75, 90, 95);
		
		boolean any95 = intStream2
				// 요소 중 하나라도 해당 조건을 만족하면 true를 반환
				.anyMatch(e->e > 90);
		System.out.println(any95);
		
		// allMatch()
		// 모든 요소가 만족하는 경우
		intStream2 = Stream.of(70, 80, 75, 90, 95); 
		boolean all70 = intStream2
				// 모든 요소가 70 이상이면 true를 반환
				.allMatch(e-> e >= 70);
		
		System.out.println(all70); // true
		
		// noneMatch()
		// 모든 요소가 특정 조건을 만족하지 않을 경우 true 반환
		intStream2 = Stream.of(70, 80, 75, 90, 95);
		
		boolean result2 = intStream2
				// 모든 요소가 70점 미만이 아니면 true를 반환
				.noneMatch(e-> e < 70);
		System.out.println(result2); // true
		
		System.out.println("=====요소의 통계=====");
		// .count()
		// 요소의 개수를 반환
		long count = Stream
				.of("홍길동", "고길동", "고희동", "둘리")
				.count();
		System.out.println(count);
		
		// .min()
		// 요소 중 가장 작은 값을 가지는 요소의 값을 반환
		IntStream nums = IntStream
				// 1부터 시작하여 -2의 등비를 가지는 등비수열
				.iterate(1, e->e*(-2))
				.limit(10) // 10개 요소로 제한
//				.peek(System.out::println)
				;
		
		int resultInt = nums
			.min()
			.getAsInt();
		
		System.out.println("min: " + resultInt); // -512
		
		// .max()
		nums = IntStream
			// 1부터 시작하여 -2의 등비를 가지는 등비수열
			.iterate(1, e->e*(-2))
			.limit(10) // 10개 요소로 제한
//			.peek(System.out::println)
			;
		System.out.println("max: " + nums.max().getAsInt());
		
		// 모든 요소의 합
		// .sum()
		// 결과로 나오는 값은 IntStream의 경우 int타입으로 나온다.
		IntStream intStream3 = IntStream
				.iterate(1, e->e+1)
				.limit(100)
		;
		
		// 요소의 총합을 출력
		System.out.println("sum: " + intStream3.sum());
		
		
		// 요소의 수집
		// .collect(Collectors...())
		Stream<String> streamStr = Stream
				.of("하나", "둘", "셋", "얍")
		;
		
		// 요소 수집 시행
		// 스트림의 요소를 리스트 형태로 변환
		// Collectors.toList()
		List<String> listStr = streamStr
				.collect(Collectors.toList());
		for (String string : listStr) {
			System.out.println(string);
		}
		
		// toList(), toArray(), toSet(), toMap()
		
		
		// 조건에 따라 스트림을 쪼개는 함수
		// .partitioning
		streamStr = Stream.of("홍길동", "고길동", "둘리", "또치");
		
		// collect를 이용한 수집
		
		Map<Boolean, List<String>> partition = 
				streamStr.collect(Collectors
				// 전달받은 요소의 길이가 짝수인 경우와
				// 홀수인 경우, 두 가지로 나누는 방식
				.partitioningBy(e->e.length()%2 == 0))
		;
		
		// .get() 함수에 true 혹은 false를 전달하여
		// 위의 파티셔닝 조건에 따른 스트림을 반환받을 수 있다.
		List<String> evenLengthList = partition
				.get(true); // 길이가 짝수인 경우를 리스트로 반환
		
		System.out.println(evenLengthList);
		
		List<String> oddLengthList = partition
				.get(false); // 길이가 홀수인 경우를 리스트로 반환
		System.out.println(oddLengthList);
	}

}
