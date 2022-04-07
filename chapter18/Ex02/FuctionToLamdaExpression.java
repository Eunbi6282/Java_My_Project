package chapter18.Ex02;

// ���ٽ� ���� 
// �Ʒ� 4���� �������̽��� ���ٽ����� ó�� ���� :�Լ��� �������̽��̱� ����

@FunctionalInterface	//�Լ��� �������̽���� ����(�޼��� 1���� �� �� ����)
interface A{  	//�Է�X, ����X
	void method1();
}

@FunctionalInterface	//�Լ��� �������̽���� ����(�޼��� 1���� �� �� ����)
interface B{ 	// �Է�O, ����X
	void method2(int a);
}

@FunctionalInterface
interface C{	// �Է�X, ����O
	int method3();
}

@FunctionalInterface
interface D{	// �Է�O, ����O
	double method4(int a , int b);
}

public class FuctionToLamdaExpression {
	public static void main(String[] args) {
		
		// �������̽��� �Լ����� --> ���ٽ�
		// 1. �Է�X, ����X
			// (1) �͸� �̳�Ŭ����
			A a1 = new A() {
				@Override
				public void method1() {
					System.out.println("�޼���1_1 - �͸� �̳�Ŭ����");
				}
			};
			a1.method1();
			
			//	(2) ���ٽ�
				// ���ٽ��� ����Ÿ��, �޼��� ���� ���ŵ�
				// (��ǲ) -> {������};
			A a2 = () -> {System.out.println("�޼���1_2 - ���ٽ�");};  // ���ٽ��� ������ ���� ��ü ����
			A a3 = () -> System.out.println("�޼���1_3 - ���ٽ�");  // �����ο� �� ���θ� ���� �� �߰�ȣ ���� ����
			a2.method1();
			a3.method1();
			
		// 2. �Է�O, ����X
			//(1) �͸� �̳�Ŭ����
			B b1 = new B() {
				public void method2(int a) {
					System.out.println("�޼���2_1 - �͸� �̳�Ŭ���� : " + a);
				};
			};
			b1.method2(0);
			
			// (2) ���ٽ�
			B b2 = (int a) -> {System.out.println("�޼���2_2 - ���ٽ� : " + a);}; //��ü����
			B b3 = (a) -> {System.out.println("�޼���2_3 - ���ٽ� : " + a); }; //��౸�� -> �Է¸Ű����� Ÿ�� ��������
			B b4 = (a) -> System.out.println("�޼���2_4 - ���ٽ� : " + a);  //��౸�� -> ���๮�� �Ѷ���(; �ϳ��� ��)�� �� �߰�ȣ ���� ����
			B b5 = a -> System.out.println("�޼���2_5 - ���ٽ� : " + a);  //��౸�� -> �Է¸Ű������� �ϳ��� �� �Ұ�ȣ ���� ����
			b2.method2(1);
			b3.method2(5);
			b4.method2(6);
			b5.method2(7);
		
		
		
		

	}

}