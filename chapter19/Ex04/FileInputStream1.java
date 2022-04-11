package chapter19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class FileInputStream1{

	public static void main(String[] args) throws IOException { 
					//���� �޼��忡���� throws ������ �ȵ�! �������� ���α׷� ����Ǿ���� �� try catch�� �����ֱ�
										
		
		// ���� �۾� ���丮 ��ġ Ȯ��
		System.out.println(System.getProperty("user.dir")); 
		
		// 1. �Է� ���� ����
			// ���� ��η� ����
		File inFile1 = new File("C:\\peb\\JAVA\\src\\chapter19\\files\\FiileInputStream");
		
			// ����� : ���� �۾� ���丮(System.getProperty("user.dir") -> C:\peb\JAVA)�� �������� ����
		File inFile = new File("src\\chapter19\\files\\FiileInputStream");
		
		// InputStream ��ü�� �����ؾ� ������ ������ ���� �� �ִ�. // ����� ���
		InputStream	iStream = new FileInputStream(inFile); //FileInputStream�� InputStream�� ��������Ŭ���� -> ���� �о����(��������)
			//InputStream�� �߻� Ŭ���� , ���� ��ü ���� �Ұ�, Ÿ�������� ���� �ϴ�. 
		
		//������ ������ ���
	
			// UTF-8 : ���� -> 1byte, �ѱ� -> 3byte
			// MS949 : ���� -> 1byte, �ѱ� -> 2byte
			// EUC-KR : ���� -> 1byte , �ѱ� -> 2byte
			// UTF - 16 : ����, �ѱ� -> 2byte / ���� ù��° 2byte���� �ĺ���(BOM)�� �� �ִ�. 
		
		//JAVA���� �ٹٲ� ó��
		// 	- UNIX : \n
		//	- Windows : \r\n  <== \r�� �����ص� ��. <== �ܼ��̳� �޸��忡�� enter : \r\n
		//	- Mac : \r
			
		//�ѹ���Ʈ �����͸� �о char�� ��ȯ �� ��� /.read() �ѹ���Ʈ�� �о���δ�. 
		System.out.print((char)iStream.read()); //(char)����� ���ڿ� ���, �ƴϸ� ����Ʈ�ڵ尡 ��µ�
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		
		System.out.println();
		System.out.println();
		
		//int read() : �� ����Ʈ�� �о ���� ������ ��� ����� ����, ���� �����Ͱ� �������� ���� ��� -1����
		// while���� ����ؼ� �ѹ��� ���
		//Stream�� ��ü�� �ѹ� �������� �� ���󰡹��� -> ���� ��ü ���� �ʿ�
		InputStream	iStream2 = new FileInputStream(inFile);
		int data;  
		//iStream2.read() �ѹ���Ʈ�� �о�� ���� data�� ����, -1 -> �����Ͱ� �������� ���� ������(������������)
		while((data = iStream2.read()) != -1) {  // -1 -> �����Ͱ� �������� ���� ������(������������) ��������. 
			System.out.print((char)data);
		}
		
				// �߿� : iStream2.read() : 1byte �� �о����. ��ȯ Ÿ���� int(4byte). 
				// FileInputStream�� �ݵ�� index0������ �о����. �߰��� ������ �濡�� ���� �� ����. 
					// FileRandomAccess�� ����ؼ� ������ index���� �о����. 
		
		System.out.println();
		System.out.println();
		
		//.available() : ���� ����Ʈ���� ���
		InputStream	iStream3 = new FileInputStream(inFile);
		
		while((data = iStream3.read()) != -1) {  // -1 -> �����Ͱ� �������� ���� ������(������������) ��������. 
			System.out.println("���� ������ : " + (char)data + " ���� ����Ʈ �� : " + iStream3.available());
		}
		
		// �� �ݾ��ֱ�!!!!!!!!!!!!!!!!!!!!!!!!
		iStream.close();
		iStream2.close();
		iStream3.close();
		
	}
}
