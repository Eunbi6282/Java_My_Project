package chapter15.Ex05;

// 객체 생성없이 익명객체를 사용해서 쓰레드 생성 !!! 가장 많이 사용 !!!
	//클래스x, 객체 생성X


public class CreateAndStartThread_4 {
	public static void main(String[] args) {
		// 자막번호 출력 - 쓰레드
			//쓰레드 객체에 Runnable인터페이스를 구현 -> Runnable()엔 start()가 없기 때문에
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {			//run 오버라이딩
				// 1 자막번호 출력
				String[] strArray = {"하나","둘","셋","넷","다섯"};
				//실행전에 약간 딜레이주기 (비디오프레임 먼저 출력후 자막번호가 약간 뒤에 찍히도록 딜레이 시킴)
				try {	//0.01초
					Thread.sleep(10);
				} catch (InterruptedException e1) {
				}
				
				for (int i = 0; i < strArray.length; i++) {
					System.out.println("-자막번호 " + strArray[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		
		
		//비디오 프레임 출력 - 쓰레드
			//쓰레드 객체에 Runnable인터페이스를 구현
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 2. 비디오 프레임 출력
				int [] intArray = {1,2,3,4,5};
				for (int i = 0; i < intArray.length; i++) {
					System.out.print("(비디오 프레임" + intArray[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		
		//3.Thread 시작
		thread1.start();
		thread2.start();

	}

}
