package chapter14.Ex01;

public class CheckException1_1 {

	public static void main(String[] args) {
		
		try {
		System.out.println( 10 / 0);		//���α׷��� ������ �����
				// ���ܿ� ���� ó��
		}catch (ArithmeticException e) {
			// try����� ������ �߻��� ��쿡 �۵���
			// catch����� �������� �ʴ��� ���� ó���� �Ȱ���
			e.printStackTrace();		//������ ���� �ڼ��� ������ ���
			System.out.println("0�� ���� �� �����ϴ�.");
		} finally {
			//try{} ������ ��� �۵��ǰ� , ������ �־ �۵� ��
			//try{}�� �۵��Ǹ� �׻� �۵�
			//��ü�� ��� �� ��ü�� �޸𸮸� ������ �� ex) sc.close();[��ĳ�� �ߴ� ����]
			System.out.println("Finally{}�� �׻� ȣ�� ��");
			
		}
										
		System.out.println("���α׷��� ���� �����մϴ�.");	//���� ����

	}

}
