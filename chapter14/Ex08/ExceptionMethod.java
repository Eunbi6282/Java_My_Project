package chapter14.Ex08;

// �޼��忡 throws�� ����, ����, �����ؼ� main �޼������ ������Ŵ
	// main() ���� ���ܰ� ���� �� ��� ������ ���â�� ���� ���α׷� ����
	//main()�� ����ó�� ���� �ʴ´�.
class AA{
	public void abc() throws NumberFormatException{
		bcd();
	}
	public void bcd() throws NumberFormatException{
		cde();
	}
	public void cde() throws NumberFormatException{
		int num = Integer.parseInt("10A");		//Exception�߻� -> NumberFormatException
	}
	
	
}
public class ExceptionMethod {
	public static void main(String[] args) throws NumberFormatException{
		// 1. ��ü ����
		AA aa = new AA();
		
		// 2. �޼��� ȣ��
		// aa.abc();	//���࿹��(�����ϴܰ迡�� ����X, �������� �� ��������)
		//���� ó���� �̷�� �̷�ٰ� main()���� ��
		
		//���� ó�� ����
//		try {
//			aa.abc();
//		} catch (NumberFormatException e) {
//			System.out.println("���� �߻�");
//		}
		System.out.println("���α׷� ����");
		
		
		// public static void main(String[] args) throws NumberFormatException{ -> ���θ޼���ε� �̷� �� ���� (���� �߻�)
		aa.abc();
		
	}

}
