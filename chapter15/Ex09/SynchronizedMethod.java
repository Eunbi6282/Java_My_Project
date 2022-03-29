package chapter15.Ex09;

// �޼��� ����ȭ : �޼��� ��ü�� ����ȭ
	// key ���� this �Ҵ��.


//�����尡 �����ϴ� ��ü �ʵ����
class MyData{  	
	int data = 3; //������ ��������
	
	public synchronized void  plusData () {	// �޼��� ����ȭ : �޼����� ��ü�� ����ȭ	
		//����ȭ ó�� �޼��� : �ϳ��� �����尡 �۾��� �Ϸ�Ǹ� �ٸ� �����尡 �۾��� �� �ִ�.
		int mydata = data;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		data = mydata + 1;
	}
}

class PlusThread extends Thread{		//1�� �����ϸ鼭 2���� ������ ����
	MyData myData;
	public PlusThread(MyData myData) {		//�Ű������� Ȱ��ȭ ��Ŵ
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "������ : " + myData.data);
	}
}

public class SynchronizedMethod {

	public static void main(String[] args) {
		//���� ��ü ����
				MyData myData = new MyData();
				
				// 1. PlusThread ù��° ������ ����
				Thread plusThread1 = new PlusThread(myData);
				plusThread1.setName("plusThread1");
				plusThread1.start();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				
				// 2. PlusThread �ι�° ������ ����
				Thread plusThread2 = new PlusThread(myData);
				plusThread2.setName("plusThread2");
				plusThread2.start();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				

	}

}
