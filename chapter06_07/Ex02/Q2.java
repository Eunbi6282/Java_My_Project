package chapter06_07.Ex02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// ������ ���� ���� �Ҵ� �޾Ƽ� �հ�� ����� ���
		
				Scanner sc = new Scanner(System.in);
				System.out.println("�������� ������ �־ �Է��ϼ��� >>> ");
				
				String numString = sc.nextLine();		//������ ���Ƿ� ��ü �������� String���� ���� -> String Ÿ������ �޾� splite�Ұ��� -> ���߿� ������ ��ȯ
				String[] array1 = numString.split(" "); 	//������ �������� splite
															// splite -> �����ڸ� �������� ���ڸ� �߶� �迭�� ����
				System.out.println("����� �Է��� ������ : ");
				for (int i = 0; i < array1.length; i++) {	//�ԷµǴ� ���� ���
					System.out.print( array1[i]+ " ");
				}
				
				method1(array1);	//flexible �������� �޼ҵ� method�� ȣ���ϸ鼭 �Ű������� array1�� �־��ָ� �ȴ�. 
				
			}
	public  static void method1(String...valueStrings) {
		int sum=0;		//������ ������ ���ϴ� ����
		double avg;		// ��հ��� �����ϴ� ����
		
		for (int i = 0; i < valueStrings.length; i++) {
			//sum+=valueStrings[i]; 		// values[i]��° ���� ���� StringŸ���̹Ƿ� ����Ÿ������ ��ȯ �ʿ�
			//sum = sum + Integer.parseInt(valueStrings[i]);
			//Integer.parseInt -> ������ String  Ÿ���� ������ ��ȯ
			sum += Integer.parseInt(valueStrings[i]);
		}
		
		avg = (double) sum/ valueStrings.length;	//����� ����ȯ(double)�� �ݵ�� �ʿ�
		
		System.out.println();
		System.out.println("���Ƿ� ���� �հ� : " + sum + " ��� : " + avg);
		
	}
	
}

	