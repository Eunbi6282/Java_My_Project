package chapter13.Ex06;

// 1. 인터페이스를 상속한 이너클래스를 생성해서 객체 출력

class A{
	C c = new B();		//C타입의 인스턴스 변수,c
	void abc() {
		c.bcd();
	}
}

class B implements C{	//인터페이스 C의 추상 메소드 구현한 B클래스

	@Override
	public void bcd() {
		System.out.println("인스턴스 이너클래스");
	}
}

interface C{
	public abstract void bcd();
	
}

public class AnonymousClass {

	public static void main(String[] args) {
		// 1. 객체 생성 및 메서드 호출
		A a = new A();
		a.abc(); 	//인스턴스 이너클래스 , C의 bcd호출됨
		
		

	}

}
