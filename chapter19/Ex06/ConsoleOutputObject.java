package chapter19.Ex06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out; // System.out :콘솔에 출력. byte를 출력
		
		//1. 한바이트 출력
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n');   // 버퍼에서만 저장되어 있다. 
		
		os.flush(); //버퍼의 내용을 콘솔에 출력
		// os.close(); //제일 마지막에 한번만 출력
		
		// 2. n-byte 출력  <== byte를 콘솔에 출력
		byte[] byteArray1 = "HelloWorld".getBytes();  //String을 byte로 변환
		os.write(byteArray1);
		os.write('\n');		// \r\n  => \r생략가능
		os.flush();
		
		// 3. n-byte 출력
		byte[] byteArray2 = "Better the last smile than the laughter".getBytes();
		os.write(byteArray2,7,8);
		// write(byte[], offset, length)
		os.flush();
		
		os.close();
		
		
		
		
		

	}

}
