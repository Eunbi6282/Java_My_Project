package chapter15.Ex10;

//  동기화 ㅣ: 여러 스레드가 공유된 필드에 접근할 때 하나의 스레드에서 작업시 다른 스레드가 접근하지 못하도록

// 블락 동기화 : 메서드 내부의 일부분만 동기화한다.
// 		- 구문형식 : synchronized (임의의 객체){}
//						this : 자신의 객체 or new  임의의객체

class A{}
class B{}
class C{}


class MyData{  	//스레드가 공유하는 객체 필드생성
	int data = 3; //데이터 가져오기
	
	public  void  plusData () {	// 메서드 동기화 : 메서드의 전체를 동기화	
		//동기화 처리 메서드 : 하나의 스레드가 작업이 완료되면 다름 스레드가 작업할 수 있다.
		synchronized (this) {	//블락 동기화 : 메서드 내의 특정 블락까지만 동기화 처리, 메서드의 일부분만 동기화
								// this -> 자신의 객체 or 임의의 객체(ex new SynchronizedBlock(), newC(),new A(), new Object()
								// 자신의 객체를 뜻하고, 동기화 블록에 접근하는 키이다. 
								// 모든 쓰레드는 Key를 가져야 동기화 블럭을 접근할 수 있다.
								// Ket는 임의의 객체를 키로 사용할 수 있다. 
			
			int mydata = data;
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			data = mydata + 1;
		}
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

public class SynchronizedBlock {

	public static void main(String[] args) {
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
