package chapter18.Ex05;

// 2. �޼��� ���� ( ���� �޼��� ǥ��)
	//�޼��� ���� : ���� �������� �ʰ�, �����Ǿ� �ִ� �޼��带 �ҷ��� ���

interface A{
	void abc();
	
	
}

class B{
	static void bcd() {				 // <<== static : Ŭ���� �̸����� ȣ�� ����
		System.out.println("�޼���");
	}
}

public class RefOfStaticMethod_Type_2 {
	public static void main(String[] args) {
		// 1. ���� �޼��� ���� : �̳�Ŭ������ ó��
		A a1 = new A() {
			@Override
			public void abc() {
				B.bcd(); // ���� �޼���� ��ü �ȸ���� �ٷ� ��ü������ �޼��� ȣ�� ����
			}
		};
		
		// 2. ���ٽ� ǥ��
		A a2 = () -> {B.bcd();}; //�� �޼��带 ȣ���ϸ� B�� bcd()�� ȣ���ض�
		
		// 3. ���� �޼��� ����
		A a3 = B :: bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();

		
		
		
		
		
		
	}

}
