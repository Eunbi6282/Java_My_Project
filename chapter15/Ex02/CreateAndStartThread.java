package chapter15.Ex02;

// ���ο� ������ ����
	// 1. Thread Ŭ������ ����ؼ� run()�� �������̵��ؼ� ���� / Ŭ���� ���� run()�̹Ƿ� �ϼ��� �޼���
	// 2. Runable �������̽��� ����ؼ� run()�� ���� 		/ �������̽� ���� run() -> �̿ϼ��� �޼���

class SMIFileThread extends Thread{
	@Override
	public void run() {		//������ Thread���� �۾��� ������ ���� 
		// 2��° �����忡�� �۾��� ����
		// �ڸ� ��� ������
		String[] strArray = {"�ϳ�","��","��","��","�ټ�"};
		
		//�ڸ� ��� ����
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (�ڸ���ȣ)" + strArray[i]);
			
			try {		//cpu�� �ʹ� ���� �ĸ��ؼ� �����̸� ���� ������ ���׹��� ó�� ��
				// 0.2�� ������ ���
				Thread.sleep(200);
			} catch (InterruptedException e) {} 	
		}
		
	}
}


public class CreateAndStartThread {

	public static void main(String[] args) {
		// 0 ������ �۵�
		Thread smThread = new SMIFileThread();	//
		smThread.start(); //run(); ���� <������ ����>
			// ���� : run();�� ���� ȣ���ϴ� ���� �ƴ� start()�� ȣ���ؼ� run()����
		  // run();�� ���� ȣ���ϸ� �����尡 �۵��Ǵ� ���� �ƴ� �޼��常 ��� ��
			// start () :�����带 �۵��ϱ� ���� �޸� �Ҵ� �� run()ȣ�� : ������� �۾���.
		
		// 1. ù��° ������ (main Thread���� �۵�)- ���� ������ ��� <1�� ������>
		int [] intArray = {1,2,3,4,5};
		
		//���� ������ ���
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(���� ������)" + intArray[i]);
			
			//�۾� ���� (0.2�� ������)
			try {
				Thread.sleep(200);	//0.2�� ����
			} catch (InterruptedException e) {}
		}

	}

}
