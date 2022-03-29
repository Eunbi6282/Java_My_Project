package chapter15.Ex18;

// Blocked 상태 : 동기화 메서드나 동기화 블락에서 한쓰레드가 키를 점유한 경우 대기 상태의 쓰레드

class MyBlockTest{
		//1. 공유 객체(동기화 메서드, 동기화 블락)
		MyClass mc = new MyClass();
		
		//2. 세개의 쓰레드 필드 생성
		Thread t1 = new Thread("thread1") {
			public void run() {
				mc.syncMethod();
			};
		};
		Thread t2 = new Thread("thread2") {
			public void run() {
				mc.syncMethod();
			};
		};
		Thread t3 = new Thread("thread3") {
			public void run() {
				mc.syncMethod();
			};
		};
		
		void startAll() {
			t1.start();
			t2.start();
			t3.start();
		}

	class MyClass { // MyBlockTest의 내부클래스 , 쓰레드 3개 동시 접근  
		
		synchronized void syncMethod() {		//동기화 메서드 : 키를 가진 쓰레드만 접근 
			
			try {Thread.sleep(100);} catch (InterruptedException e) {}	//쓰레드 준비시간 0.1초 지연
			System.out.println("====" + Thread.currentThread().getName() + "====");
			System.out.println("thread1 ->" + t1.getState());
			System.out.println("thread2 ->" + t2.getState());
			System.out.println("thread3 ->" + t3.getState());
			
		}
	}
}
public class BlockedState {
	public static void main(String[] args) {
		MyBlockTest mbt = new MyBlockTest();
		mbt.startAll();

	}

}
