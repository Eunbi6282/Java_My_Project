package chapter14.Ex03;

//���� ���� Exception�� ���ÿ� �߻��� ���
public class MultiCatch_1 {

	public static void main(String[] args) {
		
		// 1.���� Exceptionó�� try catch ó��
		
		// ArithmeticException
		try {
			System.out.println(10 / 0);
			
		} catch (ArithmeticException e) {
			// catch����� �ƹ� ������ ��� ���� ó��
			System.out.println("�������(ArithmeticException)");
		}
		
		// NumberFormatException
		try {
			
			int num = Integer.parseInt("10A"); //���ڿ��� ����Ÿ�� �Ұ�
		} catch (NumberFormatException e) {
			System.out.println("���� ���(NumberFormatException)");
		}
		
		
		// 2. ���� Exception ó��
		try {
			System.out.println(10/0);
			int num2 = Integer.parseInt("10A");
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic ���");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("NumberFormat ���");
		} 
		
		// 3. ���� Exception ó��2
		try {
			
			System.out.println(10/0);
			int num3 = Integer.parseInt("10A");
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("���� ���� ó��");
		}
		
		
		System.out.println("���α׷� ����");
	}

}
