package Test;

import javax.sql.rowset.JoinRowSet;

public class Test_arr2_for {

	public static void main(String[] args) {
		int[] arr2 = new int[300];
		//0��° �� : 3(3�� ����� ����)
		//1��° �� : 6
		
		//������ �Ҵ�
		for (int i = 0; i < arr2.length; i++) {
				arr2[i] = i;
				if( i % 3 == 0) {
					System.out.println(i + "��°�� : " + arr2[i]);
				}
				//arr2[i] = (i*3)+3;
			}
		//��±���
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(i + "��°�� : " + arr2[i]);
//		}
	}

}
