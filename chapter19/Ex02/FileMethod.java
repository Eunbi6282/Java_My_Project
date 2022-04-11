package chapter19.Ex02;

import java.io.File;

public class FileMethod {
	public static void main(String[] args) {
		// 1. C:\�� �۾����� ����(temp)
		File tempDir = new File("C:/temp");
		if (!tempDir.exists()) {
			tempDir.mkdir();
		}
		
		// 2. ���ϰ�ü ����(C:\Windows)
		File file = new File("C:/windows");
		
		// 3. File��ü�� ���� �޼��� ���
		System.out.println("���� ��� ��� : " + file.getAbsolutePath());
		System.out.println("�������� Ȯ�� : " + file.isDirectory()); // ������ true, �ƴϸ� false
		System.out.println("�������� Ȯ�� : " + file.isFile());  // �����̸� true, �ƴϸ� false
		System.out.println("����/ ���� �̸� ��� : " + file.getName());  // ����, ���� �̸� ���
		System.out.println("�θ� ������ ��� : " + file.getParent());  // �θ� ������ ���
		
		File newFile1 = new File("C:/temp/abc");  
		System.out.println(newFile1.mkdir());  //temp�ؿ� abc������ ������
		 // ��±��� �ȿ� newFile1.mkdir()�� ������ ������ �� ������ ��� -> true, ������ �����ؼ� �������� ���Ѱ�� -> false
			// �׷��� �� ó���� ������ ���� true�� ���´�. ���� ������ ���ؼ� false(�ش� ������ �����ϴ� ���, ���� ������ ���� �� ���� ��� , ��������)
		System.out.println(newFile1.exists()); 	//������ �����ϱ� ������ �׻� true
		
		File newFile2 = new File("C:/temp/bcd/cde");  //������ ������ �Ѳ����� �����ϱ�
		System.out.println(newFile2.mkdir());   // ��δ� ���� �Ұ��� -> .mkdir() �������� ���� �Ұ���
			//false , ������������ �Ѳ����� ���� �Ұ���
		System.out.println(newFile2.mkdirs()); // true , ������������ �Ѳ����� ������
		
		File newFile3 = new File("C:/temp/def/hij/klm");
		System.out.println(newFile3.mkdirs());  //������������ �Ѳ����� ������ //true
		
		// 4. File��ü�� ����ؼ� ���������� ��������
		File[]	frame = file.listFiles();    // file : "C:\Windows" ������ ��� ������, ������ �̸��� ���� �迭�� ����	
		
		for (File k : frame) {  //������ Ÿ�� File, �迭�ȿ� ����ִ� 
			System.out.println((k.isDirectory() ? "���� : " : "���� : " ) + k.getName()); // true�� "����" �׷��� ������ "����" ���
				//.getName() ������ ���� �̸� ��� ���
		}
		
		
		

	}

}
