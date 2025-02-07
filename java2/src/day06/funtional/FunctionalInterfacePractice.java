package day06.funtional;

public class FunctionalInterfacePractice {

	public static void main(String[] args) {
//		함수형 인터페이스
//		함수형 인터페이스로 선언한 인터페이스의
//		추상 메서드를 구현할 때에는 본래 익명 클래스처럼
//		직접 구현을 해야 하지만, 함수형인 경우에는
//		추상 메서드가 하나뿐이라는 보장이 있기 때문에
//		추상 메서드의 이름을 적지 않고도 구현할 수 있다.
//		이때 사용하는 것이 바로 람다식이다.
		Calculator add = (x, y) -> x + y;

//		아래는 익명 클래스로 상속받아서 구현하는 방식인데,
//		구현할 메서드가 하나뿐이기 때문에, 길게 작성하는 것보다
//		더 간단하게 작성할 수 있다 -> 람다식
//				new Calculator() {
//			@Override
//			public int calculate(int num1, int num2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};

//		구현한 함수형 인터페이스 객체의 메서드를 사용해보자.
//		만들어둔 추상 메서드의 이름이 calculate이므로 이를 그대로 쓰면 된다.
		int result1 = add.calculate(3, 5); // 3+5=8
		System.out.println(result1);

//		다른 내용으로 함수형 인터페이스를 람다식으로 구현해보자.
		Calculator sub = (a, b) -> a - b;
		System.out.println(sub.calculate(10, 3)); // 10-3=7

//		두 정수를 받아서 그 곱을 반환하는 람다식을
//		Calculator 함수형 인터페이스의 메서드로
//		구현하는 실습
//		multi
		Calculator multi = (x, y) -> x * y;
		System.out.println(multi.calculate(5, 10)); // 50
//		두 정수의 나눗셈을 반환하는 람다식 구현
//		divide
		Calculator divide = (num1, num2) -> num1 / num2;
		System.out.println(divide.calculate(11, 3)); // 3

		System.out.println("=====두 줄 이상의 람다식=====");
//		(a, b)->a+b;
//		위와 같은 방식은 단순계산에 쓰이는 람다 표현식이고
//		본래는 메서드처럼 함수의 몸체(body)가 존재해야 한다.
//		이러한 바디는 중괄호{}로 감싸여져 있어야 한다.
		Calculator divideAlt = (int a, int b) -> {
			// 유효성 검사
			// 분모의 값이 0이면 예외가 발생하므로
			// 해당 조건에 대해서는 다르게 동작하도록
			// 유효성 검사를 진행해야 한다.
			if(b == 0) {
				System.err.println("0으로 나눌 수 없습니다. 0이 반환됩니다.");
				return 0;
			}
			return a / b;
//			return b == 0 ? 0 : a / b;
		};
		
		int result2 = divideAlt.calculate(12, 0);
		System.out.println(result2);

	}

}
