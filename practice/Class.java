package practice;

class A{
	int m = 8;
	
	void print() {
		System.out.println("��ü ���� �� Ȱ��");
	}
}

class B {
	int n;
	
	void method() {
		System.out.println("B�� �޼���");
	}
}

public class Class {
	public static void main(String[] args) {
		//Ŭ������ ��ü ����
		A a = new A();
		// A -> Ŭ����, a -> ���� ���� , new -> �������� ������� ���� ��ü�� ���޸𸮿� �־��� 
		// A() -> ������(�������� �̸��� Ŭ������ �̸��� �����ؾ� ��)
		
		//Ŭ���� Ȱ��
		//@�ʵ� Ȱ�� : �ʵ忡 ���� �б�/����
		a.m=7;
		System.out.println(a.m); //a -> ��ġ�� , a.m -> ���޸𸮿� ����Ǥ��ִ� ��(�ش� ��ġ�� �ִ� ��ü ���� ����)
		
		//@�޼��� Ȱ��
		a.print();
		
		System.out.println("====�������� Ǯ�� -> class B�̿�====");
		
		// �������� bb�� �����ϰ� Ŭ���� B�� ��ü�� ����
		B bb = new B();
		
		//��ü ������ �ʵ� n�� 5���� �����Ͻÿ�
		bb.n = 5;
		System.out.println(bb.n);
		
		//�޼��� method ȣ��
		bb.method();
		
		
	}
	
	

}
