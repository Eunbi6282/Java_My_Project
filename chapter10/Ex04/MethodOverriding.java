package chapter10.Ex04;

	// �޼ҵ� �������̵� (MethodOverriding)
	// 1. �ݵ�� ��� ���迡���� �޼ҵ� �������̵��� �����ȴ�. 
	// 2. �θ� Ŭ�������� ����� �޼ҵ带 ���Ӱ� �����ؼ� ����ϴ� �� 
	// 3. @Override ��� ������̼��� ����ϸ� �޼ҵ� �����ǽ� ������ ���� �� �ִ�. 
	// 4. �ñ״�ó�� ���ƾ� �Ѵ�. (�޼ҵ� ��, �Ű����� Ÿ��, �Ű����� ����)
	// 5. �޼ҵ��� ���� �����ڰ� ���ų� �о�� �Ѵ�. 

class A{
	void print() {
		System.out.println("AŬ����");
	}
}

class B extends A{
	//@Override 	// �޼ҵ� ���ٶ��̵�, �ݵ�� �θ��� �޼ҵ带 �������ϵ��� ����
					// @Override ������̼��� ������� ���� ��� : ��Ÿ�� ���ų� ���Ŀ� ���� ���� ���
					// ������ �޼ҵ�� ���ǵ�.
	void print() {
		System.out.println("BŬ����");
	}
}


public class MethodOverriding {
	public static void main(String[] args) {
		// 1. AŸ��
		A a = new A();
		a.print(); //AŬ������ print���
		
		//2. BŸ��
		B b = new B();
		b.print();	//BŬ������ print���
		
		//3. AŸ�� ��ĳ����		<=== B�� ��ĳ�����ؼ� AŸ������ �θ�
		A ab = new B();
		ab.print(); 	//BŬ������ print���
			//ab.print()�� AŬ������ printȣ��, ���� ���Τ�/���� ���ؼ� BŬ������ print()�� ���
		
	}

}
