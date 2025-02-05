package day04.wrapperclass.boxing;

public class BoxingNUnboxing {

	public static void main(String[] args) {
//		래퍼클래스(wrapper class)
//		기본자료형(원시 자료형)을 클래스로 다루고자 할 때
//		클래스 타입으로의 포장을 위해 만들어진 클래스로
//		원시자료형과 래퍼클래스가 1대1 관계로 이루어져있다.

//		이러한 원시 자료형과 래퍼 클래스 간의 변환에 붙이는 이름이 있다.
//		원시->래퍼 : 박싱
//		래퍼->원시 : 언박싱

//		박싱
//		래퍼 클래스의 valueOf()메서드로 원시 자료형을 전달하여
//		래퍼 클래스 타입의 객체로 변환할 수 있다.
		Integer num = Integer.valueOf(3);

//		언박싱
//		래퍼 클래스 객체의 메서드를 사용하여
//		원시 자료형의 값을 반환받을 수 있다.
		int numInt = num.intValue();

//		오토 박싱, 오토 언박싱
//		JDK1.5버전이상에서는 메서드를 사용하지 않고도
//		자동으로 박싱과 언박싱이 이루어지도록 업데이트가 되었다.

//		오토 박싱
//		원시 자료형에 별다른 조치를 취하지 않고도
//		래퍼 클래스 타입으로 변환이 가능하다.
		Integer int1 = 3;

//		오토 언박싱
//		마찬가지로 별다른 조치없이 변환이 가능하다
		int integerToInt = int1;

	}

}
