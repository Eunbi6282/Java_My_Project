package chapter19.Ex06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject1_1 {

	public static void main(String[] args) throws IOException {
		// 1. Console���� ��ǲ�ޱ� ���� ��ü ����
				InputStream is1 = System.in;		//is1�� �ֿܼ��� ��ǲ�޾Ƽ� ó���ϴ� ��ü
				
				System.out.println("������ �Է��ϼ���. >>>");
				
				int data;
				while ((data = is1.read()) != '\n') {		//1byte �о int data ������ �Ҵ�, int�� 4byte
					System.out.print((char)data );
				}
				
				System.out.println(data);	//10	<== \n
				System.out.println(is1.read());	// ���̻� ������ ���� ����.
				
				System.out.println("========================");

	}

}