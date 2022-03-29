package chapter06_07.Ex02;

import java.util.Arrays;

public class ArrayArgumentMethod {
	
	// static 이 있고 같은 class안에 있음 : 메소드 이름으로 바로 호출 가능
	// public : 다른 패키지에서 접근 가능하도록 설정 (접근제어자)
	// 접근제어자 : public, protected, default, private
	// 접근제어자가 생략되어 있으면 : default (같은 패키지에서 접근 가능)
	public static void printArray (int[] a ) {		//static 이 있고 같은 class안에 있음
		System.out.println("========Arrays.toString() 사용해서 출력===========");
		System.out.println(Arrays.toString(a));
		
		System.out.println("========for문 사용해서 출력===========");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.println("========enhanced for문 샤용해서 출력===========");
		for (int k : a) {
			System.out.print(k+ " ");
		}
	}
	public static void main(String[] args) {
		// 배열을 매개 변수로 가지느 메소드 호출
		
		int [] a = new int[] {1,2,3};		//배열 변수 선언 후 값을 넣은 후 출력 
		printArray(a);
		
		printArray(new int[] {4,5,6,7,8,9}); //
		
		
		// printArray({1,2,3); -> 오류발생
	}

}
