package chapter15;

import java.util.Iterator;

/*
 ������ 4�� ���� : 1. Thread �� ���, 2. Runnable���� , 3. �͸� ���� Ŭ������ �����ؼ� ����
 
 (ù��° T)  (�ι�° T) (����° T) (�׹�° T)
 �̸�			������		������		�̵���		
 ����			25		26		28
 ����			90		100		100
 ����			90		100		100	
 ����			80		80		80
 
 �� ���� String �迭�� ���� �� ���� ���� ���
 */
// ù ��°�� ������ ����
class SubjectThread extends Thread{
	public void run() {
		// 1. ù��° �� ���(Thread�� ���)
		String[] subArray = {"�̸�","����","����","����","����"};
		for (int i = 0; i < subArray.length; i++) {
			System.out.print(subArray[i] + " ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	};
}

// �� ��°�� ������ ���� 
class MyInfoRunnable implements Runnable{

	@Override
	public void run() {
		// 2. �ι�° �� ���(Runnable�� ���)
		String[] myinfoArray = {"������","25","90","90","80"};
		try {	//0.01��
			Thread.sleep(10);
		} catch (InterruptedException e1) {
		}
		
		for (int i = 0; i < myinfoArray.length; i++) {
			System.out.print(myinfoArray[i] + " ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class Ex_CreateAndStartThread {

	public static void main(String[] args) {
		// ù��° ������ ����
		Thread subThread = new SubjectThread();
		subThread.start();
		
		//�ι�° ������ ����
		MyInfoRunnable myinfoRunnable = new MyInfoRunnable();
		// myinfoThread.start(); -> Runnable���� start()���� , Thread���ؼ� �ҷ�����
		Thread myinfoThread = new Thread(myinfoRunnable);
		myinfoThread.start();
		
		//����° �� ������ ����(�͸��̳�Ŭ���� ���-> Ŭ����, ��ü����X)
		Thread loverThread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String[] myinfoArray = {"������","26","100","98","75"};
				try {	//0.01��
					Thread.sleep(20);
				} catch (InterruptedException e1) {
				}
				for (int i = 0; i < myinfoArray.length; i++) {
					System.out.print(myinfoArray[i] + " ");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		loverThread1.start();
		
		//�׹�° �� ������ ����(�͸��̳�Ŭ���� ��� -> Ŭ����, ��ü ����X)
		Thread loverThread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] myinfoArray = {"�̵���","28","99","100","85"};
				try {	//0.01��
					Thread.sleep(30);
				} catch (InterruptedException e1) {
				}
				
				for (int i = 0; i < myinfoArray.length; i++) {
					System.out.println(myinfoArray[i] + " ");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
				}
			}
			});
		loverThread2.start();
	}
}
   
