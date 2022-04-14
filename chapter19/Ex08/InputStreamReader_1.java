package chapter19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStreamReader : Stream(byte) Reader(char), byte데이터를 char포멧으로 변환하는 객체 
	// byte포멧은 인코딩을 잘 지정해야 한다. <= MS949, UTF-8
	// char포멧으로 바꾸면 인코딩 타입을 신경쓸 필요가 없다. 
	// 사용목적 1. FileREader : defalut Charset만 사용 가능하, 현재 Default Charset (MS949) 이지만 외부 파일이 UTF-8로 되어 있는 경우 
	// 사용 목적 2. 네트워크에서 전송되는 스트림이 UTF-8, MS949  (byteStream) ===> char로 변환해서 처리
/*
  
 */

public class InputStreamReader_1 {

	public static void main(String[] args) {
		// 1. 파일 객체 생성
		File isr = new File("src\\chapter19\\Ex08\\isr.txt");		//isr.txt는 UTF-8로 저장되어 있다. 
		
		try (Reader reader = new FileReader(isr);){  // FileReader는 인코딩 설정이 안됨. Default encoding만 사용
				// 깨짐 -> isr.txt는 UTF-8, 현재 자바 파일 -> MS949
			int data = 0;
			while ((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {}
		
		System.out.println("===========================================");
		System.out.println("===========================================");
		
		// 2. FileInputStream + InputStreamReader를 이용한 파일읽기
			// InputStreamReader(is, "encoding")을 장착해서 UTF-8 도 읽을 수 있게
				//byte데이터를 char포멧으로 변환하는 객체 
		try(InputStream is = new FileInputStream(isr);
			InputStreamReader isreader = new InputStreamReader(is,"UTF-8");	) {
				
			int data;
			while ((data = isreader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {}
	}
}
