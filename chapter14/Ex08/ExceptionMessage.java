package chapter14.Ex08;

public class ExceptionMessage {

	public static void main(String[] args) {
		// 1. ���� ��ü ���� �� �޼��� �������� �ʴ� ���
		
		try {
			throw new Exception(); //���� ���� �߻�, Exception�� �⺻������ ȣ�� �� �޼����� ��� X 
				//throw�� ���ʿ� ��ü �����ؼ� ������(�⺻������ ȣ��, ����)
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=================");
		
		// 2. ���� ��ü ���� �� �޼��� �����ϴ� ���
		try {
			throw new Exception("���� �޼��� ���");	
			//throw�� ���ʿ� ��ü �����ؼ� ������(�Ű����� Stirng 1�� �޴� ������ ȣ��, ����)
			// Exception ��ü �����ڿ� String���� �־��ָ� catch������� ���� �޼����� ���
		} catch (Exception e) {
			System.out.println(e.getMessage()); 	// d=
		}	
	}

}
