package Ex_T.ch19;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
  1. is1   <== InputStream ��ü (���� ��η� ���� : - ms949) , ����ó��
  2. is2   <== InputStream ��ü (��� ��η� ���� : - utf8.txt), ����ó��(try ~ with resource�� ����ó��)
  			// try ~ with resource : close()�� �ڵ����� ó��
 */

//class Close implements AutoCloseable{
//	File resource;
//	
//	Close (File resource){
//		this.resource = resource;
//	}
//	@Override
//	public void close() throws Exception {
//		
//		if (resource != null) {
//			resource = null;  // �ʱ�ȭ
//			System.out.println("���ҽ��� ���� �Ǿ����ϴ�.");
//			System.out.println(resource); // �ʱ�ȭ �ƴ��� Ȯ��
//		}
//	}
//} => ���Ѱ�....

public class EX3_Exception1 {

	public static void main(String[] args) {

		// 1. is1   <== InputStream ��ü (���� ��η� ���� : - ms949) , ����ó��
		System.out.println("=========is1���=============");
		File file1 ;
		file1 = new File("C:\\peb\\JAVA\\src\\chapter19\\Ex04\\exception-MS949.txt");
 		InputStream is1 = null;
		byte[]arr1 = new byte[100];
		int data1 = 0; 
		try {
			is1 = new FileInputStream(file1);
			while((data1 = is1.read(arr1)) != -1) {
				// �ѱ�ó��#2 : read(byte�迭)
			String str1 = new String(arr1,0,data1,Charset.forName("MS949"));
			// �ѱ� ó�� #3 : String(byte�迭 ,offset, length, Charset(���ڵ� Ÿ��))
			System.out.println(str1);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (is1 != null) {
				try {
					is1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		// 2. is2   <== InputStream ��ü (��� ��η� ���� : - utf8.txt), ����ó��(try ~ with resource�� ����ó��)
		System.out.println("=========is2���=============");
		File file2 = new File("src\\chapter19\\Ex04\\exception-UTF-8.txt");
		
		int data2 = 0;
		byte[] arr2 = new byte[100];
		//�ѱ�ó�� #1 : byte�迭 ����
		
		try (InputStream is2 = new FileInputStream(file2)){ 
			//try()�� ��ü ����-> resource /Ram�� ���(��ü�����ؼ� �޸𸮿� �ø���.) <==close()�ڵ����� ó��
				// AutoClosable�� close()�� ������ Ŭ���������Ѵ�. => FileInputStream�� ��ӹް� ����
					// ���� ���� ��ü�� �� ���� Ŭ���� ���� ���� �޼��� ��������� ��
			while((data2 = is2.read(arr2)) != -1) {
						//�ѱ�ó�� #2 :is.read(byte�迭));
				String str2 = new String(arr2,0,data2,Charset.forName("UTF-8"));
					//�ѱ�ó�� #3 : new String(byte�迭, offset, length, "encoding"
				System.out.print(str2);
			}
		} catch (IOException e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}
		
		
	}

}
