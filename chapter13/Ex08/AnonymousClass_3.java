package chapter13.Ex08;

// Ŭ���� ���� �� ���� ������ ��� / ���������� ������� ���� ��� �Ű������� ��ü ����

interface A{
	public abstract void abc();
}

// 1. �ڽ� Ŭ������ ���� ����
class B implements A{

	@Override
	public void abc() {
		System.out.println("�Ű����� ����");
	}
}

class C{		//cde�޼��忡 input������ AŸ���� ��ü a�� input�޴´�. 
	void cde(A a) {		// cde �޼��带 ȣ���ϸ鼭 ��ü�� �Ű������� AŸ���� ��ü�� ����
		a.abc();		// AŸ���� abcȣ�� -> �������̵��Ǿ� B�� �ִ� abc()��µ�
	}
}

public class AnonymousClass_3 {

	public static void main(String[] args) {
		// ���1 : Ŭ������ O + ���� ������ O
		C c = new C();		
		A a = new B();	// ����������, Ŭ������ (A) �������� ����(a)
		c.cde(a);	//�Ű������� ��ü a�� �����ؼ� ������
		System.out.println("======================");
		
		// ���2 : Ŭ���� �� O + ���������� X
		C c1 = new C();
		c1.cde(new B()); // ��ü�� �ٷ� �������� ������ ������
		
		

	}

}
