package chapter15.Ex16;

//Thread.sleep(1000) ===> TimedWaiting 상태로 이동 ===> 특정시간(1초)이 경과되면 Runnable 상태로 이동
										//    ===> 인터럽트가 발생되면 예외를 발생시키고 Runnable 

// 인스턴스명(객체명)[a].join(1000) ===> TimedWaiting 상태로 이동 ===> 특정시간(1초)이 경과되면 Runnable 상태로 이동
	//a.join(1000) : 자신의 쓰레드는 1초를 기다리고 a객체에게 cpu할당 (Runnale), 
				// 1초 뒤에는 자신의 쓰레드도 Runnable 상태(활성화)

// <참고(시간이 없는 경우)> 인스턴스명(객체명)[a].join() ===> Waiting 상태로 이동 ===> 
	// 자신의 쓰레드는 잠시 Waiting 상태로 가고 a객체에게 CPU(Runnable) 사용하도록 할당.
	// a객체가 모두 완료된 경우 자신의 쓰레드도 Runnable 상태

class MyThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(3000);		//자신의 쓰레드를 3초 정지(TimedWaiting 상태로 진입, 3초후에는 Runnable상태)
										//Interrupt가 발생되면 예외를 발생시키고 Runnable 상태로 이동
		} catch (InterruptedException e) {
			System.out.println("---sleep() 진행중 Interrupt발생");
			for(long i = 0;i < 1000000000L ; i++) {}	// 시간지연 0.5초
		}
	}
}


public class TimeWaiting_Sleep {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start(); 		// RUNNABLE 
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}	//쓰레드 시작 준비시간
		System.out.println("MyThread State : " + myThread.getState());	//TimedWaiting
		
		//3초 이전에 interrupt 강제 발생.
		myThread.interrupt(); //TimedWaiting 상태
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread State2 : " + myThread.getState()); 	//runnable상태

	}

}
