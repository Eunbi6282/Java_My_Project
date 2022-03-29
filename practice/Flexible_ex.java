package practice;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Flexible_ex {
	public static void main(String[] args) {
		//임의의 정수를 입력받아 평균과 합계 구하기
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("정수를 입력하세요 >>>");
			
			int a = 0; //스캐너에서 입력받을 정수 값
			a = scanner.nextInt();
			int[] num = new int [a];	//a에서 받은 값을 배열로 저장
			
			for (int i = 0; i < num.length; i++) {
				num[i] = scanner.nextInt();
			}
			
			method(num);
		
		
	}
	
	public static void method(int... values) {
		int sum = 0;
		
		for (int i : values) {
			sum += i;
		}
		double avg = sum/values.length;
		
		System.out.println("합계는 : " + sum + "입니다. 평균은 : " + avg + "입니다.");
	}

}
