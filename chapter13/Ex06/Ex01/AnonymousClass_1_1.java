package chapter13.Ex06.Ex01;
//1. �������̽��� �߻� �޼��带 ������ <<<Ŭ������ ����>>> �� ȣ�� : ����ϰ� ����ϴ� ���

interface A{	// �������̽�, �߻�޼ҵ带 ����, 
	/*public abstract*/ void cry();	//�߻�޼���, public abstract �� ������
	/*public abstract*/ void fly();
}

class B{
	A a = new C();
	
	void abc() {
		a.cry();
		a.fly();
	}
	
	class C implements A{		// class C�� A�������̽��� �޼��带 ������ Ŭ����

		@Override
		public void cry() {
			System.out.println("�۸�");
		}

		@Override
		public void fly() {
			System.out.println("���� ���մϴ�.");
		}	
	}
}
public class AnonymousClass_1_1 {

	public static void main(String[] args) {
		B b = new B();
		b.abc();

	}

}