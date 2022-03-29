package practice;

import java.util.Scanner;

public class Void_return {
	

	
	
	//return 타입이 void지만 return키워드 사용 가능
		//	-> 메소드 종료를 뜻함
	public static void main(String[] args) {
		Void_return a = new Void_return();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("월을 입력하세요>>>");
		int q ;
		q = sc.nextInt();
		
		printMonth(q);
		
			
		}
		
	}
	
	
		
	static void printMonth (int m) {
		if (m < 0 || m > 12) {
			System.out.println("잘못된 입력입니다.");
			return;	//메서드 종료
		}
		System.out.println(m + "월 입니다.");		// 만약 if 내의 조건이 아니면 구문 출력
												// retrun이 없으면 구문이 안끝나서 계속 믿으로 내려오기 때문에 출력x
	}
	
	
	
		
		
		
	}


