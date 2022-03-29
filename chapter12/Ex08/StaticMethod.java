package chapter12.Ex08;

// �������̽� ���ο� static Ű�� �� �޼��� : ���� �ڽĿ��� ���� ���� �ٷ� ȣ��

/* �������̽� ���� ���� ���
  	1. �ʵ� : [public static] final 
  	2. �޼ҵ� : [public abstract]   <== �߻�޼ҵ� (�������� ���� �޼���)
  	 		  [public] default    <== �����ΰ� �ִ� �޼ҵ� (Java 1.8�̻󿡼� ���ο� ���)
  	 		  [public] static     <== �����ΰ� �ְ�, ��ü �������� ȣ�� (Java 1.8�̻󿡼� ���ο� ���)
*/

interface A{
	static void abc() {		//JAVA 1.8�̻󿡼� ���Ӱ� �߰��� ���
		System.out.println("A �������̽��� �����޼��� abc()");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// 1. ����(static) �޼��� ȣ��
		A.abc();	//�������̽� �̸����� �ٷ� ȣ�� ����
	}

}
