package chapter12.Ex05;
interface A{		
		/* 방법 1 : 객체를 생성 후 구현
		 * 방법 2 : 익명 클래스를 이용하는 방법
		 * 
		 */
		
	
//	인터페이스 선언 : 기업의 최고 프로그래머 (PM)
	double PI = 3.14;	//public static final
	void run();
}

class B implements A{
	@Override
	public void run() {
		System.out.println("달린다");
	}
}
public class Intergfce_5 {

	public static void main(String[] args) {
		//1. 객체 생성후 출력
		A a1 = new B();
		a1.run();
		
		// 2. 익명 개체로 출력
	 A a2 = new A() {
		 public void run() {
			 System.out.println("훨훨 납니다");
		 }
	 };
	 
	}
}
