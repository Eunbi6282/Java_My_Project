package Test;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// ������ ��� �ְ� �ش� ��� ������(���)�� �־ ���
		// Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2
		// ��� -> Ź�� : 2, �߱� : 9, �౸ : 11, �� : 6, ���� :2
		// ����� ������ �� �հ� : 
		// ����� ������ ��� �������� :
		//"�׸�"�̶�� �Է��ϸ� ���α׷� ����
		
		Scanner scanner = new Scanner(System.in);
		String exr;
		String array[];
		
		while (true) {
			System.out.println("��� ������ ���� �������� ������ �Է��ϼ��� >>> ");
			exr = scanner.nextLine();	//�Է¹��� ��:exr
			array = exr.split(" ");
			
			if(exr.equals("�׸�")){
				break;
			}
			method(array);
		}
		scanner.close();
		System.out.println("���α׷��� �����մϴ�.");
	}
		
		static void method(String ...valStrings){
			double avg;
			int sum = 0;
			
			for (int i = 0; i < valStrings.length; i++) {
				if(i % 2 != 0) {
					sum += Integer.parseInt(valStrings[i]);	//Ȧ�� index ������ȯ
				}
			}
			avg = (double) sum/(valStrings.length/2);
			
			for (int i = 0; i < valStrings.length; i++) {
					if(i%2==0) {			//��� ¦����°
						if (i+2 == valStrings.length) {		//������ ¦����°
							System.out.print(valStrings[i] + " : " + valStrings[i+1]);
							break;
						}else { 
							System.out.print(valStrings[i] + " : " + valStrings[i+1] + " , ");
						}
					}
				}
			System.out.println();
			System.out.println("� ���� �������� �� �հ� : " + sum);
			System.out.println("����� ������ ��� �������� : " + avg);
			
		}
}

//					if(i % 2 == 0 && i+1 % 2 != 0) {
//					System.out.print(valStrings[i] + " : " + valStrings[i+1]+ " ");
//					}
//					
//					//����������� ���� �� ���� ���� ��
//					if(i == valStrings.length - 1) {
//						System.out.print(valStrings[i] + " : " + valStrings[i+1] + " ");
//						break;
//					}
//					