package chapter12.Ex01;

abstract class D {		//클래스 내부에 선언만 된 추상 메소드가 올 경우는 abstract 클래스가 되어야 한다.
				// 자식 클래스에서 반드시 오류 없이 메소드를 재정의 하는 것을 보장받을 수 있다. 
	abstract void print();
}

class E extends D {	//자식 클래스는 추상 클래스의 메소드를 재정의 해야 한다. 

	@Override
	void print() {
		System.out.println("E클래스의 print()");
	} 	
}

public class AbstractClass_3 {

	public static void main(String[] args) {
		// 1. 객체화 해서 출력
		D e1 = new E();
		D e2 = new E();
		D e3 = new E();
		
		e1.print();
		e2.print();
		e3.print();
		
		// 2. 익명 클래스 생성해서 출력
		D a1 = new D() {
			@Override
			void print() {
				System.out.println("익명클래스 사용1");
			}
		};
		a1.print();
		
		D a2 = new D() {
			
			@Override
			void print() {
				System.out.println("익명클래스 사용2");
				
			}
		};
		a2.print();
		
		D a3 = new D() {
			@Override
			void print() {
				System.out.println("익명클래스 사용3");
			}
		};
		a3.print();
	}

}
