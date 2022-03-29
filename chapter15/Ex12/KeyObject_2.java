package chapter15.Ex12;
/*
	! 여러 쓰레드가 공유된 필드에 접근할 때 동시성의 문제가 발생 ! ==> 동기화는 동시성 문제를 해결.

	동기화 : 여러 쓰레드가 공유된 필드를 접근할 때 하나의 쓰레드가 완료되면 다른 쓰레드에서 접근이 가능
		하나의 쓰레드가 사용중인 경우 lock을 걸고 작업이 완료되면 다른 쓰레드가 접근할 수 있도록 Lock 해제 
		
		- 모든 동기화된 메서드는 this(자신의 객체)라는 키만 가짐
		- 여러 메서드가 동기화된 메서드일 경우 : 하나의 쓰레드만 접근 가능
*/
class A{}
class B{}
class C{}

//공유 객체 : 여러 쓰레드가 공유 객체에 접근
class MyData{
	//동기화된 메서드는 Key값이 모두 this가 자동으로 등록, 수정이 불가함.
		// 동기화 메서드는 Key값을 넣을 수 없다. 
		// 하나의 쓰레드가 접근할 때 Key를 가지고 동기화된 메서드를 접근 가능하다.
		// Key는 객체를 키로 사용할 수 있다. 
	// 동기화 블럭은 Key값을 임의로 할당 가능하다.
synchronized void abc() {		//여러 쓰레드가 접근할 때 동시성 문제를 방지하기 위해서 동기화 처리 필요
	
	for (int i = 0; i < 3; i++) {
		System.out.println(i + "sec");
		try {
			Thread.sleep(1000);		//1초 딜레이
		} catch (InterruptedException e) {}		
	}
}
	synchronized void bcd() {		//여러 쓰레드가 접근할 때 동시성 문제를 방지하기 위해서 동기화 처리 필요
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {
				Thread.sleep(1000);		//1초 딜레이
			} catch (InterruptedException e) {}		
		}
	}
	
	 void cde() {		//여러 쓰레드가 접근할 때 동시성 문제를 방지하기 위해서 동기화 처리 필요
		 
		 synchronized (new Object()) {		//this키가 아닌 별도의 키 생성 : 임의의 키 생성, 
			
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "번째");
				try {
					Thread.sleep(1000);		//1초 딜레이
				} catch (InterruptedException e) {}		
			}
		}
	}
}




public class KeyObject_2 {

	public static void main(String[] args) {
		// 공유객체 : 여러 쓰레드가 접근
				MyData myData = new MyData();
				
				// 세개의 쓰레드가 각각의 메소드 호출
				new Thread() {			//익명 클래스 : 쓰레드클래스를 구현하는 자식 익명 클래스 
					public void run() {
						myData.abc();		// 첫번째 쓰레드 -> abc메서드 호출
					};
				}.start();
				
				new Thread(){
					public void run() {
						myData.bcd();		// 두번째 쓰레드 -> bcd메서드 호출
					};
				}.start();
				
				new Thread() {
					public void run() {
						myData.cde();		// 세번째 쓰레드 -> cde메서드 호출
					};
				}.start();
			
	}

}
