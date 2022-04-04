package chapter17.Ex08;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//TreeSet : 출력시 정렬되어서 출력(오름차순 정렬(ascending))
	// 출력시 검색의 메서드가 지
	// 임의의 값을 넣으면 Set에 정렬되어서 저장됨, 출력시에 오름차순으로 정렬되어서 출력
	//Set <- SortedSet(정렬 메서드 정의) <- NavigableSet(검색메서드 정의) <- TreeSet
	// TreeSet<String> treeSet = new TreeSet<String>(); -> 타입을 TreeSet으로 지정해야 정렬/ 검색기능 사용 가능
	//Set 인터페이스의 모든 메서드 사용. 추가적으로 정렬메서드, 검색 메서드를 사용가능

public class TreeSetMethod {
	public static void main(String[] args) {
		// TreeSet에 값을 넣었을 경우 오름차순 정렬되어서 값이 Set에 저장, 출력시 오름차순 정렬로 출력
		TreeSet<Integer> treeSet = new TreeSet<>();
		for (int i = 50; i > 0; i-=2) {  // 50,48,46,
			treeSet.add(i); // 내부적으로 임의의 값을 넣을 때 오름차순으로 정렬되어 값이 저장.
		}
		System.out.println(treeSet);
		
		System.out.println("=========data 검색(가져오기)==============");
		//TreeSet에서만 사용가능한 메서드(1 ~15)
		//1. first()	: 제일 처음값을 리턴
		System.out.println(treeSet.first()); // 2
		//2. last()		: 제일 마지막 값을 리턴
		System.out.println(treeSet.last()); // 50
		//3. lower(E element) : element보다 바로 뒤의 작은 값이 출력
		System.out.println(treeSet.lower(26)); //24
		//4. higher(E element) : element 보다 바로 앞의 큰값을 출력
		System.out.println(treeSet.higher(26)); //28
		//5. floor (E element) : element를 포함해서 작은값을 출력
		System.out.println(treeSet.floor(25)); //24
		System.out.println(treeSet.floor(26)); //26 (element가 포함되면 element를 출력)
		//6. ceiling(E element) : element를 포함해서 큰값을 출력
		System.out.println(treeSet.ceiling(25)); //26
		System.out.println(treeSet.ceiling(26)); //26 (26을 포함해서 26보다 큰값)
		
		System.out.println("=======데이터 꺼내기==============");
		//7. pollFirst() : 제일 첫번째 값 꺼내오기
		int treeSetSize = treeSet.size();
		
		System.out.println();
		System.out.println(treeSetSize); //size -> 25
		for(int i = 0; i <treeSetSize ; i++) {
			System.out.println(treeSet.pollFirst()); //size만큼 루프를 돌면서 첫번째 값만 꺼내오기
		}
		System.out.println();
		System.out.println(treeSet.size()); //0 -> 루프돌면서 50까지 다 꺼내옴(treeSet의 값이 0)
		
		//8. pollLast() :  제일 마지막 값 꺼내오기
		for(int i = 50; i > 0 ; i-= 2) {
			treeSet.add(i); 	//오름차순으로 정렬되어서 저장
		}
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize); //25
		System.out.println(treeSet);
		System.out.println();
		
		for(int i = 0 ; i < treeSetSize; i++) {
			System.out.println(treeSet.pollLast()); // 50부터 끄집어와서 찍음
		}
		System.out.println(treeSet.size()); //0
		
		System.out.println("======정렬======");
		//9. SortedSet<E> headSet(E element) : 정렬을 사용하기 위해서 SortedSet<E> 객체를 생성
			//SortedSet<E> : 정렬된 데이터를 저장하는 Set
			// headSet( E element) : element의 Head쪽으로 값을 저장 <- element값은 미포함
 		for (int i = 50; i> 0 ; i -= 2) {
			treeSet.add(i);  //오름차순으로 정렬되어서 treeSet에 저장
		}
 		System.out.println(treeSet);
 		SortedSet<Integer> set = treeSet.headSet(20); //20을 기준으로 앞쪽의 값만
 			//headSet(20)은 SortedSet으로 리턴값을 돌려줌
 		// Set<Integer> set1 = treeSet.headSet(20); //리턴 타입 Set도 가능
 		System.out.println(set);
		
 		// 10. NavigableSet<E> headSet(E element, boolean inclusive) 
 		NavigableSet<Integer> navigableSet = treeSet.headSet(20, true); 
 		// true ->element 값 포함
 		// false -> element값 포함x
 		System.out.println(navigableSet);
 		
 		// 11. SortedSet<E> tailSet(E element)
 		SortedSet<Integer> sortedSet = treeSet.tailSet(20); 
 			// <-element(시작값)포함, 끝값은 미포함이 기본 (모든 언어에서 동일한 내용)
 		// Set<Integer> sortedSet2 = treeSet.tailSet(20); //Set으로 다 받을 수 있다.
 		System.out.println(sortedSet);
 		
 		// 12. NavigableSet<E> tailSet(E element, boolean inclusive) : true ->element 값 포함
 		// false -> element값 포함x
 		NavigableSet<Integer> navigableSet2 = treeSet.tailSet(20, false);
 		System.out.println(navigableSet2);
 		System.out.println("===특정 범위의 값 가져오기 subSet()====");
 		
 		// 13. SortedSet<E> subSet(E element, E element) : 특정 범위의 값을 set으로 담을 때.
 		SortedSet sSet3=treeSet.subSet(10, 20); //10과 20사이의 범위의 값
 		System.out.println(sSet3); //시작값은 포함, 끝값은 미포함(모든 프로그램에서 기본)
 		// 시작값: 10, 끝값 : 20
 		
 		// 14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
 		NavigableSet<Integer> nSet4 = treeSet.subSet(10, true, 20, true);
 		//시작값, 끝값 모두 출력
 		System.out.println(nSet4);
 		
 		System.out.println("=====반대로 정렬하기 descendingSet()========");
 		
 		// 15. NavigableSet<E> descendingSet() : 현재 정렬을 기준으로 반대로 정렬한다.  
 		//원래 뜻 : descending <내림차순> -> ascending으로
 		System.out.println(treeSet); //오름차순 정렬 방식
 		
 		NavigableSet<Integer> descendingSet = treeSet.descendingSet(); //내림차순 정렬
 		Set<Integer> dSet = treeSet.descendingSet();
 		System.out.println(descendingSet);
 		
 		NavigableSet<Integer> descendingSet2 = descendingSet.descendingSet(); //오름차순 정렬
 		System.out.println(descendingSet2);
	}

}
