package chapter19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

// InputStream : �߻�Ŭ����   <== FileInputStream ������ Ŭ����(�о�� ��)
// OutputStream : �߻�Ŭ����  <== FileOutputStream ������ Ŭ���� (����)
// FileInputStream : byte() ���� ������ �б�
// FileOutputStream : byte()���� ������ ����

// Windows �ܼ�, �޸��� Enter�� ������ : \r\n 

public class FileOutputStream_1 {

	public static void main(String[] args) throws IOException {
		// 1. �Է����� ���� (�������� ����)
		File outfile = new File("src/chapter19/Ex05/FileOutput1.txt");
		
		//2. �ѹ���Ʈ �б�
		OutputStream os1 = new FileOutputStream(outfile);
			// FileOutStream �� �������� �ʴ� ������ ������ ������
		os1.write('J');  // <== write()�� ��IOException�߻�
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');   // ���� -> byte13   <== ��������
		os1.write('\n');	// ���� -> byte 11
		
			// �߿�!!! : write()�޼���� ����(RAM)�� ����<�޸𸮿� �ø�>, ���۰� ������ ���Ͽ� ������
			// 			flush() : ���ۿ� ����� ������ ���Ͽ� ������ ���� �� �� ���. 
		os1.flush();  // �޸��� ������ ���Ͽ� ������ ������ ����, ���۰� ������ �ʴ��� ������ ���Ͽ� ������ �Ѵ�.
			// ��������, but write()�� ����ϸ� flush()�� ����� ���� ����
		
		os1.close(); // closer()ȣ��� flush()���� �۵� ��
		
		//2. n-byte ���� ����(byte[]�� offset���� length)
		OutputStream os2 = new FileOutputStream(outfile);   // �����
			// outfile,true => true�� ������ �̾��
			// outfile,false => false(�⺻��)�Ӹ� ������ 
		byte[] byteArray1 = "Hello!".getBytes();            //"Hello!"(String) -> byte�� ��ȯ����� ��, getBytes()�̿�
			// ���ڿ��� ���ڰ� �ƴ� ����Ʈ �迭�ȿ� ����Ʈ Ÿ������ ��
		
		os2.write(byteArray1);
		os2.write('\n');	// \r�� ��������, \n�� �־ Enteró����
		
		os2.flush();
		os2.close();
		
		// 3. n-byte �������� (byte[]�� offset���� length�� byte������ ����
		OutputStream os3 = new FileOutputStream(outfile,true); 
		byte[] byteArray2 = "Better The Last Smile Than the First Laughter".getBytes();  //
		os3.write(byteArray2,7,8);  // write�϶��� 7byte�ڿ��� 8�о ����
									// read �϶��� �ݴ��ó��
		
		os3.flush();
		os3.close();
 	}

}
