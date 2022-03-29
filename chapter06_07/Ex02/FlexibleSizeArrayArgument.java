package chapter06_07.Ex02;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;

public class FlexibleSizeArrayArgument {

	public static void main(String[] args) {
		// 배열의 길이가 고정되지 않고 가변적인 경우
		// 1. method1 ( int...values) <<== 가변길이를 처리하는 input매개변수 설정
		method1();					//메소드 오버라이딩 : 메소드명은 모두 동일, 매개변수의 타입, 개수에 따라 
													//해당 메소드 출력
		method1(1,2);
		method1(1,2,3);
		method1(1,2,3,4);
		method1(1,2,3,4,5);
		method1(1,2,3,4,5,6,7,8,9,10);
		
		//2. method2
		method2("안녕","방가");
		method2("월", "화", "수", "목","금","토","일");
		method2("토끼","호랑이","곰","여우");
		
		
	}
	
	static void method1 (int...values) {	//values -> 배열
		System.out.println();
		System.out.println("===values.length===");
		System.out.println(values.length);
		
		
		System.out.println("=====Arrays.toString()=====");
		System.out.println(Arrays.toString(values));
		
		System.out.println("=======for==========");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
		
		System.out.println("==enhanced for====");
		for (int k : values) {
			System.out.print(k + " ");
		}
	}
	
	static void method2 (String...values) {
		System.out.println();
		System.out.println("===values.length===");
		System.out.println(values.length);
		
		System.out.println("=====Arrays.toString()=====");
		System.out.println(Arrays.toString(values));
		
		System.out.println("=======for==========");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("==enhanced for====");
		for (String k : values) {
			System.out.print(k + " ");
		}
	}
	
	//메서드 오버로딩 :하나의 메서드 이용
	
	/*
	static void method1() {
		System.out.println("매개변수가 없는 메소드 호출");
	}
	static void method1(int a, int b) {
		System.out.println(a + " , " + b);
	}
	static void method1(int a, int b, int c) {
		System.out.println(a + " , " + b + " , " + c);
	}
	static void method1(int a, int b, int c ,int d) {
		System.out.println(a + " , " + b + " , " + c + " , " + d);
	}
	static void method1(int a, int b, int c ,int d, int e) {
		System.out.println(a + " , " + b + " , " + c + " , " + d + " , " + e);
	}
	 */
 
	
	
}
