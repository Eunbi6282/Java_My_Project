package Ex_T;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ� >> ");
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // ȯ���� ���� ��
		int money = sc.nextInt();	//��ĳ�ʷ� input���� ���� �����ϴ� ����

		for (int i = 0; i < unit.length; i++) {		
			System.out.printf(" %d �� ¥�� : %d �� \n" , unit[i], money/unit[i]);
			//""�ȿ�  ù��° %d(������) -> unit[i]�� ���� ����, �ι�° %d(������) -> money/unit[i]
			
			// System.out.println(unit[i] + "�� ¥�� : " + (money/unit[i]) + "��");
			money = money - (money / unit[i]) * unit[i];	//���� ������ ȯ���ؾ���. ������ money���� 50000(��*ȯ���� ��)�� ������ ���� ���꿡 �����ؾ� ��
							//ȯ���� ���� ����(1)	  *	50000		// �� ���� ������ 1 * 10000 �� ���� ���� ���꿡 ���� ��
							
		}							
		
		
		
		
		
		
		
	}

}
