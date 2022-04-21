package Ex;

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
		
		// 1. �ֿܼ��� �� �Է¹ޱ�
		InputStream is = System.in;
		System.out.println("�ѱ��� �Է��ϼ��� >>>");
		byte[] byteArray = new byte[100];
		int count1 = is.read(byteArray);
		String str = new String(byteArray, 0, count1,Charset.defaultCharset());
		System.out.println("============================");
		is.close();
		
		// 2.���Ͽ� ����
		File file1 = new File("src\\chapter19\\Ex06\\input.txt");
		
		OutputStream os = new FileOutputStream(file1);
		//String -> byte
		byte[] byteArray2 =	str.getBytes(Charset.defaultCharset());
		os.write(byteArray2);
		os.flush();
		System.out.println("���������� �� �Է�");
		os.close();
		
		// 3. ���Ͽ��� ���о��
		InputStream is2 = new FileInputStream(file1);
		
		byte[] byteArray3 = new byte[100];
		int data;
		String string = null;
		while ((data = is2.read(byteArray3)) != -1) {
			string = new String(byteArray3,0,data,Charset.defaultCharset());
		}
		is2.close();
		
		// 4. �о�� ���� �ֿܼ� ���
		System.out.println("���Ͽ��� �о�� ������ �ֿܼ� ����մϴ�. >>>");
		OutputStream os2 = System.out;  //�ֿܼ� ��� byte�� �ֿܼ� �� �����ֱ�
		// String -> byte
		byte[] byteArray4 = string.getBytes();
		os2.write(byteArray4);
		os2.flush();
		os2.close();
	}
}
