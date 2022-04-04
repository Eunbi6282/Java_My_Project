package chapter17.Ex07;

//LinkedHashSet : ���� ������ �� ���� ���� ��ġ������ �� ���� ��ġ ������ ������.
	//HashSet�� ������ : ��� �޼��尡 �����ϴ�. �ߺ��� ���� �������� �ʴ´�. ���ȣ(index)���� ������ �ʴ´�., �⺻ for������ ����� �� ����.(iterator, EnhancedFor�� ���)
	// 	�ٸ��� : HashSet�� �Է´�� ��µ��� �ʴ´�.LinkedHashSet�� �Է´�� ��µȴ�.
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* Set<E> : /�������̽�/ ���ȣ(index)�� ����. �ߺ��� ���� ���� �� ����.
	- HashSet : �ߺ��� ���� ���� �� ����. ���� ������ ������� �������� �ʴ´�.  (������ ���)
	- LinkedHashSet : �ߺ��� ���� ���� �� ����. ��½� ������� ���(Link�� �����ֱ� ����)
	- TreeSet : ����� �� ���� ������ �Ǿ ����, ascending(�������� ����) : 0 -> 9, a -> z , �� -> ��
				descending (�������� ����) : 9 -> 0, z -> a, �� -> ��
	 
	 */

//����Ű ���� Ȯ�� :ctrl + shift + L


public class LinkedHashSetMethod {

	public static void main(String[] args) {
		Set<String> linkedSet1 = new LinkedHashSet<>(); // Set�� �������̽� �̹Ƿ� Ÿ�����θ� ���� ����(������ ���)
		//Set�� ���ʸ� Ÿ�Ժ����� wrapperŬ������ ����� ���, equals()�� hashCode�� ������, toString()������ �Ǿ� ����
		//1. add(E element)
		linkedSet1.add("��"); linkedSet1.add("��"); linkedSet1.add("��");  // "��"�� �ߺ����� ���������� �ߺ����� ���� �ʴ´�. 
		System.out.println(linkedSet1);  // "��"�� �ߺ����� ���������� �ߺ����� ���� �ʴ´�. 
		System.out.println(linkedSet1.toString()); //toString()�� ������ �Ǿ��ִ�. 
		
		System.out.println("==========");
		 
		// 2. addAll(�ٸ� set��ü) : �ڽ��� Set�� �ٸ� Set�� ����� ���� �߰� : �ߺ��� �� ���ŵ�
		Set<String> linkedSet2 = new LinkedHashSet<>();
		linkedSet2.add("��"); linkedSet2.add("��");
		linkedSet2.addAll(linkedSet1);
		System.out.println(linkedSet2);
		
		// 3. remove (Object o) : ������ ����, (List�� ��� ���ȣ�� ����)
		linkedSet2.remove("��");
		System.out.println(linkedSet2);
		
		// 4. clear() : ��� ����
		linkedSet2.clear();
		System.out.println(linkedSet2);
		
		// 5. isEmpty() : ��� ������ true, ��� ���� ������ false
		System.out.println(linkedSet2.isEmpty());
		
		// 6. contains (Object 0 ) :���� Set�� �����ϸ� true, �������� ������ false
		Set<String> linkedSet3 = new LinkedHashSet<>();
		linkedSet3.add("��"); linkedSet3.add("��"); linkedSet3.add("��");
		System.out.println(linkedSet3); // �Է°� ����� ����
		System.out.println(linkedSet3.contains("��")); // ���ԵǾ� �ִ��� -> true
		System.out.println(linkedSet3.contains("��")); // ���ԵǾ� �ִ��� -> false
		
		// 7. size() : Set�� ���Ե� ���� ����
		System.out.println(linkedSet3.size()); //3
		
		System.out.println("============iterator()�� ����� ���===============");
		
		// 8. iterator() : Set�� index�� ������ �ʴ´�. for���� ���ȣ�� ���� ��� -> ���ȣ�� ��� �����Ѥ�
			// but EnhancedFor���� ��� ����
		// iterator : ��ȸ�� ,Set�� ������ ��ȸ�ϸ鼭 ��½����ش�. 
			// hasNext() : Set�� ���� �����ϸ� true, �������� ������ false
			// next() : ���� ���� ����ϰ� ���������� �̵�
		
		Iterator<String> iterator = linkedSet3.iterator(); // ����Ϸ��� ��ü�� iterator()�� ���� ��������� ��
		 	// Ŭ����<E> ������ü = Set��ü.iterator
		while(iterator.hasNext()) { // ���� �����ϸ� true�ؼ� ���� ���� ���
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("=======EnhancedFor���� ����ؼ� ���=======");
		for (String k : linkedSet3) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("===============================");
		
		// 9. toArray() : Set�� ���� �迭�� ������. 
			// �⺻������ toArray()�� Object Ÿ������ ���� -> �ٿ�ĳ���� �ʿ�
		Object[] objArray = linkedSet3.toArray(); // set�� �ִ� ������ �迭�� ����
		System.out.println(Arrays.toString(objArray));
		for (int i = 0; i < objArray.length; i++) {
			System.out.print(objArray[i] + " ");
		}
		System.out.println();
		for (Object k : objArray) {
			System.out.print(k + " ");
		}
		
		// 10. toArray(T [] t) : �ٷ� �ٿ�ĳ���� �� �� ���
		String[] strArray1 = linkedSet3.toArray(new String[0]); // String������ �迭�� �ٲ���
			// 0: ���� ũ�⸦ ���� (�Ϲ������� 0���� ����)
			// ���� ũ�Ⱑ ���� ������ ���� ��� �����Ϸ��� Set�ȿ� �� �ִ� ���� ũ�� ��ŭ ����
		System.out.println(Arrays.toString(strArray1));
		
		// 11. ���� Set�� ������ ���� ũ�⸦ ũ�� ���� ���� Null ���� �� �� �ִ�.
		String[] strArray2 = linkedSet3.toArray(new String[5]); 
		System.out.println(Arrays.toString(strArray2));
		System.out.println("================================");
		
		// 12. iterator�� ���
		Set <Integer> intSet1 = new LinkedHashSet<>();
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
