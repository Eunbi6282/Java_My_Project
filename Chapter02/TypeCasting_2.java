package Chapter02;
public class TypeCasting_2 {
	public static void main(String[] args) {
		/*
		 * Ÿ�� ĳ���� : byte < short < char < int < long < float < double
		 * 	- ��ĳ���� : ���� �ڷ������� ū �ڷ������� ��ȯ�Ǵ� ��
		 * 	- �ٿ� ĳ���� : ū �ڷ������� ���� �ڷ������� ��ȯ�Ǵ� ��
		 * 
		 * 	�������� �⺻������ int�� �����
		 * 	�Ǽ����� �⺻������ double�� �����
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		System.out.println("=======�ڵ����� Ÿ�� ��ȯ=======");
		float value1 = 3;	//int(3) ---> float���� �ڵ����� ��ĳ���� ��
		long value2 = 5;	//int(5) ---> long ������ Ÿ������ �ڵ����� ��ĳ����
		double value3 = 7;	//int(7) ---> double ������ Ÿ������ �ڵ����� ��ĳ����
		byte value4 = 9;	//int(9) ---> byte ������ Ÿ������ �ڵ����� �ٿ�ĳ����
		short value5 = 11;	//int(11) ---> short ������ Ÿ������ �ڵ����� �ٿ�ĳ����
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println("=======�������� Ÿ�� ��ȯ=============");
		
		byte value6 = (byte) 128;	//int ---> byte Ÿ������ �������� Ÿ�� ��ȯ (�ٿ� ĳ����)
		int value7 = (int) 3.5;		//�Ҽ����̹Ƿ� �⺻�� double ---> int Ÿ������ �������� Ÿ�� ��ȯ (�ٿ� ĳ����)
		float value8 = (float) 7.5;	//double ---> float Ÿ������ �������� Ÿ�� ��ȯ (�ٿ� ĳ����)
		float value9 = 7.7F;		//double ---> float Ÿ������ �������� Ÿ�� ��ȯ (�ٿ� ĳ����)
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		//
		
	}

}
