package Test;

import java.util.Arrays;

public class Test_ArraysToString {

	public static void main(String[] args) {
		int[]arr1 = new int[100];
		
		//for���̿��� �̿��� arr1 �迭�� ���濡 ���� �Է�
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;		//arr1[0 ~ 99] = i + 1; �迭 ������ �� insert
		}
		
		//��±��� Arrays.toString
		System.out.println(Arrays.toString(arr1));
	}

}
