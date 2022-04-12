package chapter19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {

	public static void main(String[] args) throws IOException {
		// 1. 입력파일 생성 ,경로 생성
		File inFile = new File("src\\chapter19\\Ex04\\FileinputStream1.txt");
		InputStream is1 = null;  //객체 선언
		
		// 2. (1) byte단위 읽기 (한바이트씩 읽어서 처리)
		try {
			is1= new FileInputStream(inFile); // 객체 생성, 나눠서 생성 선언 ->finally블락에서 close하기 위해서 
			int data;
			while ( (data=is1.read()) != -1) {  // 영문만 있으므로 read()메서드만 사용, 한글일 경우 read(byte배열)
				System.out.print((char)data);
				
			}
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
		}finally {
			if (is1 != null) {
				try { //null 인데 close하면 IOException발생
					is1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println();
		System.out.println("=========try(weith resorce){}로 구현하기==================");
		
		try (InputStream is2 = new FileInputStream(inFile)){
				//try(with rescource : 객체 셍상) <==FileInpurSrtreame 은 closable인터페이스를 구현
			int data;
			while ( (data=is2.read()) != -1) {  // 영문만 있으므로 read()메서드만 사용, 한글일 경우 read(byte배열)
				System.out.print((char)data);
				
			}
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
		}
		
		// 3. (2) n-byte단위로 읽기 (byte[]의 처음 위치에서부터 읽은 데이터 저장) : 여러 바이트를 배열에 담아 동시에 읽어서 처리 속도가 빠름
				// 배열의 방의 크기만큼 읽어 들여서 byte배열에 저장
				// 한글처리 가능
			
			System.out.println();
			System.out.println();
			System.out.println("==================================");
		
			InputStream is12= new FileInputStream(inFile);  //throws로 처리
			byte[] byteArray1 = new byte[9]; //배열방 9개, 0~8까지 //9byte씩읽는다. 
			int count1;
		
			while ( (count1=is12.read(byteArray1)) != -1) {   // 매개변수로 배열 옴
						//is2.read() : 1byte씩 읽는다.  //한글처리 못한다. 
						//is2.read(byteArray1) : 9byte씩 읽는다.  byteArray1에 저장
						//count1 : 9 , 9, 2 
				//count1 : 배열갯수
				for (int i = 0; i < count1; i++) {
					System.out.print((char)byteArray1[i]);
				}
				System.out.println(" : count1 = " + count1);
				
				/*
				System.out.println();
				System.out.println("=================");
				String str = new String(byteArray1,Charset.forName("MS949"));
				System.out.println(str);
				*/
			}
			is12.close();
			
			System.out.println(" -======한글처리=======");
			
			// 2_1 (3) n-byte 단위로 읽어서 한글처리 배열단위로 읽어서 한글처리
			InputStream is3 = new FileInputStream(inFile);
			byte[] byteArray2 = new byte[100];
			
			int count2;
			
			while ( (count2 = is3.read(byteArray2)) != -1) { // 글자수 100개씩 읽어들임
				System.out.println(new String(byteArray2,0,count2,Charset.forName("MS949")));
			}
			is3.close();
		
		// 4. 3 . n-byte 단위로 읽어서 저장. offset, length사용.
			InputStream is4 = new FileInputStream(inFile);
			byte[] byteArray4 = new byte[9];
			int offset = 3;
			int length = 6;
			int count4 = is4.read(byteArray4,offset,length);	//length만큼 앞에서 읽어와서 byteArray4에 offset위치에 저장해라
				// 6자를 읽어와서 index 3번방에 배열에 저장
			
			for (int i = 0; i < offset + count4; i++) {
				System.out.print((char) byteArray4[i]);
			}
			
			is4.close();
			
			
			
		
		
		
	}

}
