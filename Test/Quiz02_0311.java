package Test;

import java.util.Scanner;

public class Quiz02_0311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int nu;	//��ĳ�� ���� ������ ����
		
		do {
			System.out.println("=====================================================");
			System.out.println(" 1. 19�� ��� | 2. Ȧ���ܸ� ��� | 3. 3�� ����ܸ� ��� | 4. ����");
			System.out.println("======================================================");
			System.out.println("��ȣ�� �Է��� �ּ���>>>");
			nu = scanner.nextInt();
			if(nu == 1) {		//���� for�� ����ؼ� ��ĳ�ʿ��� 1������ϸ� 19�� ���
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
				System.out.println("���α׷��� �����մϴ�.");
					break;
			}
			
			
		}while(run);	//run�� true���� ������ ��� ��
		
		scanner.close();
		
	}
}	