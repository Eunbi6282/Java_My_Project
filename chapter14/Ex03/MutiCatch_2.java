package chapter14.Ex03;

public class MutiCatch_2 {

	public static void main(String[] args) {
		
		// 1. Exception���� ��� ���ܸ� ó���� �� �ִ�.
			//��� ���ܴ� Exception�� ��ӹޱ� ������
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		} catch (Exception e) {
			//try{}������� �߻��ϴ� ��� ���ܴ� ExceptionŬ������ ��� ó��
			System.out.println("���� ó�� (Exception)");
		}
		System.out.println("���α׷� ����");
		
		//2. catch ����� ������ �߸��� ���
		/*
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		} catch (Exception e) {
			//try{}������� �߻��ϴ� ��� ���ܴ� ExceptionŬ������ ��� ó��
				//Exception�� ���� �������� �ȵ�
			System.out.println("���� ó�� (Exception)");
		} catch (ArithmeticException e) {
		}catch (NumberFormatException e) {
		}
		*/
		
		//3. catch ����� �ùٸ� ���� : �ֻ��� Ŭ������ catch����� �������� ��ġ
				//�������� Exception���� ���� ������
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		}catch (ArithmeticException e) { 	//�������� Exception3333333
			
		}catch (NumberFormatException e) {
		}catch (Exception e) {
			//Exception�� ���������� �ͼ� ó���ϵ��� ��ġ��Ŵ
		System.out.println("���� ó�� (Exception)");
		}
		
		//4. �������� exception�� �����ؼ� ����
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		}catch (ArithmeticException | NumberFormatException e) { 	//�������� Exception3333333
			//�������� exception�� ����
		}catch (Exception e) {	
			
		}
		System.out.println("���α׷� ����");
	}

}
