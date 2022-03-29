package chapter15.Ex07;

// 일반스레드(setDaemon(false) default off) => 마지막 스레드가 종료되더라도 자신의 일을 모두 마치고 종료
//데몬 쓰레드(setDaemon(true), 스레드를 start할 때 설정(수정,변경 불가) : 여러개 스레드들 중에 마지막 스레드가 종료되면 자신의 일을 모두 마치고 종료
	// - 마지막 스레드가 종료되는 시점에 종료
	// - 일반적으로 다른 스레드의 작업을 돕는 보조 역할을 한다. 
	// - 종료 시점이 마지막 일반스레드가 종료될 때 종료점 외에는 일반스레드와 동일
	// - garbage Collector(메모리의 사용되지 않는 객체를 가비지컬렉터가 자동으로 객체를 제거해 준다.)
			// - 프로세서가 종료시점에 자동저장, 화면 자동 갱신
	// - 무한루프를 사용해서 항시 대기하고 있다가 특정조건이 만족하면 작업을 수행하고 다시 대기상태에 들어간다. 

class MyThread extends Thread{		//스레드를 작동시킬 클래스 
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon()? "데몬스레드" : "일반스레드")); 
		// Thread 안에 getName(),isDaemon() 있음
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + " : " +i+ "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
public class ThreadPropertites_3 {

	public static void main(String[] args) {
		// 1. 일반 쓰레드
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);  //디폴트(default)
		thread1.setName("thread 1");
		thread1.start();
		
		// 2. Daemon 스레드 : 마지막 스레드가 종료될 때 종료된다. 
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);  //디폴트(default)
		thread2.setName("thread 2");
		thread2.start();
		
		// 2. 3.5초후에 main thread 종료
		try {		//3.5초
			Thread.sleep(3500);
		} catch (InterruptedException e) {
		} 	
		System.out.println("Main Thread종료");
		//thread1은 일반 쓰레드이므로 main thread가 3.5초뒤에 중지되더라도 자기 갈길 감
		//thread1의 setDemon을 true할 경우 main thread가 종료될 경우 같이 종료됨
		
		
		

	}

}
