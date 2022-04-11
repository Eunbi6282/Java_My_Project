package chapter19.Ex03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArrayToString {
	public static void main(String[] args) throws UnsupportedEncodingException {

		// 1. String getByte() : String ---> Byte[]분해  문자 ---> byte 변환해서 배열에 저장
		byte[] array1 = "안녕".getBytes();   //Charset적용X 
		byte[] array2 = "땡큐".getBytes(Charset.defaultCharset()); // "땡큐"를 byte로 변환해서 배열에 저장.
		byte[] array3 = "베리".getBytes(Charset.forName("MS949")); //오타날 시 예외발생 : 실행시 예외 
		byte[] array4 = "땡큐".getBytes("UTF-8");  // 예외 처리 필요 <<일반예외 (컴파일시 예외 발생)>>>
		
		// 2. 각 인코딩의 바이트 수 출력
		System.out.println(array1.length);  //MS949: 한글 1자는 2바이트 //4
		System.out.println(array2.length);  //MS949: 한글 1자는 2바이트 //4
		System.out.println(array3.length);	//MS949: 한글 1자는 2바이트 //4
		System.out.println(array4.length);	//UTF-8: 한글 1자는 3바이트 //6
		
		System.out.println();
		
		// 3. new String() : byte[] ---> String으로 변환  byte --> 문자로 변환
		String str1 = new String(array1);   //배열 안의 byte를 문자로 변환
		System.out.println(str1);
		
		String str2 = new String(array2,Charset.defaultCharset());   //배열 안의 byte를 문자로 변환
		System.out.println(str2);
		
		String str3 = new String(array3,Charset.forName("MS949"));   //배열 안의 byte를 문자로 변환
			// 내보낼 때 타입과 가져오는 타입이 같아야 오류가 나지 않는다. 
		System.out.println(str3);
		
		// 3. 한글이 깨지는 경우 : 내보내는 인코딩 타입과 가져오는 인코딩 타입이 불일치 할 경우
		String str4 = new String(array4,Charset.forName("MS949"));   //배열 안의 byte를 문자로 변환
		// 내보낼 때 타입과 가져오는 타입이 같아야 오류가 나지 않는다. 
		System.out.println(str4);
	
		String str5 = new String(array1,Charset.forName("UTF-8"));
		System.out.println(str5);
		
		
		
		
		
		
		
		
		
		
	}

}
