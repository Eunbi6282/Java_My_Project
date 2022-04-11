package chapter18.Ex04;

// 람다식의 활용
	// 1. 익명 이너클래스를 활용하는 방법
	// 2. 메서드 참조 (1. 인스턴스 메서드 참조, 2. 정적 메서드 참조)
		// 메서드 참조 : 구현되어 있는 메서드를 참조/
		// 메서드를 참조하기 위해서는 return 타입과 매개변수가 동일해야 한다. 

interface A{
	void abc(); 
}

class B{
	void bcd() {   //인스턴스 메서드 : 객체화해야 호출이 가능
		System.out.println("메서드");
	}
}

//abc를 호출하면 bcd를 참조해서 쓴다. 
public class RefOfInstanceMethod_Type_1 {

	public static void main(String[] args) {
		// 1. 인스턴스 메서드 참조 type 1
		A a1 = new A() {
			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		
		// 2. 위 시나리오를 람다식으로 표현
		A a2 = () -> { 
			B b = new B(); 
			b.bcd();
		};  // 람다식 끝나는 부분에 ; 넣어주기
		
		// 3. 인스턴스 메서드 참조표현식 type1
		B b = new B(); //인스턴스 객체를 생성, 객체명::메서드명
		A a3 = b :: bcd;  // <== 인스턴스 참조 표현 <== 리턴타입이 같아야 한다. 매개변수가 동일 해야 한다. 
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		

	}

}
