package Ex_T;

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
		System.out.println("��̸��� ������ ���� ������ �̿��ؼ� �Է��ϼ���");
		System.out.println("����) �Է� >>> Ź�� : 2, �߱� : 9, �౸ : 11, �� : 6, ���� :2");
		
		String str;	//��ü string���� ��ǲ�޴� ����
		String[] array;	//������ �������� �߶� �迭�� �����ϴ� ����
		
		int sum;	//� �������� ����� ���� �����ϴ� ���� 
		int memberCount; 	
		double avg;	//����� ���ϴ� ���� 
		int b;		//�� ������ �������� ��� ����
		
		do {
			sum = 0;	//��� ������ ���ư��� ������ �ʱ�ȭ�� do while�� �ȿ� ����� ��
			avg = 0;
			b = 0;
			memberCount = 0;
			
			str = scanner.nextLine();	//sc.next() : ��������� String���� ��´�.
										//sc. nextLine() : ���ͱ��� ��ü�� String���� ��´�. 
			
			if(str.equals("�׸�")) {		//
				break;
			}
			
			array = str.split(" ");		//str�� ������ �������� �߶� arr�迭�� ����
			for (int i = 0; i < array.length; i++) {	//arr.length : �迭�� index 0���� ���� �����������
				if(i % 2 != 0) {	// i : ���� ��ȣ�̰� ���ڸ� ������ �´�. 
					b = Integer.parseInt(array[i]);	//������ String Ÿ���� ������ ��ȯ
					sum += b;		//sum = sum + b		//sum : ��ü �������� ��
					memberCount++;	//avg = sum / memberCount
				}
			}
			avg = (double) sum / memberCount;
			
			System.out.println(str);
			System.out.println("�������� ���� : " + sum);
			System.out.println("�������� ��� : " + avg);
			
		
			
		} while (true);
		
	}

}
