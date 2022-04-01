package chapter16.Ex07;


// ���ʸ� Ŭ���� : Ŭ������ ������ �� Ÿ�Ժ����� ����<T> <<����>>, ��ü�� ������ T�� ������ Ÿ���� ����

// ���ʸ� �޼��� : �Ϲ� Ŭ���� ������ �޼��� ����� ���ʸ� Ÿ�Ժ����� ���

class ssGenericmethod{	//�Ϲ� Ŭ����
	
	//3���� ���ʸ� �޼���
	public <T> T method1(T t) {
		return t;
	}
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);	//�� ���� �� true, false ����
								// �⺻ �ڷ����� ���� ���� ��, ���� �ڷ����� ���� ��ü�� �ּҸ� ��
								// *String�� ��� , equals�� �����ǰ� �Ǿ������Ƿ� ���� ���Ѵ�. 
									// String -> Integer, Double, equals �� ������ �Ǿ���ִ�. 
		
	}
	public <K,V> void method3(K k, V v) {	// 2���� Ÿ�� ����
		System.out.println(k + " : " + v);
	}
	public <K,V> void method4 () {
		System.out.println("�Ű������� ��ǲ������ ���� ��� ������ ����");
	}
}

public class GenericMethod {
	public static void main(String[] args) {
		// 1. �Ϲ� Ŭ���� ��ü ������ ���ʸ� �޼��� ȣ��
		ssGenericmethod gm = new ssGenericmethod();
		String str1 = gm.<String>method1("�ȳ�");	//T -> String// �ż��� ȣ���ϱ� ���� <Ÿ��>�� �����ؼ� ȣ��
		String str2 = gm.method1("�ȳ�");		//Ÿ���� �� �� �ִ� ��� ȣ���� �� �������� (�Ű������� ���� �� �� ��������)
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("==============================");
		
		Integer integer = gm.<Integer>method1(100);
		Integer integer2 = gm.<Integer>method1(200);
		System.out.println(integer);
		System.out.println(integer2);
		
		System.out.println("==============================");
		
		Boolean boolean1 = gm.<Boolean>method1(true);
		Boolean boolean2 = gm.<Boolean>method1(false);
		System.out.println(boolean1);
		System.out.println(boolean2);
		
		System.out.println("==============================");
		
		Boolean double1 = gm.<Double>method2(2.55, 2.55); //method2�� ����Ÿ���� boolean��
		Boolean double2 = gm.<Double>method2(2.55, 6.55); //method2�� ����Ÿ���� boolean��
		System.out.println(double1);
		System.out.println(double2);
		System.out.println("==============================");
		
		gm.<String, Integer>method3("����",90);
		gm.method3("����", 80); //�Ű������� ��ǲ�Ǵ� ������ Ÿ�Ը� ������ �� �ִ� ��� ��������
		
		gm.<Integer,String> method3(500, "���������Դϴ�");
		gm.method3(402, "������ ã�� �� �����ϴ�." );
		
		gm.method4();
		
		
				
		
	}

}
