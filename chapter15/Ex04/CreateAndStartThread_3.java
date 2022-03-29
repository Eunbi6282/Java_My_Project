package chapter15.Ex04;

//Runnable �������̽��� run()�� �����ؼ� ������ ����
class SMIFileRunnable implements Runnable {		//�������̽�

	@Override
	public void run() {
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
}

class VideoFileRunnable implements Runnable{

	@Override
	public void run() {
		//2. ���� ��ȣ ���
		int [] intArray = {1,2,3,4,5};
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(���� ������" + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class CreateAndStartThread_3 {
	public static void main(String[] args) {
		//ù��° ��ü ������ ����
		Runnable smiRunnable = new SMIFileRunnable();
		//smiRunnable.start();	//start()�޼���� Runnable �������̽����� �������� �ʴ´�. -> �������� �ȿ� Runnable�� �־���� ��
		Thread thread = new Thread(smiRunnable); //Runnable ��ü�� Thread ������ ���ο� �ִ´�. 
		thread.start();		
		
		//�ι�° ��ü ���� �� 
		Runnable videoRunnable = new VideoFileRunnable();
		//videoRunnable.start();
		Thread thread2 = new Thread(videoRunnable);
		thread2.start();

	}

}
