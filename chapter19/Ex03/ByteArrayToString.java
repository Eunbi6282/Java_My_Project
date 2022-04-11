package chapter19.Ex03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArrayToString {
	public static void main(String[] args) throws UnsupportedEncodingException {

		// 1. String getByte() : String ---> Byte[]����  ���� ---> byte ��ȯ�ؼ� �迭�� ����
		byte[] array1 = "�ȳ�".getBytes();   //Charset����X 
		byte[] array2 = "��ť".getBytes(Charset.defaultCharset()); // "��ť"�� byte�� ��ȯ�ؼ� �迭�� ����.
		byte[] array3 = "����".getBytes(Charset.forName("MS949")); //��Ÿ�� �� ���ܹ߻� : ����� ���� 
		byte[] array4 = "��ť".getBytes("UTF-8");  // ���� ó�� �ʿ� <<�Ϲݿ��� (�����Ͻ� ���� �߻�)>>>
		
		// 2. �� ���ڵ��� ����Ʈ �� ���
		System.out.println(array1.length);  //MS949: �ѱ� 1�ڴ� 2����Ʈ //4
		System.out.println(array2.length);  //MS949: �ѱ� 1�ڴ� 2����Ʈ //4
		System.out.println(array3.length);	//MS949: �ѱ� 1�ڴ� 2����Ʈ //4
		System.out.println(array4.length);	//UTF-8: �ѱ� 1�ڴ� 3����Ʈ //6
		
		System.out.println();
		
		// 3. new String() : byte[] ---> String���� ��ȯ  byte --> ���ڷ� ��ȯ
		String str1 = new String(array1);   //�迭 ���� byte�� ���ڷ� ��ȯ
		System.out.println(str1);
		
		String str2 = new String(array2,Charset.defaultCharset());   //�迭 ���� byte�� ���ڷ� ��ȯ
		System.out.println(str2);
		
		String str3 = new String(array3,Charset.forName("MS949"));   //�迭 ���� byte�� ���ڷ� ��ȯ
			// ������ �� Ÿ�԰� �������� Ÿ���� ���ƾ� ������ ���� �ʴ´�. 
		System.out.println(str3);
		
		// 3. �ѱ��� ������ ��� : �������� ���ڵ� Ÿ�԰� �������� ���ڵ� Ÿ���� ����ġ �� ���
		String str4 = new String(array4,Charset.forName("MS949"));   //�迭 ���� byte�� ���ڷ� ��ȯ
		// ������ �� Ÿ�԰� �������� Ÿ���� ���ƾ� ������ ���� �ʴ´�. 
		System.out.println(str4);
	
		String str5 = new String(array1,Charset.forName("UTF-8"));
		System.out.println(str5);
		
		
		
		
		
		
		
		
		
		
	}

}
