package Ex_T.ch19;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
  1. is1   <== InputStream 객체 (절대 경로로 접근 : - ms949) , 예외처리
  2. is2   <== InputStream 객체 (상대 경로로 접근 : - utf8.txt), 예외처리(try ~ with resource로 예외처리)
  			// try ~ with resource : close()를 자동으로 처리
 */

//class Close implements AutoCloseable{
//	File resource;
//	
//	Close (File resource){
//		this.resource = resource;
//	}
//	@Override
//	public void close() throws Exception {
//		
//		if (resource != null) {
//			resource = null;  // 초기화
//			System.out.println("리소스가 해제 되었습니다.");
//			System.out.println(resource); // 초기화 됐는지 확인
//		}
//	}
//} => 왜한거....

public class EX3_Exception1 {

	public static void main(String[] args) {

		// 1. is1   <== InputStream 객체 (절대 경로로 접근 : - ms949) , 예외처리
		System.out.println("=========is1출력=============");
		File file1 ;
		file1 = new File("C:\\peb\\JAVA\\src\\chapter19\\Ex04\\exception-MS949.txt");
 		InputStream is1 = null;
		byte[]arr1 = new byte[100];
		int data1 = 0; 
		try {
			is1 = new FileInputStream(file1);
			while((data1 = is1.read(arr1)) != -1) {
				// 한글처리#2 : read(byte배열)
			String str1 = new String(arr1,0,data1,Charset.forName("MS949"));
			// 한글 처리 #3 : String(byte배열 ,offset, length, Charset(인코딩 타입))
			System.out.println(str1);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (is1 != null) {
				try {
					is1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		// 2. is2   <== InputStream 객체 (상대 경로로 접근 : - utf8.txt), 예외처리(try ~ with resource로 예외처리)
		System.out.println("=========is2출력=============");
		File file2 = new File("src\\chapter19\\Ex04\\exception-UTF-8.txt");
		
		int data2 = 0;
		byte[] arr2 = new byte[100];
		//한글처리 #1 : byte배열 선언
		
		try (InputStream is2 = new FileInputStream(file2)){ 
			//try()에 객체 생성-> resource /Ram을 사용(객체생성해서 메모리에 올린다.) <==close()자동으로 처리
				// AutoClosable의 close()를 구현한 클래스여야한다. => FileInputStream가 상속받고 있음
					// 내가 만든 객체로 할 때는 클래스 만들어서 따로 메서드 구현해줘야 함
			while((data2 = is2.read(arr2)) != -1) {
						//한글처리 #2 :is.read(byte배열));
				String str2 = new String(arr2,0,data2,Charset.forName("UTF-8"));
					//한글처리 #3 : new String(byte배열, offset, length, "encoding"
				System.out.print(str2);
			}
		} catch (IOException e) {
			System.out.println("예외가 발생되었습니다.");
		}
		
		
	}

}
