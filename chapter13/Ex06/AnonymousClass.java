package chapter13.Ex06;

// 1. �������̽��� ����� �̳�Ŭ������ �����ؼ� ��ü ���

class A{
	C c = new B();		//CŸ���� �ν��Ͻ� ����,c
	void abc() {
		c.bcd();
	}
}

class B implements C{	//�������̽� C�� �߻� �޼ҵ� ������ BŬ����

	@Override
	public void bcd() {
		System.out.println("�ν��Ͻ� �̳�Ŭ����");
	}
}

interface C{
	public abstract void bcd();
	
}

public class AnonymousClass {

	public static void main(String[] args) {
		// 1. ��ü ���� �� �޼��� ȣ��
		A a = new A();
		a.abc(); 	//�ν��Ͻ� �̳�Ŭ���� , C�� bcdȣ���
		
		

	}

}
