package chapter06_07.Ex06;

//���� �ʱ�ȭ ���

/* �����ڿ� static���:
 * - ������ : �ν��Ͻ� �ʵ带 �ʱ�ȭ, �����ʵ嵵 �ʱ�ȭ ����
 * - ����(static)���  : static�ʵ��� ���� �ʱ�ȭ
 * 
 * 
 * */

class E{
	int a;
	static int b;	
	
	//���� �ʱ�ȭ ��� : �����ڿ� ���� static�ʵ��� ���� ȣ���� �� �ʱ�ȭ�ϴ� ������ �Ѵ�. 
	static {	//����(static) �ʱ�ȭ �� : ��ü ���� ���� Ŭ���� ������ ȣ���� �� �ʱ�ȭ 
//		a = 3; -> �����߻�(�ν��Ͻ� �ʵ�� static������ �ʱ�ȭ�� �� ����)
		b= 8;
		System.out.println("classE�� �ε� �Ǿ����ϴ�. ���� b�� �� : " + b);
	}
	
	E(){		//������ : ��üȭ �� �� �ʵ��� ���� �ʱ�ȭ
		a = 3;		//�ν��Ͻ� �ʵ�
				//�����ʵ�
	}
}

public class Static_3 {

	public static void main(String[] args) {
		System.out.println(E.b); 	//��ü �������� E.b ȣ��� �� static����� �۵��� 
										// :static �� ���� �ʱ�ȭ ��. ������ ȣ��� ����
		
		System.out.println();
		E.b = 8;
		System.out.println(E.b);

	}

}
