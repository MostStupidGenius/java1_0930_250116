package day06.functional;

import java.util.function.Function;

public class FunctionalFunction {

	public static void main(String[] args) {
//		Function<T, R>
//		함수형 인터페이스 중, 매개변수의 타입과
//		리턴 타입을 추상 메서드를 구현할 때
//		사용자쪽에서 정하는 함수형 인터페이스이다.
//		T는 입력 매개 변수의 타입을 나타내는 제네릭이고
//		R은 리턴 타입을 나타내는 제네릭이다.
		Function<String, String> makeCallName = name -> name + "씨";
		String callName = makeCallName.apply("홍길동");
		System.out.println(callName);

//		Function<T, R>은 엄밀히 따지면 인터페이스, 즉 클래스의 일종이다.
//		때문에 타입으로도 취급될 수 있으며 이때문에
//		T나 R 자리에 또다시 Function<T, R>이 사용될 수 있다.
//		Function<
//			Function<String, String>, String
//		>
//		위의 내부 Function은 String을 받아서 String을 반환하는 함수를 의미하는데
//		이를 매개변수의 인자로 받는 외부의 Function은
//		그 결과 String을 반환한다.

		Function<String, Function<String, String>> doubleFunction =
//				외부 Function<>의 인수를 작성하는 공간
//				name은 Function<String
				(name) -> {
//					반환할 함수형 인터페이스를 구현한 객체를 생성하는 부분
					Function<String, String> makeHello =
//							함수형 인터페이스의 추상 메서드를 구현하는 부분
							(greeting) -> greeting + " " + name;
//					반환하는 구현이 완료된 함수형 인터페이스의 객체 
					return makeHello;
				};
		String result = doubleFunction.apply("홍길동") // 외부 Function<>에서 입력값을 전달
				.apply("안녕하세요."); // 내부 Function<>에 입력값을 전달
		System.out.println(result); // 안녕하세요 홍길동

//		나눠서 생각해보자.
//		외부 Function을 구현한 객체를 반환받아서 변수에 담는다.
		Function<String, String> ljsHello = doubleFunction.apply("이준상");

//		반환된 내부 Function이었던 객체의 함수를 사용한다.
		String result2 = ljsHello.apply("반갑습니다.");
//		함수 호출
		System.out.println(result2);

	}

}
