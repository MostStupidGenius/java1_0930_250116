package day04.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetPractice {
	String name;

	public SetPractice(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

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

		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		// 요소의 추가
		setString.add(str1);
		// new로 새로운 주소값을 할당하려고 해도
		// 문자열은 new로 새로운 객체를 만들더라도
		// 같은 객체의 주소값을 참조하게 된다.-> 불변객체
		boolean a = setString.add(str2);
		System.out.println("str1 주소값: " + str1.hashCode());
		System.out.println("str2 주소값: " + str2.hashCode());
		System.out.println(a);
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
//		.contains(E)
//		전달되는 객체가 해당 셋 객체의 요소로 포함되어 있는지(존재하는지)
//		여부를 반환하는 메서드
		System.out.println(setString.contains("안녕")); // false
		System.out.println(setString.contains("반가워"));// true

//		문자열이 아닌 객체로 HashSet 다뤄보기
		SetPractice sp1 = new SetPractice("홍길동");
		SetPractice sp2 = new SetPractice("홍길동");
		HashSet<SetPractice> sps = new HashSet<SetPractice>();
		sps.add(sp1);
		sps.add(sp2);
		// syso로 HashSet 객체를 전달하면, 각 요소의 toString()을 호출하여
		// 나열 및 출력하는 방식으로 동작한다.
		// [요소1.toString(), 요소2.toString(),...]
		System.out.println(sps);
		// toString의 결과값과 무관하게 각각의 객체를 구분하는 자료구조가
		// HashSet이다.(주소값으로 객체를 구분)
		SetPractice sp3 = new SetPractice("홍길동");

		// 해당 객체의 주소를 담은 적이 없기 때문에
		// false라는 결과가 나온다.
		System.out.println(sps.contains(sp3));

		// sp1과 sp2는 담은 적이 있는 주소이기 때문에
		// true라는 결과가 나온다.
		System.out.println(sps.contains(sp1) + " " + sps.contains(sp2));

	}

}
