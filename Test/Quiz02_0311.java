package Test;

import java.util.Scanner;

public class Quiz02_0311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int nu;	//스캐너 통해 정수값 들어옴
		
		do {
			System.out.println("=====================================================");
			System.out.println(" 1. 19단 출력 | 2. 홀수단만 출력 | 3. 3의 배수단만 출력 | 4. 종료");
			System.out.println("======================================================");
			System.out.println("번호를 입력해 주세요>>>");
			nu = scanner.nextInt();
			if(nu == 1) {		//이중 for문 사용해서 스캐너에서 1번사용하면 19단 출력
				for (int i = 1; i <= 19; i++) {
					for (int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + i*j);
					}
				} 
			}else if (nu == 2) {
				for (int i = 1; i <= 19; i++) {
					if (i % 2 != 0) {
						for (int j = 1; j <= 9; j++) {
							System.out.println(i + " * " + j + " = " + i*j);
						}
					}
				}
			} else if (nu == 3) {
				for (int i = 1; i <= 19; i++) {
					if (i % 3 == 0) {
						for (int j = 1; j <= 9; j++) {
							System.out.println(i + " * " + j + " = " + i*j);
						}
					}
				}
			} else if (nu == 4) {
				System.out.println("프로그램을 종료합니다.");
					break;
			}
			
			
		}while(run);	//run이 true여서 루프가 계속 돔
		
		scanner.close();
		
	}
}	