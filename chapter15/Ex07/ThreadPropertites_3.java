package chapter15.Ex07;

// �Ϲݽ�����(setDaemon(false) default off) => ������ �����尡 ����Ǵ��� �ڽ��� ���� ��� ��ġ�� ����
//���� ������(setDaemon(true), �����带 start�� �� ����(����,���� �Ұ�) : ������ ������� �߿� ������ �����尡 ����Ǹ� �ڽ��� ���� ��� ��ġ�� ����
	// - ������ �����尡 ����Ǵ� ������ ����
	// - �Ϲ������� �ٸ� �������� �۾��� ���� ���� ������ �Ѵ�. 
	// - ���� ������ ������ �Ϲݽ����尡 ����� �� ������ �ܿ��� �Ϲݽ������ ����
	// - garbage Collector(�޸��� ������ �ʴ� ��ü�� �������÷��Ͱ� �ڵ����� ��ü�� ������ �ش�.)
			// - ���μ����� ��������� �ڵ�����, ȭ�� �ڵ� ����
	// - ���ѷ����� ����ؼ� �׽� ����ϰ� �ִٰ� Ư�������� �����ϸ� �۾��� �����ϰ� �ٽ� �����¿� ����. 

class MyThread extends Thread{		//�����带 �۵���ų Ŭ���� 
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon()? "���󽺷���" : "�Ϲݽ�����")); 
		// Thread �ȿ� getName(),isDaemon() ����
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + " : " +i+ "��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
public class ThreadPropertites_3 {

	public static void main(String[] args) {
		// 1. �Ϲ� ������
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);  //����Ʈ(default)
		thread1.setName("thread 1");
		thread1.start();
		
		// 2. Daemon ������ : ������ �����尡 ����� �� ����ȴ�. 
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);  //����Ʈ(default)
		thread2.setName("thread 2");
		thread2.start();
		
		// 2. 3.5���Ŀ� main thread ����
		try {		//3.5��
			Thread.sleep(3500);
		} catch (InterruptedException e) {
		} 	
		System.out.println("Main Thread����");
		//thread1�� �Ϲ� �������̹Ƿ� main thread�� 3.5�ʵڿ� �����Ǵ��� �ڱ� ���� ��
		//thread1�� setDemon�� true�� ��� main thread�� ����� ��� ���� �����
		
		
		

	}

}
