package chapter06_07.Ex06;
//static Ű�� �Ҵ�� �ʵ�� ��� ��ü���� �����ؼ� ����ϴ� �޸� ����

class Pizza{
	int m = 3;		//�ν��Ͻ� �ʵ� : ��üȭ�ؼ� ���
	static int n = 5;	//static �ʵ� : ��üȭ �ʿ����(Aaaa.n)���� ��� ���� , ��üȭ �ص� ��
							//��� ��ü���� �����ϴ� �ʵ�
	
}

public class Static_2 {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		Pizza pizza4 = new Pizza();
		
		//�ν��Ͻ� �ʵ� : �� ��ü���� �������� �ʴ� �� ��ü������ ���.
		pizza.m = 5;
		pizza2.m = 6;
		pizza3.m = 7;
		pizza4.m = 8;
		System.out.println(pizza.m);
		System.out.println(pizza2.m);
		System.out.println(pizza3.m);
		System.out.println(pizza4.m);
		
		System.out.println();
		
		//���� �ʵ�
		pizza.n= 10;	//�Ѱ������� �ٲ㵵 ��� �ٲ�
		pizza.n= 100;
		System.out.println(pizza.n);
		System.out.println(pizza2.n);
		System.out.println(pizza3.n);
		System.out.println(pizza4.n);

		Pizza.n = 200;		//��ü�������� Ŭ���������� ȣ�� ����
		System.out.println(pizza.n);
		System.out.println(pizza2.n);
		System.out.println(pizza3.n);
		System.out.println(pizza4.n);

	}

}
