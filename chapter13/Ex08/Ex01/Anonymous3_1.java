package chapter13.Ex08.Ex01;

//3. �޼����� �Ű������� ����:
	// 3-1 : ��ü ������ �Ű������� ���� (Ŭ������ O, �������� O)
	// 3-2 : ��ü ������ �Ű������� ���� (Ŭ������ O, �������� X)

interface A{	// �������̽�, �߻�޼ҵ带 ����, 
	/*public abstract*/ void cry();	//�߻�޼���, public abstract �� ������
	/*public abstract*/ void fly();
}

class B implements A{		//B�� A�������̽��� ������ Ŭ���� 
	@Override
	public void cry() {System.out.println("�۸� : �Ű����� ���� �� ���");}
	@Override
	public void fly() {System.out.println("���� ���մϴ� : �Ű����� ���� �� ���");}
	
}
class C {	// C ��ü�� abc�޼��� ȣ�� �� AŸ���� �Ű������� �޴´�. 
	void abc(A a) {		//���� �ڽ� Ŭ������ �Ű����� ���� ��� AŸ������ �ڵ����� ���ɽ����� �ȴ�. 
		a.cry();
		a.fly();
	}
}

public class Anonymous3_1 {
	public static void main(String[] args) {
		
		//1. Ŭ���� O, �������� O
		C c = new C();
		A a = new B();	//B�� ��üȭ�ؼ� AŸ������ ����, a : ��������/ �������̽��� ��üȭ �� �� �����Ƿ� �ڽ� Ŭ���� �̿� 
		
		c.abc(a); 	//AŸ���� ��ü ������
		
		// 2. Ŭ���� O, �������� X
		c.abc(new B()); 	//��ü B�� ��������鼭 AŸ������ �ڵ����� ��ĳ���� ��
		

	}

}
