package Chapter02;

public class FloatVsDouble {
	public static void main(String[] args) {
		// Float vs Double �� ���е� : float�� 7�ڸ����� , double�� 15�ڸ�����
		
		float f1 = 1.0000001f; //float���� ������ ���� ���� ��, f(��ҹ��� ���x)�� �����Ͽ� ����
		System.out.println(f1);
		float f2 = 1.00000001f;
		System.out.println(f2); //7�ڸ��� �Ѿ�� �߷��� ó����
		System.out.println("=====================");
		
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2); //15�ڸ��� �Ѿ�� �߷��� ó����
		
		
		
		
		

	}

}