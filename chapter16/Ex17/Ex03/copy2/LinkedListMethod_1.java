package chapter16.Ex17.Ex03.copy2;

//LinkedLis vs ArrayList


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethod_1 {
	public static void main(String[] args) {
		/* List�� �޼��� (13��)
		 	1. ArrayList
		 	2. Vector
		 	3. LinkedList
		 */
		
		List<Integer> linkedlist1 = new LinkedList <Integer>();
		// 1. add(E element) : ������ ���� ���� �߰�
		linkedlist1.add(3); linkedlist1.add(4); linkedlist1.add(5);
		System.out.println(linkedlist1);
		System.out.println(linkedlist1.size()); 	// 3

		//2. add(int index, E element)
		linkedlist1.add(1, 6); 	// ���ȣ 1���� 6�� �߰�
		System.out.println(linkedlist1);
		
		//3. addAll( �Ǵٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		List<Integer>linkedlist2 = new LinkedList<>();
		linkedlist2.add(1);
		linkedlist2.add(2);
		
		linkedlist2.addAll(linkedlist1); 	//aLsit1�� ����� ���� �����ؼ� aList2�� �߰���
		System.out.println(linkedlist2);
		
		//4. addAll(int index, �� �ٸ� ��ü)
		List<Integer> linkedlist3 = new LinkedList<>();
		linkedlist3.add(1);
		linkedlist3.add(2);
		
		linkedlist3.addAll(1,linkedlist3); // �ڽ��� ���� �ٸ� ��ü�� �߰�
			// 1���� ������ �ڱ� ��ü�� ���� �߰�
		System.out.println(linkedlist3);
		
		//5. set(int index, E element) : Ư�� ���ȣ�� ���� ����
		linkedlist3.set(1, 5);	// 1�����ȣ�� ���� 5�� �����ض�
		linkedlist3.set(3, 6);
		// aList3.set(4, 7); -> �����߻� (4������ �������� ����)
		System.out.println(linkedlist3);
		
		//6. remove (int index) : Ư�� ���ȣ�� ���� ����,
		linkedlist3.remove(1); // ���ȣ 1���� �ִ� ���� ����, ���ȣ�� �����ϴ°���!!!!
			// �����Ǹ� �ڿ� �ִ� ���� ������ ���ܿ�
		System.out.println(linkedlist3); // 1������ ���� �����ǰ� ���� ������ ������ �����
		
		// 7. remove(Object O) :������ ����
		linkedlist3.remove(new Integer(2)); //������ ������ �� �� �ִ�. , �� 2�� ������
		System.out.println(linkedlist3);
		
		// 8. clear() : ��� ����
		linkedlist3.clear();
		System.out.println(linkedlist3);
		
		// 9. isEmpty(): ���� ��������� true, �׷��� ������ false
		System.out.println(linkedlist3.isEmpty()); //true -> �տ��� clear����س� ������
		
		// 10. size() :���� ����, ���� ����
		System.out.println(linkedlist3.size());
		linkedlist3.add(1); linkedlist3.add(2);linkedlist3.add(3);
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		
		System.out.println("=========");
		
		// 11 . get(int index) : ���ȣ�� ���� ���
		System.out.println(linkedlist3.get(0));
		System.out.println(linkedlist3.get(1));
		System.out.println(linkedlist3.get(2));
		
		System.out.println("===========");
		
		// 12.toArray() : List(����Ʈ) ----> Array (�迭)�� ��ȯ
		System.out.println(linkedlist3); //List�϶� toString()�� ������ �Ǿ��ֱ� ������ ���� ����Ѵ�.
		
		Object[]objects = linkedlist3.toArray(); //�⺻������ toArray()�޼���� ObjectŸ������ ������ ��/ List�� �迭Ÿ������ 
			// �ٿ�ĳ���� �ʿ�
		System.out.println(Arrays.toString(objects)); //�迭�� ���� Arrays.toString()���
		
		System.out.println("============");
		
		//13-1 toArray(T[] t)  ===> tŸ������ �ٷ� ��ȯ ����
			//Integer�� �ٷ� ĳ����, �ٿ�ĳ���� �ʿ�x
		Integer[] integer1 = linkedlist3.toArray(new Integer[0]);
		//Integer[0]-> ���� ũ�� ���� �۰� �־��� : ���� ���� ����Ǿ��ִ� �������� ���
		System.out.println(Arrays.toString(integer1));
		
		//13-2 toArray(T[] t)  ===> tŸ������ �ٷ� ��ȯ ����
		//Integer�� �ٷ� ĳ����, �ٿ�ĳ���� �ʿ�x
		Integer[] integer2 = linkedlist3.toArray(new Integer[5]);
		//Integer[5]-> ���� ũ�� ���� �� Ŭ �� : ����ִ� �κп� null���� ��µ�
		System.out.println(Arrays.toString(integer1));
		
		//toArray�� �⺻������ ObjectŸ���̾ Integer�� �ٿ�ĳ���� �ʿ��� �׷��� toArray(T[] t)����ؼ� �ٷ� �ٿ�ĳ����
		
		
		
		
		
		
		
	}

}
