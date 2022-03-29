package chapter15.Ex20;

class DataBox{
	int data;
	boolean isEmpty = true;	// �⺻�� ����
	
	// �ΰ��� �޼��� �� thisŰ�� ������ ���� -> ����, ���� Ű�� �����Ϸ��� ��
	
	synchronized void inputData(int data) {		//����ȭ �޼���
		if(!isEmpty) {		//false�϶� wait(); ����ȭ ���̳� ����ȭ �޼��忡�� WAITING���·� ��ȯ
							// ( =data�ʵ��� ���� ������� ���� �� ��� ���. t2�����尡 ó���ϵ��� ��� ���)
			try {wait();} catch (InterruptedException e) {}
		}
		isEmpty = false;  // Data�ʵ��� ���� �ְ� t2�����尡 ���� ���� �� �ֵ��� false�� �⺻����
		this.data = data;
		System.out.println("�Է� ������" + data);	// data : �Ű����� ������ ���� ������ -> this �ʿ���(Setter������)
		notify();
	}
	synchronized void outputData() {			//����ȭ �޼���
		if(isEmpty) {		// isEmpty�� true�϶� WAITING���·� ����
			try {wait();} catch (InterruptedException e) {}
		}
		isEmpty = true;
		System.out.println("��� ������" + data);	// data : �޸𸮿� �ö�� ������ ����Ѵٴ� �ǹ� -> this X
		notify();		// inputData() �޼����� wait()�� �����带 �����ش�. 
	}
}


public class Waiting_WaiteNotify_2 {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		//ù��° ������ : ������ü�� ���� �ִ� ������
		Thread t1 = new Thread() {		//(Thread ����ϴ�)�͸� ���� Ŭ����
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.inputData(i);
				}
			}
		};	
		
		// �ι�° ������ : ������ü�κ��� ���� �о���� �޼���
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.outputData();
				}
			}
		};
		
		//start()
		t1.start();
		t2.start();
		

	}
}
