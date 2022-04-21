package Ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import book.chapter15.Ex14.NewRunnableTerminated;

/*
 	Application Default : MS949
 	
 	Reader / Writer �� ���� Ŭ���� ���
 	
 	1. �ֿܼ��� �ѱ��� �о 
 	C:\Temp\a\aaa.txt (MS949);
 	C:\Temp\b\bbb.txt (UTF-8);
 	���Ͽ� ����
 	
 	- a,b ���� Application���� ����
 	
 	2. �� ���Ͽ��� ���� ������ �ֿܼ� �������� ���
 */

public class Ex_Reader_Writer {
	public static void main(String[] args) {
		// 1. a,b ���� ����
		File tempDir1 = new File("C:/Temp/a");
		if(! tempDir1.exists()) {
			tempDir1.mkdir();
		}
		File tempDir2 = new File("C:/Temp/b");
		if(! tempDir2.exists()) {
			tempDir2.mkdir();
		}
		
		// 2. ���� ��ü ����
		File file1 = new File("C:\\Temp\\a\\aaa.txt"); //MS949
		File file2 = new File("C:\\Temp\\a\\bbb.txt"); //UTF-8

		// 3. �ֿܼ��� �ѱ� �б�(InputStreamReader), ���Ͽ� ����(OutputStreamWriter) <MS949>
		InputStreamReader isr = null;
		InputStreamReader isr2 = null; 
		
		
		try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file1),"MS949");){
			
			 
			isr = new InputStreamReader(System.in,"MS949");
			System.out.println("�ѱ��� �Է��ϼ��� >>>");
			int data;
			while ((data = isr.read()) != '\r') {
				osw.write((char)data);  // �޸��忡 ���
				//System.out.print((char)data);
			}
			
		}catch (Exception e) {}	
		
		try {
			isr2 = new InputStreamReader(new FileInputStream(file1),"MS949");
			System.out.println("������ ������ ����մϴ�(MS949) >>>");
			int data;
			while ((data = isr2.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {}
		
		System.out.println();
		System.out.println("========================");
		
		// 4. �ֿܼ��� �ѱ� �б�(InputStreamReader), ���Ͽ� ����(OutputStreamWriter) <UTF-8>
		
		try (InputStreamReader isrr = new InputStreamReader(System.in,"MS949");
			OutputStreamWriter osww = new OutputStreamWriter(new FileOutputStream(file2),"UTF-8");){
			System.out.println("�ѱ��� �Է��ϼ��� >>>");
			int data;
			while ((data = isrr.read()) != '\r') {
				osww.write((char)data);  // �޸��忡 ���
			}
		} catch (Exception e) {}
		
		// 4-1. �ֿܼ� �޸��� ���� �߰�
		try(
			InputStreamReader isrrr = new InputStreamReader(new FileInputStream(file2),"UTF-8");
			OutputStreamWriter oswww = new OutputStreamWriter(System.out,"MS949")
			) {
			System.out.println("������ ������ ����մϴ�(UTF-8) >>>");
			int data;
			while ((data = isrrr.read()) != -1) {
				oswww.write((char)data);
				oswww.flush();
			}
		} catch (Exception e) {} 
		
		try {
			isr.close();
			
		} catch (IOException e) {}	
		
		
		try {
			isr2.close();
		} catch (IOException e) {}
		
		
	}
}
