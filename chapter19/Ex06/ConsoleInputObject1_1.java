package chapter19.Ex06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject1_1 {

	public static void main(String[] args) throws IOException {
		// 1. Console에서 인풋받기 위한 객체 생성
				InputStream is1 = System.in;		//is1은 콘솔에서 인풋받아서 처리하는 객체
				
				System.out.println("영문을 입력하세요. >>>");
				
				int data;
				while ((data = is1.read()) != '\n') {		//1byte 읽어서 int data 변수에 할당, int는 4byte
					System.out.print((char)data );
				}
				
				System.out.println(data);	//10	<== \n
				System.out.println(is1.read());	// 더이상 리드할 것이 없다.
				
				System.out.println("========================");

	}

}
