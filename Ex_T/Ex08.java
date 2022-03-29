package Ex_T;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하시오 >> ");
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종
		int money = sc.nextInt();	//스캐너로 input받을 돈을 저장하는 변수

		for (int i = 0; i < unit.length; i++) {		
			System.out.printf(" %d 원 짜리 : %d 개 \n" , unit[i], money/unit[i]);
			//""안에  첫번째 %d(정수값) -> unit[i]의 값을 담음, 두번째 %d(정수값) -> money/unit[i]
			
			// System.out.println(unit[i] + "원 짜리 : " + (money/unit[i]) + "개");
			money = money - (money / unit[i]) * unit[i];	//몫을 뺀값을 환산해야함. 기존의 money에서 50000(몫*환산할 돈)을 뺀값을 다음 연산에 적용해야 함
							//환산한 돈의 갯수(1)	  *	50000		// 그 다음 연산은 1 * 10000 한 값을 다음 연산에 적용 함
							
		}							
		
		
		
		
		
		
		
	}

}
