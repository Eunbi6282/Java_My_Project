package chapter14.Ex06;
/*
 	����ó�� 2���� ��� :
 		1. ���� ó�� : try catch
 		2. ���� ����(�̷��) : throws , �޼��鸣 ȣ���ϴ� �ʿ��� ���ܸ� ó���ϵ��� ������Ų��. 
 */

class A{ 		//�޼��� ���ο��� ����ó���� ���� ����
	void abc() {
		bcd();
	}
	void bcd() {
		
		try {			//�Ϲݿ��� : InterruptedException
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("���ܹ߻� 1");
		} 
	}
}

class B{
	void abc() {
		 try {		
			bcd();		//bcd()���� ���� ó���� ȣ���ϴ� ������ �̷�� ������ bcd()�� ȣ���� abc()���� ���ܸ� ó���� �ǹ��� ������. 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("���� �߻�2");
		}  
	}
	void bcd() throws InterruptedException {	//bcd()�� ȣ���ϴ� �ʿ��� ���ܸ� ó���ϵ��� �̷�
		Thread.sleep(1000);	//���� ���� ,but throws�� �̷�
	}
}

public class ThrowsException1 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.abc();

	}

}
