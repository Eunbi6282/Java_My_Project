package chapter12.Ex02;

//���� ���̽� (interface) : �ܺο� ���θ� ��������ִ� ����
	// ��� �ʵ�� �ݵ�� : public static final����
	// ��� �޼ҵ� : public abstract ���� (1.8����), (default �޼ҵ� ����)

interface A{	//���� ǥ��
	public static final int A = 3;	//Interface�ʵ��� ���� ǥ��
	public abstract void abc() ; 	//Interface �޼ҵ��� ���� ǥ��
}
interface B{	//������ ����
	int A = 3;
	void abc();
}
abstract class C{			// �߻� Ŭ������ ���� abstract�� ������ �� ����. 
abstract void abc();		//������ ���� �߻�
}

public class InterFace_1 {

	public static void main(String[] args) {


		// 1. �������̽��� static �ʵ��� ������ ���
		System.out.println(A.A);	//�������̽��� �ʵ� ��� -> ��ü �������� ��� ����(static ������ ����)
		System.out.println(B.A);
		
		// 2. final�� ����Ǿ��ֱ� ������ ���� ������ �� ����. 
//		A.A = 5;	//final�� �����Ǿ� �ֱ� ������ ���� ������ �� ����. 
//		B.A = 6;
		
	}

}
