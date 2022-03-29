package chapter15.Ex04;

//Runnable 인터페이스의 run()을 구현해서 쓰레드 생성
class SMIFileRunnable implements Runnable {		//인터페이스

	@Override
	public void run() {
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
}

class VideoFileRunnable implements Runnable{

	@Override
	public void run() {
		//2. 비디오 번호 출력
		int [] intArray = {1,2,3,4,5};
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임" + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class CreateAndStartThread_3 {
	public static void main(String[] args) {
		//첫번째 객체 생성후 시작
		Runnable smiRunnable = new SMIFileRunnable();
		//smiRunnable.start();	//start()메서드는 Runnable 인터페이스내에 존재하지 않는다. -> ㅆ쓰레드 안에 Runnable을 넣어줘야 함
		Thread thread = new Thread(smiRunnable); //Runnable 객체를 Thread 생성자 내부에 넣는다. 
		thread.start();		
		
		//두번째 객체 생성 후 
		Runnable videoRunnable = new VideoFileRunnable();
		//videoRunnable.start();
		Thread thread2 = new Thread(videoRunnable);
		thread2.start();

	}

}
