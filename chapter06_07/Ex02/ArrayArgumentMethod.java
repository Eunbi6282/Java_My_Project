package chapter06_07.Ex02;

import java.util.Arrays;

public class ArrayArgumentMethod {
	
	// static �� �ְ� ���� class�ȿ� ���� : �޼ҵ� �̸����� �ٷ� ȣ�� ����
	// public : �ٸ� ��Ű������ ���� �����ϵ��� ���� (����������)
	// ���������� : public, protected, default, private
	// ���������ڰ� �����Ǿ� ������ : default (���� ��Ű������ ���� ����)
	public static void printArray (int[] a ) {		//static �� �ְ� ���� class�ȿ� ����
		System.out.println("========Arrays.toString() ����ؼ� ���===========");
		System.out.println(Arrays.toString(a));
		
		System.out.println("========for�� ����ؼ� ���===========");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.println("========enhanced for�� �����ؼ� ���===========");
		for (int k : a) {
			System.out.print(k+ " ");
		}
	}
	public static void main(String[] args) {
		// �迭�� �Ű� ������ ������ �޼ҵ� ȣ��
		
		int [] a = new int[] {1,2,3};		//�迭 ���� ���� �� ���� ���� �� ��� 
		printArray(a);
		
		printArray(new int[] {4,5,6,7,8,9}); //
		
		
		// printArray({1,2,3); -> �����߻�
	}

}
