package Chapter02;
public class PrimaryDataType_1 {
	public static void main(String[] args) {
		//boolean : true / false ���� �Ҵ� ����
		boolean bool1 = true;
		boolean bool2 =  false;
		//boolean bool3 = 10; //t,f�� ����
		
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println("====���� : ���� ��, ���============");
		
		byte value1 = -128;  //byte : 1byte, (-128 ~ +127) 
		//byte value11 = -129; //���� ��� ����
		byte value111 = (byte) -129;  //-129�� byteŸ������ ��ȯ�ؼ� ���� -> 127�� ��� ��
		byte value1111 = (byte) -129;  //128�� byteŸ������ ��ȯ�ؼ� ���� -> -127�� ��� ��
									  
		System.out.println(value1);
		System.out.println(value111);  
		System.out.println(value1111);
		
		short value2 = -10; //short : 2byte (-32768 ~ +32767)
		value2 = -32768;
		System.out.println(value2);
		value2 = (short) -32769;
		System.out.println(value2);
		
		int value3 = 100;
		long value4 = 200L;
		
		
		//�Ǽ� : Float, Double
		float value5 = 1.2f;
		double value6 = -1.5;
		
		
		
		
		
	}

}
