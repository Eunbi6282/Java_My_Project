package Test;

public class Test_EnhancedFor {

	public static void main(String[] args) {
		
		int[]arr1 = new int[100];
		//for문이용을 이용해 arr1 배열의 각방에 값을 입력
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;		//arr1[0 ~ 99] = i + 1; 배열 변수의 값 insert
		}
		
		//출력구문 Enhancedfor 
		for (int k : arr1) {
			System.out.println((k-1) + "방 : " + k);
		}

	}

}
