package practice;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Flexible_ex {
	public static void main(String[] args) {
		//������ ������ �Է¹޾� ��հ� �հ� ���ϱ�
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("������ �Է��ϼ��� >>>");
			
			int a = 0; //��ĳ�ʿ��� �Է¹��� ���� ��
			a = scanner.nextInt();
			int[] num = new int [a];	//a���� ���� ���� �迭�� ����
			
			for (int i = 0; i < num.length; i++) {
				num[i] = scanner.nextInt();
			}
			
			method(num);
		
		
	}
	
	public static void method(int... values) {
		int sum = 0;
		
		for (int i : values) {
			sum += i;
		}
		double avg = sum/values.length;
		
		System.out.println("�հ�� : " + sum + "�Դϴ�. ����� : " + avg + "�Դϴ�.");
	}

}
