package chapter12.Ex04;

// �������̽� ��ӽ� �ڽ�Ŭ���� ���� ������ ����  <<�߿�>>
interface A {
	public abstract void abc();
}

interface B{
	void abc();
}
class C implements A{
	public void abc() {  	//A �������̽��� abc()�� �������̵��ؼ� ������ �޼ҵ�
					// �ڽ��� �θ𺸴� ���������ڰ� ���ų� �� �о�� �Ѵ�. 
	}
}
class D implements B{
	public void abc() {  	//�������̽��� �޼ҵ带 ������ ���� �ݵ�� public�ֱ�
	}
}
//class E implements B{
//
//	@Override
//	void abc() {				=>public -> default �Ұ���
//	} 
class F implements A{ //FŬ������ �ϼ��� �޼Ұ� �����Ǿ� �־�� �Ѵ�.
	@Override
	public void abc() {
	}
}	
public class Interface_4 {
	public static void main(String[] args) {

	}
}
