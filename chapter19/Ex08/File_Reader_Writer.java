package chapter19.Ex08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
  Reader / Writer : char단위 입출력. 문자만 처리하도록 특화된 추상클래스
   		// byte : 1byte
  		// char : 2byte, UTF-16(영문, 한글2byte/ 유니코드)으로 처리, 고정길이, 전 세계 모든 언어를 처리
  	 		
  	 		FileReader : charset지정 옵션이 없다. default charset사용
  	 		FileWriter : charset 지정 옵션이 없다. default charset사용
 */
public class File_Reader_Writer {

	public static void main(String[] args) {
		//1. 파일객체 생성
		File rwFile = new File("src\\chapter19\\Ex08\\rwFile.txt");
		
		try(Writer writer = new FileWriter(rwFile);) {  //Writer :  추상클래스, FileWriter: Writer을 구현한 자식 클래스
			// OutputStream : byte단위 출력, 추상 클래스, FileOutputStream(구현한 클래스), <문자, 데이터, MP3, JPG, AVG....>
				//Stream -> 전부  byte단위 출력
			// Writer 		: char단위 출력, 추상 클래스, FileWriter(구현한 클래스), 문자 특화해서 처리
			writer.write("안녕하세요\n".toCharArray());
			writer.write("Hello\n");
			writer.write('A');
			writer.write('\r');
			writer.write('\n');
			writer.write("반갑습니다.",2,3);
			writer.flush();
		} catch (IOException e) {}
		
		// 2. FileReader를 이용한 파일 읽기 (Default MS949)   <== CharacterSet 지정 옵션이 없다.
		try(Reader reader = new FileReader(rwFile);) {
			
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
			
		} catch (IOException e) {}

	}

}
