package day03.basicAPI;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// Arrays 클래스
		// 배열을 다루기 위한 클래스로
		// 모든 메서드가 static으로 선언 및 정의되어 있다.
		// 때문에 Arrays 클래스는 객체화 없이
		// "Arrays.메서드명()"과 같은 방식으로 메서드를 사용해야 한다.
		int[] nums = new int[] { 0, 1, 2, 3, 4, 5 };

		// copyOf(T[], int n)메서드
		// 전달받은 배열 객체의 0번째인덱스 요소부터
		// 전달된 인덱스-1번째 요소까지를
		// 새로운 배열로 만들어서 반환한다.
		// 두번째 int인수의 값은 0번째부터 n개 만큼을 뽑아
		// 새로운 배열을 만든다고 생각하면 편하다.
		int n = 4; // 추출하고자 하는 요소 개수(0번째부터)
		int[] newNums = Arrays.copyOf(nums, n);
		for (int i : newNums) {
			System.out.println(i);
		}

		// copyOfRange(T[], int start, int end)
		// 전달된 배열에서 start번째 인덱스부터
		// end-1번째 인덱스의 요소까지를 추출하여
		// 새로운 배열로 만들어 반환한다.
		// end번째의 인덱스를 포함하지 않음을 주의해야 한다.
		// 마지막 요소까지 뽑고자 한다면
		// end의 값으로 배열의 길이를 전달하면 된다.
		System.out.println("=========");
		int[] newNums2 = Arrays.copyOfRange(nums, 2, 4);
		for (int i : newNums2) {
			System.out.println(i);
		}

		System.out.println("===마지막요소까지===");
		// 마지막 요소까지 추출하려면 배열참조변수.length를 이용하여
		// 배열의 길이를 마지막 인수로 전달하면 된다.
		int[] newNums3 = Arrays.copyOfRange(nums, 2, nums.length);
		for (int i : newNums3) {
			System.out.println(i);
		}

		System.out.println("===fill()===");
		// fill(T[], T)
		// 전달받은 원본배열의 요소들을 모두 두번째로 전달된 값으로
		// 채워넣어 초기화하는 메서드
		// ※ 새로운 배열을 만드는 것이 아니라
		// 원본배열을 직접 수정하기 때문에
		// 데이터 손실에 주의해야 한다.
		// 원본 배열을 복사
		int[] numsDummy = Arrays.copyOf(nums, nums.length);

		// fill 메서드를 이용하여 모든 요소의 값을 10으로 변경
		Arrays.fill(numsDummy, 10);
		// 원본을 직접 수정하기 때문에
		// 결과를 따로 담을 수가 없다.
		for (int i : numsDummy) {
			System.out.println(i);
		}

		System.out.println("===sort()===");
		// sort()
		// 전달된 원본배열의 요소를 오름차순으로 정렬
		int[] nums4 = new int[] { 1, 3, 6, 5, 4, 2 };

		// Arrays 클래스의 sort 메서드 호출
		Arrays.sort(nums4);
		for (int i : nums4) {
			System.out.println(i);
		}

	}

}
