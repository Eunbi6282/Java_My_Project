package chapter13.Ex11;
// 여러 쓰레드가 공유된 필드에 접근할 때 동시성의 문제가 발생 -> 동기화는 동시성 문제를 해결
/*
 동기화 : 여러 쓰레드가 공유된 필드를 접근할 때 하나의 쓰레드가 완료되면 다른 쓰레드에서 접근이 가능
 하나의 쓰레드가 사용중인 경우 lock을 걸고 작업이 완료되면 다른 쓰레드가 접근할 수 있도록 Lock해제
 - 모든 동기화된 메서드는 this(자신의 객체)라는 키만 가짐
 - 여러 메서드가 동기화된 메서드일 경우 : 하나의 쓰레드만 접근가능
 */

class MyData{
//동기화된 메서드는 Key값이 모두 this가 자동으로 등록, 수정이 불가함
	
	// 여러 쓰레드가 접근할 대 동시성 문제를 방지하기 위해서 동기화 처리 필요
	synchronized void abc() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	// 1초 딜레이
		}
	}
	
	synchronized void bcd() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "번째");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	// 1초 딜레이
		}
	}
	
	synchronized void cde() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	// 1초 딜레이
		}
	}
	
}
public class KeyObject_1 {
	public static void main(String[] args) {
		// 공유 객체 : 여러 쓰레드가 접근
		MyData myData = new MyData();
		
		//세개의 쓰레드가 각각의 메서드 호출
		new Thread() {	// 익명 클래스 : 쓰레드 클래스를 구현하는 자식 익명 클래스
			@Override
			public void run() {
				myData.abc();
			}
		}.start();
		
		new Thread() {				// Thread객체 생성 -> 바로 .start()출력
			public void run() {
				myData.bcd();
			};
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				myData.cde();
			}
		}.start();
		
		// 3개의 동기화 영역이 동일한 열쇠로 동기화 됐을 떄 -> 같은 키를 가지면 동시에 출력이 불가하다. 동시에 출력하고 싶다면 키를 다르게
		
	
	}
}
