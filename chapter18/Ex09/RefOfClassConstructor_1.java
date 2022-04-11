package chapter18.Ex09;

interface A{
	B abc();   // 리턴타입이 B 객체를 리턴
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
		System.out.println("============A를 통해 abc() 중 기본 생성자 호출===============");
		// 1. 클래스 생성자 참조
		A a1 = new A() {
			@Override
			public B abc() {   //abc()호출시 생성자 참조(구현된 생성자 호출). / B객체의 기본 생성자 호출
				return new B();
			}
		};
		
		// 람다식 표현
		A a2 = () -> {return new B();};  //전체구문
		A a3 = () -> new B();  //축약구문 -> return 제거시 중괄호도 제거
		
		// 3. 클래스 생성자 참조
		A a4 = B :: new;
		
		a1.abc();
		a2.abc();
		a3.abc();
		a4.abc();
		
		

	}

}
