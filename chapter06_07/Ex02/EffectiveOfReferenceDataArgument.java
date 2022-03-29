package chapter06_07.Ex02;

import java.util.Arrays;

//참조자료형(배열)의 메소드 인풋값으로 호출
public class EffectiveOfReferenceDataArgument {

	public static void main(String[] args) {
		int [] array = new int[] {1,2,3};
		System.out.println(array[0]);
		modifyData(array);
		printArray(array);
	}
	static void modifyData (int[] a) {
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
	}
	
	static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	

}
