package chapter18.Ex10;

interface A{
	B abc(int k);   // 리턴타입이 B 객체를 리턴
}

class B{
	B(){
		System.out.println("첫번째 생성자");
	}
	B (int k) {
		System.out.println("두번째 생성자");
	}
}
public class RefOfClassConstructor_1 {
	public static void main(String[] args) {
		System.out.println("=================================");
		// 익명 이너클래스 
		A a1 = new A() {
			@Override
			public B abc(int k) {
				return new B(3);  //객체를 B타입으로 돌려줄
			}
		};
		
		// 람다식 표현
		A a2 = (int k) -> {return new B(3);};   //(인풋값) -> {구현부}
		A a3 = k -> new B(3);  // 축약 -> 매개변수 1개 받아서 소괄호, 매개변수 타입 생략가능, return과 증괄호도 생략가능
		
		// 클래스 생성자 참조
		A a4 = B :: new; // B의 두번째 생성자 호출
		
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
		a4.abc(3);
	}
}
