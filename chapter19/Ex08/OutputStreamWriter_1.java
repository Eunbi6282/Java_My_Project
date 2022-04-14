package chapter19.Ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

// InputStreamReader : byte ==> char
// OutputStreamWriter : byte ==> char, CharSet�� �����ؼ� file �� ������ �� �ִ�. 


public class OutputStreamWriter_1 {

	public static void main(String[] args) {

		// 1. FileWriter�� ���ؼ� ������ ����(Default : MS949)
		File osw1 = new File("src\\chapter19\\Ex08\\osw1.txt");  //MS949
		
		try(Writer writer = new FileWriter(osw1);) { //FileWriter => char�迭 ó��
			
			writer.write("OutputStreamWriter1 ���� �����Դϴ�.\n" .toCharArray());  //String�� char�迭�ȿ� ���� //�迭
			writer.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�.");  // String
			writer.write('\n');  // char����
			writer.write("Good Bye!!! \n\n");
			writer.flush();
			
		} catch (IOException e) {}
		
		// 2. FileWrite�� ����ؼ� (Default : MS949 ==> UTF-8 ���� ���� )
			//OutputStreamWrite 
		File osw2 = new File("src\\chapter19\\Ex08\\osw2.txt");		//UTF-8
	
		try(OutputStream os = new FileOutputStream(osw2);
			OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8")) { //FileWriter => char�迭 ó��
				// OutputStreamWriter : byte�� char�� ��ȯ
			
			osw.write("OutputStreamWriter1 ���� �����Դϴ�.\n" .toCharArray());  //String�� char�迭�ȿ� ���� //�迭
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�.");  // String
			osw.write('\n');  // char����
			osw.write("Good Bye!!! \n\n");
			osw.flush();
		
		} catch (IOException e) {}
		
		
		
		
		
	}

}
