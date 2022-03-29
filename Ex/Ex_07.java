package Ex;

import java.util.Iterator;

public class Ex_07 {

	public static void main(String[] args) {
		/*
		 * 양의 정수를 10 개 입력받아 배열에 저장하고,배열에
		있는 정수 중에서 3 의 배수만 출력하는 프로그램을 작성하라.
		출력 결과 예시) 
		양의 정수 10 개를 입력하시오 >> 1 5 99 22 345 125 2346 55 32 85
		3 의 배수는 99 345 234
		*/
		int[] arr = {1,5, 99, 22, 345, 125, 2346, 55, 32, 85};
	
		System.out.print("양의 정수 10개를 입력하시오 >> ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("3의 배수는 ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
