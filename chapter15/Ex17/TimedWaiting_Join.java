package chapter15.Ex17;

import java.util.Iterator;

// a.join(1000) :a ��ü���� CPU�Ҵ��ϰ� �ڽ��� TimedWaiting���·� ���

class MyThread1 extends Thread{
	
	
	@Override
	public void run() {
		for (long i = 0; i < 1000000000L; i++) {}	// �ð����� 0.5��
			
	};
}

class MyThread2 extends Thread{
	MyThread1 myThread1;	// Ŭ����Ÿ�� ��������;
	
	//������ ���ؼ� ���������� �� �Ҵ�
	public MyThread2 (MyThread1 myThread1) {	
		this.myThread1 = myThread1;
	}
	
	@Override
	public void run() {
		try {
			myThread1.join(3000);	// myThread2(�ڽ�)�� 3�� ��� , myThread1���� cpu�Ҵ�(�纸)
		} catch (InterruptedException e) {
			System.out.println("---join(...) ������ interrupt �߻�");
			for (long i = 0; i < 1000000000L; i++) {}	// �ð����� 0.5��/ 1�� -> 100��
			for (long i = 0; i < 1000000000L; i++) {}
			for (long i = 0; i < 1000000000L; i++) {}
		}
	}
}

public class TimedWaiting_Join {
	public static void main(String[] args) {
		// 1. ��ü ����
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		
		// s
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(1);} catch (InterruptedException e) {}	//0.1�� ,��������� �غ�ð�
		System.out.println("MyThread1 State : " + myThread1.getState());	//RUNNABLE
		
		System.out.println("MyThread1 State : " + myThread2.getState()); //TIMED_WAITING
				// myThread1.join(3000); => myThread2(�ڱ��ڽ�)�� TIMED_WAITING���� ������ myThread1�� CPU�� �Ҵ�
		
		myThread2.interrupt(); 	//3�� ����� ���� ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� Runnable�� �̵���.
		try {Thread.sleep(1);} catch (InterruptedException e) {}	//0.1�� ,��������� �غ�ð�
		System.out.println("MyThread1 State : " + myThread1.getState());	//RUNNABLE
		System.out.println("MyThread1 State : " + myThread2.getState()); //RUNNABLE

	}

}
