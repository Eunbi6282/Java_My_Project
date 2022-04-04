package chapter17.Ex08;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//TreeSet : ��½� ���ĵǾ ���(�������� ����(ascending))
	// ��½� �˻��� �޼��尡 ��
	// ������ ���� ������ Set�� ���ĵǾ �����, ��½ÿ� ������������ ���ĵǾ ���
	//Set <- SortedSet(���� �޼��� ����) <- NavigableSet(�˻��޼��� ����) <- TreeSet
	// TreeSet<String> treeSet = new TreeSet<String>(); -> Ÿ���� TreeSet���� �����ؾ� ����/ �˻���� ��� ����
	//Set �������̽��� ��� �޼��� ���. �߰������� ���ĸ޼���, �˻� �޼��带 ��밡��

public class TreeSetMethod {
	public static void main(String[] args) {
		// TreeSet�� ���� �־��� ��� �������� ���ĵǾ ���� Set�� ����, ��½� �������� ���ķ� ���
		TreeSet<Integer> treeSet = new TreeSet<>();
		for (int i = 50; i > 0; i-=2) {  // 50,48,46,
			treeSet.add(i); // ���������� ������ ���� ���� �� ������������ ���ĵǾ� ���� ����.
		}
		System.out.println(treeSet);
		
		System.out.println("=========data �˻�(��������)==============");
		//TreeSet������ ��밡���� �޼���(1 ~15)
		//1. first()	: ���� ó������ ����
		System.out.println(treeSet.first()); // 2
		//2. last()		: ���� ������ ���� ����
		System.out.println(treeSet.last()); // 50
		//3. lower(E element) : element���� �ٷ� ���� ���� ���� ���
		System.out.println(treeSet.lower(26)); //24
		//4. higher(E element) : element ���� �ٷ� ���� ū���� ���
		System.out.println(treeSet.higher(26)); //28
		//5. floor (E element) : element�� �����ؼ� �������� ���
		System.out.println(treeSet.floor(25)); //24
		System.out.println(treeSet.floor(26)); //26 (element�� ���ԵǸ� element�� ���)
		//6. ceiling(E element) : element�� �����ؼ� ū���� ���
		System.out.println(treeSet.ceiling(25)); //26
		System.out.println(treeSet.ceiling(26)); //26 (26�� �����ؼ� 26���� ū��)
		
		System.out.println("=======������ ������==============");
		//7. pollFirst() : ���� ù��° �� ��������
		int treeSetSize = treeSet.size();
		
		System.out.println();
		System.out.println(treeSetSize); //size -> 25
		for(int i = 0; i <treeSetSize ; i++) {
			System.out.println(treeSet.pollFirst()); //size��ŭ ������ ���鼭 ù��° ���� ��������
		}
		System.out.println();
		System.out.println(treeSet.size()); //0 -> �������鼭 50���� �� ������(treeSet�� ���� 0)
		
		//8. pollLast() :  ���� ������ �� ��������
		for(int i = 50; i > 0 ; i-= 2) {
			treeSet.add(i); 	//������������ ���ĵǾ ����
		}
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize); //25
		System.out.println(treeSet);
		System.out.println();
		
		for(int i = 0 ; i < treeSetSize; i++) {
			System.out.println(treeSet.pollLast()); // 50���� ������ͼ� ����
		}
		System.out.println(treeSet.size()); //0
		
		System.out.println("======����======");
		//9. SortedSet<E> headSet(E element) : ������ ����ϱ� ���ؼ� SortedSet<E> ��ü�� ����
			//SortedSet<E> : ���ĵ� �����͸� �����ϴ� Set
			// headSet( E element) : element�� Head������ ���� ���� <- element���� ������
 		for (int i = 50; i> 0 ; i -= 2) {
			treeSet.add(i);  //������������ ���ĵǾ treeSet�� ����
		}
 		System.out.println(treeSet);
 		SortedSet<Integer> set = treeSet.headSet(20); //20�� �������� ������ ����
 			//headSet(20)�� SortedSet���� ���ϰ��� ������
 		// Set<Integer> set1 = treeSet.headSet(20); //���� Ÿ�� Set�� ����
 		System.out.println(set);
		
 		// 10. NavigableSet<E> headSet(E element, boolean inclusive) 
 		NavigableSet<Integer> navigableSet = treeSet.headSet(20, true); 
 		// true ->element �� ����
 		// false -> element�� ����x
 		System.out.println(navigableSet);
 		
 		// 11. SortedSet<E> tailSet(E element)
 		SortedSet<Integer> sortedSet = treeSet.tailSet(20); 
 			// <-element(���۰�)����, ������ �������� �⺻ (��� ���� ������ ����)
 		// Set<Integer> sortedSet2 = treeSet.tailSet(20); //Set���� �� ���� �� �ִ�.
 		System.out.println(sortedSet);
 		
 		// 12. NavigableSet<E> tailSet(E element, boolean inclusive) : true ->element �� ����
 		// false -> element�� ����x
 		NavigableSet<Integer> navigableSet2 = treeSet.tailSet(20, false);
 		System.out.println(navigableSet2);
 		System.out.println("===Ư�� ������ �� �������� subSet()====");
 		
 		// 13. SortedSet<E> subSet(E element, E element) : Ư�� ������ ���� set���� ���� ��.
 		SortedSet sSet3=treeSet.subSet(10, 20); //10�� 20������ ������ ��
 		System.out.println(sSet3); //���۰��� ����, ������ ������(��� ���α׷����� �⺻)
 		// ���۰�: 10, ���� : 20
 		
 		// 14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
 		NavigableSet<Integer> nSet4 = treeSet.subSet(10, true, 20, true);
 		//���۰�, ���� ��� ���
 		System.out.println(nSet4);
 		
 		System.out.println("=====�ݴ�� �����ϱ� descendingSet()========");
 		
 		// 15. NavigableSet<E> descendingSet() : ���� ������ �������� �ݴ�� �����Ѵ�.  
 		//���� �� : descending <��������> -> ascending����
 		System.out.println(treeSet); //�������� ���� ���
 		
 		NavigableSet<Integer> descendingSet = treeSet.descendingSet(); //�������� ����
 		Set<Integer> dSet = treeSet.descendingSet();
 		System.out.println(descendingSet);
 		
 		NavigableSet<Integer> descendingSet2 = descendingSet.descendingSet(); //�������� ����
 		System.out.println(descendingSet2);
	}

}
