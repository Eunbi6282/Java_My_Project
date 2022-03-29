package chapter05;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Iterator;

public class InitialValue_03 {
	public static void main(String[] args) {
		// 1. 메모리의 초기값(기본자료형, 참조자료형)
		
		int value1;					//기본 자료형에 초기값을 할당하지 않을때 -> 오류
		//System.out.println(value1);
		int [] value2;				// 배열 : 참조자료형
		//System.out.println(value2);
		
		int value3 = 0;					// 기본자료형에 0값으로 초기값을 할당
		System.out.println(value3);
		
		int[] value4 = null;				//참조 자료형은 초기값으로 null(알수없는 값), 비어있는 상태
		System.out.println(value4);
		
		//2. Heap메모리의 초기값 (강제 초기화), Heap에는 참조자료형의 값이 할당
		// 기본 자료형 배열일 경우 : 기본값으로 boolean -> false, int/long/byte/short(정수형) -> 0, double/float(실수형) -> 0.0 
		// 참조 자료형 배열일 경우 : 기본값으로 null
		
		boolean [] array1 = new boolean [200];
		System.out.print(array1[0] + " " + array1[1] + " " + array1[2]);
		System.out.println();
		System.out.println("==========for문을 사용해서 배열방의 값을 출력(방번호가 많을 때)=======================");
		for (int i = 0; i < 100 ; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		System.out.println("객체의 메모리 주소 : " + array1 );
		System.out.println("객체의 방의 개수를 출력 : " + array1.length);
		System.out.println("=========for문 : array1.length=======");
		for (int i = 0; i < array1.length ; i++) {
			System.out.println("array1[" + i + "] 번째 방의 값은" + array1[i]);
		}
		System.out.println("===================");
		
		int[] array2 = new int[3]; 	//0이 기본값임
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		System.out.println("===================");
		double[] array3 = new double[3]; 	// double의 기본값 -> 0.0
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
		
		System.out.println();
		System.out.println("===================");
		
		//참조 자료형 배열인 경우 -> 기본값으로  null
		String [] array4 = new String[3];	//기본값 -> null
		for (int i = 0; i < array4.length; i++) {
			System.out.print(array4[i] + " ");
		}
		
	}

}
