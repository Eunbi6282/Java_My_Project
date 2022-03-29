package Test;

import javax.sql.rowset.JoinRowSet;

public class Test_arr2_for {

	public static void main(String[] args) {
		int[] arr2 = new int[300];
		//0번째 방 : 3(3의 배수만 저장)
		//1번째 방 : 6
		
		//변수값 할당
		for (int i = 0; i < arr2.length; i++) {
				arr2[i] = i;
				if( i % 3 == 0) {
					System.out.println(i + "번째방 : " + arr2[i]);
				}
				//arr2[i] = (i*3)+3;
			}
		//출력구문
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(i + "번째방 : " + arr2[i]);
//		}
	}

}
