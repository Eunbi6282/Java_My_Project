package chapter13.Ex03;


// static �̳�Ŭ���� : �ܺ� Ŭ������ �ν��Ͻ� �ʵ�, �ν��Ͻ� �޼���� ������ �Ұ�
	// �ܺ� Ŭ������ static �ʵ峪 static�޼���� ���� ����

class A{
	int a = 3;		//�ν��Ͻ� �ʵ�, ��üȭ �ؾ� ���� ����
	static int b = 4;	// static�ʵ�, ��ü �������� Ŭ���� �̸����� ���� ����, ��ü ������ ����
	void method1() {	//�ν��Ͻ� �޼ҵ�, ��ü ���� �� ���� ����
		System.out.println("�ν��Ͻ� �޼ҵ�");
	}
	static void method2() {	//static �޼ҵ�, ��ü �������� �ʰ� ����, ��ü ������ ���� 
		System.out.println("static �޼ҵ�");
	}
	static class B{
		void bcd() {
			// 1. static Ŭ�������� �ܺ� Ŭ������ �ν��Ͻ� �ʵ� ���� (���� �Ұ�)
			//System.out.println(a); //�ܺ� Ŭ������ �Τ��ͽ��ʵ�
			System.out.println(b); 	// static �̳� Ŭ�������� �ܺ�Ŭ������ static �ʵ峪 �޼ҵ� ���� ����
			
			// 2. �޼ҵ�ȣ�� 
			//method1(); 	//�ν��Ͻ� �޼��� ȣ�� �Ұ�
			method2();	// static �޼��� ȣ�� ����
		}
	}
}
public class InnerClass_3 {

	public static void main(String[] args) {
		// 1. Static �̳� Ŭ���� ��ü ����
		A.B b = new A.B();	//static �̳� Ŭ������ �ܺ� ��ü �������� ��ü ����
		b.bcd();
		System.out.println();
		A.method2();	//static�޼��� ȣ��
		

	}

}
