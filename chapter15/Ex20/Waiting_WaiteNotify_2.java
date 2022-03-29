package chapter15.Ex20;

class DataBox{
	int data;
	boolean isEmpty = true;	// 기본값 세팅
	
	// 두개의 메서드 다 this키를 가지고 있음 -> 경쟁, 서로 키를 점유하려고 함
	
	synchronized void inputData(int data) {		//동기화 메서드
		if(!isEmpty) {		//false일때 wait(); 동기화 블럭이나 동기화 메서드에서 WAITING상태로 전환
							// ( =data필드의 값이 비어있지 않을 때 잠시 대기. t2쓰레드가 처리하도록 잠시 대기)
			try {wait();} catch (InterruptedException e) {}
		}
		isEmpty = false;  // Data필드의 값을 넣고 t2쓰레드가 값을 읽을 수 있도록 false로 기본세팅
		this.data = data;
		System.out.println("입력 데이터" + data);	// data : 매개변수 값으로 들어온 데이터 -> this 필요함(Setter같은거)
		notify();
	}
	synchronized void outputData() {			//동기화 메서드
		if(isEmpty) {		// isEmpty가 true일때 WAITING상태로 진입
			try {wait();} catch (InterruptedException e) {}
		}
		isEmpty = true;
		System.out.println("출력 데이터" + data);	// data : 메모리에 올라온 데이터 출력한다는 의미 -> this X
		notify();		// inputData() 메서드의 wait()된 쓰레드를 깨워준다. 
	}
}


public class Waiting_WaiteNotify_2 {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		//첫번째 쓰레드 : 공유객체에 값을 넣는 쓰레드
		Thread t1 = new Thread() {		//(Thread 상속하는)익명 내부 클래스
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.inputData(i);
				}
			}
		};	
		
		// 두번째 쓰레드 : 공유객체로부터 값을 읽어오는 메서드
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.outputData();
				}
			}
		};
		
		//start()
		t1.start();
		t2.start();
		

	}
}
