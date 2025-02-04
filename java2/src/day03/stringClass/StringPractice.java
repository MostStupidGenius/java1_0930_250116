package day03.stringClass;

public class StringPractice {

	public static void main(String[] args) {
//		문자열 클래스
//		String 클래스는 문자열을 다루기 위한 클래스로
//		기본자료형은 아니지만 기본 자료형과 함께 다룰 만큼
//		중요한 참조 자료형이다.
//		이러한 문자열 클래스의 여러가지 메서드에 대해서 배워보자.
		
//		- 문자열은 내부적으로 문자 배열(char[])로 취급되고 사용된다.
//		때문에 문자열의 인덱스번째에 있는 문자를 반환하는 함수가 있다.
//		charAt(index)
//		전달된 인덱스 번째의 문자를 추출, 반환한다.
		String name = "김독수리세상을빛내다";
		char lastName = name.charAt(0);
		System.out.println(lastName);
		// for문으로 문자열의 문자 하나하나를 접근할 수 있다.
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		System.out.println("===성을 마지막으로===");
		// 0번째 요소를 뽑는다
		lastName = name.charAt(0);
		
		// 문자열의 모든 문자를 담을 문자 배열 선언
		// 길이는 기존 문자열의 길이만큼으로 설정
		char[] names = new char[name.length()];
		// 0부터 총길이-1까지의 요소를 접근
		for (int i = 0; i < name.length()-1; i++) {
			// i번째 방에 i+1번째 요소를 땡겨와서
			// 대입한다.
			names[i] = name.charAt(i+1);
		}
		// 0번째 성에 해당하는 문자를 마지막 요소로 삽입
		names[name.length()-1] = lastName;
		// 최종 문자열을 뽑기 위해 만든 문자열 변수 선언 및 초기화
		String fullName = "";
		for (char c : names) {
			// 문자를 하나씩 들고 와서 문자열에 붙여준다.
			fullName += c;
		}
		
		// 풀네임 출력
		System.out.println("풀네임: " + fullName);
		
		System.out.println("===문자열 찾기indexOf()===");
		// indexOf(char|String)
		// 전달된 문자나 문자열이 원본 문자열에서 0번째부터 검색하여
		// 처음으로 발견되는 인덱스를 반환한다.
		String text = "Hello world. Hello nice.";
		// 공백 후 Hello라는 문자열이 처음으로 등장하는 인덱스는
		// 12번째 인덱스이므로, 12가 출력된다.
		int index1 = text.indexOf(" Hello");
		System.out.println(index1);
		
		System.out.println("===앞뒤 공백제거 strip()===");
		// trim(), strip()
		// trim은 11버전미만에서 쓰이던 메서드
		// strip은 11버전 이상에서 쓰이는 메서드
		// 문자열의 앞뒤 공백문자, 줄바꿈문자, 탭문자 등을 제거한 문자열을
		// 반환하는 메서드다.
		String text2 = "   \t\n엔터이후 내용  \n";
		System.out.println("#"+text2+"#"); // 원본 문자열
		String removedText = text2.strip();
		
		// 앞뒤 공백, 줄바꿈, 탭문자를 모두 제거한 문자열
		System.out.println("#"+removedText+"#");
		
		System.out.println("===대소문자 변환===");
		// toUpperCase(), toLowerCase()
		// 각각 원본 문자열을 모두 대문자/소문자로 변환한 새로운 문자열을
		// 반환하는 메서드다.
		String text3 = "Hello, World";
		System.out.println(text3.toUpperCase());
		System.out.println(text3.toLowerCase());
		
		System.out.println("===문자열반복===");
		// repeat(int times)
		// 전달된 times만큼 문자열을 반복한 새로운 문자열을 만들어
		// 반환하는 메서드
		String text4 = "Hi, Hello, ";
		System.out.println(text4.repeat(3));
		
		
		
		
		
		
	}

}
