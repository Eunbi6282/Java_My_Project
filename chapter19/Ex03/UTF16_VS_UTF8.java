package chapter19.Ex03;

import java.io.UnsupportedEncodingException;

// UTF-16 고정길이 : 한글 영문 모두 2byte로 고정 되어 표기
	// 제일 처음 2byte의 식별코드 BOM(Byte Order Mark)가 들어감
// UTF-8 가변길이 : 영어 1byte, 한글은 3byte 

public class UTF16_VS_UTF8 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		byte[] b1 = "abc".getBytes("UTF-16");  //문자열 ==> byte[]
			//BOM 식별코드 2byte
			// abc : 6byte
		
		byte[] b2 = "abc".getBytes("UTF-8");
		
		System.out.println(b1.length); 	//8 : BOM(2) + 6 (abc)
		System.out.println(b2.length);  //3
		
		System.out.println(new String(b1, "UTF-16"));
		System.out.println(new String(b1, "UTF-8")); //decoding 타입이 다르면 오류가 남
		
		for(byte b : b1) { 	//2byte씩이 한글자 표시
			System.out.printf("%02X" , b);  //%02X -> 16진수으로 표현해라
			System.out.println();
		}
		
		System.out.println("===============");
		
		for (byte b : b2) {
			System.out.printf("%02X" , b);  //%02X -> 16진수로 표현해라
			System.out.println();
		}
		
		System.out.println("================");
		
		//한글을 byte로 변환해서 UTF-16 타입으로 배열에 담는다.
		byte[]b3 = "가나다".getBytes("UTF-16"); //한글 영문 모두 2byte씩 처리됨
		byte[]b4 = "가나다".getBytes("UTF-8"); //한글 -> 3byte가 한글자
		
		System.out.println(b3.length); //8 : BOM(2byte) + 6 (가나다)
		System.out.println(b4.length); //9
		
		for (byte b : b3) {
			System.out.printf("%02X" , b);
			System.out.println();
		}
		
		System.out.println("===============");
		
		for (byte b : b4) {
			System.out.printf("%02X" , b);
			System.out.println();
		}
		
		System.out.println(new String(b3, "UTF-16"));
		System.out.println(new String(b4, "UTF-8"));
	
	}

}
