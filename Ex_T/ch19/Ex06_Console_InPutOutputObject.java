package Ex_T.ch19;

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
		
		// 1. 콘솔에서 값 입력받기 (System.in) <== 콘솔에서 byte[]가 넘어온다. ,byte[]을 생성해서 처리 : 한글을 처리
		InputStream is = System.in; 	//콘솔에서 입력받겠다 , new로 생성하지 않고 연결만 , 콘솔에서 인풋값을 받는다. 
		System.out.println("한글을 입력하세요 >>>");
		byte[] byteArray = new byte[100];
		int count1 = is.read(byteArray);		// byteArray1에 byte로 \r\n을 포함해서 들어간다. 
			// count1은 배열에 값이 들어온 개수를 리턴한다. 
		
		//int data = is.read(); //read()안에 아무것도 없다면 data안에 한바이트씩 읽은 값을 저장!! , 한글을 처리하지 못한다. 
		// int count1 = is.read(byteArray);  //read()안에 배열이 들어간다면 배열안에 들어있는 값의 개수가 저장됨
		
		System.out.println("============================");
		
		// 2.파일에 저장 (FileOutputStream)
		File file1 = new File("src\\Ex_T\\ch19\\input.txt");
		
		OutputStream os = new FileOutputStream(file1);  //파일을 쓰도록 함 , (file1,false) => 기본값 , 덮어쓰기
		//String -> byte
		os.write(byteArray); //버퍼(RAM)에만 쓰여짐
		os.flush();	//.flush()를 사용해야만 버퍼에 쓰인 내용을 파일에 적용한다. 
		System.out.println("정상적으로 값 입력");
		
		// 3. 파일에서 값읽어옴 (FileInputStream)
		InputStream is2 = new FileInputStream(file1); //read(): 한글을 처리 못한다. read(byte[]) : 한글처리
		byte[] byteArray2 = new byte[100];
		int count2 = is2.read(byteArray2); //배열을 .read()에 처리해야 한글이 출력
		// int data2 = is2.read(); //read() : 1byte씩 읽어온다. 
		
		
		// 4. 읽어온 값을 콘솔에 출력 (System.out)
		System.out.println("파일에서 읽어온 내용을 콘솔에 출력합니다. >>>");
		OutputStream os2 = System.out;  //콘솔에 출력 byte로 콘솔에 값 던져주기
		// String -> byte
		os2.write(byteArray2);
		os2.flush();
		
		is.close();
		os.close();
		is2.close();
		os2.close();
	}
}
