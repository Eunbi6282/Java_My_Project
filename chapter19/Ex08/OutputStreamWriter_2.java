package chapter19.Ex08;

import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
  Reader / Writer : 추상 클래스, char를 처리, 문자(0), 이미지(O), MP#(X).../ 문자만 특화해서 처리
  
  FileReader / FileWriter : 완성된 클래스 , Default Charset만 사용. 
  InputStreamReader , OutputStreamWriter : encoding 타입 지정 가능
  
  주의 : System.in : 콘솔에서 입력, System.out : 콘솔에 출력  <== Application에서 한번 close()되면 재사용 안됨
  	// System.in, System.out 바이트 읽기, 바이트 쓰기
  
 */


public class OutputStreamWriter_2 {
	public static void main(String[] args) {
		
		// 1. 콘솔 출력(Application Default : MS949)
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "MS949");
			osw.write("OutputStreamWriter1 예제 파일입니다.\n" .toCharArray());  //String을 char배열안에 저장 //배열
			osw.write("한글과 영문이 모두 포함되어 있습니다.");  // String
			osw.write('\n');  // char저장
			osw.write("Good Bye!!! \n\n");  //.flush() 안하고 .write만 하면 그냥 버퍼(멤리)에 쓰여지는 것
			osw.flush();  // 버퍼에 저장된 것을 콘솔에 출력.
			System.out.println(osw.getEncoding());
		} catch (Exception e) {}
		
		// 2. 콘솔출력 (Application Default : MS949 => UTF-8)
		
		
		
		
	}

}
