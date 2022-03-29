package Chapter04;
import java.util.Scanner;

public class If_Ex02 {
	public static void main(String[] args) {
		System.out.println("문자열을 넣으세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char operator = sc.next().charAt(0);
		int result = 0;
		
		if (operator == '+') {
			result = num1 + num2;
		}else if (operator == '-') {
			result = num1 - num2;
		}else if (operator == '*') {
			result = num1 * num2;
		}else if (operator == '/') {
			result = num1 / num2;
		}else {
			System.out.println("연산자 오류입니다.");
			return; 	//실행한 후 구문 종료
		}
		System.out.println("결과 값은 : " + result + " 입니다. ");
	}
	}

