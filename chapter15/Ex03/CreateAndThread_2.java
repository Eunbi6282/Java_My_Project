package chapter15.Ex03;

// 2��° ������
class SMIFileThread extends Thread{	//�ڸ����� ó���ϴ� ������
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

// 3��° ������
class VideoFileThread extends Thread{	//���� �������� ó���ϴ� ������
	@Override
	public void run() {
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

public class CreateAndThread_2 {
// 1��° ������ :���ξ����� 
	public static void main(String[] args) {
		//SMIFiile Thread��ü ����
		Thread smi = new SMIFileThread();	//ThreadŸ������ ��ü ����
		smi.start();
				
		// VideoFile Thread ��ü ����
		Thread video = new VideoFileThread();
		video.start();
	}

}
