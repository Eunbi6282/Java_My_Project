package chapter10.Ex04;
	//�޼ҵ� �������̵��� ���� �����ڿ��� ����
		//�ڽ��� Ŭ�������� �θ��� �޼ҵ带 �������� ��� ���� �����ڴ� �θ�� ���ų� �о�� �Ѵ�. 
class Aaa{
	protected void abc() {
	}
}
class B1 extends Aaa{
	@Override
	public void abc() {
		System.out.println("�������̵� ����: �θ� protected , �ڽ� public");
	}
}
class B2 extends Aaa{
	@Override
	protected void abc() {
		System.out.println("�������̵� ����: �θ� protected , �ڽ� protected");
	}
}
class B3 extends Aaa{
	//@Override
//	void abc() {   -> �������̵��� �޼ҵ��� ���� ������ ����
//		System.out.println("�����߻�: �θ� protected , �ڽ� default");
//	}
}
class B4 extends Aaa{
	//@Override
//	private void abc() {	-> �������̵��� �޼ҵ��� ���� ������ ����
//		System.out.println("�����߻�: �θ� protected , �ڽ� private");
//	}
}


public class MetodOverriding_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
