package Chapter01;


import java.util.Scanner;

public class ArihmeticOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력 하세요");
		
		int time = sc.nextInt(); // 스캐너에서 인풋값을 받아서 time변수에 할당합니다. 
		int scond = time % 60; // %는 나눈 나머지값 = 초
		int minite = (time/60) % 60; //분
		int hour = (time /60) / 60; //시간
		
		System.out.println(time + " 초는 " );
		System.out.println(hour + "시간, ");
		System.out.println(minite + "분, ");
		System.out.println(scond + "초 입니다.");
	}

}
