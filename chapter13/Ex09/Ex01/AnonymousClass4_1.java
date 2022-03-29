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
		// 1. Ŭ���� X, �������� O
		C c = new C();
		A a = new A() {
			@Override
			public void cry() {
				System.out.println("±±");
			}
			@Override
			public void fly() {
				System.out.println("�� �� �ִ�.");
			}
		};
		c.abc(a);
		System.out.println("===============");
		
		// 2. Ŭ���� X, �������� X
		c.abc(new A() {
			@Override
			public void cry() {
				System.out.println("±±");
			}
			public void fly() {
				System.out.println("�� �� �ִ�.");
			}
		});
		

	}

}
