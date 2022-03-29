package chapter14.Ex07;

// Exception - Checked Exception - ������ ����, ��������� ����ó��
		//	 - unChedcked Exception (RunTime Exception) - ����ÿ� ����

/*	���� ó�� ���
 * 1. try catch -> �ڽ��� ���� ���ܸ� ó��
 * 2. throws -> ���� ó���� �̷�� ��, �޼��� ������� ���ܸ� �޼��带 ȣ���ϴ� ������ throws 
 * 		throw : ���ܸ� ���� �߻�.
 */

// 1. Exception�� �߻��� �޼��� ���ο��� �ڽ��� ���� ���� ó��
	
class A{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);  //ms : 1000, 1��
		} catch (ClassNotFoundException | InterruptedException e) {
		} //�Ϲݿ���  ClassNotFoundException
			//Class.forName :���� �ε� - �����Ͻÿ� üũ���� �ʰ� ������ �� ��ü�� �����ϴ��� Ȯ��.
				//����� Ŭ���� ������ ������ ���� �ְ� �������� ���� ���� �ֱ� ������ ���� ó���� ���־�� �Ѵ�!!@!@!@!
	}
}
// 2. throws�� ����ؼ� Exception�� �̷�� ���
class B{
	void abc() {
		//�굵 �ٽ� throws�� �̷� �� ����
		
			try {
				bcd();		//multicatch
			} catch (ClassNotFoundException | InterruptedException e) {
				e.printStackTrace();
			}	
	}
	//bcd()�� ȣ���ϴ� ��(abc())�� ���ܸ� �̷�ڴ�.
	void bcd() throws ClassNotFoundException, InterruptedException {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);  //ms : 1000, 1��
	
	}
}
public class ThrowsException_3 {
	public static void main(String[] args) {

	}

}
