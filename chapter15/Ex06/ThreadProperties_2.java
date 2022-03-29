package chapter15.Ex06;
// 스레드 우선순위
class MyThread extends Thread{
	@Override
	public void run() {
		for (long i = 0; i < 10000000; i++) {	}	//시간 지연용
		System.out.println(getName() + " 우선순위 " + getPriority());
	}
}
public class ThreadProperties_2 {

	public static void main(String[] args) {
		// 1. 참고 :CPU코어 확인하기
		System.out.println("코어수 : " + Runtime.getRuntime().availableProcessors());
		
		// 2. 기본(default) 우선순위
			//(낮음) 0 ~ 5(default) ~ 10(높음)
		for (int i = 0; i < 3; i++) {
			Thread thread = new MyThread();
			//System.out.print(thread.getName() + "\t"); // "\t" -> tap 	//스레드 이름 출력
			//System.out.println(thread.getPriority()); //기본값 5
			thread.start();
		}
		//1초 딜레이 -> 스레드가 금방 없어지므로 딜레이 시켜둠
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		//2. 우선순위 지정
		for (int i = 0; i < 10; i++) {		//0~8 : 우선순위 5, 9 : 우선순위 10
			Thread thread  = new MyThread();
			thread.setName(i + "번째 스레드");
			
			if (i == 9) { 	//마지막 스레드의 우선순위를 10으로 할당
				thread.setPriority(10);
			}
			thread.start(); //스레드 출력 (MyThread())
		}
	}
}
