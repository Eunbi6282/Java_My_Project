package chapter19.Ex03;

import java.io.UnsupportedEncodingException;

// UTF-16 �������� : �ѱ� ���� ��� 2byte�� ���� �Ǿ� ǥ��
	// ���� ó�� 2byte�� �ĺ��ڵ� BOM(Byte Order Mark)�� ��
// UTF-8 �������� : ���� 1byte, �ѱ��� 3byte 

public class UTF16_VS_UTF8 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		byte[] b1 = "abc".getBytes("UTF-16");  //���ڿ� ==> byte[]
			//BOM �ĺ��ڵ� 2byte
			// abc : 6byte
		
		byte[] b2 = "abc".getBytes("UTF-8");
		
		System.out.println(b1.length); 	//8 : BOM(2) + 6 (abc)
		System.out.println(b2.length);  //3
		
		System.out.println(new String(b1, "UTF-16"));
		System.out.println(new String(b1, "UTF-8")); //decoding Ÿ���� �ٸ��� ������ ��
		
		for(byte b : b1) { 	//2byte���� �ѱ��� ǥ��
			System.out.printf("%02X" , b);  //%02X -> 16�������� ǥ���ض�
			System.out.println();
		}
		
		System.out.println("===============");
		
		for (byte b : b2) {
			System.out.printf("%02X" , b);  //%02X -> 16������ ǥ���ض�
			System.out.println();
		}
		
		System.out.println("================");
		
		//�ѱ��� byte�� ��ȯ�ؼ� UTF-16 Ÿ������ �迭�� ��´�.
		byte[]b3 = "������".getBytes("UTF-16"); //�ѱ� ���� ��� 2byte�� ó����
		byte[]b4 = "������".getBytes("UTF-8"); //�ѱ� -> 3byte�� �ѱ���
		
		System.out.println(b3.length); //8 : BOM(2byte) + 6 (������)
		System.out.println(b4.length); //9
		
		for (byte b : b3) {
			System.out.printf("%02X" , b);
			System.out.println();
		}
		
		System.out.println("===============");
		
		for (byte b : b4) {
			System.out.printf("%02X" , b);
			System.out.println();
		}
		
		System.out.println(new String(b3, "UTF-16"));
		System.out.println(new String(b4, "UTF-8"));
	
	}

}
