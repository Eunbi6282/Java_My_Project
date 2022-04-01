package chapter16.Ex17.Ex02;

// Vector : ArrayList�� ��� �޼��带 �����ϰ� ���.
	// Vector�� ��� �޼��尡 ����ȭó��(synchronized)�� �Ǿ� �ִ�. ��Ƽ ������ ȯ�濡 ���ǵ��� �Ǿ� �ִ�.-> ���� ���̰� ���ư�

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorMethod_1 {
	public static void main(String[] args) {
		/* List�� �޼��� (13��)
		 	1. ArrayList
		 	2. Vector
		 	3. LinkedList
		 */
		
		List<Integer>vector1 = new Vector<Integer>();
		// 1. add(E element) : ������ ���� ���� �߰�
		vector1.add(3); vector1.add(4); vector1.add(5);
		System.out.println(vector1);
		System.out.println(vector1.size()); 	// 3

		//2. add(int index, E element)
		vector1.add(1, 6); 	// ���ȣ 1���� 6�� �߰�
		System.out.println(vector1);
		
		//3. addAll( �Ǵٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		List<Integer>vector2 = new Vector<>();
		vector2.add(1);
		vector2.add(2);
		
		vector2.addAll(vector1); 	//aLsit1�� ����� ���� �����ؼ� aList2�� �߰���
		System.out.println(vector2);
		
		//4. addAll(int index, �� �ٸ� ��ü)
		List<Integer> vector3 = new Vector<>();
		vector3.add(1);
		vector3.add(2);
		
		vector3.addAll(1,vector3); // �ڽ��� ���� �ٸ� ��ü�� �߰�
			// 1���� ������ �ڱ� ��ü�� ���� �߰�
		System.out.println(vector3);
		
		//5. set(int index, E element) : Ư�� ���ȣ�� ���� ����
		vector3.set(1, 5);	// 1�����ȣ�� ���� 5�� �����ض�
		vector3.set(3, 6);
		// aList3.set(4, 7); -> �����߻� (4������ �������� ����)
		System.out.println(vector3);
		
		//6. remove (int index) : Ư�� ���ȣ�� ���� ����,
		vector3.remove(1); // ���ȣ 1���� �ִ� ���� ����, ���ȣ�� �����ϴ°���!!!!
			// �����Ǹ� �ڿ� �ִ� ���� ������ ���ܿ�
		System.out.println(vector3); // 1������ ���� �����ǰ� ���� ������ ������ �����
		
		// 7. remove(Object O) :������ ����
		vector3.remove(new Integer(2)); //������ ������ �� �� �ִ�. , �� 2�� ������
		System.out.println(vector3);
		
		// 8. clear() : ��� ����
		vector3.clear();
		System.out.println(vector3);
		
		// 9. isEmpty(): ���� ��������� true, �׷��� ������ false
		System.out.println(vector3.isEmpty()); //true -> �տ��� clear����س� ������
		
		// 10. size() :���� ����, ���� ����
		System.out.println(vector3.size());
		vector3.add(1); vector3.add(2); vector3.add(3);
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		System.out.println("=========");
		
		// 11 . get(int index) : ���ȣ�� ���� ���
		System.out.println(vector3.get(0));
		System.out.println(vector3.get(1));
		System.out.println(vector3.get(2));
		
		System.out.println("===========");
		
		// 12.toArray() : List(����Ʈ) ----> Array (�迭)�� ��ȯ
		System.out.println(vector3); //List�϶� toString()�� ������ �Ǿ��ֱ� ������ ���� ����Ѵ�.
		
		Object[]objects = vector3.toArray(); //�⺻������ toArray()�޼���� ObjectŸ������ ������ ��/ List�� �迭Ÿ������ 
			// �ٿ�ĳ���� �ʿ�
		System.out.println(Arrays.toString(objects)); //�迭�� ���� Arrays.toString()���
		
		System.out.println("============");
		
		//13-1 toArray(T[] t)  ===> tŸ������ �ٷ� ��ȯ ����
			//Integer�� �ٷ� ĳ����, �ٿ�ĳ���� �ʿ�x
		Integer[] integer1 = vector3.toArray(new Integer[0]);
		//Integer[0]-> ���� ũ�� ���� �۰� �־��� : ���� ���� ����Ǿ��ִ� �������� ���
		System.out.println(Arrays.toString(integer1));
		
		//13-2 toArray(T[] t)  ===> tŸ������ �ٷ� ��ȯ ����
		//Integer�� �ٷ� ĳ����, �ٿ�ĳ���� �ʿ�x
		Integer[] integer2 = vector3.toArray(new Integer[5]);
		//Integer[5]-> ���� ũ�� ���� �� Ŭ �� : ����ִ� �κп� null���� ��µ�
		System.out.println(Arrays.toString(integer1));
		
		//toArray�� �⺻������ ObjectŸ���̾ Integer�� �ٿ�ĳ���� �ʿ��� �׷��� toArray(T[] t)����ؼ� �ٷ� �ٿ�ĳ����
		
		
		
		
		
		
		
	}

}
