package chapter12.Ex07;

interface A{
	default void abc() {		//�������̽����� �����ΰ� �ִ� �޼ҵ带 ���� -> default���
		System.out.println("A�������̽��� abc()");
	}
}
class B extends Object implements A{
	public void abc() {
		A.super.abc(); 	//super.abc�� Object Ŭ������ abc()�� ȣ���϶�� ���� 
							//-> interface�� �޼ҵ带 ����ϱ� ���ؼ� 
								//�θ��������̽��̸�.super.����Ʈ�޼����̸�
		System.out.println("BŬ������ abc()");
	}
}

public class DefaultMethod2 {

	public static void main(String[] args) {
		// 1. ��ü ����
		B b = new B();
		
		// 2. �޼ҵ� ȣ��
		b.abc();	//B�� abc()�� ȣ���ϱ� ���ؼ� Ÿ���� B�� ��
		
		System.out.println("================");
		A a1 = new B(); 	//�������̽��� ��ü ���� �Ұ�, Ÿ���� ����
		a1.abc(); 	//�������̵� �Ǿ A�� abc�� ��µǴ°��� �ƴ� B�� abc()�� ��µ�
		

	}

}
