package Chapter02;
public class UsageOfDataType {
	public static void main(String[] args) {
		//���� ���� : 
			//�ڷ��� ������ ; �����ϰ� ���߿� �� �Ҵ�
			//�ڷ��� 
		
		int a = 3;
		int b;
		b = 4;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("==============");
		
		a = 10;
		b = 30;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("==============");
		
		//byte a ;  //���� -> a�� �̹� int�� ����Ǿ�����, ����� ������ �缱�� �� �� ����.
		// a = 10.02 //���� -> a���� ������ ���� �� ���� , �Ǽ� ������ ����, �ٸ� ������ Ÿ���� ���� ���� �� ����.
		
		char c;				//char�� ���� 1�ڸ� ������ �� ����,��������ǥ'' ���
		c = 'A';
		System.out.println(c);
			
		String d;
		d = "������ ����� ���� ���������ϴ�.";
		System.out.println(d);
		
		String e ="11������";
		System.out.println(e);
		
		
	}

}
