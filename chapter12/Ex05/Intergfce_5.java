package chapter12.Ex05;
interface A{		
		/* ��� 1 : ��ü�� ���� �� ����
		 * ��� 2 : �͸� Ŭ������ �̿��ϴ� ���
		 * 
		 */
		
	
//	�������̽� ���� : ����� �ְ� ���α׷��� (PM)
	double PI = 3.14;	//public static final
	void run();
}

class B implements A{
	@Override
	public void run() {
		System.out.println("�޸���");
	}
}
public class Intergfce_5 {

	public static void main(String[] args) {
		//1. ��ü ������ ���
		A a1 = new B();
		a1.run();
		
		// 2. �͸� ��ü�� ���
	 A a2 = new A() {
		 public void run() {
			 System.out.println("���� ���ϴ�");
		 }
	 };
	 
	}
}
