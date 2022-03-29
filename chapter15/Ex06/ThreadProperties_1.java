package chapter15.Ex06;

public class ThreadProperties_1 {

	public static void main(String[] args) {
		// 1. ��ü ��������(currentThread()) //Thread�� ���� (activeCount())
			//static curentThread() <- staticŰ�� ��ü �������� Ŭ����(Ÿ��)������ �ٷ� �޼��� �ҷ��� �� ����
		Thread curThread = Thread.currentThread();  //MainThread
		//Ŭ����(Ÿ��) �������� = Ŭ������.�޼ҵ��;
		System.out.println("���� �������� �̸� : " + curThread.getName());
		//getName() �� �ν��Ͻ�ȭ �ؼ� �����;� ��
		System.out.println("�����ϴ� ������ ��: " + Thread.activeCount());
		
		System.out.println("===================================");
		// 2. ������ �̸� ���(�ڵ����) - JVM�� ������ �̸��� �ڵ����� �Ҵ� - Thread-0,,,,Thread-9
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();	//������ 10���� �ڵ����� �������
			System.out.println(thread.getName());	//������ �̸� ���
			thread.start();
		}
		System.out.println("=====================================");
		
		// 3. ������ �̸� ���� ���� : ��ü��.setName();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			thread.setName(i + " : ��° ������");
			System.out.println(thread.getName()); //������ �̸� ���
			thread.start();
		}
		System.out.println("======================================");
		
		// 4. ������ �̸� ���(�ڵ����) - JVM�� ������ �̸��� �ڵ����� �Ҵ� - Thread-0,,,,Thread-9
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();	//������ 10���� �ڵ����� ������� 
			//	-> �տ� �ڵ����� ���� ��������� ������ �� ������ȣ���� ��ȣ �Ҵ���
			
			System.out.println(thread.getName());	//������ �̸� ���
			thread.start();
			
		}
		System.out.println("=====================================");
		
		// 5. ������ �� ����ϱ�
		System.out.println("�����ϴ� ������ �� : " + Thread.activeCount());

	}

}
