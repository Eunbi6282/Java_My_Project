package chapter19.Ex08;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReader_2 {

	public static void main(String[] args) {
		// 1. �ܼ� �Է�(MS949) : Default CharacterSet, byteStream (�ַܼ� �������� ��, �ֿܼ��� ��ǲ�޴� �� ��� byteStream)
		try {
			//InputStreamReader : byte ==> char ��ȯ
			
			// isr�� ��ȯ�� char
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");  // �ֿܼ��� �ι�° ���� �޾ƾ� �ϹǷ� �ڵ� close()�ȵǵ���
			System.out.println("�ѱ��� ���ϴ� ��� �Է��ϼ��� >>>");
			
			int data;
			while ((data = isr.read()) != '\r') {		// �ܼ��Է� ���
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e) {}
		
		System.out.println("==================================================");
		
		// 2. �ܼ��Է� (UTF-8) : 
		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");){
			
			System.out.println("�ѱ��� ���ϴ� ��� �Է��ϼ���2 >>>");
			
			int data;
			while ((data = isr.read()) != '\r') {		// �ܼ��Է� ���
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e) {}
	}

}
