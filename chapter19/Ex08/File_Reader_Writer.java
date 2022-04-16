package chapter19.Ex08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
  Reader / Writer : char���� �����. ���ڸ� ó���ϵ��� Ưȭ�� �߻�Ŭ����
   		// byte : 1byte
  		// char : 2byte, UTF-16(����, �ѱ�2byte/ �����ڵ�)���� ó��, ��������, �� ���� ��� �� ó��
  	 		
  	 		FileReader : charset���� �ɼ��� ����. default charset���
  	 		FileWriter : charset ���� �ɼ��� ����. default charset���
 */
public class File_Reader_Writer {

	public static void main(String[] args) {
		//1. ���ϰ�ü ����
		File rwFile = new File("src\\chapter19\\Ex08\\rwFile.txt");
		
		try(Writer writer = new FileWriter(rwFile);) {  //Writer :  �߻�Ŭ����, FileWriter: Writer�� ������ �ڽ� Ŭ����
			// OutputStream : byte���� ���, �߻� Ŭ����, FileOutputStream(������ Ŭ����), <����, ������, MP3, JPG, AVG....>
				//Stream -> ����  byte���� ���
			// Writer 		: char���� ���, �߻� Ŭ����, FileWriter(������ Ŭ����), ���� Ưȭ�ؼ� ó��
			writer.write("�ȳ��ϼ���\n".toCharArray());
			writer.write("Hello\n");
			writer.write('A');
			writer.write('\r');
			writer.write('\n');
			writer.write("�ݰ����ϴ�.",2,3);
			writer.flush();
		} catch (IOException e) {}
		
		// 2. FileReader�� �̿��� ���� �б� (Default MS949)   <== CharacterSet ���� �ɼ��� ����.
		try(Reader reader = new FileReader(rwFile);) {
			
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
			
		} catch (IOException e) {}

	}

}