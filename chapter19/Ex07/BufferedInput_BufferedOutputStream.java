package chapter19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 추가 기능을 제공하는 스트림 : 기반 스트림이 존재해야 한다. 단독으로 사용할 수 없다.
// BuffredInputStream : InputStream의 필터를 장착해서 읽기 성능을 아주 빠르게 한 스트림, 기반 스트림의 추가 기능이어서 단독으로 사용 못함. 
// BuffredOutputStream : OutputStream의 필터를 장착해서 쓰기 성능을 아주 빠르게 한 스트림, 기반 스트림의 추가 기능이어서 단독으로 사용 못함.

public class BufferedInput_BufferedOutputStream {

	public static void main(String[] args) {
		// 두 파일을 복사, Buffered를 사용하지 않고 처리하는 경우,  Buffered를 사용하는 경우 속도 차이. 
		File orgFile1 = new File("src\\chapter19\\Ex07\\mycat_origin.jpg"); //원본파일
		File copyFile1 = new File("src\\chapter19\\Ex07\\mycat_copy1.jpg"); 	//Buffered를 사용하지 않고 처리하는 경우 
		File copyFile2 = new File("src\\chapter19\\Ex07\\mycat_copy2.jpg"); 	//Buffered를 사용해서 처리
		
		// 성능 측정을 하기 위한 변수 선언
		long start, end , time1, time2;	//time1 : Buffered를 사용하지 않는 경우 , time2 : Buffered를 사용하는 경우
		
		// 1. Buffered를 사용하지 않고 처리하는 경우(BuffredInputStream, BuffredOutputStream)
		start = System.nanoTime(); // 시작시간
		
		try (InputStream is = new FileInputStream(orgFile1); // Auto close()
			OutputStream os = new FileOutputStream(copyFile1)// Auto close()
			) {
			// 데이터 복사 코드 생성
			int data;
			 while ((data = is.read()) != -1) { //InputStream에서 한바이트씩 읽은 값을 data에 저장. 
				os.write(data); // 그 값을 OutputStream에 1byte씩 쓰기 , -1(마지막값까지)  => copyFile1파일 생성됨
			} 
		} catch (IOException e) {}
			end = System.nanoTime();
			time1 = end - start;
			System.out.println("Without BufferedXXXStream : " + time1); // Buffered를 사용하지 않고 복사. copy1.jpg
		
		
		// 2. Buffered를 사용해서 처리하는 경우(BuffredInputStream, BuffredOutputStream)
		start = System.nanoTime();
		
		try (InputStream is = new FileInputStream(orgFile1);  //기반 스트림
			 BufferedInputStream bis = new BufferedInputStream(is)	;	//추가 기능을 제공하는 스트림. 성능을 빠르게 처리(Buffered 사용)
			OutputStream os = new FileOutputStream(copyFile2);	// 기반 스트림
				BufferedOutputStream bos = new BufferedOutputStream(os); // 추가 기능을 제공(필터)
			)
		{	 // 원본을 복사하기 위한 
			// InputStream을 읽어와서  OutoutStream에 복사
			
		// 복사할 코드 생성
			int data;
			while ((data = bis.read()) != -1) {  // 버퍼를 사용해서 읽기
				bos.write(data);		// 버퍼를 사용해서 쓰기
			}
		}  
			
		catch (IOException e){}
		
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With BufferedXXXStream : " + time2); // Buffered를 사용해서 복사. copy2.jpg
		
		// Buffered 사용한 경우 (time2), 사용하지 않은 경우 (time1)
		System.out.println("속도 차이 몇 배 ? " + (time1 / time2) + "배 빠름");
	

	}
}
