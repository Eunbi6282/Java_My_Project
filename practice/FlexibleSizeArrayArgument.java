package practice;

import java.util.Arrays;

import javax.print.attribute.IntegerSyntax;

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		// method1
		method1(1,2);
		method1(1,2,3,4,5,6);
		method1();

	}
	
	public static void method1(int...values) {
		System.out.println("배열의 길이 : " + values.length);
		//출력방법1
//		for (int i = 0; i < values.length; i++) {
//			System.out.println(values[i]);
//			
//		}
		
		//출력방법2
//		for (int i : values) {
//			System.out.println(i);
//		}
		
		//출력방법
		System.out.println(Arrays.toString(values));
	}

}
