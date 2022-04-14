package chapter19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 하나의 기반 스트림에 Filter 스트림을 여러개 혼합해서 사용이 가능하다. 
	// 제일 마지막에 처리하는 Stream의 메서드 사용여부에 따라 순서를 정할 수 있다. 

// 기반스트림1 : FileOutputStream 		: 기반스트림. 파일에 쓰기
// FilterStream : BufferedOutputStream :  버퍼를 사용해서 빠르게 처리
// FilterStream : DataOutputStream :  다양한 포맷방식으로 처리

// 기반스트림2 : FileInputStream : 기반 스트림. 파일 읽기
//FilterStream : BufferedInputStream :  버퍼를 사용해서 빠르게 처리
//FilterStream : DataInputStream :  다양한 포맷방식으로 처리




public class CombineFilterStream {

	public static void main(String[] args) {
		// 1. 파일 생성
		File dataFile = new File("src\\chapter19\\Ex07\\file1.data");
		
		// 2. 데이터 쓰기 .write
		try (OutputStream os  = new FileOutputStream(dataFile);	//기반 스트림
			BufferedOutputStream bos = new BufferedOutputStream(os);	//FilterStream (추가기능 제공, 단독으로는 사용 불가능)
			DataOutputStream dos = new DataOutputStream(bos);)			//FilterStream (추가기능 제공, 단독으로는 사용 불가능)
				//DataOutputStream의 메서드 사용할거면 DataOutputStream를 가장 마지막에 둬야 함
		{
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세용");
			dos.flush();
			
		} catch (Exception e) {}
		
		// 3. 데이터 읽기 .read
		try(InputStream is = new FileInputStream(dataFile);
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);) 
		{
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {}
		
		
		
	}

}
