package chapter15.Ex12;
/*
	! ���� �����尡 ������ �ʵ忡 ������ �� ���ü��� ������ �߻� ! ==> ����ȭ�� ���ü� ������ �ذ�.

	����ȭ : ���� �����尡 ������ �ʵ带 ������ �� �ϳ��� �����尡 �Ϸ�Ǹ� �ٸ� �����忡�� ������ ����
		�ϳ��� �����尡 ������� ��� lock�� �ɰ� �۾��� �Ϸ�Ǹ� �ٸ� �����尡 ������ �� �ֵ��� Lock ���� 
		
		- ��� ����ȭ�� �޼���� this(�ڽ��� ��ü)��� Ű�� ����
		- ���� �޼��尡 ����ȭ�� �޼����� ��� : �ϳ��� �����常 ���� ����
*/
class A{}
class B{}
class C{}

//���� ��ü : ���� �����尡 ���� ��ü�� ����
class MyData{
	//����ȭ�� �޼���� Key���� ��� this�� �ڵ����� ���, ������ �Ұ���.
		// ����ȭ �޼���� Key���� ���� �� ����. 
		// �ϳ��� �����尡 ������ �� Key�� ������ ����ȭ�� �޼��带 ���� �����ϴ�.
		// Key�� ��ü�� Ű�� ����� �� �ִ�. 
	// ����ȭ ���� Key���� ���Ƿ� �Ҵ� �����ϴ�.
synchronized void abc() {		//���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó�� �ʿ�
	
	for (int i = 0; i < 3; i++) {
		System.out.println(i + "sec");
		try {
			Thread.sleep(1000);		//1�� ������
		} catch (InterruptedException e) {}		
	}
}
	synchronized void bcd() {		//���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó�� �ʿ�
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "��");
			try {
				Thread.sleep(1000);		//1�� ������
			} catch (InterruptedException e) {}		
		}
	}
	
	 void cde() {		//���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó�� �ʿ�
		 
		 synchronized (new Object()) {		//thisŰ�� �ƴ� ������ Ű ���� : ������ Ű ����, 
			
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "��°");
				try {
					Thread.sleep(1000);		//1�� ������
				} catch (InterruptedException e) {}		
			}
		}
	}
}




public class KeyObject_2 {

	public static void main(String[] args) {
		// ������ü : ���� �����尡 ����
				MyData myData = new MyData();
				
				// ������ �����尡 ������ �޼ҵ� ȣ��
				new Thread() {			//�͸� Ŭ���� : ������Ŭ������ �����ϴ� �ڽ� �͸� Ŭ���� 
					public void run() {
						myData.abc();		// ù��° ������ -> abc�޼��� ȣ��
					};
				}.start();
				
				new Thread(){
					public void run() {
						myData.bcd();		// �ι�° ������ -> bcd�޼��� ȣ��
					};
				}.start();
				
				new Thread() {
					public void run() {
						myData.cde();		// ����° ������ -> cde�޼��� ȣ��
					};
				}.start();
			
	}

}
