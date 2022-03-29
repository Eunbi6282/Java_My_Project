package chapter13.Ex09;

// �Ű������� �޾Ƽ� ó�� : ���� ���̽��� ������ Ŭ������ (X), 
// 4. �ڽ� Ŭ������ �������� �ʴ´�. 

interface A{
	void abc();		//public abstract
}
class C{
	void cde(A a) {
		a.abc();
	}
}
public class AnonymousClass_4 {

	public static void main(String[] args) {
		C c = new C();
		
		// 3. Ŭ����(�������̽��� ������ Ŭ����) X, �������� ����(O)
		A a = new A() {		//�������̽��� ������ �ڽ� �͸� ��ü���� �� Ÿ���� A�� ������ �������� ����
			@Override
			public void abc() {
				System.out.println("Ŭ����(X), ��������(O)");
			}
		};	
		c.cde(a); 		//���������� �Ű������� ���� 
		
		// 4. Ŭ����(�������̽��� ������ Ŭ����) X, �������� ����(X) <==== ���� ���� ���(�ӽ÷� �ѹ��� ����� ��)
			// �̺�Ʈ ó���� ���
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("Ŭ����(X), ��������(X)");
			}
		});
	}

}
