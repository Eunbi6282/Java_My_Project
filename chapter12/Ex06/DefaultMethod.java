package chapter12.Ex06;

/*Interface�� default �޼ҵ� : �������̽� ������ �����ΰ� �ִ� �޼ҵ带 ������ �� (public �����Ǿ�����)
  - ������ �����Ǿ� �ִ� �������̽����� ���ο� ����� �߰��� �� ���� Ŭ�������� ������ �ʿ���� ���ο� ����� �߰��� ��
 
 * public default void bdc(){} 
	- �ڹ� 1.8�̻󿡼� ���Ӱ� �߰��� ���
	 default Ű�� �־�� �Ѵ�. / ������ default�� ���� �����ڰ� �ƴ�!!!
*/


interface A{
	void abc();		//2005�⿡ ������ �޼ҵ�  , public abstract, �����ΰ� ���� �߻� �޼���
	default void bcd() {	//2020�⿡ ������ �޼ҵ�
		System.out.println("A �������̽��� bcd()");
	}
	default void  ttt() {
		System.out.println("dd");
		}
	// void ttt(); -> �׳� �߻� Ŭ������ ������ ������
}
class B implements A{		//2005�� ������ Ŭ����
	public void abc() {
		System.out.println("BŬ������ abc()");
	}
}
class C implements A{
	public void abc() {
		System.out.println("CŬ������ abc()");
	}
	public void bcd() {			//default�޼ҵ嵵 �������̵� �� �� �ִ�. 
		System.out.println("CŬ������ bcd()");
	}
}

public class DefaultMethod {

	public static void main(String[] args) {
		//1. ��ü ����
		A a1 = new B();
		A a2 = new C();
		
		// 2. �޼ҵ� ȣ��
		a1.abc();	//B
		a1.bcd();
		
		a2.abc();
		a2.bcd();
		

	}

}
