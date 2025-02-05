package day04.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetPractice {

	public static void printElements(HashSet<String> setString) {
		System.out.print("현재 요소: ");
		for (String string : setString) {
			System.out.print(string + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
//		set 컬렉션 클래스
//		HashSet<E>
//		set 자료구조는 저장순서를 무시하고
//		저장하는 값의 중복을 불허하는 자료구조다.
//		때문에 주로 중복값을 제거하는 용도로 사용된다.

		// HashSet<E>의 선언
		HashSet<String> setString = new HashSet<String>();

		// 요소의 추가
		setString.add("안녕");
		setString.add("반가워");
		setString.add("아이엠");
		setString.add("그루트");

//		저장되는 순서를 무시하기 때문에
//		요소를 가져오는 순서는 저장했던 순서와 다를 수 있다.
//		이러한 순서는 set 자료구조에서 정해놓은 대로 정렬된다.
//		-> 정렬 메서드 없음
		printElements(setString);

		System.out.println("===요소의 삭제===");
		// 요소의 삭제
		// 전달된 객체의 값과 동일한 요소를 제거한다.
		setString.remove("안녕");
		System.out.println(setString);

		// 요소 존재 여부 확인
//		.contains()

	}

}
