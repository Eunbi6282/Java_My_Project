package Chapter04;
public class Switch_Ex02 {
	public static void main(String[] args) {
		
		// 1. Break�� ó������ �ʾ��� �� -> �ش� case�� �̵��� �� switch ���� ���������� �ʰ� ������ case������ ��� ��µ�
		int value1 = 2;
		
		switch (value1 ) {
		case 1:
			System.out.println("A����");
		case 2 : 							// (value���� �ش��ϴ�)2�� �� �ִ� case������ ������Ŵ
			System.out.println("B����");
		case 3 : 
			System.out.println("C����");
		default :
			System.out.println("F����");
		
		}
		System.out.println("=========================================");
		// 2.  Break�� ���Ե� ���
		int value2 = 3;
		
		switch (value2 ) {
		case 1:
			System.out.println("A����");
			break;							// break -> ������ ������������ ������
		case 2 : 						
			System.out.println("B����");
			break;
		case 3 : 
			System.out.println("C����");
			break;
		default :
			System.out.println("F����");		//switch�� ������ case�� break ��������
		
		}
		System.out.println("===============================");
		value2 = 2; 	//������ int�� ����Ǿ� �ֱ� ������ ���� �Ҵ����ָ� ��
		
		if (value2 == 1 ) {
			System.out.println("A���� (if)");
		} else if (value2 == 2) {
			System.out.println("B���� (if)");
		} else if (value2 == 3) {
			System.out.println("C���� (if)");
		} else {
			System.out.println("F���� (if)");
		}
		
		/*
		 * switch���� ����ؼ� ������ 7�� �̻��� PASS, 7�� ���ϴ� fAIL�� ���
		 */
		
		int a = 10;
		
		switch(a) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("PASS");
			break;
		default:
			System.out.println("FAIL");
		}
		
		
	}

}
