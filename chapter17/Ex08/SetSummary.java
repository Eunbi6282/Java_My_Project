package chapter17.Ex08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set : �ߺ����� �ʴ� ���� ����(equals(),hashCode()�޼��带 ������, Wrapper Ŭ�������� ��� ������ �Ǿ��ִ�. 
	// 1. HashSet : ��µǴ� ���� �����ϰ� ���
	// 2. LinkedHashSet : �ԷµǴ� ��� ���
	// 3. TreeSet : �Է°��� ������ ���������� ����. ������� ���
public class SetSummary {

	public static void main(String[] args) {
		// 1. HashSet
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		System.out.println(hashSet);
		
		//LinkedHashSet
		Set<String> linkedhashSet = new LinkedHashSet<String>();
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		System.out.println(linkedhashSet);
		
		// TreeSet -> ���ĵǾ ��� Comparable<E> �� compareTo(), Comparator<E> �� compare() ������ �ʿ�
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		System.out.println(treeSet);
	}

}