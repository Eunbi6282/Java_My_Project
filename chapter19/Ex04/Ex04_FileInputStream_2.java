package chapter19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

//FileInputStream
//is1 : MS949 한글로 읽기 처리 , try(with resource), 예외 처리
// is2 : UTF-8 한글 읽기 처리, try 예외처리

public class Ex04_FileInputStream_2 {
	public static void main(String[] args) {
		// 1 . is1 : MS949 한글로 읽기 처리 , try(with resource), 예외 처리
		File file1 = new File("src\\chapter19\\Ex04\\files\\file-MS949.txt");
		
		try(InputStream is1 = new FileInputStream(file1)) {
			
			byte[] arr1 = new byte[100];
			int data = 0;
			
			while((data = is1.read(arr1)) != -1) {
				String string = new String(arr1,0,data,Charset.forName("MS949"));
				System.out.println(string);
			}
			
		} catch (Exception e) {
			System.out.println("예외발생");
		}
		
		System.out.println("======================");
		
		// 2. is2 : UTF-8 한글 읽기 처리, try 예외처리
		File file2 = new File("src\\chapter19\\Ex04\\files\\file-UTF-8.txt");
		
		InputStream is2 = null;
		try {
			is2 = new FileInputStream(file2);
			byte[] arr2 = new byte[200];
			int data = 0;
			
			while((data = is2.read(arr2)) != -1) {
				String string = new String(arr2,0,data,Charset.forName("UTF-8"));
				System.out.println(string);
			}
		} catch (IOException e) {
			System.out.println("예외발생");
		} finally {
			try {
				is2.close();
			} catch (IOException e) {
				System.out.println("예외발생");
			}
		}
	}
}
