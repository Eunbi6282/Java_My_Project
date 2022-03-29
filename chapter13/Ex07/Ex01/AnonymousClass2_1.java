package chapter13.Ex07.Ex01;
//2. 인터페이스의 추상 메서드를 구현한 <<<익명내부클래스>>> 후 호출 : 한번만 사용할 경우

interface A{	// 인터페이스, 추상메소드를 정의, 
	/*public abstract*/ void cry();	//추상메서드, public abstract 가 생략됨
	/*public abstract*/ void fly();
}

class B{
	//A a = new A();		// 인터페이스는 객체화할 수 없다. 
	 A a = new A(){			// 익명 외부 클래스를 생성해서 구현 가능 
		 
		 //A인터페이스를 구현한 자식 클래스 블락 : 클래스 이름이 없다. (컴파일러가 랜덤한 이름으로 자동으로 할당)
		 public void cry() {		// 접근 제어자는 반드시 public
			 System.out.println("멍멍");
		 };		
		 public void fly() {
			 System.out.println("개는 날지 못합니다.");
		 };
	 };
	 
	void abc() {
		a.cry();
		a.fly();
	}
}

public class AnonymousClass2_1 {
	public static void main(String[] args) {
		B b = new B();
		b.abc();

	}

}
