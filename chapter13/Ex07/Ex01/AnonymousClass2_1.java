package chapter13.Ex07.Ex01;
//2. �������̽��� �߻� �޼��带 ������ <<<�͸���Ŭ����>>> �� ȣ�� : �ѹ��� ����� ���

interface A{	// �������̽�, �߻�޼ҵ带 ����, 
	/*public abstract*/ void cry();	//�߻�޼���, public abstract �� ������
	/*public abstract*/ void fly();
}

class B{
	//A a = new A();		// �������̽��� ��üȭ�� �� ����. 
	 A a = new A(){			// �͸� �ܺ� Ŭ������ �����ؼ� ���� ���� 
		 
		 //A�������̽��� ������ �ڽ� Ŭ���� ��� : Ŭ���� �̸��� ����. (�����Ϸ��� ������ �̸����� �ڵ����� �Ҵ�)
		 public void cry() {		// ���� �����ڴ� �ݵ�� public
			 System.out.println("�۸�");
		 };		
		 public void fly() {
			 System.out.println("���� ���� ���մϴ�.");
		 };
	 };
	 
	void abc() {
		a.cry();
		a.fly();
	}
}

public class AnonymousClass2_1 {
	public static void main(String[] args) {
		B b = new B();
		b.abc();

	}

}
