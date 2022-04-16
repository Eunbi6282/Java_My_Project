package chapter19.Ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Buffer_Reader_Writer {

	public static void main(String[] args) {
		// 1. ���� ��ü ����
		File rwfile= new File ("src\\chapter19\\Ex08\\BufferFile.txt");
		
		// 2. FileWriter�� �̿��� ���� ����(MS949)
		try(Writer writer = new FileWriter(rwfile);
			BufferedWriter bw = new BufferedWriter(writer);) {
			
			bw.write("�ȳ��ϼ���\n");
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("�ݰ����ϴ�",2,3);
			bw.flush();
			
		} catch (IOException e) {}
		
		// 3. FileReader�� �̿��� �����б� (MS-949���)
		try (Reader reader = new FileReader(rwfile);
			BufferedReader bReader = new BufferedReader(reader);){
			
			//BufferedReader�� �߰��� �޼��� : readLine
			
			//int read() �� ������ �� = -1
			//readLine�� ����Ÿ���� String , ������ ���� ��Ÿ�� �� null, �� ���ξ� �д´�. 
			String data;
			while((data = bReader.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {}
		

	}

}