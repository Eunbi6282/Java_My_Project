package chapter11.Ex03;

//abstract(�߻�) �޼ҵ� : ���࿵���� ���� �޼ҵ� ,���� �Ǿ�����
	//�߻� Ŭ������ ��ü�� �� �� ����, Ÿ�����δ� ������ �� �ִ�.
	// ������ �޼ҵ带 �������ش� -> ������ �������� �߻�޼ҵ带 �������̵��ؼ� �����θ� ����� �ȴ�.
	// ���� Ŭ�������� �޼ҵ� �������̵��� ������ �����ϱ� 
	
	//�ڽ�Ŭ�������� �������ؼ� �����θ� �����ؾ� �Ѵ�. 
	// ��) �޼ҵ��� �⺻ ���� : void print(){}
	//    �߻� �޼ҵ� : ���� ������ ���� �޼ҵ� : void print();
	//    �߻� Ŭ���� : abstract class A {�߻� �޼ҵ带 �ϳ� �̻� �����ϸ�}
			// �ڽ� Ŭ�������� �޼ҵ带 �������ؼ� �����θ� �����Ѵ�. 

abstract class A{		//�߻�Ŭ���� : �߻�޼ҵ带 �ϳ��� �����ϸ� �ݵ�� �߻�Ŭ����
	abstract void print ();	//�߻�޼ҵ� : ���࿵���� ���� �޼ҵ�
	abstract void cry();
	
}
class B extends A{

	@Override
	void print() {
		System.out.println("��ũ��Ʈ Ŭ���� : �߻� Ŭ������ �߻�޼ҵ带 ��� ������ Ŭ����");
		
	}

	@Override
	void cry() {
		System.out.println("�߿�");
		
	}		//��ũ��Ʈ Ŭ���� : 
	
}
abstract class C extends A{		// �θ��� �߻� �޼ҵ��� �Ϻθ� ������ ��� : �߻�Ŭ����

	@Override
	void print() {
		// TODO Auto-generated method stub
	}
}
class D extends C{			//��ũ��Ʈ Ŭ���� : �θ��� ��� �߻�޼ҵ带 

	@Override
	void cry() {
		// TODO Auto-generated method stub
		
	}  	
	
}

public class AbstractModifier_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
