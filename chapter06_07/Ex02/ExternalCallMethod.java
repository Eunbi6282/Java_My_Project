package chapter06_07.Ex02;

//�޼ҵ� �����ε�: �ϳ��� �޼ҵ�� �ް������� Ÿ��, ������ ���� ȣ���ϴ� �� (Java)
//�޼ҵ� �������̵�: ��ӿ��� �θ� Ŭ������ �޼ҵ带 �������ؼ� ���



//�پ��� Ÿ���� �޼ҵ� ����(���� Ÿ���� �ִ� ��� (int, double, String...)
	//����Ÿ���� ���� ���
public class ExternalCallMethod {

	public static void main(String[] args) {
		//��ü ����
		A a = new A();
		
		//�޼ҵ� ȣ��
		a.print();
		
		int k = a.data();		//3
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result);		//8.2
		
		a.printMethod(8);
		a.printMethod(133);
		
		//���� :
		System.out.println(a.data());  //��� ������ ȣ�Ⱑ���� �޼ҵ� (return�� �ִ� �޼ҵ�)
		// System.out.println(a.print());  -> ���� , �ٷ� ����Ʈ ������
		a.print();
		System.out.println(a.sum(4, 10.5));
		// System.out.println(a.printMethod(3)); -> �����߻�
		a.printMethod(3);
		
		
	}

}
