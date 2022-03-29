package chapter14.Ex06;
/*
 	예외처리 2가지 방법 :
 		1. 직접 처리 : try catch
 		2. 예외 전가(미룬다) : throws , 메서들르 호출하는 쪽에서 예외를 처리하도록 전가시킨다. 
 */

class A{ 		//메서드 내부에서 예외처리를 직접 구현
	void abc() {
		bcd();
	}
	void bcd() {
		
		try {			//일반예외 : InterruptedException
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("예외발생 1");
		} 
	}
}

class B{
	void abc() {
		 try {		
			bcd();		//bcd()에서 예외 처리를 호출하는 곳으로 미뤘기 때문에 bcd()를 호출한 abc()에서 예외를 처리할 의무를 가진다. 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("에외 발생2");
		}  
	}
	void bcd() throws InterruptedException {	//bcd()를 호출하는 쪽에서 예외를 처리하도록 미룸
		Thread.sleep(1000);	//예외 생김 ,but throws로 미룸
	}
}

public class ThrowsException1 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.abc();

	}

}
