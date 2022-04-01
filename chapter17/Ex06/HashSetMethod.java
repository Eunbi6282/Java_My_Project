package chapter17.Ex06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set<E> : /�������̽�/ ���ȣ(index)�� ����. �ߺ��� ���� ���� �� ����.
	- HashSet : �ߺ��� ���� ���� �� ����. ���� ������ ������� �������� �ʴ´�.  (������ ���)
	- LinkedHashSet : �ߺ��� ���� ���� �� ����. ��½� ������� ���(Link�� �����ֱ� ����)
	- TreeSet : ����� �� ���� ������ �Ǿ ����, ascending(�������� ����) : 0 -> 9, a -> z , �� -> ��
				descending (�������� ����) : 9 -> 0, z -> a, �� -> ��
	 
	 */

public class HashSetMethod {

	public static void main(String[] args) {
		Set<String> hSet1 = new HashSet<>(); // Set�� �������̽� �̹Ƿ� Ÿ�����θ� ���� ����(������ ���)
		
		//1. add(E element)
		hSet1.add("��"); hSet1.add("��"); hSet1.add("��");  // "��"�� �ߺ����� ���������� �ߺ����� ���� �ʴ´�. 
		System.out.println(hSet1);  // "��"�� �ߺ����� ���������� �ߺ����� ���� �ʴ´�. 
		System.out.println(hSet1.toString()); //toString()�� ������ �Ǿ��ִ�. 
		 
		// 2. addAll(�ٸ� set��ü) : �ڽ��� Set�� �ٸ� Set�� ����� ���� �߰�
		Set<String> hSet2 = new HashSet<>();
		hSet2.add("��"); hSet2.add("��");
		hSet2.addAll(hSet1);
		System.out.println(hSet2);
		
		// 3. romove (Object o) : ������ ����, (List�� ��� ���ȣ�� ����)
		hSet2.remove("��");
		System.out.println(hSet2);
		
		// 4. clear() : ��� ����
		hSet2.clear();
		System.out.println(hSet2);
		
		// 5. isEmpty() : ��� ������ true, ��� ���� ������ false
		System.out.println(hSet2.isEmpty());
		
		// 6. contains (Object 0 ) :���� Set�� �����ϸ� true, �������� ������ false
		Set<String> hSet3 = new HashSet<>();
		hSet3.add("��"); hSet3.add("��"); hSet3.add("��");
		System.out.println(hSet3); // �����ϰ� ��µ�
		System.out.println(hSet3.contains("��")); // ���ԵǾ� �ִ��� -> true
		System.out.println(hSet3.contains("��")); // ���ԵǾ� �ִ��� -> false
		
		// 7. size() : Set�� ���Ե� ���� ����
		System.out.println(hSet3.size()); //3
		
		System.out.println("============iterator()�� ����� ���===============");
		
		// 8. iterator() : Set�� index�� ������ �ʴ´�. for���� ���ȣ�� ���� ��� -> ���ȣ�� ��� �����Ѥ�
			// but EnhancedFor���� ��� ����
		// iterator : ��ȸ�� ,Set�� ������ ��ȸ�ϸ鼭 ��½����ش�. 
			// hasNext() : Set�� ���� �����ϸ� true, �������� ������ false
			// next() : ���� ���� ����ϰ� ���������� �̵�
		
		Iterator<String> iterator = hSet3.iterator(); // ����Ϸ��� ��ü�� iterator()�� ���� ��������� ��
		 	// Ŭ����<E> ������ü = Set��ü.iterator
		while(iterator.hasNext()) { // ���� �����ϸ� true�ؼ� ���� ���� ���
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("=======EnhancedFor���� ����ؼ� ���=======");
		for (String k : hSet3) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("===============================");
		
		// 9. toArray() : Set�� ���� �迭�� ������. 
			// �⺻������ toArray()�� Object Ÿ������ ���� -> �ٿ�ĳ���� �ʿ�
		Object[] objArray = hSet3.toArray(); // set�� �ִ� ������ �迭�� ����
		System.out.println(Arrays.toString(objArray));
		for (int i = 0; i < objArray.length; i++) {
			System.out.print(objArray[i] + " ");
		}
		System.out.println();
		for (Object k : objArray) {
			System.out.print(k + " ");
		}
		
		// 10. toArray(T [] t) : �ٷ� �ٿ�ĳ���� �� �� ���
		String[] strArray1 = hSet3.toArray(new String[0]); // String������ �迭�� �ٲ���
			// 0: ���� ũ�⸦ ���� (�Ϲ������� 0���� ����)
			// ���� ũ�Ⱑ ���� ������ ���� ��� �����Ϸ��� Set�ȿ� �� �ִ� ���� ũ�� ��ŭ ����
		System.out.println(Arrays.toString(strArray1));
		
		// 11. ���� Set�� ������ ���� ũ�⸦ ũ�� ���� ���� Null ���� �� �� �ִ�.
		String[] strArray2 = hSet3.toArray(new String[5]); 
		System.out.println(Arrays.toString(strArray2));
		System.out.println("================================");
		
		// 12. iterator�� ���
		Set <Integer> intSet1 = new HashSet<>();
		intSet1.add(30); intSet1.add(50); intSet1.add(100); intSet1.add(0);
		
		Iterator<Integer> i1 = intSet1.iterator();
        // iterator���(for)
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
