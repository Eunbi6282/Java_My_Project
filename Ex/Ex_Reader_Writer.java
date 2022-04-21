package Ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import book.chapter15.Ex14.NewRunnableTerminated;

/*
 	Application Default : MS949
 	
 	Reader / Writer 의 하위 클래스 사용
 	
 	1. 콘솔에서 한글을 읽어서 
 	C:\Temp\a\aaa.txt (MS949);
 	C:\Temp\b\bbb.txt (UTF-8);
 	파일에 쓰기
 	
 	- a,b 폴더 Application에서 생성
 	
 	2. 두 파일에서 읽은 내용을 콘솔에 깨짐없이 출력
 */

public class Ex_Reader_Writer {
	public static void main(String[] args) {
		// 1. a,b 폴더 생성
		File tempDir1 = new File("C:/Temp/a");
		if(! tempDir1.exists()) {
			tempDir1.mkdir();
		}
		File tempDir2 = new File("C:/Temp/b");
		if(! tempDir2.exists()) {
			tempDir2.mkdir();
		}
		
		// 2. 파일 객체 생성
		File file1 = new File("C:\\Temp\\a\\aaa.txt"); //MS949
		File file2 = new File("C:\\Temp\\a\\bbb.txt"); //UTF-8

		// 3. 콘솔에서 한글 읽기(InputStreamReader), 파일에 쓰기(OutputStreamWriter) <MS949>
		InputStreamReader isr = null;
		InputStreamReader isr2 = null; 
		
		
		try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file1),"MS949");){
			
			 
			isr = new InputStreamReader(System.in,"MS949");
			System.out.println("한글을 입력하세요 >>>");
			int data;
			while ((data = isr.read()) != '\r') {
				osw.write((char)data);  // 메모장에 출력
				//System.out.print((char)data);
			}
			
		}catch (Exception e) {}	
		
		try {
			isr2 = new InputStreamReader(new FileInputStream(file1),"MS949");
			System.out.println("파일의 내용을 출력합니다(MS949) >>>");
			int data;
			while ((data = isr2.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {}
		
		System.out.println();
		System.out.println("========================");
		
		// 4. 콘솔에서 한글 읽기(InputStreamReader), 파일에 쓰기(OutputStreamWriter) <UTF-8>
		
		try (InputStreamReader isrr = new InputStreamReader(System.in,"MS949");
			OutputStreamWriter osww = new OutputStreamWriter(new FileOutputStream(file2),"UTF-8");){
			System.out.println("한글을 입력하세요 >>>");
			int data;
			while ((data = isrr.read()) != '\r') {
				osww.write((char)data);  // 메모장에 출력
			}
		} catch (Exception e) {}
		
		// 4-1. 콘솔에 메모장 내용 추가
		try(
			InputStreamReader isrrr = new InputStreamReader(new FileInputStream(file2),"UTF-8");
			OutputStreamWriter oswww = new OutputStreamWriter(System.out,"MS949")
			) {
			System.out.println("파일의 내용을 출력합니다(UTF-8) >>>");
			int data;
			while ((data = isrrr.read()) != -1) {
				oswww.write((char)data);
				oswww.flush();
			}
		} catch (Exception e) {} 
		
		try {
			isr.close();
			
		} catch (IOException e) {}	
		
		
		try {
			isr2.close();
		} catch (IOException e) {}
		
		
	}
}
