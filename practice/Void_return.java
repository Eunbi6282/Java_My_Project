package practice;

import java.util.Scanner;

public class Void_return {
	

	
	
	//return Ÿ���� void���� returnŰ���� ��� ����
		//	-> �޼ҵ� ���Ḧ ����
	public static void main(String[] args) {
		Void_return a = new Void_return();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("���� �Է��ϼ���>>>");
		int q ;
		q = sc.nextInt();
		
		printMonth(q);
		
			
		}
		
	}
	
	
		
	static void printMonth (int m) {
		if (m < 0 || m > 12) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;	//�޼��� ����
		}
		System.out.println(m + "�� �Դϴ�.");		// ���� if ���� ������ �ƴϸ� ���� ���
												// retrun�� ������ ������ �ȳ����� ��� ������ �������� ������ ���x
	}
	
	
	
		
		
		
	}


