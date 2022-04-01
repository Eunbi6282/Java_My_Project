package chapter16.Ex17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {
	public static void main(String[] args) {
		// 1. ArrayList
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("다"); 
		arrayList.add("마"); 
		arrayList.add("나"); 
		arrayList.add("가");
		System.out.println(arrayList); // Arrays.toString메서드가 정의되어 있기 때문에 객체자체만 찍어도 값이 나옴
		
		// 2. Vector
		
		List<String> vector = new Vector<>();
		vector.add("다"); 
		vector.add("마"); 
		vector.add("나"); 
		vector.add("가");
		System.out.println(vector); // Arrays.toString메서드가 정의되어 있기 때문에 객체자체만 찍어도 값이 나옴
		
		// 3. LinkedList
				
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("다"); 
		linkedList.add("마"); 
		linkedList.add("나"); 
		linkedList.add("가");
		System.out.println(linkedList); // Arrays.toString메서드가 정의되어 있기 때문에 객체자체만 찍어도 값이 나옴

	}

}
