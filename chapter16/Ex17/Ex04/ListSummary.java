package chapter16.Ex17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {
	public static void main(String[] args) {
		// 1. ArrayList
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("��"); 
		arrayList.add("��"); 
		arrayList.add("��"); 
		arrayList.add("��");
		System.out.println(arrayList); // Arrays.toString�޼��尡 ���ǵǾ� �ֱ� ������ ��ü��ü�� �� ���� ����
		
		// 2. Vector
		
		List<String> vector = new Vector<>();
		vector.add("��"); 
		vector.add("��"); 
		vector.add("��"); 
		vector.add("��");
		System.out.println(vector); // Arrays.toString�޼��尡 ���ǵǾ� �ֱ� ������ ��ü��ü�� �� ���� ����
		
		// 3. LinkedList
				
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("��"); 
		linkedList.add("��"); 
		linkedList.add("��"); 
		linkedList.add("��");
		System.out.println(linkedList); // Arrays.toString�޼��尡 ���ǵǾ� �ֱ� ������ ��ü��ü�� �� ���� ����

	}

}
