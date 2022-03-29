package chapter15.Ex03;

// 2번째 쓰레드
class SMIFileThread extends Thread{	//자막파일 처리하는 쓰레드
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

// 3번째 쓰레드
class VideoFileThread extends Thread{	//비디로 프레임을 처리하는 쓰레드
	@Override
	public void run() {
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

public class CreateAndThread_2 {
// 1번째 쓰레드 :메인쓰레드 
	public static void main(String[] args) {
		//SMIFiile Thread객체 시작
		Thread smi = new SMIFileThread();	//Thread타입으로 객체 생성
		smi.start();
				
		// VideoFile Thread 객체 시작
		Thread video = new VideoFileThread();
		video.start();
	}

}
