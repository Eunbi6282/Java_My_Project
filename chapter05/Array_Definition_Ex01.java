package chapter05;

import java.nio.channels.NonWritableChannelException;

public class Array_Definition_Ex01 {
	public static void main(String[] args) {
		/*
		 * �迭 ���� ���� ���
		 *  - �迭�� �ϳ��� �迭 ������ ���� �����͸� ����. 
		 *  - �迭�� ����� ������ �ڷ����� ���� ���� (�÷����� ���� ������ Ÿ���� ����)
		 *  - �迭�� �迭�� ���� ������ �� ũ�⸦ �����ϸ� �� ũ�⸣ ������ �� ����. 
		 *  	(�÷����� ��ũ�Ⱑ �ڵ����� �þ��.)
		 */
		
		//�迭 ���� ��� 1 : �ڷ��� �ڿ� ���ȣ�� �Ҵ�
		
		int[] array1 = new int[3];		// �迭�� ����� ���ÿ� ��ũ�⸦ �Ҵ��ϴ� ���
		
		int[] array2;					//�迭�� ������ ����
		array2 = new int[3];			//�迭�����l ��ũ�⸦ ����
		
		//�迭 ���� ���� ��� 2 : ������ �ڿ� ���ȣ�� �Ҵ�
		int array3[] = new int[3];		//�迭�� ����� ���ÿ� ��ũ�⸦ �Ҵ�
		
		int array4[];
		array4 = new int[3];
		
		
		//�پ��� �迭 ���� (�⺻ �ڷ��� �迭, ���� �ڷ��� �迭)
		boolean[] array5 = new boolean [3];	//boolean���� ���� �� ����
		int[] array6 = new int [5];
		double[] array7 = new double[7];
		String[] array8 = new String[9];
		
		
 		
	}

}
