package chapter19.Ex07;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintStreamExamp_2 {

	public static void main(String[] args) {
		// 1. File��ü ����
				File outfile1 = new File("src\\chapter19\\Ex07\\printStream3.txt");
				File outfile2 = new File("src\\chapter19\\Ex07\\printStream4.txt");

				
		// 2. ���ϻ���
				try(PrintStream ps = new PrintStream(outfile1) ;) {
					ps.println(5.8);  //double ���		<==����� ���� ����
					ps.print(3 + "아나녕" + 12345 + "\n");  // <= ��� �� ���ΰ��� X, ���๮�� ���� �־��� => "\n"
					ps.printf("%d", 7); 	// "%d" : int���� ȣ��
					ps.printf("%s %f", "안녕", 5.8); 	// "%s" : stringȣ��, "%f" : double ȣ��
					
				} catch (Exception e) {}
				
				try (InputStream is = new FileInputStream(outfile1)){
					int count;
					byte[] byteArray = new byte[100];
					count = is.read(byteArray);
					
					System.out.println(new String(byteArray,0,count,Charset.forName("UTF-8")));
				} catch (Exception e) {
				}
	}

}
