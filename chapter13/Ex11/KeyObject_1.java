package chapter13.Ex11;
// ���� �����尡 ������ �ʵ忡 ������ �� ���ü��� ������ �߻� -> ����ȭ�� ���ü� ������ �ذ�
/*
 ����ȭ : ���� �����尡 ������ �ʵ带 ������ �� �ϳ��� �����尡 �Ϸ�Ǹ� �ٸ� �����忡�� ������ ����
 �ϳ��� �����尡 ������� ��� lock�� �ɰ� �۾��� �Ϸ�Ǹ� �ٸ� �����尡 ������ �� �ֵ��� Lock����
 - ��� ����ȭ�� �޼���� this(�ڽ��� ��ü)��� Ű�� ����
 - ���� �޼��尡 ����ȭ�� �޼����� ��� : �ϳ��� �����常 ���ٰ���
 */

class MyData{
//����ȭ�� �޼���� Key���� ��� this�� �ڵ����� ���, ������ �Ұ���
	
	// ���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó�� �ʿ�
	synchronized void abc() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	// 1�� ������
		}
	}
	
	synchronized void bcd() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "��°");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	// 1�� ������
		}
	}
	
	synchronized void cde() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	// 1�� ������
		}
	}
	
}
public class KeyObject_1 {
	public static void main(String[] args) {
		// ���� ��ü : ���� �����尡 ����
		MyData myData = new MyData();
		
		//������ �����尡 ������ �޼��� ȣ��
		new Thread() {	// �͸� Ŭ���� : ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			@Override
			public void run() {
				myData.abc();
			}
		}.start();
		
		new Thread() {				// Thread��ü ���� -> �ٷ� .start()���
			public void run() {
				myData.bcd();
			};
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				myData.cde();
			}
		}.start();
		
		// 3���� ����ȭ ������ ������ ����� ����ȭ ���� �� -> ���� Ű�� ������ ���ÿ� ����� �Ұ��ϴ�. ���ÿ� ����ϰ� �ʹٸ� Ű�� �ٸ���
		
	
	}
}
