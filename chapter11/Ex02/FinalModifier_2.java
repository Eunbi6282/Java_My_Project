package chapter11.Ex02;

//final �޼���� final class�� Ư¡
	//final �޼��� : �������̵� �Ұ� (���� �߿��� �޼���� �ڽĿ��� ������ ���� ���ϵ��� ����)
	//final Ŭ���� : ����� �Ұ��� Ŭ����
class A{
	void abc() {}
	final void bcd() {} //final�� �Ҵ�� �⼭��� �ڽ� Ŭ�������� �������̵��� �Ұ�
}
class B extends A{
	void abc() {}	//�޼ҵ� �������̵� : �θ��� �޼��� ����� �ڽĿ��� ���Ӱ� ��� ���� ����
	//void bcd() {}  -> �޼ҵ� �������̵� �Ұ���
}
final class c{}
// class D extends C{}	-> C�� final class�̹Ƿ� ��ӺҰ�

public class FinalModifier_2 {

	public static void main(String[] args) {

	}

}
