package Ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

//콘솔에서 배열 100byte 이하 한글을 인풋받은 값을 input.txt 파일에 저장후 , default CharSet
// input.txt 파일에서 값을 읽어서 콘솔(System.out)에 출력, 예외 throw
	// 1. System.in
	// 2. FileOutputStream
	// 3. FileInputStream : 저장된 파일의 내용을 읽어오기
	// 4. System.out : 콘솔에 출력
	

public class Ex06_Console_InPutOutputObject {

	public static void main(String[] args) throws IOException {
		
		// 1. 콘솔에서 값 입력받기
		InputStream is = System.in;
		System.out.println("한글을 입력하세요 >>>");
		byte[] byteArray = new byte[100];
		int count1 = is.read(byteArray);
		String str = new String(byteArray, 0, count1,Charset.defaultCharset());
		System.out.println("============================");
		is.close();
		
		// 2.파일에 저장
		File file1 = new File("src\\chapter19\\Ex06\\input.txt");
		
		OutputStream os = new FileOutputStream(file1);
		//String -> byte
		byte[] byteArray2 =	str.getBytes(Charset.defaultCharset());
		os.write(byteArray2);
		os.flush();
		System.out.println("정상적으로 값 입력");
		os.close();
		
		// 3. 파일에서 값읽어옴
		InputStream is2 = new FileInputStream(file1);
		
		byte[] byteArray3 = new byte[100];
		int data;
		String string = null;
		while ((data = is2.read(byteArray3)) != -1) {
			string = new String(byteArray3,0,data,Charset.defaultCharset());
		}
		is2.close();
		
		// 4. 읽어온 값을 콘솔에 출력
		System.out.println("파일에서 읽어온 내용을 콘솔에 출력합니다. >>>");
		OutputStream os2 = System.out;  //콘솔에 출력 byte로 콘솔에 값 던져주기
		// String -> byte
		byte[] byteArray4 = string.getBytes();
		os2.write(byteArray4);
		os2.flush();
		os2.close();
	}
}
