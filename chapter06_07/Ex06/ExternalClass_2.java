package chapter06_07.Ex06;

// import chapter06_07.Ex05.B;		//class B�� Ŭ���� ���� �����ڰ� default�̱� ������ �ٸ� ��Ű������ ���� �Ұ�.  
import chapter06_07.Ex05.Bb;		//�ٸ� ��Ű���� Ŭ�������� ����Ʈ �Ǳ� ���ؼ� -> public ���� ������ �ʿ�

public class ExternalClass_2 {

	public static void main(String[] args) {

		// B b = new B();
		
		//�ٸ� ��Ű���� Ŭ���Ѥ����� BbŬ������ �����ϴ� ���
			// 1. import�� ���� ���
			// 2. BbŬ������ Ŭ���� ���� �����ڴ� public
			// 3. �ʵ�, �޼ҵ��� ���� �����ڿ� ���� ������ ���� (protected(��Ӱ���), public) , �Ұ���(private, default)
		
		Bb bb = new Bb();		//�ٸ� ��Ű���� Ŭ���� 1. Ŭ���� ���� �����ڿ� public
		bb.d = 40;
		// bb.a = 10; -> ����, ���� �Ұ���
		
		
		
		// bb.a; // ���� a�� private �̹Ƿ� BbŬ���������� ��밡��
		//bb.b; 
		

	}

}
