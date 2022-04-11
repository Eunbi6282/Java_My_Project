package chapter19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class FileInputStream1{

	public static void main(String[] args) throws IOException { 
					//메인 메서드에서는 throws 던지면 안됨! 오류나면 프로그램 종료되어버림 다 try catch로 묶어주기
										
		
		// 현재 작업 디렉토리 위치 확인
		System.out.println(System.getProperty("user.dir")); 
		
		// 1. 입력 파일 생성
			// 절대 경로로 설정
		File inFile1 = new File("C:\\peb\\JAVA\\src\\chapter19\\files\\FiileInputStream");
		
			// 상대경로 : 현재 작업 디렉토리(System.getProperty("user.dir") -> C:\peb\JAVA)를 기준으로 설정
		File inFile = new File("src\\chapter19\\files\\FiileInputStream");
		
		// InputStream 객체를 생성해야 파일의 내용을 읽을 수 있다. // 상대경로 사용
		InputStream	iStream = new FileInputStream(inFile); //FileInputStream은 InputStream의 하위구현클래스 -> 파일 읽어오기(가져오기)
			//InputStream은 추상 클래스 , 직접 객체 생성 불가, 타입지정은 가능 하다. 
		
		//파일의 내용을 출력
	
			// UTF-8 : 영어 -> 1byte, 한글 -> 3byte
			// MS949 : 영어 -> 1byte, 한글 -> 2byte
			// EUC-KR : 영어 -> 1byte , 한글 -> 2byte
			// UTF - 16 : 영어, 한글 -> 2byte / 제일 첫번째 2byte에는 식별자(BOM)이 들어가 있다. 
		
		//JAVA에서 줄바꿈 처리
		// 	- UNIX : \n
		//	- Windows : \r\n  <== \r은 생략해도 됨. <== 콘솔이나 메모장에서 enter : \r\n
		//	- Mac : \r
			
		//한바이트 데이터를 읽어서 char로 변환 후 출력 /.read() 한바이트를 읽어들인다. 
		System.out.print((char)iStream.read()); //(char)해줘야 문자열 출력, 아니면 바이트코드가 출력됨
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		System.out.print((char)iStream.read());
		
		System.out.println();
		System.out.println();
		
		//int read() : 한 바이트를 읽어서 값이 존재할 경우 양수를 리턴, 읽은 데이터가 존재하지 않을 경우 -1리턴
		// while문을 사용해서 한번에 출력
		//Stream은 객체를 한번 꺼내오면 다 날라가버림 -> 새로 객체 생성 필요
		InputStream	iStream2 = new FileInputStream(inFile);
		int data;  
		//iStream2.read() 한바이트씩 읽어온 값을 data에 저장, -1 -> 데이터가 존재하지 않을 때까지(마지막값까지)
		while((data = iStream2.read()) != -1) {  // -1 -> 데이터가 존재하지 않을 때까지(마지막값까지) 루프돈다. 
			System.out.print((char)data);
		}
		
				// 중요 : iStream2.read() : 1byte 를 읽어들임. 반환 타입은 int(4byte). 
				// FileInputStream은 반드시 index0번부터 읽어들임. 중간의 임의의 방에서 읽을 수 없다. 
					// FileRandomAccess를 사용해서 임의의 index에서 읽어들임. 
		
		System.out.println();
		System.out.println();
		
		//.available() : 남은 바이트수를 출력
		InputStream	iStream3 = new FileInputStream(inFile);
		
		while((data = iStream3.read()) != -1) {  // -1 -> 데이터가 존재하지 않을 때까지(마지막값까지) 루프돈다. 
			System.out.println("읽은 데이터 : " + (char)data + " 남은 바이트 수 : " + iStream3.available());
		}
		
		// 다 닫아주기!!!!!!!!!!!!!!!!!!!!!!!!
		iStream.close();
		iStream2.close();
		iStream3.close();
		
	}
}
