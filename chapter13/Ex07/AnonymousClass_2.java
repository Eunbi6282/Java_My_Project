package chapter13.Ex07;

// 2. �͸� �̳�Ŭ������ ����Ͽ� �������̽� ��ü ����

class A{
	C c = new C() { 					// (C�� �ڽ��� ������ �ʰ�)�͸� �̳� Ŭ���� ����, ���� �������̽��� ��ü ����x -> �̰� �͸�Ŭ���������
		public void bcd() {
			System.out.println("�͸� �̳�Ŭ����");
		};
	};
	void abc() {
		c.bcd();
	}
	
}
interface C{		//�������̽�, �߻�޼��� ���� :void bcd()
	public abstract void bcd();
	
}

public class AnonymousClass_2 {

	public static void main(String[] args) {
		// 1. ��ü ���� �� �޼��� Ȱ��
		A a = new A();
		a.abc();

	}

}
