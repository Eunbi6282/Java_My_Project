package chapter15.Ex19;

/* Waiting : 
	1. a. join() : 자신의 쓰레드는 Waiting 상태이고 a 객체에게 CPU를 할당(Runnable)/ time X
		// a 객체가 실행이 완료되면 자신의 쓰레드가 작동(Runnable), a. join(time)이랑 다름
	// 자신 쓰레드의 처리할 내용이 다른 쓰레드의 결과를 받아서 처리해야 할 경우
	
	2. wait(), notify(), notifyAll() <== 동기화 블락에서만 사용됨
		- wait() : 동기화 블록,동기화 메서드 내에서 wait()메서드를 만나면 Waiting상태로 들어간다. 
		- notify(), notifyAll()가 wait()메서드를 깨워줌. <== 반드시 다른 쓰레드에서 깨워줘야 함
		
*/

class DataBox{
	int data;
	synchronized void inputData(int data) {		//동기화 메서드
				//inputData -> setter와 비슷
		this.data = data;
		System.out.println("입력 데이터" + data);	// data : 매개변수 값으로 들어온 데이터 -> this 필요함(Setter같은거)
	}
	synchronized void outputData() {			//동기화 메서드
		System.out.println("출력 데이터" + data);	// data : 메모리에 올라온 데이터 출력한다는 의미 -> this X
	}
}
public class Waiting_WateNotify {
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