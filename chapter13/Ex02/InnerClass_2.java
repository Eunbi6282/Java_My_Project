package chapter13.Ex02;
/*
  �̳� Ŭ�������� �ܺ� Ŭ������ �ʵ�� �޼ҵ� ���� ���
  
  �������̵� :  1. �θ�� �ڽ��� ��� ���谡 �־�� �Ѵ�.
  			2. �ν��Ͻ� �޼��� �������̵�
  		 	3. �ν��Ͻ� �ʵ�, static �ʵ�, static �޼���� �������̵� ���� �ʴ´�. 
 */

class A {
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;

	void abcd() { // ���� : �������̵��� �ƴϴ�. �ܺ� ���� Ŭ������ ������ �޼ҵ�� ������ ������ ��ġ
		System.out.println("AŬ������ �޼ҵ� abcd()");
	}

	class B { // �̳�Ŭ�������� �ܺ�Ŭ������ �ߺ��� �ʵ峪 �޼��带 ȣ���� ���
		int a = 5;
		int b = 6;

		void abcd() { // �������̵��� �ƴ϶� ������ �޼ҵ�
			System.out.println("BŬ������ abcd()");
		}

		void bcd() {
			// 1. �ڱ� �ڽ��� �ʵ�� �޼ҵ� ȣ��(�̳�Ŭ������ �ʵ�� �޼ҵ�)
			System.out.println(a); // 5 this.a
			System.out.println(b); // 6 this.b
			abcd(); // this.abcd()

			// 2. Outer Ŭ������ �ʵ�� �޼ҵ� ȣ��
			System.out.println(A.this.a); // 3 A.this.a : Outer Class�� �ʵ尪 ȣ�� !!����� �ƴϹǷ� super�� �ƴ�!!
			System.out.println(A.this.b); // 4 !!����� �ƴϹǷ� super�� �ƴ�!!
			A.this.abcd();

			// 3. OuterŬ������ �ʵ�� �޼ҵ� ȣ��
			System.out.println(c); // 33
			System.out.println(d); // 44

		}
	}
}

public class InnerClass_2 {

	public static void main(String[] args) {
		// 1. ��ü ����
		A a = new A();

		// 2. �̳�Ŭ���� ��ü ����
		A.B b = a.new B();
		b.bcd();
		System.out.println("=============");

		// 3. ���� Ŭ������ �ʵ�� �޼ҵ� ȣ��
		System.out.println(b.a);
		System.out.println(b.b);
		b.abcd();

	}

}
