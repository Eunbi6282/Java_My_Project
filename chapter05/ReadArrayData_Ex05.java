package chapter05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReadArrayData_Ex05 {
	public static void main(String[] args) {
		
		int [] array = new int [] {3,4,5,6,7};
		
		// 1. 배열의 방(index)의 길이 구하기
		System.out.println(array.length);
		
		// 2. 출력하기1 : 방번호를 직접 찍어서 출력 : 특정방번호의 값을 출력.
		System.out.print(array[0] + " " );
		System.out.print(array[1] + " " );
		System.out.print(array[2] + " " );
		System.out.print(array[3] + " " );
		System.out.print(array[4] + " " );
		// System.out.print(array[5] + " " );	// ArrayIndexOutOfBoundsException, 방번호를 초가한 경우를 출력한 오류
		System.out.println();
		
		// 3. 출력하기 2 : for 문을 사용해서 특정 범위를 지정해서 출력
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		//for문을 사용해서 특정 범위만 출력
		for (int i = 0; i < 3; i++) {
			System.out.println(array[i]);
		}
		
		System.out.print("========================");
		
		// 4. 출력하기 3 : enhanced for문(향산된 for문), 무조건 처음 방부터 마지막 방까지 순환하면서 출력. 범위를 지정해서 출력할 수 없다. 
		// 구문은 for 문에 비해서 짧다. 
		for (int k : array) {			//for문(출력할 자료형 변수 : 배열변수) {실행문, k를 출력}
			System.out.print(k + " ");
		}
		
		System.out.println();
		
		// 5. 출력하기 4 : Arrays.toString(배열변수명)	//배열변수의 모든 값을 출력
		System.out.println(Arrays.toString(array));	//배열안의 값들을 대괄호와 컴마를 이용해서 출력
		
		
		
	}

}
