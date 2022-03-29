package chapter12.Ex01;

abstract class D {		//Ŭ���� ���ο� ���� �� �߻� �޼ҵ尡 �� ���� abstract Ŭ������ �Ǿ�� �Ѵ�.
				// �ڽ� Ŭ�������� �ݵ�� ���� ���� �޼ҵ带 ������ �ϴ� ���� ������� �� �ִ�. 
	abstract void print();
}

class E extends D {	//�ڽ� Ŭ������ �߻� Ŭ������ �޼ҵ带 ������ �ؾ� �Ѵ�. 

	@Override
	void print() {
		System.out.println("EŬ������ print()");
	} 	
}

public class AbstractClass_3 {

	public static void main(String[] args) {
		// 1. ��üȭ �ؼ� ���
		D e1 = new E();
		D e2 = new E();
		D e3 = new E();
		
		e1.print();
		e2.print();
		e3.print();
		
		// 2. �͸� Ŭ���� �����ؼ� ���
		D a1 = new D() {
			@Override
			void print() {
				System.out.println("�͸�Ŭ���� ���1");
			}
		};
		a1.print();
		
		D a2 = new D() {
			
			@Override
			void print() {
				System.out.println("�͸�Ŭ���� ���2");
				
			}
		};
		a2.print();
		
		D a3 = new D() {
			@Override
			void print() {
				System.out.println("�͸�Ŭ���� ���3");
			}
		};
		a3.print();
	}

}
