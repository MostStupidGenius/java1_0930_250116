package day05.collection.map.basic;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
//		Map
//		키와 값의 한 쌍으로 이루어진 데이터 자료구조다
//		키의 경우에는 중복이 불가능하며, 값은 키에 종속된 값이기에
//		값은 중복이 가능하다.
//		HashMap<K, V>
//		대표적인 Map 컬렉션 클래스는 HashMap이다.

		// HashMap 선언
		// Key는 문자열로, Value는 모든 클래스가 올 수 있게 설정
		HashMap<String, Object> hm = new HashMap<String, Object>();

		// 요소의 추가
		// 키값과 Value값을 순서대로 전달하여 요소를 추가한다.
		// 이때 키값과 Value값은 기존에 설정한 타입에 맞게 전달해야 한다.
		// 다형성을 고려해서 값을 전달하면 된다.
		hm.put("나이", 30);
		hm.put("이름", "홍길동");
		hm.put("지역", "서울");
		// 전달한 키값이 이미 존재한다면
		// 새로 추가하는 것이 아니라(키 중복x)
		// 기존의 키의 Value값을 새로운 값으로 대체한다(덮어쓰기)
		// -> 변수와 같다.
		hm.put("지역", "역삼");

		// HashMap 객체를 출력하면
		// 중괄호{} 안에 키1=값1,키2=값2,...와 같은 형태로
		// 출력된다.
		System.out.println(hm);

		// 요소의 호출
		// .get(K) -> V
		// 전달되는 키값에 해당하는 값을 반환한다.
		// 만약 키가 요소 중에 없다면 null을 반환한다.
		// -> null: 참조 없음, 대상 없음.
		// 아래의 경우, Object 타입으로 저장되어 있었기 때문에
		// String으로 다운캐스팅하여 그 값을 확인한다.
		String name = (String) hm.get("이름");
		System.out.println(name);

		// 다운캐스팅 없이도 출력은 정상적으로 된다.
		System.out.println(hm.get("이름"));

		// 키의 목록을 반환
		// .keySet() -> Set<K>
		// 키의 목록을 Set타입으로 반환
		// HashMap의 요소에 접근하려면 keySet을 이용하여
		// 그 값에 접근해야 하기 때문이다.
		System.out.println(hm.keySet());

		// HashMap의 모든 요소 값에 접근하려면
		// foreach문으로 keySet의 요소를 반복하여
		// 그 값에 접근해야 한다.
		for (String key : hm.keySet()) {
			Object value = hm.get(key);
			System.out.println("key: " + key);
			System.out.println("value: " + value);
		}

	}

}
