package chapter06_07.Ex02;

// �⺻ Ÿ���� �޼ҵ�
public class InternalCallMethod {

	public static void main(String[] args) {
		//���� Ŭ���� �ȿ��� ���� �޼ҵ� ȣ�� : static Ű�� ������� ���� ���� ��üȭ�ؼ� �޼ҵ� ȣ��
		
		InternalCallMethod aaa = new InternalCallMethod();	
		//static�� ������ �ʾ� ��üȭ ��Ŵ
		
		aaa.print();	//aaa ��ü�� print�޼ҵ� ȣ��
		
		int a = aaa.twice(3);
		System.out.println(a);
		
		double b = aaa.sum(a, 9.5);
		System.out.println(b);
				
		
	}

	void print() {		//static Ű���� ���� �޼ҵ� ���� , ��üȭ ���Ѿ� ��(new ���)
		System.out.println("�ȳ�");
	}
	int twice ( int k) {
		return k * 2;
	}
	double sum ( int m, double n) {
		return m+n;
	}
		
}
