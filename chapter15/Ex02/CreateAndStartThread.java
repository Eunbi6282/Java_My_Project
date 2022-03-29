package chapter15.Ex02;

// 새로운 쓰레드 생성
	// 1. Thread 클래스를 상속해서 run()을 오버라이딩해서 구현 / 클래스 안의 run()이므로 완성된 메서드
	// 2. Runable 인터페이스를 상속해서 run()을 구현 		/ 인터페이스 안의 run() -> 미완성된 메서드

class SMIFileThread extends Thread{
	@Override
	public void run() {		//생성된 Thread에서 작업할 내용을 구현 
		// 2번째 쓰레드에서 작업할 내용
		// 자막 출력 쓰레드
		String[] strArray = {"하나","둘","셋","넷","다섯"};
		
		//자막 출력 구문
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막번호)" + strArray[i]);
			
			try {		//cpu가 너무 빨리 쳐리해서 딜레이를 두지 않으면 뒤죽박죽 처리 됨
				// 0.2를 지연후 출력
				Thread.sleep(200);
			} catch (InterruptedException e) {} 	
		}
		
	}
}


public class CreateAndStartThread {

	public static void main(String[] args) {
		// 0 쓰레드 작동
		Thread smThread = new SMIFileThread();	//
		smThread.start(); //run(); 실행 <쓰레드 시작>
			// 주의 : run();을 직접 호출하는 것이 아닌 start()를 호출해서 run()실행
		  // run();을 직접 호출하면 쓰레드가 작동되는 것이 아닌 메서드만 출력 됨
			// start () :쓸레드를 작동하기 위한 메모리 할당 후 run()호출 : 쓰레드로 작업됨.
		
		// 1. 첫번째 쓰레드 (main Thread에서 작동)- 비디오 프레임 출력 <1번 쓰레드>
		int [] intArray = {1,2,3,4,5};
		
		//비디오 프레임 출력
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임)" + intArray[i]);
			
			//작업 지연 (0.2초 딜레이)
			try {
				Thread.sleep(200);	//0.2초 지연
			} catch (InterruptedException e) {}
		}

	}

}
