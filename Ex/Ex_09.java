package Ex;

import java.util.Iterator;

public class Ex_09 {
	public static void main(String[] args) {
//		 ������ 10 �� �����ϴ� �迭�� ����� 1 ���� 10 ���� ������ ������ ��
//		 ���ϰ� �����Ͽ� �迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ����϶�.
//		 ������ ������ : 3 6 3 6 1 3 8 9 6 9 
//		 ����� 5.4
//		 [Hint] 1 ���� 10 ���� ������ ������ �����ϰ� ������ ���� ���� �ڵ带 �̿���
//		 ��.
		
		int arr[] = new int [10];
		double sum = 0;
		
		System.out.print("������ ������ : ");
		for (int j = 0; j < arr.length; j++) {
			int i = (int)(Math.random()*10+1);
			arr[j] = i;
			System.out.print(arr[j] +" ");
			sum += arr[j];
		}
		
		System.out.println();
		System.out.println("����� " + sum/arr.length);
		//double�� ����Ÿ�� ��ȯ
		
		
		
			
			
	}
}
		
		
	


