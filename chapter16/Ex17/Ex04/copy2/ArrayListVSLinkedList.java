package chapter16.Ex17.Ex04.copy2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList vs LinkedList
// ArrayLsi : 값에 대해서 index 값을 가지고 있다. 검색 속도가 빠르다.
	// 단점 : 중간에서 값을 추가/ 삭제시 부하가 굉장히 많이 걸린다.

// LinkedList : 각각의 값은 앞 뒤의 연결고리만 가지고 있다. 검색시에 index방 번호가 할당된다. 검색이 ArrayList에 비해서 느리다.
	// 장점 : 중간에 값을 추가/ 삭제시 부하가 걸리지 않는다.

public class ArrayListVSLinkedList {
	public static void main(String[] args) {
		// 1. 데이터를 추가 시 시간 비교
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime = 0, endTime = 0;
		
		// 1-1 Array List에서 데이터 추가 시간
		startTime = System.nanoTime(); //System.nanoTime():
		for (int i = 0; i < 100000; i++) {
			aList.add(0, i); // 0번방에 i를 넣겠다. -> 0번방에 계속 값이 들어가면서 값이 '바뀌면서' 뒤로 밀려감 -> 부하생김
				// 0번째 방에 계속해서 10만번째 까지 
			// aList.add(i) -> 이거는 그냥 값만 뒤로 쭉쭉 들어가기 때문에 부하가 생기진 않음
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 추가 시간" + (endTime - startTime) + "ns"); //840214400ns
		
		// 1-2 LinkedList에서 데이터 추가 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("Linkedlist에서 데이터 추가 시간" + (endTime - startTime) + "ns");
			// 176617800ns : 250배 정도 빠르다.
		
		System.out.println("=======================");
		
		//2. 검색시 비교 :Array List가 LinkedList보다 빠르다.
		
		// 2-1. Array List에서 데이터 검색 시간 : 5274100ns
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.get(i); // i를 10만번 get해옴
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 검색 시간" + (endTime - startTime) + "ns");
		
		// 2-2 LinkedList에서 데이터 검색 시간 : 6437019200ns
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("Linkedlist에서 데이터 검색 시간" + (endTime - startTime) + "ns");
		
		//3. 데이터 삭제시ㅣ 실행시간 비교 : LinkedList가 휠씬 빠르다.
		// 3-1. ArrayList : 744981300ns
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.remove(0); // 0번을 제거하면 뒤에걸 앞당겨옴, 다른 자리를 제거하면 의미 없음
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 삭제 시간" + (endTime - startTime) + "ns");
		
		// 3-2. LinkedList : 6642400ns
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.remove(0); // 0번을 제거하면 뒤에걸 앞당겨옴, 다른 자리를 제거하면 의미 없음
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에서 데이터 삭제 시간" + (endTime - startTime) + "ns");
		
	}

}
