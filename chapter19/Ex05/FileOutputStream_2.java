package chapter19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

//FileOutputStream����ؼ� �ѱ�ó��
public class FileOutputStream_2 {

	public static void main(String[] args) throws IOException {
		// 1. ������ ���� ����
		File outfile = new File("src/chapter19/Ex05/FileOutput2.txt");
			// �⺻������ ��Ŭ������ default charactorSet���� ����
		
		// 2. n-byte���� ���� ó��(byte[]�� ó������ ������ ����) <== �ѱ��� ó��
		OutputStream os2 = new FileOutputStream(outfile);
		byte[] byteArray1 = "�ȳ��ϼ���".getBytes("MS949"); //String ==> byte[]�� ���� : getBytes()
			// ���� 2byte�� ó����
		
		os2.write(byteArray1);
		os2.write('\n');
		
		os2.flush();
		os2.close();
		
		// 3. n-byte ����(byte[],offset,length
		OutputStream os3 = new FileOutputStream(outfile,true);  //�̾ ����
		byte[] byteArray2 = "�ݰ����ϴ�.".getBytes(Charset.forName("MS949")); //MS949�� ��������
		os3.write(byteArray2,6,5);  //2byte ���� 2byte�о��, �ѱ�2byte, Ư������ 1byte
			//write(byte[], offset, length)
		
		// ���� , ����, Ư������ :1byte
		
		os3.flush();
		os3.close();
		
		
		

	}

}
