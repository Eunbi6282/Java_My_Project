package chapter19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStreamReader : Stream(byte) Reader(char), byte�����͸� char�������� ��ȯ�ϴ� ��ü 
	// byte������ ���ڵ��� �� �����ؾ� �Ѵ�. <= MS949, UTF-8
	// char�������� �ٲٸ� ���ڵ� Ÿ���� �Ű澵 �ʿ䰡 ����. 
	// ������ 1. FileREader : defalut Charset�� ��� ������, ���� Default Charset (MS949) ������ �ܺ� ������ UTF-8�� �Ǿ� �ִ� ��� 
	// ��� ���� 2. ��Ʈ��ũ���� ���۵Ǵ� ��Ʈ���� UTF-8, MS949  (byteStream) ===> char�� ��ȯ�ؼ� ó��
/*
  
 */

public class InputStreamReader_1 {

	public static void main(String[] args) {
		// 1. ���� ��ü ����
		File isr = new File("src\\chapter19\\Ex08\\isr.txt");		//isr.txt�� UTF-8�� ����Ǿ� �ִ�. 
		
		try (Reader reader = new FileReader(isr);){  // FileReader�� ���ڵ� ������ �ȵ�. Default encoding�� ���
				// ���� -> isr.txt�� UTF-8, ���� �ڹ� ���� -> MS949
			int data = 0;
			while ((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {}
		
		System.out.println("===========================================");
		System.out.println("===========================================");
		
		// 2. FileInputStream + InputStreamReader�� �̿��� �����б�
			// InputStreamReader(is, "encoding")�� �����ؼ� UTF-8 �� ���� �� �ְ�
				//byte�����͸� char�������� ��ȯ�ϴ� ��ü 
		try(InputStream is = new FileInputStream(isr);
			InputStreamReader isreader = new InputStreamReader(is,"UTF-8");	) {
				
			int data;
			while ((data = isreader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {}
	}
}
