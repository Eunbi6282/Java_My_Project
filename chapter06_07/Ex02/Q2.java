package chapter06_07.Ex02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// 임의의 정수 값을 할당 받아서 합계와 평균을 출력
		
				Scanner sc = new Scanner(System.in);
				System.out.println("정수값을 공백을 넣어서 입력하세요 >>> ");
				
				String numString = sc.nextLine();		//공백이 들어가므로 전체 정수값을 String으로 넣음 -> String 타입으로 받아 splite할거임 -> 나중에 정수로 변환
				String[] array1 = numString.split(" "); 	//공백을 기준으로 splite
															// splite -> 구분자를 기준으로 글자를 잘라서 배열에 저장
				System.out.println("당신이 입력한 정수는 : ");
				for (int i = 0; i < array1.length; i++) {	//입력되는 값을 출력
					System.out.print( array1[i]+ " ");
				}
				
				method1(array1);	//flexible 가변길이 메소드 method를 호출하면서 매개변수로 array1을 넣어주면 된다. 
				
			}
	public  static void method1(String...valueStrings) {
		int sum=0;		//들어오는 정수를 합하는 변수
		double avg;		// 평균값을 저장하는 변수
		
		for (int i = 0; i < valueStrings.length; i++) {
			//sum+=valueStrings[i]; 		// values[i]번째 방의 값이 String타입이므로 정수타입으로 변환 필요
			//sum = sum + Integer.parseInt(valueStrings[i]);
			//Integer.parseInt -> 숫자형 String  타입을 정수로 변환
			sum += Integer.parseInt(valueStrings[i]);
		}
		
		avg = (double) sum/ valueStrings.length;	//평균은 형변환(double)이 반드시 필요
		
		System.out.println();
		System.out.println("임의로 들어온 합계 : " + sum + " 평균 : " + avg);
		
	}
	
}

	