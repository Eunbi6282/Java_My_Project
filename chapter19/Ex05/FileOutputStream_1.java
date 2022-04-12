package chapter19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

// InputStream : 추상클래스   <== FileInputStream 구현한 클래스(읽어올 때)
// OutputStream : 추상클래스  <== FileOutputStream 구현한 클래스 (쓰기)
// FileInputStream : byte() 단위 데이터 읽기
// FileOutputStream : byte()단위 데이터 쓰기

// Windows 콘솔, 메모장 Enter을 넣으면 : \r\n 

public class FileOutputStream_1 {

	public static void main(String[] args) throws IOException {
		// 1. 입력파일 생성 (존재하지 않음)
		File outfile = new File("src/chapter19/Ex05/FileOutput1.txt");
		
		//2. 한바이트 읽기
		OutputStream os1 = new FileOutputStream(outfile);
			// FileOutStream 에 존재하지 않는 파일을 넣으면 생성됨
		os1.write('J');  // <== write()도 ㅑIOException발생
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');   // 엔터 -> byte13   <== 생략가능
		os1.write('\n');	// 엔터 -> byte 11
		
			// 중요!!! : write()메서드는 버퍼(RAM)에 쓰기<메모리에 올림>, 버퍼가 꽉차면 파일에 쓰게함
			// 			flush() : 버퍼에 저장된 내용을 파일에 강제로 쓰게 할 때 사용. 
		os1.flush();  // 메모리의 내용을 파일에 쓰도록 강제로 적용, 버퍼가 꽉차지 않더라도 강제로 파일에 쓰도록 한다.
			// 생략가능, but write()를 사용하면 flush()를 사용할 것을 권장
		
		os1.close(); // closer()호출시 flush()먼저 작동 됨
		
		//2. n-byte 단위 쓰기(byte[]의 offset부터 length)
		OutputStream os2 = new FileOutputStream(outfile);   // 덮어쓰기
			// outfile,true => true를 넣으면 이어쓰기
			// outfile,false => false(기본값)ㅣ면 덮어쓰기ㅣ 
		byte[] byteArray1 = "Hello!".getBytes();            //"Hello!"(String) -> byte로 변환해줘야 함, getBytes()이용
			// 문자열이 문자가 아닌 바이트 배열안에 바이트 타입으로 들어감
		
		os2.write(byteArray1);
		os2.write('\n');	// \r은 생략가능, \n만 넣어도 Enter처리됨
		
		os2.flush();
		os2.close();
		
		// 3. n-byte 단위쓰기 (byte[]의 offset부터 length의 byte데이터 쓰기
		OutputStream os3 = new FileOutputStream(outfile,true); 
		byte[] byteArray2 = "Better The Last Smile Than the First Laughter".getBytes();  //
		os3.write(byteArray2,7,8);  // write일때는 7byte뒤에서 8읽어서 저장
									// read 일때는 반대로처리
		
		os3.flush();
		os3.close();
 	}

}
