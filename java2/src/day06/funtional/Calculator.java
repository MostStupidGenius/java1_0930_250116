package day06.funtional;

// 함수형 인터페이스
// 람다식으로 하나밖에 없는 추상 메서드를 간단히 구현하기 위해서는
// 함수형 인터페이스로 선언할 필요가 있다.
// 이때 사용하는 어노테이션
@FunctionalInterface
public interface Calculator {
	// 두 개의 정수를 받아서 연산 후
	// 연산 결과 하나의 정수를 반환하는 추상 메서드
	public int calculate(int num1, int num2);
}
