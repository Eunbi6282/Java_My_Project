package Test;

import java.util.Arrays;

public abstract class Test_for_0228 {
	public static void main(String[] args) {
		
	int[]arr1 = new int[100];	// �ʱⰪ�� ���0
	
	//for���̿��� �̿��� arr1 �迭�� ���濡 ���� �Է�
	for (int i = 0; i < arr1.length; i++) {
		arr1[i] = i + 1;		//arr1[0 ~ 99] = i + 1; �迭 ������ �� insert
	}
	
	//��±��� for
	for (int i = 0; i < arr1.length; i++) {
		System.out.println(i +"�� : " + arr1[i]);
	}
	
	}
}

