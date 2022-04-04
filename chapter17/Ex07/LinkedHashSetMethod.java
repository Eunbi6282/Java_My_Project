package chapter17.Ex07;

//LinkedHashSet : 값의 정보에 내 앞의 값의 위치정보와 내 뒤의 위치 정보를 가진다.
	//HashSet과 공통점 : 모든 메서드가 동일하다. 중복된 값을 저장하지 않는다. 방번호(index)값을 가지지 않는다., 기본 for문으로 출력할 수 없다.(iterator, EnhancedFor문 사용)
	// 	다른점 : HashSet은 입력대로 출력되지 않는다.LinkedHashSet은 입력대로 출력된다.
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* Set<E> : /인터페이스/ 방번호(index)가 없다. 중복된 값을 넣을 수 없다.
	- HashSet : 중복된 값을 넣을 수 없다. 값을 꺼내면 순서대로 꺼내지지 않는다.  (무작위 출력)
	- LinkedHashSet : 중복된 값을 넣을 수 없다. 출력시 순서대로 출력(Link로 묶여있기 때문)
	- TreeSet : 저장될 때 값이 정렬이 되어서 저장, ascending(오름차순 정렬) : 0 -> 9, a -> z , 가 -> 하
				descending (내림차순 정렬) : 9 -> 0, z -> a, 하 -> 가
	 
	 */

//단축키 정복 확인 :ctrl + shift + L


public class LinkedHashSetMethod {

	public static void main(String[] args) {
		Set<String> linkedSet1 = new LinkedHashSet<>(); // Set은 인터페이스 이므로 타입으로만 지정 가능(무작위 출력)
		//Set의 제너릭 타입변수로 wrapper클래스를 사용할 경우, equals()와 hashCode가 재정의, toString()재정의 되어 있음
		//1. add(E element)
		linkedSet1.add("가"); linkedSet1.add("나"); linkedSet1.add("가");  // "가"를 중복으로 저장했지만 중복값은 들어가지 않는다. 
		System.out.println(linkedSet1);  // "가"를 중복으로 저장했지만 중복값은 들어가지 않는다. 
		System.out.println(linkedSet1.toString()); //toString()가 재정의 되어있다. 
		
		System.out.println("==========");
		 
		// 2. addAll(다른 set객체) : 자신의 Set에 다른 Set에 저장된 값을 추가 : 중복된 값 제거됨
		Set<String> linkedSet2 = new LinkedHashSet<>();
		linkedSet2.add("나"); linkedSet2.add("다");
		linkedSet2.addAll(linkedSet1);
		System.out.println(linkedSet2);
		
		// 3. remove (Object o) : 값으로 삭제, (List인 경우 방번호로 삭제)
		linkedSet2.remove("나");
		System.out.println(linkedSet2);
		
		// 4. clear() : 모두 삭제
		linkedSet2.clear();
		System.out.println(linkedSet2);
		
		// 5. isEmpty() : 비어 있으면 true, 비어 있지 않으면 false
		System.out.println(linkedSet2.isEmpty());
		
		// 6. contains (Object 0 ) :값이 Set에 존재하면 true, 존재하지 않으면 false
		Set<String> linkedSet3 = new LinkedHashSet<>();
		linkedSet3.add("가"); linkedSet3.add("나"); linkedSet3.add("다");
		System.out.println(linkedSet3); // 입력과 출력이 동일
		System.out.println(linkedSet3.contains("나")); // 포함되어 있느냐 -> true
		System.out.println(linkedSet3.contains("라")); // 포함되어 있느냐 -> false
		
		// 7. size() : Set에 포함된 값의 개수
		System.out.println(linkedSet3.size()); //3
		
		System.out.println("============iterator()를 사용한 출력===============");
		
		// 8. iterator() : Set은 index를 가지지 않는다. for문은 방번호로 값을 출력 -> 방번호가 없어서 못쑤ㅡㅁ
			// but EnhancedFor문은 사용 가능
		// iterator : 순회자 ,Set의 값들을 순회하면서 출력시켜준다. 
			// hasNext() : Set에 값이 존재하면 true, 존재하지 않으면 false
			// next() : 현재 값을 출력하고 다음값으로 이동
		
		Iterator<String> iterator = linkedSet3.iterator(); // 사용하려면 객체에 iterator()를 먼저 선언해줘야 함
		 	// 클래스<E> 참조객체 = Set객체.iterator
		while(iterator.hasNext()) { // 값이 존재하면 true해서 밑의 구문 출력
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("=======EnhancedFor문을 사용해서 출력=======");
		for (String k : linkedSet3) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("===============================");
		
		// 9. toArray() : Set의 값을 배열로 보낸다. 
			// 기본적으로 toArray()는 Object 타입으로 리턴 -> 다운캐스팅 필요
		Object[] objArray = linkedSet3.toArray(); // set에 있는 값들을 배열에 저장
		System.out.println(Arrays.toString(objArray));
		for (int i = 0; i < objArray.length; i++) {
			System.out.print(objArray[i] + " ");
		}
		System.out.println();
		for (Object k : objArray) {
			System.out.print(k + " ");
		}
		
		// 10. toArray(T [] t) : 바로 다운캐스팅 한 후 출력
		String[] strArray1 = linkedSet3.toArray(new String[0]); // String탕입의 배열로 바꿨음
			// 0: 방의 크기를 지정 (일반적으로 0으로 지정)
			// 방의 크기가 실제 값보다 작을 경우 컴파일러가 Set안에 들어가 있는 방의 크기 만큼 지정
		System.out.println(Arrays.toString(strArray1));
		
		// 11. 실제 Set의 값보다 방의 크기를 크게 했을 경우는 Null 값이 들어갈 수 있다.
		String[] strArray2 = linkedSet3.toArray(new String[5]); 
		System.out.println(Arrays.toString(strArray2));
		System.out.println("================================");
		
		// 12. iterator로 출력
		Set <Integer> intSet1 = new LinkedHashSet<>();
		intSet1.add(30); intSet1.add(50); intSet1.add(100); intSet1.add(0);
		
		Iterator<Integer> i1 = intSet1.iterator();
        // iterator출력(for)
		while (i1.hasNext()) {
			System.out.print(i1.next() + " ");
		}
		System.out.println();
		
		//EnhancedFor
		for (Integer k : intSet1) {
			System.out.print(k + " ");
		}
		
		
		
	}

}
