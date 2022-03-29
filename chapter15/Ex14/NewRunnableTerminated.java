package chapter15.Ex14;

// ������ ���� 
	// 1. NEW 	: ������ ��ü ���� �� .start()�� ȣ��Ǳ� �������� ����
	// 2. RUNNABLE : .start()�޼��尡 ȣ��Ǹ� run()�޼��� ������ �ڵ尡 CPU���� ����ǰ� �ִ� ����
	// 3. Terminated : run()�� ��� �ڵ尡 ����ǰ� ���� ������ ����
	// 4. Timed_waiting : Ư�� �ð����ȸ� ������ ,Ư�� �ð��� ����Ǹ� ������·� ��, interrupt�� �߻��� �Ǹ�(���� �߻�) ������·� �ٽ� ��
					/* Thread.sleep();, 
					 * a(��ü).join(1000) : ���� �ڽ��� ������� 1�� ��� ���¿� �ְ�, a ��ü�� ���� ������·� ����(�纸)
					 * 
					 */
					
	// 5. Blocked : ����ȭ ó������ Lock�� �ɷ��� ������ ��� ���ܵ� ����, Ű�� �ݳ��� ��� Ű�� ȹ���ؼ� ���� ���·� ��.
	// 6. Waiting : ������ ��� ����. �������� ������� �������� �� �� �ִ�.�ٸ� �����尡 ������� �Ѵ�. 

public class NewRunnableTerminated {

	public static void main(String[] args) {
		
		// �������� ���¸� �����س��� Ŭ�����̴�. �� 6���� ���¸� ������ �� �ִ�
		Thread.State state;  // state �������� 6����� ���� ����
		
		// 1. ��ü ���� (NEW)	-- �͸� ���� Ŭ���� ����
			//NEW : ������ ��ü ������ .start()�� ȣ��Ǳ� ������ 
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for (long i = 0; i < 100000000L; i++) {}	//1�� �����ؼ� 1��� , �� 0.5�� �ð� ����
				// ��ü ������ �ణ�� �ð� �ʿ�
				// �޸��� �Ҵ� �ð��� �ʿ�
			}
		};
		
		state = myThread.getState();	//�������� ���¸� ������ �ͼ� state������ ��´�.
		System.out.println("myThread state : " + state);
		
		//2. myThread ����
		myThread.start();
		state = myThread.getState();	//�������� ���¸� ������ �ͼ� state������ ��´�.
		System.out.println("myThread State : " + state); 	// RUNNABLE����
		
		//3. myThread ������ ����
			//myThread.join(); �� ������{main}�� ����ϰ�, myThread�� ó���϶�
		try {
			myThread.join();
		} catch (InterruptedException e) {}
		
		state = myThread.getState();
		System.out.println("myThread State : " + state); 	//TERMINATED
		

	}

}
