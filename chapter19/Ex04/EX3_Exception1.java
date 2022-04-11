package chapter19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.sql.Date;

/*
  1. is1   <== InputStream 객체 (절대 경로로 접근 : - ms949) , 예외처리
  2. is2   <== InputStream 객체 (상대 경로로 접근 : - utf8.txt), 예외처리(try ~ with resource로 예외처리)
  			// try ~ with resource : close()를 자동으로 처리
 */

class Close implements AutoCloseable{
	File resource;
	
	Close (File resource){
		this.resource = resource;
	}
	
	
	
	@Override
	public void close() throws Exception {
		
		if (resource != null) {
			resource = null;  // 초기화
			System.out.println("리소스가 해제 되었습니다.");
			System.out.println(resource); // 초기화 됐는지 확인
		}
	}
	
}

public class EX3_Exception1 {
	public static void main(String[] args) {

		// 1. is1   <== InputStream 객체 (절대 경로로 접근 : - ms949) , 예외처리
		System.out.println("=========is1출력=============");
		File file1 ;
		file1 = new File("C:\\peb\\JAVA\\src\\chapter19\\Ex04\\exception-MS949.txt");
 		InputStream is1 = null;
		
		
		try {
			is1 = new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		byte[] array1 = is1.readAllBytes();
		String str1= new String(array1,Charset.forName("MS949"));
		int data = 0;
		
		try {
			while((data = is1.read()) != -1) {
				try {
				
				System.out.print((char)data);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		} catch (IOException e) {
			System.out.println("파일을 읽지 못하는 예외가 발생되었습니다.");
		}
		
		// 닫아주기
		try {
			is1.close();
		} catch (IOException e) {
		}
		
		// 2. is2   <== InputStream 객체 (상대 경로로 접근 : - utf8.txt), 예외처리(try ~ with resource로 예외처리)
		System.out.println("=========is2출력=============");
		File file2 = new File("src\\chapter19\\Ex04\\exception-UTF-8.txt");
		
		InputStream is2 = null;
		int data2 = 0;
		try (Close c1 = new Close(file2);){
			is2 = new FileInputStream(file2);
			while((data2 = is2.read()) != -1) {
				System.out.print((char)data2);
			}
			
			
		} catch (Exception e) {
			System.out.println("예외가 발생되었습니다.");
		}
		
		
	}

}
