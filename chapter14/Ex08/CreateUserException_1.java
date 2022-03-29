package chapter14.Ex08;

// ����� ���� ���� Exception
// 	1. Exception�� ����ϴ� ���� : �Ϲݿ���(Checked Exception) -> ������ �ܰ迡�� ����ó�� �ʿ�
//	2. RunTimeException�� ����ϴ� ���� : ���࿹��(unChecked Exception) , RunTime Exception-> ����ÿ� ����

class MyException extends Exception{	//�Ϲݿ���
	public MyException () {		//�⺻ ������
		super();
	} 	
	public MyException (String message) {	//���ܸ޼��� ��½� ���
		super(message);
	}
}

class MyRTException extends RuntimeException{  //���� ����
	public MyRTException () {	//�⺻������
		super();
	};
	public MyRTException(String message) {	//���� �߻��� �޼����� ������ִ� ������
		super(message);
	}
}

//���� ó�� class
class A{
	
	// 1. ����� ���� ���� ��ü ����(�Ϲ� ���� ��ü)
	MyException me1 = new MyException(); //�⺻������ ȣ��
	// ���� �߻��� ���� �޼��� ����ϴ� ������
	MyException me2 = new MyException("���� �޼��� : MyException"); 
	// public MyException (String message) 	<== message�� �� ������ ��, Stirng �� �޴� �����ϰ�� e.getMessage() ��� ���
		//super(message);

	
	// 2. ��Ÿ�� ���� ��ü
	MyRTException mre1 = new MyRTException();	//�⺻������ ȣ��
	// ���� �߻��� ���� �޼��� ����ϴ� ������
	MyRTException mre2 = new MyRTException("���� �޼��� : MyRTException");
	
	// (1) ���ܸ� ������ �߻���Ű��(throw) : 
	void abc_1(int num) {
		try {
			if (num > 70) {
				System.out.println("�����۵�");
			}else {
				throw me1;		//���ܸ� ������ �߻���Ŵ
			}
		} catch (MyException e) {  //me1�� throw�� ����ؼ� ������ ���ܸ� �߻���Ŵ.
			System.out.println("70�����Դϴ�. 70�̻� ���� ��������");
			System.out.println(e.getMessage()); // �⺻�����ڿ� ������ ���� �������� String���� �ִ� ������ ������ �޼����� ����
				//me1�� �⺻�����ڶ� ���ܰ� ������ e.getMessage()�� null����
			
		}
	}
	
	void abc_12(int num) {
		try {
			if (num > 70) {
				System.out.println("�����۵�");
			}else {
				throw me2;		//���ܸ� ������ �߻���Ŵ
			}
		} catch (MyException e) {  //me2�� throw�� ����ؼ� ������ ���ܸ� �߻���Ŵ.
			System.out.println("70�����Դϴ�. 70�̻� ���� ��������");
			System.out.println(e.getMessage()); // �⺻�����ڿ� ������ ���� �������� String���� �ִ� ������ ������ �޼����� ����
				// String ������ �� message�� String���� �޾Ƽ� ������ �߻����� �� ���
		}
	}
	
	// (2) ���ܸ� ����  (throws) : abc_2()�޼��带 ȣ���ϴ� ������ ����ó���� ����� ��
	void abc_2(int num) throws MyException {
		if (num > 70) {
			System.out.println("�����۵�");
		}else {
			throw me1;	//throw�� ���� ���� �߻�
		}
	}
	
	void bcd_1() {
		abc_1(65); 	//���� �߻�
	}
	
	void bcd_2() {	//abc_2()�޼��带 ȣ���ϴ� ������ ����ó���� ����� ��
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("70�����Դϴ�. 70�̻� ���� ��������");
			System.out.println(e.getMessage());  // �⺻�����ڿ� ������ ���� �������� String���� �ִ� ������ ������ �޼����� ����
		}
	}
	
	void bcd_3() {
		abc_12(65); 	//���� �߻�
	}
	
}
public class CreateUserException_1 {
	public static void main(String[] args) {
		A a = new A();
		a.bcd_1();		// ���ܸ� ���� ����
		a.bcd_2();		// throws�� ���ܸ� �������Ѽ� ȣ���ϴ� �ʿ��� ���ܸ� ó����.
		System.out.println("========");
		a.bcd_3();
		
		
	}
}
