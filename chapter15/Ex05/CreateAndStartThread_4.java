package chapter15.Ex05;

// ��ü �������� �͸�ü�� ����ؼ� ������ ���� !!! ���� ���� ��� !!!
	//Ŭ����x, ��ü ����X


public class CreateAndStartThread_4 {
	public static void main(String[] args) {
		// �ڸ���ȣ ��� - ������
			//������ ��ü�� Runnable�������̽��� ���� -> Runnable()�� start()�� ���� ������
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {			//run �������̵�
				// 1 �ڸ���ȣ ���
				String[] strArray = {"�ϳ�","��","��","��","�ټ�"};
				//�������� �ణ �������ֱ� (���������� ���� ����� �ڸ���ȣ�� �ణ �ڿ� �������� ������ ��Ŵ)
				try {	//0.01��
					Thread.sleep(10);
				} catch (InterruptedException e1) {
				}
				
				for (int i = 0; i < strArray.length; i++) {
					System.out.println("-�ڸ���ȣ " + strArray[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		
		
		//���� ������ ��� - ������
			//������ ��ü�� Runnable�������̽��� ����
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 2. ���� ������ ���
				int [] intArray = {1,2,3,4,5};
				for (int i = 0; i < intArray.length; i++) {
					System.out.print("(���� ������" + intArray[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		
		//3.Thread ����
		thread1.start();
		thread2.start();

	}

}
