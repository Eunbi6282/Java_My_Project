package chapter19.Ex01;

import java.io.File;  //���ϰ� ������ �ٷ�� ��ü
import java.io.IOException;


// ����: ��Ŭ�������� ���ϻ����� C:\\�� ������ �� ���� ������ ���� ������ ���� �� �ִ�. 
	// �����ذ� ù��° ��� 1: ��Ŭ������ <<������ ����>>���� ����
	// 2. ���� ���ο� ������ ���� ex)"C:/temp001/newFile.txt"


// File��ü ���� �����ĺ��ڸ� ������ ��� 
//		C:\abc\abc.txt 
		
	// 1. Windows�� ��� : String path = "C:\\abc\\abc.txt"(�������� �ι� ó��)  	""���� Ư�����ڸ� ó���ϱ� ���� ��ȣ \ <= \�� ó�����ֱ� ���ؼ� \�� �ϳ� �� ����
	//    Windows10�� ��� : String path = "C:/abc/abc.txt" 
	// 2. Mac�� ��� : String path = "C:/abc/abc.txt" 

// ȣȯ�� ���ؼ� ���������� ����� �� �ִ� �ڵ��ۼ� <�����ð� ���� �κ���  File.seperator ���>
	// String path = "C:" + File.seperator + "abc" + File.separator + "abc.txt"


public class CreateFileObject {

	public static void main(String[] args) throws IOException {   //trhows ����ؼ� ����ó�� �̷� -> ����ó�� �ʿ�
		
		// 1. File��ü ����ؼ� ��������. �ش� �����̳� ������ �������� �ʴ� ��� 
		File tempDir = new File("C:/temp001");
		if(!tempDir.exists()) {    // .exist() �ش� ��ο� �����̳� ������ �����ϸ� true, �������� �ʴ´ٸ� false
			tempDir.mkdir();		// ���� ���� ��ɾ�. 
		}
		System.out.println(tempDir.exists());  // ������ ��ο� �����ϸ� true/ �ƴϸ� false
		
		// 2. File��ü�� ����ؼ� ���� ����
		File newFile = new File("C:/temp001/newFile.txt"); //C����̺꿡 �ٷ� ������ ������ ���� ������ ������ ���� �� ���� <= ��Ŭ������ ������ �������� ����
		if(!newFile.exists()){		//newFile�� �������� �ʴ´ٸ�)  
			newFile.createNewFile();   ////������ ������ �� ���ܰ� �߻��� �� �ִ�. ����ó�� �ʿ�.. ���ѹ��� ����
		}
		System.out.println(newFile.exists());
		
		System.out.println("================");
		//3. ���� ������
		File newFile2 = new File("C:\\temp001\\newfile01.txt"); // Windows10 ����������
		File newFile3 = new File("C:/temp001/newfile02.txt");   //Window10 �̳� Mac
		if(!newFile2.exists()) {newFile2.createNewFile();}
		if(!newFile3.exists()) {newFile3.createNewFile();}
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		
		//��� OS���� �������� �ĺ������� �ڵ�
		File newFile4 = new File ("C:" + File.separator +"temp001" + File.separator + "newfile03.txt");
		if(!newFile4.exists()) {newFile4.createNewFile();}
		System.out.println(newFile4.exists());
		
		
		// 4. ���� ��η� ó�� 
		File newFile5 = new File("C:/temp001/newfile05.txt");
		System.out.println(newFile5.getAbsolutePath()); //file ��ü�� ����� ������ ���� ��θ� ���.
		
		// 5. ��� ��η� ó�� < = �������
		// ���� ���� �۾� ������ ��ġ�� �Դ����ؼ� �����;� ��
		System.out.println(System.getProperty("user.dir"));  // ���� �۾������� ��ġ�� �˷���
			// ��Ŭ���� ���� ���� ��ġ
		File newFile6 = new File("newfile06.txt");  // ����η� ���
		if(!newFile6.exists()) {newFile6.createNewFile();}
		System.out.println(newFile6.getAbsolutePath());
		
		
		
		
	}

}
