package chapter17.Ex08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set : 중복되지 않는 값을 저장(equals(),hashCode()메서드를 재정의, Wrapper 클래스들은 모두 재정의 되어있다. 
	// 1. HashSet : 출력되는 것이 랜덤하게 출력
	// 2. LinkedHashSet : 입력되는 대로 출력
	// 3. TreeSet : 입력값을 넣으면 내부적으로 정렬. 순서대로 출력
public class SetSummary {

	public static void main(String[] args) {
		// 1. HashSet
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("다");
		hashSet.add("마");
		hashSet.add("나");
		hashSet.add("가");
		System.out.println(hashSet);
		
		//LinkedHashSet
		Set<String> linkedhashSet = new LinkedHashSet<String>();
		linkedhashSet.add("다");
		linkedhashSet.add("마");
		linkedhashSet.add("나");
		linkedhashSet.add("가");
		System.out.println(linkedhashSet);
		
		// TreeSet -> 정렬되어서 출력 Comparable<E> 의 compareTo(), Comparator<E> 의 compare() 재정의 필요
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("다");
		treeSet.add("마");
		treeSet.add("나");
		treeSet.add("가");
		System.out.println(treeSet);
	}

}
