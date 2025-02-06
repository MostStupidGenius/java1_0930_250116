package day05.collection.map.basic;

import java.util.HashMap;
import java.util.Iterator;

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

		// 요소의 제거
		// .remove(K) -> V|null
		// 제거하고자 하는 값의 키를 전달했을 때
		// 해당 키가 존재하면 그 키를 요소 목록에서 제거하고
		// 해당 키에 해당하는 값을 반환
		// 해당 키가 존재하지 않는다면 찾을 수 없으므로 null을 반환
//		Object removed = hm.remove("지역");
//		System.out.println("제거된 요소: " + removed);
//		
//		Object removedE = hm.remove("성별");
//		System.out.println("찾을 수 없는 요소: " + removedE);

		// 지역 키값을 제거
		Object result = hm.remove("지역");
		System.out.println((result == null ? "찾을 수 없는 요소: " : "제거된 요소: ") + result);

		// 제거된 요소를 또 제거하려고 하면
		result = hm.remove("지역");

		// 찾을 수 없는 요소라고 출력한다.
		System.out.println((result == null ? "찾을 수 없는 요소: " : "제거된 요소: ") + result);

		// 키의 값을 대체
		// .replace(K, V)
		// 전달된 키의 값을 전달된 값으로 대체한다.
		// - 이때 키가 존재하지 않으면 아무런 동작을 수행하지 않는다.
		// 키가 존재하지 않는다면 null값을 반환한다.
		// -> 키가 존재하지만 그 값이 null값일 경우에도 null값을 반환한다.
		// - 키가 정상적으로 존재한다면 그 값을 전달받은 값으로 변경한다.
		// 정상적으로 메서드가 실행된 경우, 기존 값을 반환한다.
		Object replaced = hm.replace("나이", 31);
		System.out.println("대체된 기존값: " + replaced);

		Object replaced2 = hm.replace("지역", "강남");
		System.out.println("키값을 찾을 수 없어 " + "대체되지 않음: " + replaced2);

		// 두번째 replace
		// .replace(K, oldV, newV)
		// 전달된 키의 요소 값이 oldV라면, 전달된 newV로 대체한다.
		// 키의 요소 값이 oldV가 아닌 경우엔 대체를 하지 않는다.
		// 반환값으로는 대체되었는지 여부를 반환한다.
		boolean replaceOk1 = hm.replace("나이", 31, 32); // 나이의 값이 31이라면 32로 변경
		System.out.println("나이값 변경 여부: " + replaceOk1);
		boolean replaceOk2 = hm.replace("나이", 31, 30); // 나이의 값이 31이라면 30으로 변경
		System.out.println("나이값 변경 여부: " + replaceOk2);
		// -> 기존 값이 32이기 때문에 변경되지 않음.

//		이터레이터
//		요소나 값을 하나씩 순차적으로 가져오는 역할을 수행한다.
//		반복문과 다른 점은 원할 때 다음 값을 가져오거나 건너뛰는 행동을
//		할 수 있다. -> 정해지지 않은 영역에서 가능.
//		.hasNext() boolean
//		다음 요소가 있는지 여부를 반환
//		주로 while문의 조건식으로 쓰여서 다음 요소가 있는 경우에만
//		while문 안으로 진입한다.

//		키값의 이터레이터 생성
		Iterator<String> iterKey = hm.keySet().iterator();

		// 다음 요소가 있을 경우 반복 실행
		while (iterKey.hasNext()) {
			// .next() 다음 요소를 반환
			String current = iterKey.next();
			// HashMap의 다음 value를 get
			Object value = hm.get(current);
			System.out.println("키: " + current);
			System.out.println("값: " + value);
		}

	}

}
