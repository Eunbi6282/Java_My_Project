package chapter17.Ex12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

//TreeMap : 저장시에 Key를 기준으로 오름차순 정렬되어 저장됨
	// 출력시에 오름차순 정렬되어 출력. 
	// Key에 일반 객체를 저장할 떄 
		// 1. Comparable<E> 의 compareTo()재정의 <== 객체 수정 및 재컴파일
		// 2. Comparator<E>의 compare()를 재정의 <==객체 수정없이 사용 , 

// Map<K,V> <== SortedMap<K,V> (정렬메서드 정의) <== NavigableMap<K,V> (검색 메서드 정의) <== TreeMap<K,V>
	// TreeMap을 사용할 때는 타입을 TreeMap으로 지정해야 검색과 정렬의 메서드를 사용할 수 있다.
public class TreeMapMethod {

	public static void main(String[] args) {
		// TreeMap<K,V> 은 Map<K,v>메서들르 모두 사용, 추가적으로Sportedmap, NavigableMap의 추가적인 메서드를 사용
		TreeMap<Integer, String> treeMap = new TreeMap();
		for (int i = 20; i < args.length; i-=2) {
			treeMap(i, i+"제번째 데이터");
		}
		System.out.println(treeMap);  // key기준으로 ㅗ름차슨 정렬-------b
		// 1. firstKey() : 제일 첫번째 값을 출력해주기
		
		System.out.println(treeMap.firstKey()); //2
		
		///,firstEntry() : entry = Key _ alj
		
		// 3. lastKey =() ㅏ카지맠ㄱ
		System.out.println(treeMap);
		
		//4 lastEnb.
		
		// .5 lowerKey (K key, : 입력받은 키의 낮은 키값 출력
		System.out.println(treeMap.lowerEntry(10));
		// 6. higheSystem.out.println(treeMaploner.loc);rKey (K key):
		
		// 7. pollFirstEntry() : 첫번째 ㄱ키와 값을 끄집어 내온다.
		System.out.println(treeMap.pollFirstEntry());
		// 8. poollLastEntry() : 마지막 키와 값을 끄집어 내온다.
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		
		// 9. SortedMap<K,V> headMap(K tokey) : 인풋 받은 키의 head쪽으로 처리
		SortedMap<Integer, String> sortedMap = treeMap.headMap(8); //
		System.out.println(sortedMap); //8번 데이터 앞쪽으로 출력
		
		//10. NavigableMap<K,V> headMap(K key, boolean inculsive)
		NavigableMap<Integer, String> nMap = treeMap.headMap(8, true);
		
		// 11. SortedMap<K,V> tailMap(K tokey)
		SortedMap<Integer, String> sortedMap2 = treeMap.tailMap(14); //14포함하고 뒤쪽으로 출력
		System.out.println(sortedMap2);
		
		//12. NavigableMap<K,V> tailMap(K tokey, boolean inculsive)
		NavigableMap<Integer, String> nMap2 = treeMap.tailMap(14,false);
		System.out.println(nMap2);
		
		//13 . SortedMap<K,V> subMap (K formkey, K tokey) :특정 범위의 값을 지정
		SortedMap<Integer, String> subMap = treeMap.subMap(6, 10);
		System.out.println(subMap);
		
		// 14. Navigable<K,V> SubMap( K fromkey, boolean inclusive, K tokey, boolean inclusive)
		NavigableMap<Integer, String> nsubMap = treeMap.subMap(6, true, 10, true);
		System.out.println(nsubMap);
		
		// 15. NavigableSet<K> descendingKeySet() : 현재 Key정렬을 반대로 출력
		NavigableSet<Integer> navigableSet =treeMap.descendingKeySet();
		System.out.println(navigableSet);
		System.out.println(navigableSet.descendingIterator());
		
		// 16. NavigableMap<K,V> decendingMap() : 현재 정렬을 반대로 출력
		NavigableMap<Integer, String> navigableMap = treeMap.descendingMap();
		System.out.println(navigableMap);
		System.out.println(navigableMap.descendingMap()); //Map이기 때문에 key와 value모두 출력됨
 	}

	private static void treeMap(int i, String string) {
		// TODO Auto-generated method stub
		
	}

}
