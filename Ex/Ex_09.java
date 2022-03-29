package Ex;

import java.util.Iterator;

public class Ex_09 {
	public static void main(String[] args) {
//		 정수를 10 개 저장하는 배열을 만들고 1 에서 10 까지 범위의 정수를 랜
//		 덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
//		 랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9 
//		 평균은 5.4
//		 [Hint] 1 에서 10 까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하
//		 라.
		
		int arr[] = new int [10];
		double sum = 0;
		
		System.out.print("랜덤한 정수들 : ");
		for (int j = 0; j < arr.length; j++) {
			int i = (int)(Math.random()*10+1);
			arr[j] = i;
			System.out.print(arr[j] +" ");
			sum += arr[j];
		}
		
		System.out.println();
		System.out.println("평균은 " + sum/arr.length);
		//double로 관계타입 변환
		
		
		
			
			
	}
}
		
		
	


