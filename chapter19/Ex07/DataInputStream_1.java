package chapter19.Ex07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.attribute.DosFileAttributes;

//InputStream : ��� ��Ʈ��
	// int => 5555(���ڷ� ����) ==> 5555(���ڷ� ����) => int(int�� ������)  , ���� �ӵ�

//  DataInputStream : �߰� ����� �����ϴ� ��Ʈ��, ��� ��Ʈ���� �ݵ�� ����, �ܵ����� ����� �� ����. 
	// �پ��� ������ �����͸� ������ ������ �� ���
	// ������ �� int, ������ �� int (���� �ӵ�)

public class DataInputStream_1 {

	public static void main(String[] args) {
		// ������ ������ ���� ���� ����
		File dataFile = new File("src\\chapter19\\Ex07\\file1.data");  //Ȯ���ڰ�  data
		
		// ������ ����(�Է�)  OutputStrea, DataOutputStream
		try (OutputStream os = new FileOutputStream(dataFile); // ������ ��
			DataOutputStream dos = new DataOutputStream(os);)  // AutoClose()
				// ������ ���� ���� = ������ ���� ����(������ ���� ����)
		{
			dos.writeInt(35);  //���� ���� �� ������ ���ڷ� ���´ٰ� �޴°����� int�� ������ => DataInputStream ���(������ �� int, ������ �� int)
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���");
			dos.flush();
			
			
		} catch (Exception e) {}	//Exception => ���� �ֻ����� Exception, ���� ��� ���� ó��

		// ������ �б�(DataInputStream)
		try (InputStream is = new FileInputStream(dataFile);
			DataInputStream dis = new DataInputStream(is);
			)
		{ 
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {}		
	}
}
