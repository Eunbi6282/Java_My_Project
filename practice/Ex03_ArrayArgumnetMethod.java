package practice;

import java.util.Arrays;

public class Ex03_ArrayArgumnetMethod {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3};
		
	printArray(a);
	printArray(new int[] {4,5,6,9,0,0000,91234});
		
	}
	
	public static void printArray(int[]num) {
		System.out.println(Arrays.toString(num));
	}

}
