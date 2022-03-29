package chapter13.Ex08.Ex01;

//3. 메서드의 매개변수로 전달:
	// 3-1 : 객체 생성후 매개변수로 전달 (클래스명 O, 참조변수 O)
	// 3-2 : 객체 생성후 매개변수로 전달 (클래스명 O, 참조변수 X)

interface A{	// 인터페이스, 추상메소드를 정의, 
	/*public abstract*/ void cry();	//추상메서드, public abstract 가 생략됨
	/*public abstract*/ void fly();
}

class B implements A{		//B는 A인터페이스를 구현한 클래스 
	@Override
	public void cry() {System.out.println("멍멍 : 매개변수 전달 후 출력");}
	@Override
	public void fly() {System.out.println("날지 못합니다 : 매개변수 전달 후 출력");}
	
}
class C {	// C 객체의 abc메서드 호출 시 A타입을 매개변수로 받는다. 
	void abc(A a) {		//하위 자식 클래스가 매개수로 들어올 경우 A타입으로 자동으로 업케스팅이 된다. 
		a.cry();
		a.fly();
	}
}

public class Anonymous3_1 {
	public static void main(String[] args) {
		
		//1. 클래스 O, 참조변수 O
		C c = new C();
		A a = new B();	//B를 객체화해서 A타입으로 생성, a : 참조변수/ 인터페이스는 객체화 할 수 없으므로 자식 클래스 이용 
		
		c.abc(a); 	//A타입의 객체 던져줌
		
		// 2. 클래스 O, 참조변수 X
		c.abc(new B()); 	//객체 B가 만들어지면서 A타입으로 자동으로 업캐스팅 됨
		

	}

}
