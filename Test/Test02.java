package Test;
public class Test02 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		switch (operator) {
		case '+':
			System.out.println("결과값은 : " + (num1 + num2)+ " 입니다. ");
			break;
		case '-':
			System.out.println("결과값은 : " + (num1 - num2)+ " 입니다. ");
			break;
		case '*':
			System.out.println("결과값은 : " + (num1 * num2)+ " 입니다. ");
			break;
		case '/':
			System.out.println("결과값은 : " + (num1 / num2) + " 입니다. ");
			break;
		default:
			System.out.println("연산자 오류입니다.");
			break;
		}
	}
	}


