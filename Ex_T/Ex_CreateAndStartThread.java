package Ex_T;
/*
쓰레드 4개 생성 : 1. Thread 를 상속, 2. Runnable구현 , 3. 익명 내부 클래스를 생성해서 구현

(첫번째 T)  (두번째 T) (세번째 T) (네번째 T)
이름			박은비		정재현		이도현		
나이			25		26		28
국어			90		100		100
영어			90		100		100	
수학			80		80		80

각 값을 String 배열에 저장 후 위와 같이 출력
*/
class F_Thread extends Thread{
	
	@Override
		public void run() {
		//0.01초 지연 , 제일 먼저 출력
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {}
		
		String[] subArray = {"T_1","이름","나이","국어","영어","수학"};
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
		// 0.01초 지연, 두번째 출력
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
		
		// 세번째 쓰레드 - 익명내부 객체 이용
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//0.02초 지연, 세번째 출력
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {}
				
			}
		});
		
		//4.네번째 쓰레드 - 익명 내부 객체 이용
		Thread thread4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// // 0.03초 지연, 네번째 출력
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {}
			}
		});

	}

}
