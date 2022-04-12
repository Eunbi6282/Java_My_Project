package chapter19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

//FileOutputStream사용해서 한글처리
public class FileOutputStream_2 {

	public static void main(String[] args) throws IOException {
		// 1. 저장할 파일 생성
		File outfile = new File("src/chapter19/Ex05/FileOutput2.txt");
			// 기본적으로 이클립스의 default charactorSet으로 저장
		
		// 2. n-byte단위 쓰기 처리(byte[]의 처음부터 끝까지 쓰기) <== 한글을 처리
		OutputStream os2 = new FileOutputStream(outfile);
		byte[] byteArray1 = "안녕하세요".getBytes("MS949"); //String ==> byte[]에 저장 : getBytes()
			// 한자 2byte씩 처리됨
		
		os2.write(byteArray1);
		os2.write('\n');
		
		os2.flush();
		os2.close();
		
		// 3. n-byte 쓰기(byte[],offset,length
		OutputStream os3 = new FileOutputStream(outfile,true);  //이어서 쓰기
		byte[] byteArray2 = "반갑습니다.".getBytes(Charset.forName("MS949")); //MS949로 가져오기
		os3.write(byteArray2,6,5);  //2byte 띄우고 2byte읽어옴, 한글2byte, 특수문자 1byte
			//write(byte[], offset, length)
		
		// 영어 , 숫자, 특수문자 :1byte
		
		os3.flush();
		os3.close();
		
		
		

	}

}
