package day06.method;

public class MethodTask2 {
//	등차수열의 조건을 전달하고
//	이를 로직으로 수행하여 새로운 정수 배열을 반환하는 함수

	// 시작 숫자, 등차값, 요소 개수
	// 정수 배열을 반환할 것이다.
//	public static int[] makeArray(int start, int add, int size) {
////		size의 값을 사용하여 배열의 길이를 정한다.
////		만약 size의 값이 1보다 작으면 null 반환
//		if(size < 1) {
//			return null;
//		}
//		
////		결과값을 담을 변수 선언
//		int[] result = new int[size];
////		배열의 요소에 접근하는 데 쓰이는 인덱스를 외부에서 선언
//		int index = 0;
//		
////		본격적인 로직 작성
////		start부터 add만큼씩 증가하는 등차수열의 요소를
////		size 개수만큼 배열의 요소로 삽입
//		for(int i=start;index<size;i+=add) {
//			// 각 인덱스에 값을 넣어준다.
//			result[index] = i;
////			System.out.println(i);
//			index++; // 요소 접근을 위한 인덱스 증가
//		}
//		
////		결과값을 반환(return)
//		return result;
//	}

	public static int[] makeArray(int start, int add, int size) {
		// 전달받은 size의 값이 0이나 음수라면
		if (size < 1) {
			// 배열을 만들 수 없기 때문에 null을 반환한다.
			return null;
		}
		// 반환할 값을 담을 변수를 선언해준다.
		// 이때 길이를 정하기 위해서 전달받은 size 값을 사용한다.
		int[] result = new int[size];
		// 각 요소에 들어갈 현재 값을 담을 변수 선언
		// 초기값으로 전달받은 start 값을 사용한다.
		int currentValue = start;

		// 인덱스는 배열의 요소에 접근하기 위한 값이므로
		// 0으로 시작하여 size-1까지 반복적으로 사용할 것이다.
		for (int i = 0; i < size; i++) {
			// i번째 방에 현재값이 담긴 변수의 값을 대입한다.
			result[i] = currentValue;
			// 현재값에 등차를 더한다
			currentValue += add;
		}

		// 반환할 변수를 return 뒤에 적어 반환한다.
		return result;
	}

	public static void main(String[] args) {
		// 1부터 1씩 증가하는 10개의 요소를 가진 배열 생성
		int[] result = makeArray(10, 13, 0);

		// 외부의 메인 메서드에서 해당 함수를 사용했을 때
		// 반환된 값이 null이면 처리할 코드를 작성
		if (result == null) {
			System.out.println("잘못 만들었습니다.");
			return; // 메인 메서드를 종료
		}

		// foreach문으로 요소 확인
		for (int i : result) {
			System.out.print(i + " ");
		}

	}

}
