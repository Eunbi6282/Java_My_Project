package chapter15.Ex15;

// Thread.yield() : �������� �������(RUNNABLE)�� �ִ� Ư�� �����忡�� �ڽ��� ������� �Ͻ� �纸
	// ������� ���ο��� �ٸ� �����带 ���� �����ϵ��� �纸. 
	// ����ȭ���� key�� ���� �����ϴ� ������ �߻��Ǵµ�... Ű�� �纸�ؼ� �յ��ϰ� ó���ϵ��� �� �� ���

class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while(true) {	//���� ����
			if(yieldFlag == true) {		// yieldFlag�� true�� �� �����带 �纸����
				Thread.yield(); //�����带 �纸����.
			}else {		// yieldFlag�� false�� �� ������ ������ �������
				System.out.println(getName() + "����");
				for (long i = 0; i < 1000000000L; i++) {}  // 0.5�� �ð� ����
			}
		}
	}
}

public class YieldInRunnableState {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag = false;	// false �� �� ������ ���� ���
		thread1.setDaemon(true); 	// ������ �����尡 ����� �� ����, while ���ѷ��� ���������� ���� 
		thread1.start();
		
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag = true;	
		thread2.setDaemon(true);
		thread2.start();
		
		// ������ 6�� ���� (1�ʸ��� �ѹ��� �纸)
		for (int i = 0 ; i < 6 ; i++) {
			try {
				Thread.sleep(10);		//1000�� 6�� ���ư� (6��)
			} catch (InterruptedException e) {}
			thread1.yieldFlag =! thread1.yieldFlag;		// ���϶� ��������, ������ �� �� ����
			// true�϶� �纸���ִϱ� ������ ��
			thread2.yieldFlag =! thread2.yieldFlag;
		}
		

	}

}
