package Chapter04;
import java.util.Scanner;

public class If_Ex02 {
	public static void main(String[] args) {
		System.out.println("���ڿ��� ��������");
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
			System.out.println("������ �����Դϴ�.");
			return; 	//������ �� ���� ����
		}
		System.out.println("��� ���� : " + result + " �Դϴ�. ");
	}
	}

