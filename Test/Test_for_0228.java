package Test;

import java.util.Arrays;

public abstract class Test_for_0228 {
	public static void main(String[] args) {
		
	int[]arr1 = new int[100];	// 초기값은 모두0
	
	//for문이용을 이용해 arr1 배열의 각방에 값을 입력
	for (int i = 0; i < arr1.length; i++) {
		arr1[i] = i + 1;		//arr1[0 ~ 99] = i + 1; 배열 변수의 값 insert
	}
	
	//출력구문 for
	for (int i = 0; i < arr1.length; i++) {
		System.out.println(i +"방 : " + arr1[i]);
	}
	
	}
}

