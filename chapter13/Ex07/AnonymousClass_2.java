package chapter13.Ex07;

// 2. 익명 이너클래스를 사용하여 인터페이스 객체 생성

class A{
	C c = new C() { 					// (C의 자식을 만들지 않고)익명 이너 클래스 생성, 원래 인터페이스는 객체 생성x -> 이건 익명클래스사용임
		public void bcd() {
			System.out.println("익명 이너클래스");
		};
	};
	void abc() {
		c.bcd();
	}
	
}
interface C{		//인터페이스, 추상메서드 정의 :void bcd()
	public abstract void bcd();
	
}

public class AnonymousClass_2 {

	public static void main(String[] args) {
		// 1. 객체 생성 및 메서드 활용
		A a = new A();
		a.abc();

	}

}
