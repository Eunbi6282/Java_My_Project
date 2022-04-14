package chapter19.Ex08;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReader_2 {

	public static void main(String[] args) {
		// 1. 콘솔 입력(MS949) : Default CharacterSet, byteStream (콘솔로 내보내는 것, 콘솔에서 인풋받는 값 모두 byteStream)
		try {
			//InputStreamReader : byte ==> char 변환
			
			// isr은 변환된 char
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");  // 콘솔에서 두번째 값도 받아야 하므로 자동 close()안되도록
			System.out.println("한글을 원하는 대로 입력하세요 >>>");
			
			int data;
			while ((data = isr.read()) != '\r') {		// 콘솔입력 대기
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e) {}
		
		System.out.println("==================================================");
		
		// 2. 콘솔입력 (UTF-8) : 
		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");){
			
			System.out.println("한글을 원하는 대로 입력하세요2 >>>");
			
			int data;
			while ((data = isr.read()) != '\r') {		// 콘솔입력 대기
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e) {}
	}

}
