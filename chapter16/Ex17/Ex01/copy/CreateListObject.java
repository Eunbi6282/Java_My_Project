package chapter16.Ex17.Ex01.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
	public static void main(String[] args) {
		// 1. List���� Ŭ������ �����ڸ� ����Ͽ� ��ü ����
			// List�� �������̽� �̹Ƿ� new Ű �ڿ� �� �� ����(��ü ����x), Ÿ�������� ����
		// capacity : �޸��� ���� ũ�⸦ �Ҵ�, �⺻���� 10 �����ڿ� �ִ� �� -> �޸𸮿� �����Ҵ�,
		// size() : �濡 ����� ���� ���� <<===== 
		
		List<Integer> aList1 = new ArrayList<>(); //capacity = 10(�⺻��)
		List<Integer> aList2 = new ArrayList<>(30); //capacity = 30, �޸� ���� Ȯ��
		
		List<Integer> aList3 = new Vector<>();
		List<Integer> aList4 = new Vector<>(30); // ���� Ȯ�� 30
		
		List<Integer> aList5 = new LinkedList<>();
		// List<Integer> aList6 = new LinkedList<>(40); // LinkedList�� ���� ������ �Ҵ� ����, �⺻���� ������ ��� ���� 
		
		// 2. Arrays Ŭ������ ���� �޼��带 �̿��ϴ� ��� : ������ ũ�⸦ �ٲ��� ����, �迭�� ���� �氳��(������ũ��)�� ������ �ʰ� ������
			//����, ����, �Ϸ�24�ð� ������쿡 ��� ((������ ũ�� �����Ǿ� �ִ� ���)
		List<Integer> aList7 = Arrays.asList(1,2,3,4); 	// ������ ��
		List<String> aList8 = Arrays.asList("��","ȭ","��","��","��","��","��"); 
		aList7.set(1, 7);	//set() : ������ �ִ� ���� �߰�, ������ �� index 1�� 7�� �ְڴ�.
		//aList7.add(5); //�����߻� -> ���ȣ�� 4���ε� �������������� 5�� �߰��Ѵ�? �ȵ�(������ ũ�� �����Ǿ� ����)
			//add()-> ���������� ���� �� �߰��� �� ���
		
		aList8.set(0, "��");
		// aList8.add("�Ͽ���") -> �����߻� , �� �߰��� �ȵ� asLsitƯ���� ���� �����Ǿ� �ֱ� ������ 
		System.out.println(aList7);
		System.out.println(aList8);
		

	}

}
