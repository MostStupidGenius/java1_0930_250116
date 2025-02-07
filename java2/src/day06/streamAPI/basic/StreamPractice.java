package day06.streamAPI.basic;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
//		StreamAPI
//		많은 데이터를 함수형 프로그래밍 방식을 통해 일관적이고 안정적으로
//		데이터를 처리하기 위해 만들어진 자바의 기본 내장 API이다.
//		이전에 배웠던 컬렉션 프레임워크의 자료구조들과 긴밀한 연계를 통해
//		사용하게 된다.

//		컬렉션 클래스를 스트림으로 바꾸어 사용하는 예제
		ArrayList<String> arrStr = new ArrayList<String>();

		arrStr.add("하나");
		arrStr.add("둘");
		arrStr.add("셋");
		arrStr.add("얍");
		arrStr.add("천방지축");
		arrStr.add("어리둥절");
		arrStr.add("빙글빙글");

//		리스트 컬렉션 클래스 객체를 Stream 객체로 변환
//		리스트 객체.stream()을 사용하면 된다.
		Stream<String> streamStr = arrStr.stream();

//		해당 스트림을 사용하여 함수형 프로그래밍 방식으로
//		데이터를 일괄처리할 수 있다.
//		스트림 객체의 요소를 순차적으로 e라는 매개변수에 담아서
//		반복적으로 모든 요소를 출력하는 예시
		streamStr.forEach((e) -> System.out.println(e));

//		StreamAPI에는 두 가지의 연산방식이 있다.
//		- 중개연산
//		- 최종연산
//		forEach는 이 중 최종 연산에서 가장 자주 쓰이는 함수이다.

	}

}
