package chapter19.Ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

// InputStreamReader : byte ==> char
// OutputStreamWriter : byte ==> char, CharSet을 지정해서 file 을 저장할 수 있다. 


public class OutputStreamWriter_1 {

	public static void main(String[] args) {

		// 1. FileWriter을 통해서 데이터 쓰기(Default : MS949)
		File osw1 = new File("src\\chapter19\\Ex08\\osw1.txt");  //MS949
		
		try(Writer writer = new FileWriter(osw1);) { //FileWriter => char배열 처리
			
			writer.write("OutputStreamWriter1 예제 파일입니다.\n" .toCharArray());  //String을 char배열안에 저장 //배열
			writer.write("한글과 영문이 모두 포함되어 있습니다.");  // String
			writer.write('\n');  // char저장
			writer.write("Good Bye!!! \n\n");
			writer.flush();
			
		} catch (IOException e) {}
		
		// 2. FileWrite를 사용해서 (Default : MS949 ==> UTF-8 파일 쓰기 )
			//OutputStreamWrite 
		File osw2 = new File("src\\chapter19\\Ex08\\osw2.txt");		//UTF-8
	
		try(OutputStream os = new FileOutputStream(osw2);
			OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8")) { //FileWriter => char배열 처리
				// OutputStreamWriter : byte를 char로 변환
			
			osw.write("OutputStreamWriter1 예제 파일입니다.\n" .toCharArray());  //String을 char배열안에 저장 //배열
			osw.write("한글과 영문이 모두 포함되어 있습니다.");  // String
			osw.write('\n');  // char저장
			osw.write("Good Bye!!! \n\n");
			osw.flush();
		
		} catch (IOException e) {}
		
		
		
		
		
	}

}
