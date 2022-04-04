package chapter16.Ex17.Ex04.copy2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList vs LinkedList
// ArrayLsi : ���� ���ؼ� index ���� ������ �ִ�. �˻� �ӵ��� ������.
	// ���� : �߰����� ���� �߰�/ ������ ���ϰ� ������ ���� �ɸ���.

// LinkedList : ������ ���� �� ���� ������� ������ �ִ�. �˻��ÿ� index�� ��ȣ�� �Ҵ�ȴ�. �˻��� ArrayList�� ���ؼ� ������.
	// ���� : �߰��� ���� �߰�/ ������ ���ϰ� �ɸ��� �ʴ´�.

public class ArrayListVSLinkedList {
	public static void main(String[] args) {
		// 1. �����͸� �߰� �� �ð� ��
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime = 0, endTime = 0;
		
		// 1-1 Array List���� ������ �߰� �ð�
		startTime = System.nanoTime(); //System.nanoTime():
		for (int i = 0; i < 100000; i++) {
			aList.add(0, i); // 0���濡 i�� �ְڴ�. -> 0���濡 ��� ���� ���鼭 ���� '�ٲ�鼭' �ڷ� �з��� -> ���ϻ���
				// 0��° �濡 ����ؼ� 10����° ���� 
			// aList.add(i) -> �̰Ŵ� �׳� ���� �ڷ� ���� ���� ������ ���ϰ� ������ ����
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ������ �߰� �ð�" + (endTime - startTime) + "ns"); //840214400ns
		
		// 1-2 LinkedList���� ������ �߰� �ð�
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("Linkedlist���� ������ �߰� �ð�" + (endTime - startTime) + "ns");
			// 176617800ns : 250�� ���� ������.
		
		System.out.println("=======================");
		
		//2. �˻��� �� :Array List�� LinkedList���� ������.
		
		// 2-1. Array List���� ������ �˻� �ð� : 5274100ns
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.get(i); // i�� 10���� get�ؿ�
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ������ �˻� �ð�" + (endTime - startTime) + "ns");
		
		// 2-2 LinkedList���� ������ �˻� �ð� : 6437019200ns
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("Linkedlist���� ������ �˻� �ð�" + (endTime - startTime) + "ns");
		
		//3. ������ �����ä� ����ð� �� : LinkedList�� �پ� ������.
		// 3-1. ArrayList : 744981300ns
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.remove(0); // 0���� �����ϸ� �ڿ��� �մ�ܿ�, �ٸ� �ڸ��� �����ϸ� �ǹ� ����
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ������ ���� �ð�" + (endTime - startTime) + "ns");
		
		// 3-2. LinkedList : 6642400ns
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.remove(0); // 0���� �����ϸ� �ڿ��� �մ�ܿ�, �ٸ� �ڸ��� �����ϸ� �ǹ� ����
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� ������ ���� �ð�" + (endTime - startTime) + "ns");
		
	}

}
