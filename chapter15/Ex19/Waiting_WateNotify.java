package chapter15.Ex19;

/* Waiting : 
	1. a. join() : �ڽ��� ������� Waiting �����̰� a ��ü���� CPU�� �Ҵ�(Runnable)/ time X
		// a ��ü�� ������ �Ϸ�Ǹ� �ڽ��� �����尡 �۵�(Runnable), a. join(time)�̶� �ٸ�
	// �ڽ� �������� ó���� ������ �ٸ� �������� ����� �޾Ƽ� ó���ؾ� �� ���
	
	2. wait(), notify(), notifyAll() <== ����ȭ ��������� ����
		- wait() : ����ȭ ���,����ȭ �޼��� ������ wait()�޼��带 ������ Waiting���·� ����. 
		- notify(), notifyAll()�� wait()�޼��带 ������. <== �ݵ�� �ٸ� �����忡�� ������� ��
		
*/

class DataBox{
	int data;
	synchronized void inputData(int data) {		//����ȭ �޼���
				//inputData -> setter�� ���
		this.data = data;
		System.out.println("�Է� ������" + data);	// data : �Ű����� ������ ���� ������ -> this �ʿ���(Setter������)
	}
	synchronized void outputData() {			//����ȭ �޼���
		System.out.println("��� ������" + data);	// data : �޸𸮿� �ö�� ������ ����Ѵٴ� �ǹ� -> this X
	}
}
public class Waiting_WateNotify {
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