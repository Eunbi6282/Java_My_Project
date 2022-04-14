package chapter19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// �ϳ��� ��� ��Ʈ���� Filter ��Ʈ���� ������ ȥ���ؼ� ����� �����ϴ�. 
	// ���� �������� ó���ϴ� Stream�� �޼��� ��뿩�ο� ���� ������ ���� �� �ִ�. 

// ��ݽ�Ʈ��1 : FileOutputStream 		: ��ݽ�Ʈ��. ���Ͽ� ����
// FilterStream : BufferedOutputStream :  ���۸� ����ؼ� ������ ó��
// FilterStream : DataOutputStream :  �پ��� ���˹������ ó��

// ��ݽ�Ʈ��2 : FileInputStream : ��� ��Ʈ��. ���� �б�
//FilterStream : BufferedInputStream :  ���۸� ����ؼ� ������ ó��
//FilterStream : DataInputStream :  �پ��� ���˹������ ó��




public class CombineFilterStream {

	public static void main(String[] args) {
		// 1. ���� ����
		File dataFile = new File("src\\chapter19\\Ex07\\file1.data");
		
		// 2. ������ ���� .write
		try (OutputStream os  = new FileOutputStream(dataFile);	//��� ��Ʈ��
			BufferedOutputStream bos = new BufferedOutputStream(os);	//FilterStream (�߰���� ����, �ܵ����δ� ��� �Ұ���)
			DataOutputStream dos = new DataOutputStream(bos);)			//FilterStream (�߰���� ����, �ܵ����δ� ��� �Ұ���)
				//DataOutputStream�� �޼��� ����ҰŸ� DataOutputStream�� ���� �������� �־� ��
		{
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���");
			dos.flush();
			
		} catch (Exception e) {}
		
		// 3. ������ �б� .read
		try(InputStream is = new FileInputStream(dataFile);
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);) 
		{
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {}
		
		
		
	}

}
