package day04.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
//		List 인터페이스
//		배열과 그 성질이 비슷한 클래스 타입이다.
//		- 저장되는 데이터의 순서를 유지한다 -> 인덱스 접근
//		- 중복된 값을 저장할 수 있다.
//		- 같은 타입의 값만 저장할 수 있다.
//		배열과 다른점:
//		- 고정길이가 아니라 가변길이
//		- 요소를 추가하거나 삭제할 때, 메서드를 이용한다.
//		- 요소의 타입을 클래스 타입으로 지정해야 하기 때문에
//		다형성 개념을 알아야 여러 값들을 업캐스팅하여
//		다룰 수 있게 된다.

//		List 컬렉션 클래스의 대표적인 클래스
//		ArrayList
//		어레이리스트의 선언
//		ArrayList<클래스타입>
//		요소로 사용할 클래스의 타입을 꺾쇠<>안에 작성해야 한다.
//		이때, 제네릭E라는 문자가 먼저 자리하게 되는데,
//		이 위치에 클래스 타입을 적어넣으면 된다.

//		Integer타입을 요소로 하는 ArrayList 선언 및 초기화
//		이때 배열과 달리 길이를 지정할 필요가 없다.
		ArrayList<Integer> arrList = new ArrayList<Integer>();

		System.out.println("===요소의 추가===");
//		요소의 추가
//		.add(E)
//		전달된 객체를 마지막 요소로 추가한다.
		arrList.add(3);

//		.add(index, E)
//		전달된 객체를 index번째 요소로 추가한다.
		arrList.add(0, 1);
		arrList.add(1, 2);

		for (Integer integer : arrList) {
			System.out.println(integer);
		}
		System.out.println(arrList);

		System.out.println("===요소의 삭제===");
//		요소의 삭제
//		.remove(index)
//		전달된 인덱스번째의 요소를 제거하고
//		제거한 그 요소를 반환한다.
		int removed = arrList.remove(0);
		System.out.println("제거된 값: " + removed);

		// .remove(E)
		// 전달된 객체를 리스트 상에서 제거하는데,
		// 가장 먼저 발견하는 요소를 제거하며,
		// 만약 remove()메서드의 실행결과 리스트에 변화가 있다면
		// true를 반환, 변화가 없다면(못 찾으면) false를 반환한다.
		System.out.println("-1 요소 제거 결과: " + arrList.remove(Integer.valueOf(-1))); // false

		System.out.print("남은 요소: ");
		for (Integer integer : arrList) {
			System.out.print(integer + " ");
		}

		System.out.println("\n\n===요소의 변경===");

//		요소의 변경
//		.set(index, E)
//		전달된 객체를 전달된 인덱스번째의 요소 대신 대체하고
//		기존에 해당 인덱스에 있던 요소를 반환하는 메서드
		int replaced = arrList.set(0, 31);

		System.out.println("대체되기 전 요소: " + replaced);
		System.out.print("현재 요소: ");
		for (Integer integer : arrList) {
			System.out.print(integer + " ");
		}
		System.out.println();

//		요소 추가
		System.out.println("요소 추가");
		arrList.add(31);
		arrList.add(13);
		arrList.add(16);
		arrList.add(29);
		for (int i = 0; i < arrList.size(); i++) {
			arrList.set(i, i);
		}

		System.out.print("현재 요소: ");
		for (Integer integer : arrList) {
			System.out.print(integer + " ");
		}

		System.out.println("\n===요소 범위 추출===");
//		요소의 일부 추출
//		.subList(start, end)
//		start번째 인덱스 요소부터 end-1번째 요소까지를
//		새로운 List<E> 객체로 추출하여 반환한다.
//		이때, 원본 리스트의 변화는 없으며, 단순히 부분 리스트를
//		복사하여 추출할 뿐이다.
//		- start와 end의 값이 같으면 빈 리스트를 반환한다.
//		- 리스트의 길이를 넘어가는 인덱스를 전달하면 오류가 발생할 수 있다.
//		- 반환되는 리스트는 ArrayList<E>가 아니라
//		List<E>임을 주의해야 한다.(ArrayList<E>타입으로의 다운캐스팅 불가)
		List<Integer> sublist = arrList.subList(2, 4);
		for (Integer integer : sublist) {
			System.out.print(integer + " ");
		}
		System.out.print("\n원본 요소:");
		for (Integer integer : arrList) {
			System.out.print(integer + " ");
		}

	}

}
