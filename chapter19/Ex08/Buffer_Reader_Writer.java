package chapter19.Ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Buffer_Reader_Writer {

	public static void main(String[] args) {
		// 1. 파일 객체 생성
		File rwfile= new File ("src\\chapter19\\Ex08\\BufferFile.txt");
		
		// 2. FileWriter을 이용한 파일 쓰기(MS949)
		try(Writer writer = new FileWriter(rwfile);
			BufferedWriter bw = new BufferedWriter(writer);) {
			
			bw.write("안녕하세요\n");
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("반갑습니다",2,3);
			bw.flush();
			
		} catch (IOException e) {}
		
		// 3. FileReader를 이용한 파일읽기 (MS-949모드)
		try (Reader reader = new FileReader(rwfile);
			BufferedReader bReader = new BufferedReader(reader);){
			
			//BufferedReader에 추가된 메서드 : readLine
			
			//int read() 는 파일의 끝 = -1
			//readLine은 리턴타입이 String , 파일의 끝을 나타낼 때 null, 한 라인씩 읽는다. 
			String data;
			while((data = bReader.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {}
		

	}

}
