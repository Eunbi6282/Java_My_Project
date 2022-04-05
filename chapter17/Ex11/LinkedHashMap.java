package chapter17.Ex11;

//Map <K ,V> : Key는 중복되지 않는다. <= Set으로 관리
//HashMap vs LinkedHashMap
	//HashMap <K,V> : 입력과 출력이 다를 수 있다. 출력이 랜덤하게 출력
	//LinkedHashMap <K,V> : Key는 링크 되어있다. 앞의 값과 뒤의 값의 정보를 가진다. ( 입력 순서대로 출력이 됩니다. )

import java.util.Map;
import java.util.Set;

public class LinkedHashMap {

	public static void main(String[] args) {
		
		Map<Integer, String> lhMap1 = new LinkedHashMap<Integer, String>();
		
		// 1. put(K key, V value) : 값을 넣을 때
		lhMap1.put(2,"나다라");
		lhMap1.put(1, "가나다");
		lhMap1.put(3, "다라마");
		// lhMap1.put(3, "가가가");  //Key는 중복 불가. 값을 넣을 경우 기존의 값이 수정이 된다.
		System.out.println(lhMap1);
		
		// 2. putAll(다른맵객체) : 다른 맵을 복사해서 사용
		Map<Integer, String> lhMap2 = new LinkedHashMap<>();
		lhMap2.putAll(lhMap1);
		System.out.println(lhMap2);
		
		// 3. replace(K key, V value) : key에 저장된 값을 value로 수정
		lhMap2.replace(1, "가가가");
		lhMap2.replace(4, "라라라"); // Key4번은 존재하지 않음. 작동이 안됨(예외도 발생 안됨)
		System.out.println(lhMap2);
		
		// 4. replace(K key, oldValue, V newValue) : oldValue를 newValue로 수정
		lhMap2.replace(1, "가가가", "나나나");
		lhMap2.replace(2, "다다다", "라라라"); // 동작안됨 <==Key와 Value가 정확히 일치해야 수정됨
		System.out.println(lhMap2);
		
		//5. get(Object key) : Map의 값을 가져올 때 Key를 넣어줘야 Key에 할당된 Value를 출력
		System.out.println(lhMap2.get(1)); //주의 index가 아니가 Key가 1임
		System.out.println(lhMap2.get(2));
		System.out.println(lhMap2.get(3));
		
		//6. containsKey(Object Key); 맵에 해당키가 존재하는지 확인, true, false
		System.out.println(lhMap2.containsKey(1)); // true
		System.out.println(lhMap2.containsKey(5)); // false
		
		// 7. containsValue(Object value) : 맵에 해당값이 존재하는지 확인, true, false
		System.out.println(lhMap2.containsValue("나나나")); //true
		System.out.println(lhMap2.containsValue("하하하")); // false
		
		// 8. Set<K> keySet() : 키만 추출
		Set<Integer> keySet = lhMap2.keySet(); //hMap2의 저장된 keySet을 추출
		System.out.println(keySet);
		
		// 9. Set<Map.Entry<K,V>> entrySet() : 키와 값의 셋을 추출(한꺼번에 추출)
		Set<Map.Entry<Integer, String>> entryset = lhMap2.entrySet();
		System.out.println(entryset);
		
		// 10. size(); 총 개수
		System.out.println(lhMap2.size()); //3
		
		// 11. remove(Object key) // 키값을 넣어서 value를 삭제
		lhMap2.remove(1); //1번삭제
		lhMap2.remove(4); // 동작하지 않음
		System.out.println(lhMap2);
		
		// 12. remove (Object key, Object value) : key와 value가 정확하게 일치할 때 삭제
		lhMap2.remove(2, "나다라");
		lhMap2.remove(3,"다다다"); // 동작안함 . key와 value가 일치하지 않음 3의 값은 다다다가 아니다.
		System.out.println(lhMap2);
		
		// 13. clear () : 모두 삭제
		lhMap2.clear();
		System.out.println(lhMap2);
		
		
		
		
		
		

	}

}
