package chapter13.Ex09.Ex01;
interface A{
	void cry();
	void fly();
}

class C {
	void abc(A a) {
		a.cry();
		a.fly();
	}
}

public class AnonymousClass4_1 {

	public static void main(String[] args) {
		// 1. 클래스 X, 참조변수 O
		C c = new C();
		A a = new A() {
			@Override
			public void cry() {
				System.out.println("짹짹");
			}
			@Override
			public void fly() {
				System.out.println("날 수 있다.");
			}
		};
		c.abc(a);
		System.out.println("===============");
		
		// 2. 클래스 X, 참조변수 X
		c.abc(new A() {
			@Override
			public void cry() {
				System.out.println("짹짹");
			}
			public void fly() {
				System.out.println("날 수 있다.");
			}
		});
		

	}

}
