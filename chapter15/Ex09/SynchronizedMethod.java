package chapter15.Ex09;

// 메서드 동기화 : 메서드 전체를 동기화
	// key 값이 this 할당됨.


//스레드가 공유하는 객체 필드생성
class MyData{  	
	int data = 3; //데이터 가져오기
	
	public synchronized void  plusData () {	// 메서드 동기화 : 메서드의 전체를 동기화	
		//동기화 처리 메서드 : 하나의 스레드가 작업이 완료되면 다름 스레드가 작업할 수 있다.
		int mydata = data;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		data = mydata + 1;
	}
}

class PlusThread extends Thread{		//1씩 증가하면서 2개의 스레드 생성
	MyData myData;
	public PlusThread(MyData myData) {		//매개변수를 활성화 시킴
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행결과 : " + myData.data);
	}
}

public class SynchronizedMethod {

	public static void main(String[] args) {
		//공유 객체 생성
				MyData myData = new MyData();
				
				// 1. PlusThread 첫번째 스레드 생성
				Thread plusThread1 = new PlusThread(myData);
				plusThread1.setName("plusThread1");
				plusThread1.start();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				
				// 2. PlusThread 두번째 스레드 생성
				Thread plusThread2 = new PlusThread(myData);
				plusThread2.setName("plusThread2");
				plusThread2.start();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				

	}

}
