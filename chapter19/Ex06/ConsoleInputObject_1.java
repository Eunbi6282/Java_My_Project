package chapter19.Ex06;

import java.io.IOException;
import java.io.InputStream;

/*
 	System.in : Console���� ��ǲ�� �޴� �ڹٿ��� �������ִ� ��ü, InputStream
 		Windows : �ֿܼ��� Enter : \r\n
 		Mac : �ֿܼ��� Enter : \r
 	System.out : Console�� �ߎ��ϴ� ��ü
 */
public class ConsoleInputObject_1 {

	public static void main(String[] args) throws IOException {
		// 1. Console���� ��ǲ�ޱ� ���� ��ü ����
		InputStream is1 = System.in;		//is1�� �ֿܼ��� ��ǲ�޾Ƽ� ó���ϴ� ��ü
		
		System.out.println("������ �Է��ϼ���. >>>");
		
		int data;
		while ((data = is1.read()) != '\r') {		//1byte �о int data ������ �Ҵ�, int�� 4byte
			System.out.println("���� ������ : " + (char)data + "���� ����Ʈ�� : " + is1.available());
		}
		
		System.out.println(data);	//13	<== \r
		System.out.println(is1.read());	//10 <== \n
		
		System.out.println("========================");
	}
}
