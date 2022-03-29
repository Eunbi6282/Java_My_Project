package Ex_T;
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
class F_Thread extends Thread{
	
	@Override
		public void run() {
		//0.01�� ���� , ���� ���� ���
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {}
		
		String[] subArray = {"T_1","�̸�","����","����","����","����"};
		for (int i = 0; i < subArray.length; i++) {
			System.out.print(subArray[i] + "\t ");	//"\t " -> tap
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
		}
}

class S_Thread implements Runnable{

	@Override
	public void run() {
		// 0.01�� ����, �ι�° ���
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {}
		
		
		
	}
	
}
public class Ex_CreateAndStartThread {

	public static void main(String[] args) {
		Thread thread1 = new F_Thread();
		Runnable runnable1 = new S_Thread();
		Thread thread2 = new Thread(runnable1);
		
		// ����° ������ - �͸��� ��ü �̿�
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//0.02�� ����, ����° ���
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {}
				
			}
		});
		
		//4.�׹�° ������ - �͸� ���� ��ü �̿�
		Thread thread4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// // 0.03�� ����, �׹�° ���
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {}
			}
		});

	}

}
