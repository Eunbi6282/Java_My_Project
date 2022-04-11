package chapter19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.sql.Date;

/*
  1. is1   <== InputStream ��ü (���� ��η� ���� : - ms949) , ����ó��
  2. is2   <== InputStream ��ü (��� ��η� ���� : - utf8.txt), ����ó��(try ~ with resource�� ����ó��)
  			// try ~ with resource : close()�� �ڵ����� ó��
 */

class Close implements AutoCloseable{
	File resource;
	
	Close (File resource){
		this.resource = resource;
	}
	
	
	
	@Override
	public void close() throws Exception {
		
		if (resource != null) {
			resource = null;  // �ʱ�ȭ
			System.out.println("���ҽ��� ���� �Ǿ����ϴ�.");
			System.out.println(resource); // �ʱ�ȭ �ƴ��� Ȯ��
		}
	}
	
}

public class EX3_Exception1 {
	public static void main(String[] args) {

		// 1. is1   <== InputStream ��ü (���� ��η� ���� : - ms949) , ����ó��
		System.out.println("=========is1���=============");
		File file1 ;
		file1 = new File("C:\\peb\\JAVA\\src\\chapter19\\Ex04\\exception-MS949.txt");
 		InputStream is1 = null;
		
		
		try {
			is1 = new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		
		byte[] array1 = is1.readAllBytes();
		String str1= new String(array1,Charset.forName("MS949"));
		int data = 0;
		
		try {
			while((data = is1.read()) != -1) {
				try {
				
				System.out.print((char)data);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���ϴ� ���ܰ� �߻��Ǿ����ϴ�.");
		}
		
		// �ݾ��ֱ�
		try {
			is1.close();
		} catch (IOException e) {
		}
		
		// 2. is2   <== InputStream ��ü (��� ��η� ���� : - utf8.txt), ����ó��(try ~ with resource�� ����ó��)
		System.out.println("=========is2���=============");
		File file2 = new File("src\\chapter19\\Ex04\\exception-UTF-8.txt");
		
		InputStream is2 = null;
		int data2 = 0;
		try (Close c1 = new Close(file2);){
			is2 = new FileInputStream(file2);
			while((data2 = is2.read()) != -1) {
				System.out.print((char)data2);
			}
			
			
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}
		
		
	}

}
