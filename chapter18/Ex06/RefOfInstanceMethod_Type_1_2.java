package chapter18.Ex06;

//메서드를 참조하기 위해서는 return 타입과 매개변수가 동일해야 한다.

interface A{
	void abc (B b, int k);  // B의 객체가 인풋으로 들어옴
}

class B{
	void bcd(int k) {  //인스턴스 메서드
		System.out.println(k);
	}
}
public class RefOfInstanceMethod_Type_1_2 {
	public static void main(String[] args) {
		// 인스턴스 메서드 참조 Type2
		// 익명 이너 클래스 
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		// 람다식 표현
		A a2 = (B b, int k) -> {b.bcd(k);}; 
		
		// 인스턴스 메서드 참조
		A a3 = B :: bcd;  // <== 인스턴스 메서드이나 B객체를 인풋받아서 bcd메서드 호출.
		
		B b = new B();
		a1.abc(b, 7);
		a2.abc(b, 8);
		a3.abc(b, 9);
		
		
	}
}
