package day08.stringAdv;

public class StringPool {

	public static void main(String[] args) {
		// StringPool
		// 큰따옴표로 코드 상에서 작성된 문자열을
		// 리터럴 문자열(Literal String)이라고 부른다.
		// 이러한 리터럴 문자열은 String Pool이라는
		// 특정 공간에서 관리하며, 새로운 문자열 변수로 리터럴 문자열을
		// 만들어 할당하더라도, 실제로는 String Pool에서 
		// 해당 문자열이 있는 확인하여 같은 문자열을 할당해준다.
		// -> 왜? 메모리 관리에 있어서 같은 내용을
		// 서로 다른 두 장소에 할당하는 건 메모리 낭비이기 때문이다.
	}

}
