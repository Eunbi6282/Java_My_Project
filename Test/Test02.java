package Test;
public class Test02 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		switch (operator) {
		case '+':
			System.out.println("������� : " + (num1 + num2)+ " �Դϴ�. ");
			break;
		case '-':
			System.out.println("������� : " + (num1 - num2)+ " �Դϴ�. ");
			break;
		case '*':
			System.out.println("������� : " + (num1 * num2)+ " �Դϴ�. ");
			break;
		case '/':
			System.out.println("������� : " + (num1 / num2) + " �Դϴ�. ");
			break;
		default:
			System.out.println("������ �����Դϴ�.");
			break;
		}
	}
	}


