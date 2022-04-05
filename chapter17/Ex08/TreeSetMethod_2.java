package chapter17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

//!!!�߿�!!!!!

//TreeSet�� �Ϲ� ��ü�� ������ ���, Ư�� �ʵ带 ũ��� ���� �ʵ尡 �����ؾ� �Ѵ�.
	//1�� ��� : Comparable<E> �������̽��� compareTo() �޼��� ������: TreeSet�� �Ϲ� ��ü�� ������ �� �Ϲ� ��ü�� Ư�� �ʵ带 ������ �ؾ� �Ѵ�.
			// Comparable<E>�������̽��� ��� �� compareTo()��� ������,  ������ Ŭ������ �����ؼ� ���.

	// 2�� ��� : Comparator<E> �������̽� compare() �޼��带 ������ �� << �͸��ΰ�ü ���
			// ������ ��ü�� �������� �ʰ� ����� ��
			// TreeSet<E>��ü�� ������ �� �����ڿ� Comparator<E> �������̽��� ������ �͸�ü�� ����.

	// 3�� ��� : �͸� ���� ��ü�� ����ؼ� ó���ϴ� ���

//���� ����� �Ϲݰ�ü -> TreeSet�ȿ� �ȵ�(����ʿ�)
	//�Ϲ� Ŭ����
class Myclass{
	int data1;
	int data2;
	public Myclass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		return data1 + " " + data2;
	}
}

	//Comparable<E>�������̽��� ������ Ŭ���� ����
class MyComparableClass implements Comparable<MyComparableClass>{
	
	int data1;  	// <<== data1 �ʵ带 �� �������� ����, compareTo()������
	int data2;
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	

	@Override
	public int compareTo(MyComparableClass o) { 	//��ü�� ũ��񱳱����� �����ϴ� �޼���,<TreeSet���� ���>(���� , 0 , ���)
		
		// ��������
//		if(this.data1 < o.data1) { //�Ű������� o�� ����, this.data1 => ������
//			// �� �������� �ʵ�(this.data1)�� ������ ������(o.data1)�� �� / ex) al.compareTo(a2) /al-> this.data1, a2 -> o.data1
//			return -1; //����(this.data1) ���� ��(����) => ascending ����(�ݴ�� �ϸ� descending ��)
//		}else if (this.data1 == o.data1) {
//			return 0; 	//����(this.data1) ���� ��(0)
//		}else {
//			return 1; // ����(this.data1) �� Ŭ ��(���)
//		}
		
		//��������
		if(this.data1 < o.data1) { //�Ű������� o�� ����, this.data1 => ������
			// �� �������� �ʵ�(this.data1)�� ������ ������(o.data1)�� �� / ex) al.compareTo(a2) /al-> this.data1, a2 -> o.data1
			
			return 1; //����(this.data1) ���� ��(���) =>descending
		}else if (this.data1 == o.data1) {
			return 0; 	//����(this.data1) ���� ��(0)
		}else {
			return -1; // ����(this.data1) �� Ŭ ��(����)
		}
		}
	
	@Override
		public String toString() {
			return data1 + " " + data2;
		}
	
}

//TreeSet�� ���� : 1. �ߺ�������� �ʴ´�.(Set) 2. �������� ���ĵǾ� �Է� 3. ���ĵǾ� ���(��������) 4. �˻���� ��� ���� 5. Ư�� ������ ���� ���Ⱑ�� 6. asc(��������), desc(��������)

	//Set -> equals(),hashCode()�������ؼ� �� ��

public class TreeSetMethod_2 {

	public static void main(String[] args) {
		// wrapper Ŭ������ Comparable<E>�������̽��� comparTo()�� ������ �ϰ� �ִ�.
			//wrapper Ŭ������ ���� TreeSet�� ������ ���ĵǾ ����-> compareTo()�� �����ǵǾ� �ֱ� ����
		// 1. Integer wrapper Ŭ������ ũ�� ��
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>(); //treeSet1�� ����Ÿ�� ���� �� ����
		// Ÿ���� Set���� �����ϸ� �ȵȴ�.
		
		Integer intValue1 = new Integer(20); //ū��
		Integer intvalue2 = new Integer(10); // ���� ��
		//TreeSet���� ���� ������ ū ���� ���� �ִ��� ���������� ū������(��������) ���ĵǾ ��µ�
		
		treeSet1.add(intValue1);
		treeSet1.add(intvalue2);
		System.out.println(treeSet1);
		
		// 2. String wrapper Ŭ������ ũ�� ��
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("����"); //���� ��
		//String str1 = "����"; <- �̰͵� ����
		String str2 = new String("�ٶ�"); //ū��
		
		treeSet2.add(str1); //treeSet2.add()�� ����ؼ� ��ü�� ������ ��� ���� ��⸦ ���ϴ� �ʵ尡 ���� �Ǿ� �־�� �Ѵ�.
		treeSet2.add(str2); // Comparable<E> �������̽� ,compareTo()�޼��尡 ������ �Ǿ�� �Ѵ�.
		System.out.println(treeSet2);
		
		// 3. MyClass�� TreeSet�� ������ �ɱ�? ->X (�Ϲ� ��ü�ȿ��� ũ�⸦ ���ϴ� �޼��尡 ������ �ȵǾ��ֱ� ������ -> Comparable<E> �������̽��� compareTo()������ �ʿ�)
		
/*		TreeSet<Myclass> treeSet3 = new TreeSet<Myclass>();
		Myclass myclass1 = new Myclass(2, 5);
		Myclass myclass2 = new Myclass(3, 3);
		treeSet3.add(myclass1); //TreeSet���� Comparable<E>�������̽��� compareTo()�޼��带 �������� Ŭ������ ���� �� �ִ�.
		treeSet3.add(myclass2); //����� ���� �߻� ->ClassCastException:
		System.out.println(treeSet3);
*/		
		
		//4. MyComparableClass ��üũ�� �� (TreeSet�� �Ϲݰ�ü�� ����
			// ��� 1.  Comparable<E>�� compareTo()�� ������ (���� ��ü�� ���� �ʿ�)
		TreeSet<MyComparableClass> treeSet4 = new TreeSet<MyComparableClass>(); 
		MyComparableClass m1 = new MyComparableClass(2, 5); //TreeSet�� ����� �� Comparable<E>�� compareTo()�� ������ �ؾ��Ѵ�.
		MyComparableClass m2 = new MyComparableClass(5, 3); //5�� ���� �־����� 4, 3�� ���� ��µ�(���������� ���)
		MyComparableClass m3 = new MyComparableClass(4, 3);
		
		treeSet4.add(m1);
		treeSet4.add(m2);
		treeSet4.add(m3);
		
		System.out.println(treeSet4);
		
		System.out.println("=======================");
		
		//5. ���2. ������ ��ü�� �������� �ʰ� TreeSet�� ������ ���
			//TreeSet������ ���ο� Comparator<E> �������̽��� �����ؼ� �͸�ü�� ���� �׸��� compare()������
		//�͸� �ڽ� Ŭ���� �����ؼ� ���
		TreeSet<Myclass> treeSet5 = new TreeSet<Myclass>(new Comparator<Myclass>() {
			//Comparator�� �������̽��̱� ������ new�ؼ� ��ü ���� ���� �׷��� �ڽ�Ŭ������ �����ؼ� Ÿ������ �����ϰų� �͸��ڽ� Ŭ������ �����ؼ� ���
			@Override
			public int compare(Myclass o1, Myclass o2) {
				if (o1.data1 < o2.data1) { //o1.data1�� ����, o1.data1�� ������ -1 -> �������� ����ó��(data1)
					return -1;
				} else if (o1.data1== o2.data1) {
					return 0;
				}else {
					return 1;
				}
			} 
		});
		
		Myclass myClass1 = new Myclass(2, 5);
		Myclass myClass2 = new Myclass(3, 3);
		
		treeSet5.add(myClass1);
		treeSet5.add(myClass2);
		
		System.out.println(treeSet5);

	}

}
