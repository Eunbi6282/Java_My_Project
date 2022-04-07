package chapter17.Ex12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// Map ���� : K�� �ߺ��� �� ����. Value�� �ߺ� �Ұ���
	// 1. HashMap :Key�� �������� ����� �����ϰ� ���, �񵿱�ȭ -> �̱� ������ ȯ��
	// 2. HashTable : ��� �޼��尡 ����ȭ �Ǿ� �ִ�. ��Ƽ ������ ȯ�濡�� ����
	// 3. LinkedHashMap : �Է¼������ ��µ�
	// 4. TreeMap : �������� ���ĵǾ� �Է�, Comparable <E> Comparator<E>

public class MapSummary {

	public static void main(String[] args) {
		// 1. HashMap : �Է¼����� ��� ������ �ٸ���. 
		Map <String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("��", 30);
		hashMap.put("��", 40);
		hashMap.put("��", 50);
		hashMap.put("��", 60);
		System.out.println(hashMap);
		
		// 2. HastTable : �Է¼����� ��¼����� �ٸ���. <����ȭ �Ǿ� �ִ�> <��Ƽ ������ ȯ��>
		Map <String, Integer> hashTable = new Hashtable<>();
		hashMap.put("��", 30);
		hashMap.put("��", 40);
		hashMap.put("��", 50);
		hashMap.put("��", 60);
		System.out.println(hashTable);
		
		// 3. LinkedHashMap : �Է¼����� ��¼����� ����. 
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("��", 30);
		linkedHashMap.put("��", 40);
		linkedHashMap.put("��", 50);
		linkedHashMap.put("��", 60);
		System.out.println(hashTable);
		
		// 4. TreeMap : �������� ���ĵǾ� ����(Map <K,V>  : Key�� �������� �������� ����)
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("��", 30);
		treeMap.put("��", 40);
		treeMap.put("��", 50);
		treeMap.put("��", 60);
		System.out.println(hashTable);
		
		
	}

}
