package chapter17.Ex12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

//TreeMap : ����ÿ� Key�� �������� �������� ���ĵǾ� �����
	// ��½ÿ� �������� ���ĵǾ� ���. 
	// Key�� �Ϲ� ��ü�� ������ �� 
		// 1. Comparable<E> �� compareTo()������ <== ��ü ���� �� ��������
		// 2. Comparator<E>�� compare()�� ������ <==��ü �������� ��� , 

// Map<K,V> <== SortedMap<K,V> (���ĸ޼��� ����) <== NavigableMap<K,V> (�˻� �޼��� ����) <== TreeMap<K,V>
	// TreeMap�� ����� ���� Ÿ���� TreeMap���� �����ؾ� �˻��� ������ �޼��带 ����� �� �ִ�.
public class TreeMapMethod {

	public static void main(String[] args) {
		// TreeMap<K,V> �� Map<K,v>�޼��鸣 ��� ���, �߰�������Sportedmap, NavigableMap�� �߰����� �޼��带 ���
		TreeMap<Integer, String> treeMap = new TreeMap();
		for (int i = 20; i < args.length; i-=2) {
			treeMap(i, i+"����° ������");
		}
		System.out.println(treeMap);  // key�������� �Ǹ����� ����-------b
		// 1. firstKey() : ���� ù��° ���� ������ֱ�
		
		System.out.println(treeMap.firstKey()); //2
		
		///,firstEntry() : entry = Key _ alj
		
		// 3. lastKey =() ��ī������
		System.out.println(treeMap);
		
		//4 lastEnb.
		
		// .5 lowerKey (K key, : �Է¹��� Ű�� ���� Ű�� ���
		System.out.println(treeMap.lowerEntry(10));
		// 6. higheSystem.out.println(treeMaploner.loc);rKey (K key):
		
		// 7. pollFirstEntry() : ù��° ��Ű�� ���� ������ ���´�.
		System.out.println(treeMap.pollFirstEntry());
		// 8. poollLastEntry() : ������ Ű�� ���� ������ ���´�.
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		
		// 9. SortedMap<K,V> headMap(K tokey) : ��ǲ ���� Ű�� head������ ó��
		SortedMap<Integer, String> sortedMap = treeMap.headMap(8); //
		System.out.println(sortedMap); //8�� ������ �������� ���
		
		//10. NavigableMap<K,V> headMap(K key, boolean inculsive)
		NavigableMap<Integer, String> nMap = treeMap.headMap(8, true);
		
		// 11. SortedMap<K,V> tailMap(K tokey)
		SortedMap<Integer, String> sortedMap2 = treeMap.tailMap(14); //14�����ϰ� �������� ���
		System.out.println(sortedMap2);
		
		//12. NavigableMap<K,V> tailMap(K tokey, boolean inculsive)
		NavigableMap<Integer, String> nMap2 = treeMap.tailMap(14,false);
		System.out.println(nMap2);
		
		//13 . SortedMap<K,V> subMap (K formkey, K tokey) :Ư�� ������ ���� ����
		SortedMap<Integer, String> subMap = treeMap.subMap(6, 10);
		System.out.println(subMap);
		
		// 14. Navigable<K,V> SubMap( K fromkey, boolean inclusive, K tokey, boolean inclusive)
		NavigableMap<Integer, String> nsubMap = treeMap.subMap(6, true, 10, true);
		System.out.println(nsubMap);
		
		// 15. NavigableSet<K> descendingKeySet() : ���� Key������ �ݴ�� ���
		NavigableSet<Integer> navigableSet =treeMap.descendingKeySet();
		System.out.println(navigableSet);
		System.out.println(navigableSet.descendingIterator());
		
		// 16. NavigableMap<K,V> decendingMap() : ���� ������ �ݴ�� ���
		NavigableMap<Integer, String> navigableMap = treeMap.descendingMap();
		System.out.println(navigableMap);
		System.out.println(navigableMap.descendingMap()); //Map�̱� ������ key�� value��� ��µ�
 	}

	private static void treeMap(int i, String string) {
		// TODO Auto-generated method stub
		
	}

}
