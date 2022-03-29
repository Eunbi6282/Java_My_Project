package chapter15.Ex06;

public class ThreadProperties_1 {

	public static void main(String[] args) {
		// 1. 객체 가져오기(currentThread()) //Thread의 개수 (activeCount())
			//static curentThread() <- static키라서 객체 생성없이 클래스(타입)명으로 바로 메서드 불러올 수 있음
		Thread curThread = Thread.currentThread();  //MainThread
		//클래스(타입) 참조변수 = 클래스명.메소드명;
		System.out.println("현재 스레드의 이름 : " + curThread.getName());
		//getName() 은 인스턴스화 해서 가져와야 함
		System.out.println("동작하는 스레드 수: " + Thread.activeCount());
		
		System.out.println("===================================");
		// 2. 스레드 이름 출력(자동출력) - JVM이 스레드 이름을 자동으로 할당 - Thread-0,,,,Thread-9
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();	//스레드 10개가 자동으로 만들어짐
			System.out.println(thread.getName());	//스레드 이름 출력
			thread.start();
		}
		System.out.println("=====================================");
		
		// 3. 스레드 이름 직접 지정 : 객체명.setName();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			thread.setName(i + " : 번째 스레드");
			System.out.println(thread.getName()); //스레드 이름 출력
			thread.start();
		}
		System.out.println("======================================");
		
		// 4. 스레드 이름 출력(자동출력) - JVM이 스레드 이름을 자동으로 할당 - Thread-0,,,,Thread-9
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();	//스레드 10개가 자동으로 만들어짐 
			//	-> 앞에 자동으로 넣은 스레드들이 있으면 그 다음번호부터 번호 할당함
			
			System.out.println(thread.getName());	//스레드 이름 출력
			thread.start();
			
		}
		System.out.println("=====================================");
		
		// 5. 스레드 수 출력하기
		System.out.println("동작하는 스레드 수 : " + Thread.activeCount());

	}

}
