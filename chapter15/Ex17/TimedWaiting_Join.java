package chapter15.Ex17;

import java.util.Iterator;

// a.join(1000) :a 객체에게 CPU할당하고 자신은 TimedWaiting상태로 대기

class MyThread1 extends Thread{
	
	
	@Override
	public void run() {
		for (long i = 0; i < 1000000000L; i++) {}	// 시간지연 0.5초
			
	};
}

class MyThread2 extends Thread{
	MyThread1 myThread1;	// 클래스타입 참조변수;
	
	//생성자 통해서 참조변수에 값 할당
	public MyThread2 (MyThread1 myThread1) {	
		this.myThread1 = myThread1;
	}
	
	@Override
	public void run() {
		try {
			myThread1.join(3000);	// myThread2(자신)은 3초 대기 , myThread1에게 cpu할당(양보)
		} catch (InterruptedException e) {
			System.out.println("---join(...) 진행중 interrupt 발생");
			for (long i = 0; i < 1000000000L; i++) {}	// 시간지연 0.5초/ 1초 -> 100억
			for (long i = 0; i < 1000000000L; i++) {}
			for (long i = 0; i < 1000000000L; i++) {}
		}
	}
}

public class TimedWaiting_Join {
	public static void main(String[] args) {
		// 1. 객체 생성
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		
		// s
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(1);} catch (InterruptedException e) {}	//0.1초 ,쓰레드시작 준비시간
		System.out.println("MyThread1 State : " + myThread1.getState());	//RUNNABLE
		
		System.out.println("MyThread1 State : " + myThread2.getState()); //TIMED_WAITING
				// myThread1.join(3000); => myThread2(자기자신)은 TIMED_WAITING으로 빠지고 myThread1는 CPU에 할당
		
		myThread2.interrupt(); 	//3초 대기중 전에 인터럽트가 발생되면 예외를 발생시키고 Runnable로 이동함.
		try {Thread.sleep(1);} catch (InterruptedException e) {}	//0.1초 ,쓰레드시작 준비시간
		System.out.println("MyThread1 State : " + myThread1.getState());	//RUNNABLE
		System.out.println("MyThread1 State : " + myThread2.getState()); //RUNNABLE

	}

}
