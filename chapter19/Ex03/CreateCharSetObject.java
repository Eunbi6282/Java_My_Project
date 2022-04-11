package chapter19.Ex03;

import java.nio.charset.Charset;

public class CreateCharSetObject {

	public static void main(String[] args) {
		// 문자 encoding설정을 적용하는 방법1
		// 1. Charset.defaultCharset() -> 시스템의 기본설정을 로드 (encoding type)
			//Charset클래스의 defaultCharset()메서드
		
		Charset cs1 = Charset.defaultCharset(); // 객체 생성없이 메서드 불라옴 -> 정적메서드, 시스템의 기본 설정된 chrarset을 로드
		System.out.println(cs1); //MS949 (확장)--> x-windows-949
								// UTF-8
		
		// 2. Charset.forName("encoding Type") -> encoding타입을 직접 할당해서 사용
		Charset cs2 = Charset.forName("MS949");
		System.out.println(cs2);
		Charset cs3 = Charset.forName("UTF-8");
		System.out.println(cs3);
		//Charset cs4 = Charset.forName("EUC-KRr"); 
			//존재하지 않는 encoding타입을 넣으면 UnsupportedCharsetException예외 발생
		
		System.out.println();
		
		System.out.println(Charset.isSupported("MS949")); // 지원 되면 true, 아니면 false
		System.out.println(Charset.isSupported("UTF-8"));
		System.out.println(Charset.isSupported("EUC-KR"));
		
		
	}

}
