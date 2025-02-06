package day05.collection.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IteratorEntry {

	public static void main(String[] args) {
		// 맵 객체 생성
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// 요소 추가
		hm.put("age", 30);
		hm.put("height", 180);
		hm.put("weight", 80);
		hm.put("birthYear", 1990);

		// 맵의 엔트리(Entry)에 대한 반복자(Iterator) 생성
		Iterator<Entry<String, Integer>> entryIt = hm.entrySet().iterator();

		// 맵 엔트리의 반복자
		// 키값과 value값을 결합하여 하나의 객체에서 메서드만으로
		// 그 키와 값을 접근할 수 있도록 만든 반복자(iterator)

		// Entry 사용 예시
		while (entryIt.hasNext()) {
			// 엔트리 반복자의 요소를 가져온다. -> 엔트리
			Entry<String, Integer> entry = entryIt.next();

			// 가져온 엔트리의 키와 값을 메서드를 통해 얻을 수 있다.
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(
					"key: " + key + "\n" + 
					"value: " + value);
			// 예시 조건: Entry를 통해 확인한 키값이 특정 값이라면
			if(key=="birthYear") {
				// Entry 반복자에서 요소를 제거
				// -> 원본 Map에서도 해당 요소를 제거하게 된다.
				entryIt.remove();
			}
		}
		System.out.println(hm);
		// {weight=80, age=30, height=180}
		// birthYear키 요소가 삭제된 위와 같은 결과가 나온다
	}

}
