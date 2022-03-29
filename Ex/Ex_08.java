package Ex;
import java .util.Scanner;
public class Ex_08 {
	public static void main(String[] args) {
		/*
		 *  배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로
		된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500 원짜리 동전, 100 원
		짜리 동전, 50 원짜리 동전, 10 원짜리 동전, 1 원짜리 동전이 각 몇 개로 변환되
		는지 예시와 같이 출력하라. 이때 반드시 다음 배열을 이용하고 반복문으로 작성
		하라.
		예시)
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종
		류
		금액을 입력하시오 >> 65123
		50000 원 짜리 : 1 개
		10000 원 짜리 : 1 개
		1000 원 짜리 : 5 개
		500 원 짜리 : 0 개
		100 원 짜리 : 1 개
		50 원 짜리 : 0 개
		10 원 짜리 : 2 개
		1 원 짜리 : 3 개
		 */
		System.out.println("금액을 입력하시오");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
		
		for (int i = 0; i < unit.length; i++) {  //for문에서 각 방에 있는 값들을 가지고 옴
				System.out.println(unit[i] + "원 짜리 :" + money/unit[i]);	
				money %= unit[i];
				}
		sc.close();
	}
}
