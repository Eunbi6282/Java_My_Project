package Ex_T;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int[] arr1 = new int[10];	//방의 개수만 선언
	
	System.out.println("양의 정수 10개를 입력하세요 >>>");
	
	for (int i = 0; i < arr1.length; i++) { // 각방의 index(i)값 0~9까지
		arr1[i] = scanner.nextInt(); //각 방에 스캐너에서 던진 정수 값을 input해줌
									// 0번째 방에 1(첫번째로 입력한 값), 1번째 방에 5(2번째로 입력한 값)...
	}
	
	//3의 배수만 출력
	System.out.println();
	
	System.out.print("3의 배수는");
	for (int i = 0; i < arr1.length; i++) {
		if(arr1[i] % 3 ==0) {		// 위 for구문에서 arr1[i] = scanner.nextInt(); 선언 해줌
									// 배열의 각 방의 값을 가지고 와서 조건에 돌림(3의 배수만)
			System.out.print(arr1[i] + " , ");
		}
	}

		
	}

}
