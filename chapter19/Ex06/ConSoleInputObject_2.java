package chapter19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// Windows :�ܼ� , �޸��忡�� Enter : \r\n, \r ������ �� �� �ִ�. \n�����ε� ó���� �����ϴ�. write('\n) <- write()�� n�� �־ ó�� ����


public class ConSoleInputObject_2 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in; 	// is �ܼ��� ���ؼ� ��ǲ�� �ްڴ�.
			// System.in�� ������������ ����� 
		
		System.out.println("������ �Է��ϼ��� >>>");
		
		// 1. �ѹ���Ʈ ���� �б�
		int data;
		while ( (data = is.read()) != '\r') {	//is.read()ȣ��� �� �ֿܼ��� ��ǲ�� ���
			System.out.print((char)data);
		}
		
		is.read();		//10 <== \n�� �������� !!! // ����(RAM)�� ��������. ������ ����� ��
			// \n�� ó���� ���� ������ ���� read()���� \n�� �� ����
		
		System.out.println();
		System.out.println();
		
		System.out.println("============");
		
		// 2. n -byte�б� (
		byte[] byteArray1 = new byte [100];	// �ֿܼ��� �迭�� ����� �� \r\n���� ����. 
		int count1 = is.read(byteArray1); 	// count1�� 100����Ʈ��. 100,100,30(100���� ���� ���� �۰� �޾Ƶ���), -1(enter�� �񶧱��� 100byte)
		
			// new byte [100]�� �迭�� �־ ������ ���� 100��
		// count1 �迭���� ���� ���� ������ ����.
		
		for (int i = 0; i < count1; i++) {
			System.out.print((char)byteArray1[i]);
			System.out.println(" : count = " + count1); // \r\n�� �迭 ���ο� �־ 2byte�� �� ��� ��
		}
		
		System.out.println("======================");
		
		int count2;
		count2 = is.read(byteArray1);  // �迭 ���ο� \r�� \n�� ��
		System.out.println(new String(byteArray1,0,count2));
		
		
//		while((count2 = is.read(byteArray1)) != '\r') {  //�ֿܼ����� -1�� ������� �ʰ� , \ró��
//			System.out.println(new String(byteArray1));
//		}   // 
		// is.read(); // <== ���ۿ��� ���� �ʾƾ� �Ѵ�. (�迭 ���ο� \r\n�� �� �ֱ� ������)
			// byteStream�� ��� �޸𸮿� ����Ǿ� �ֱ� ������ ������ ����� ��
		System.out.println("======================");
		
		// 3. n -byte ������ ���� (length ��ŭ �ϰſͼ� byte[] offset ��ġ���� ����
		byte[] byteArray2 = new byte[8];
		int offset = 3;
		int length = 5;
		
		int count3 = is.read(byteArray2,offset,length);
		for( int i = 0; i < offset + length; i++) {
			System.out.print((char)byteArray2[i]);
		}
		
		is.close();  // ���� �������� ó��. �߰��� close()�ϸ� �ٽ� ȣ���� �Ұ���
	}

}
