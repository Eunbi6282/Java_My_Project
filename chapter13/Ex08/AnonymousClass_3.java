package chapter13.Ex08;

// 클래스 정의 및 참조 변수를 사용 / 참조변수를 사용하지 않을 경우 매개변수로 객체 전달

interface A{
	public abstract void abc();
}

// 1. 자식 클래스를 직접 생성
class B implements A{

	@Override
	public void abc() {
		System.out.println("매개변수 전달");
	}
}

class C{		//cde메서드에 input값으로 A타입의 객체 a를 input받는다. 
	void cde(A a) {		// cde 메서드를 호출하면서 객체의 매개변수로 A타입의 객체를 전송
		a.abc();		// A타입의 abc호출 -> 오버라이딩되어 B에 있는 abc()출력됨
	}
}

public class AnonymousClass_3 {

	public static void main(String[] args) {
		// 방법1 : 클래스명 O + 참조 변수명 O
		C c = new C();		
		A a = new B();	// 참조변수명, 클래스명 (A) 참조변수 생성(a)
		c.cde(a);	//매개변수에 객체 a를 생성해서 던져줌
		System.out.println("======================");
		
		// 방법2 : 클래스 명 O + 참조변수명 X
		C c1 = new C();
		c1.cde(new B()); // 객체를 바로 참조변수 명으로 던져줌
		
		

	}

}
