package chapter18.Ex05;

// 2. 메서드 참조 ( 정적 메서드 표현)
	//메서드 참조 : 내가 구현하지 않고, 구현되어 있는 메서드를 불러서 사요

interface A{
	void abc();
	
	
}

class B{
	static void bcd() {				 // <<== static : 클래스 이름으로 호출 가능
		System.out.println("메서드");
	}
}

public class RefOfStaticMethod_Type_2 {
	public static void main(String[] args) {
		// 1. 정적 메서드 참조 : 이너클래스로 처리
		A a1 = new A() {
			@Override
			public void abc() {
				B.bcd(); // 정적 메서드라서 객체 안만들고 바로 객체명으로 메서드 호출 가능
			}
		};
		
		// 2. 람다식 표현
		A a2 = () -> {B.bcd();}; //내 메서드를 호출하면 B의 bcd()를 호출해라
		
		// 3. 정적 메서드 참조
		A a3 = B :: bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();

		
		
		
		
		
		
	}

}
