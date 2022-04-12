package chapter19.Ex06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out; // System.out :�ֿܼ� ���. byte�� ���
		
		//1. �ѹ���Ʈ ���
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n');   // ���ۿ����� ����Ǿ� �ִ�. 
		
		os.flush(); //������ ������ �ֿܼ� ���
		// os.close(); //���� �������� �ѹ��� ���
		
		// 2. n-byte ���  <== byte�� �ֿܼ� ���
		byte[] byteArray1 = "HelloWorld".getBytes();  //String�� byte�� ��ȯ
		os.write(byteArray1);
		os.write('\n');		// \r\n  => \r��������
		os.flush();
		
		// 3. n-byte ���
		byte[] byteArray2 = "Better the last smile than the laughter".getBytes();
		os.write(byteArray2,7,8);
		// write(byte[], offset, length)
		os.flush();
		
		os.close();
		
		
		
		
		

	}

}
