package chapter15.Ex10;

//  ����ȭ ��: ���� �����尡 ������ �ʵ忡 ������ �� �ϳ��� �����忡�� �۾��� �ٸ� �����尡 �������� ���ϵ���

// ��� ����ȭ : �޼��� ������ �Ϻκи� ����ȭ�Ѵ�.
// 		- �������� : synchronized (������ ��ü){}
//						this : �ڽ��� ��ü or new  �����ǰ�ü

class A{}
class B{}
class C{}


class MyData{  	//�����尡 �����ϴ� ��ü �ʵ����
	int data = 3; //������ ��������
	
	public  void  plusData () {	// �޼��� ����ȭ : �޼����� ��ü�� ����ȭ	
		//����ȭ ó�� �޼��� : �ϳ��� �����尡 �۾��� �Ϸ�Ǹ� �ٸ� �����尡 �۾��� �� �ִ�.
		synchronized (this) {	//��� ����ȭ : �޼��� ���� Ư�� ��������� ����ȭ ó��, �޼����� �Ϻκи� ����ȭ
								// this -> �ڽ��� ��ü or ������ ��ü(ex new SynchronizedBlock(), newC(),new A(), new Object()
								// �ڽ��� ��ü�� ���ϰ�, ����ȭ ��Ͽ� �����ϴ� Ű�̴�. 
								// ��� ������� Key�� ������ ����ȭ ���� ������ �� �ִ�.
								// Ket�� ������ ��ü�� Ű�� ����� �� �ִ�. 
			
			int mydata = data;
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			data = mydata + 1;
		}
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

public class SynchronizedBlock {

	public static void main(String[] args) {
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
