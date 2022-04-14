package Ex_T.ch19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

//�ֿܼ��� �迭 100byte ���� �ѱ��� ��ǲ���� ���� input.txt ���Ͽ� ������ , default CharSet
// input.txt ���Ͽ��� ���� �о �ܼ�(System.out)�� ���, ���� throw
	// 1. System.in
	// 2. FileOutputStream
	// 3. FileInputStream : ����� ������ ������ �о����
	// 4. System.out : �ֿܼ� ���
	

public class Ex06_Console_InPutOutputObject {

	public static void main(String[] args) throws IOException {
		
		// 1. �ֿܼ��� �� �Է¹ޱ� (System.in) <== �ֿܼ��� byte[]�� �Ѿ�´�. ,byte[]�� �����ؼ� ó�� : �ѱ��� ó��
		InputStream is = System.in; 	//�ֿܼ��� �Է¹ްڴ� , new�� �������� �ʰ� ���Ḹ , �ֿܼ��� ��ǲ���� �޴´�. 
		System.out.println("�ѱ��� �Է��ϼ��� >>>");
		byte[] byteArray = new byte[100];
		int count1 = is.read(byteArray);		// byteArray1�� byte�� \r\n�� �����ؼ� ����. 
			// count1�� �迭�� ���� ���� ������ �����Ѵ�. 
		
		//int data = is.read(); //read()�ȿ� �ƹ��͵� ���ٸ� data�ȿ� �ѹ���Ʈ�� ���� ���� ����!! , �ѱ��� ó������ ���Ѵ�. 
		// int count1 = is.read(byteArray);  //read()�ȿ� �迭�� ���ٸ� �迭�ȿ� ����ִ� ���� ������ �����
		
		System.out.println("============================");
		
		// 2.���Ͽ� ���� (FileOutputStream)
		File file1 = new File("src\\Ex_T\\ch19\\input.txt");
		
		OutputStream os = new FileOutputStream(file1);  //������ ������ �� , (file1,false) => �⺻�� , �����
		//String -> byte
		os.write(byteArray); //����(RAM)���� ������
		os.flush();	//.flush()�� ����ؾ߸� ���ۿ� ���� ������ ���Ͽ� �����Ѵ�. 
		System.out.println("���������� �� �Է�");
		
		// 3. ���Ͽ��� ���о�� (FileInputStream)
		InputStream is2 = new FileInputStream(file1); //read(): �ѱ��� ó�� ���Ѵ�. read(byte[]) : �ѱ�ó��
		byte[] byteArray2 = new byte[100];
		int count2 = is2.read(byteArray2); //�迭�� .read()�� ó���ؾ� �ѱ��� ���
		// int data2 = is2.read(); //read() : 1byte�� �о�´�. 
		
		
		// 4. �о�� ���� �ֿܼ� ��� (System.out)
		System.out.println("���Ͽ��� �о�� ������ �ֿܼ� ����մϴ�. >>>");
		OutputStream os2 = System.out;  //�ֿܼ� ��� byte�� �ֿܼ� �� �����ֱ�
		// String -> byte
		os2.write(byteArray2);
		os2.flush();
		
		is.close();
		os.close();
		is2.close();
		os2.close();
	}
}
