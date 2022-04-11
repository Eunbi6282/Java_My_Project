package chapter19.Ex03;

import java.io.UnsupportedEncodingException;

//EUC-KR  한국 표준, 한글표현 가능 전체중 표기 가능한 것만 구성되어 있음. 약 11,000자 --> 2200자 정도만 표기 가능, 8000자는 표기 안됨
	// 영문 : 1byte  <=== 영어는 UTF-8로 처리된다. 
	// 한글 : 2byte
	// 웹페이지로 출력할 때 한글을 깨지지 않도록 처리하기 위해서 사용. 근데 요즘엔 UTF-8 많이 사용

// MS-949(ANSI) - MicroSoft 사에서 개발한 한글 표기방식. 11,000 모두 표기 가능. Windows os는 기본 encoding 타입이 MS-949/ 
	// 영문 : 1byte
	// 한글 : 2byte

//UTF-8 - 모든 서버(웹, FTP, Mail,DB ...)의 기본 타입, git, Mac, Linux의 기본 encoding
	// 영문 : 1byte
	// 한글 : 3byte

//UTF-16 : <고정길이>
	//영문, 한글 모두 2byte로 처리
	// BOM 2byte : 모든 나라의 식별코드
	

// 문자를 해당 encoding 타입으로 바이트로 스트림으로 생성하는 경우, 해당 encoding타입으로 조합을 해야 깨지지 않는다. 

// 이클립스에서 인코딩타입 설정 3가지.
	// 1. 전역설정 : 
	// 2. 프로젝트에서 설정
	// 3. 파일에서 설정
	
	// 우선순위 : 파일 > 프로젝트 > 전역설정

public class EUCKR_VS_MS949 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//EUCKR vs MS949
		// 1. 영문자를 byte로 내보내고 String으로 변환 // 내보낼 때 encoding타입과 가져올 때 encoding타입이 같아야 함
			//문자를 byte로 변환
			byte[] b1 = null;
			try {
				b1 = "a".getBytes("EUC-KR");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}  // 문자를 byte로 변환 ==> 네트워크로 문자를 byte스트림으로 변환해서 전송
			//.getBytes() 예외 처리 필요( UnsupportedEncodingException ) -> 오타가 발생할 경우 인코딩할 수 없는 예외가 발생됨
			
			byte[] b2 = null;
			try {
				b2 = "a".getBytes("MS949");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			
			System.out.println(b1.length); // 1byte(영문은 1byte로 처리)
			System.out.println(b2.length); // 1byte
			
			// byte[]를 문자로 변환
			try {
				System.out.println(new String(b1,"EUC-KR"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} //a
			
			try {
				System.out.println(new String(b2,"MS949"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} //a
			
			System.out.println();
		 
		// 2. 한글을 byte로 내보내고 String으로 가져오기  // 내보낼 때 encoding타입과 가져올 때 encoding타입이 같아야 함
			byte[]b3 = "가".getBytes("EUC-KR");  
			byte[]b4 = "가".getBytes("MS949");
			
			System.out.println(b3.length); // 2
			System.out.println(b4.length); //2
			
			//byte[] ==> 문자열로 바꿈
			System.out.println(new String(b3,"EUC-KR"));
			System.out.println(new String(b4,"EUC-KR")); //encoding타입이 다르면 글자가 깨질 수 있음
			
		// 3. EUC-KR은 현재 사용 가능한 것만 표기, 약 2000자
			//MS949는 11,000자 모두 사용 가능
			
			byte[]b5 = "봵".getBytes("EUC-KR");  //11,000자 중 2000만 표기, 8000(X)
			byte[]b6 = "봵".getBytes("MS949");	// 11,000자 모두 처리
		
			System.out.println(b5.length); //1  ? 
			System.out.println(b6.length); //2
			
			//byte[] ==> 문자열로 바꿈
			System.out.println(new String(b5,"EUC-KR"));
			System.out.println(new String(b6,"MS949"));
		
		
		

	}

}
