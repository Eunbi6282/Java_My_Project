package chapter14.Ex07;

// Exception - Checked Exception - 컴파일 오류, ㅏㅂㄴ드시 예외처리
		//	 - unChedcked Exception (RunTime Exception) - 실행시에 예외

/*	예외 처리 방식
 * 1. try catch -> 자신이 직접 예외를 처리
 * 2. throws -> 예외 처리를 미루는 것, 메서드 블락안의 예외를 메서드를 호출하는 곳으로 throws 
 * 		throw : 예외를 강제 발생.
 */

// 1. Exception이 발생한 메서드 내부에서 자신이 직접 예외 처리
	
class A{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);  //ms : 1000, 1초
		} catch (ClassNotFoundException | InterruptedException e) {
		} //일반예외  ClassNotFoundException
			//Class.forName :동적 로딩 - 컴파일시에 체크하지 않고 실행할 때 객체가 존재하는지 확인.
				//실행시 클래스 파일이 존재할 수도 있고 존재하지 않을 수도 있기 때문에 예외 처리를 해주어야 한다!!@!@!@!
	}
}
// 2. throws를 사용해서 Exception을 미루는 경우
class B{
	void abc() {
		//얘도 다시 throws로 미룰 수 있음
		
			try {
				bcd();		//multicatch
			} catch (ClassNotFoundException | InterruptedException e) {
				e.printStackTrace();
			}	
	}
	//bcd()를 호출하는 곳(abc())에 예외를 미루겠다.
	void bcd() throws ClassNotFoundException, InterruptedException {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);  //ms : 1000, 1초
	
	}
}
public class ThrowsException_3 {
	public static void main(String[] args) {

	}

}
