package Ex_T;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int[] arr1 = new int[10];	//���� ������ ����
	
	System.out.println("���� ���� 10���� �Է��ϼ��� >>>");
	
	for (int i = 0; i < arr1.length; i++) { // ������ index(i)�� 0~9����
		arr1[i] = scanner.nextInt(); //�� �濡 ��ĳ�ʿ��� ���� ���� ���� input����
									// 0��° �濡 1(ù��°�� �Է��� ��), 1��° �濡 5(2��°�� �Է��� ��)...
	}
	
	//3�� ����� ���
	System.out.println();
	
	System.out.print("3�� �����");
	for (int i = 0; i < arr1.length; i++) {
		if(arr1[i] % 3 ==0) {		// �� for�������� arr1[i] = scanner.nextInt(); ���� ����
									// �迭�� �� ���� ���� ������ �ͼ� ���ǿ� ����(3�� �����)
			System.out.print(arr1[i] + " , ");
		}
	}

		
	}

}
