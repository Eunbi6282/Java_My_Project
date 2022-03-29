package chapter13.Ex06.Ex01;
//1. 인터페이스의 추상 메서드를 구현한 <<<클래스를 생성>>> 후 호출 : 빈번하게 사용하는 경우

interface A{	// 인터페이스, 추상메소드를 정의, 
	/*public abstract*/ void cry();	//추상메서드, public abstract 가 생략됨
	/*public abstract*/ void fly();
}

class B{
	A a = new C();
	
	void abc() {
		a.cry();
		a.fly();
	}
	
	class C implements A{		// class C는 A인터페이스의 메서드를 구현한 클래스

		@Override
		public void cry() {
			System.out.println("멍멍");
		}

		@Override
		public void fly() {
			System.out.println("날지 못합니다.");
		}	
	}
}
public class AnonymousClass_1_1 {

	public static void main(String[] args) {
		B b = new B();
		b.abc();

	}

}
