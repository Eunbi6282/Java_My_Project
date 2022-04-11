package chapter19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream1_1 {

	public static void main(String[] args) {
		
		File inFile = new File("src\\chapter19\\files\\FiileInputStream");
		
		//예외처리 : 각각 처리
		InputStream iStream1 = null ;  // 지역변수 초기화 필요
		
		try {
			iStream1 = new FileInputStream(inFile);
		} catch (FileNotFoundException e) { 
			//"src\\chapter19\\files\\FiileInputStream" 이 경로에 파일이 없을 때 생기는 예외 처리
			System.out.println("파일이 존재하지 않습니다. ");
		}
		
		int data = 0;		// 지역변수 초기화 필요
		// iStream 객체를 try catch 문안에 적으면 인식 못하니까 이름은 위에서 선언 해두기
		try {
			while((data = iStream1.read()) != -1) {   // IOException 발생(input,output에 대한 Exception)
				System.out.println((char)data); 
			}
		} catch (IOException e) {
			System.out.println("파일을 읽지 못하는 예외가 발생되었습니다.");
		}
		
		// 닫아주기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		try {
			if (iStream1 != null) {
				iStream1.close();
			}
		} catch (IOException e) {
		}
		
		System.out.println("====================================");
		
		//예외처리 : 2개의 예외에 대해서 한꺼번에 처리
		InputStream iStream2 = null ;
		int data2 = 0;
		
		
		try {
			iStream2 = new FileInputStream(inFile);
			
			while((data = iStream2.read()) != -1) {   // IOException 발생(input,output에 대한 Exception)
				System.out.println((char)data); 
			}
		} catch (IOException e) { //IOException이 FileNotFoundException 보다 상위 EXception 이므로 포괄적으로 처리
			System.out.println("예외가 발생했습니다 ");
		} finally {
			try {
				iStream2.close();
			} catch (IOException e) {
				System.out.println("예외가 발생했습니다 ");
			}
		}
		

	}

}
