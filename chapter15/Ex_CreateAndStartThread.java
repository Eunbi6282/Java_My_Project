package chapter15;

import java.util.Iterator;

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
// 첫 번째열 쓰레드 생성
class SubjectThread extends Thread{
	public void run() {
		// 1. 첫번째 열 출력(Thread를 상속)
		String[] subArray = {"이름","나이","국어","영어","수학"};
		for (int i = 0; i < subArray.length; i++) {
			System.out.print(subArray[i] + " ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	};
}

// 두 번째열 쓰레드 생성 
class MyInfoRunnable implements Runnable{

	@Override
	public void run() {
		// 2. 두번째 열 출력(Runnable을 상속)
		String[] myinfoArray = {"박은비","25","90","90","80"};
		try {	//0.01초
			Thread.sleep(10);
		} catch (InterruptedException e1) {
		}
		
		for (int i = 0; i < myinfoArray.length; i++) {
			System.out.print(myinfoArray[i] + " ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class Ex_CreateAndStartThread {

	public static void main(String[] args) {
		// 첫번째 쓰레드 시작
		Thread subThread = new SubjectThread();
		subThread.start();
		
		//두번째 쓰레드 시작
		MyInfoRunnable myinfoRunnable = new MyInfoRunnable();
		// myinfoThread.start(); -> Runnable에는 start()없음 , Thread통해서 불러오기
		Thread myinfoThread = new Thread(myinfoRunnable);
		myinfoThread.start();
		
		//세번째 열 쓰레드 생성(익명이너클래스 사용-> 클래스, 객체생성X)
		Thread loverThread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String[] myinfoArray = {"정재현","26","100","98","75"};
				try {	//0.01초
					Thread.sleep(20);
				} catch (InterruptedException e1) {
				}
				for (int i = 0; i < myinfoArray.length; i++) {
					System.out.print(myinfoArray[i] + " ");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		loverThread1.start();
		
		//네번째 열 쓰레드 생성(익명이너클래스 사용 -> 클래스, 객체 생성X)
		Thread loverThread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] myinfoArray = {"이도현","28","99","100","85"};
				try {	//0.01초
					Thread.sleep(30);
				} catch (InterruptedException e1) {
				}
				
				for (int i = 0; i < myinfoArray.length; i++) {
					System.out.println(myinfoArray[i] + " ");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
				}
			}
			});
		loverThread2.start();
	}
}
   
