package chapter19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// Windows :콘솔 , 메모장에서 Enter : \r\n, \r 생략이 될 수 있다. \n만으로도 처리가 가능하다. write('\n) <- write()는 n만 넣어도 처리 가능


public class ConSoleInputObject_2 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in; 	// is 콘솔을 통해서 인풋을 받겠다.
			// System.in은 한페이지에서 만들면 
		
		System.out.println("영문만 입력하세요 >>>");
		
		// 1. 한바이트 단위 읽기
		int data;
		while ( (data = is.read()) != '\r') {	//is.read()호출될 때 콘솔에서 인풋을 대기
			System.out.print((char)data);
		}
		
		is.read();		//10 <== \n이 남아있음 !!! // 버퍼(RAM)에 남아있음. 끄집어 내줘야 함
			// \n을 처리해 주지 않으면 다음 read()에서 \n이 들어가 버림
		
		System.out.println();
		System.out.println();
		
		System.out.println("============");
		
		// 2. n -byte읽기 (
		byte[] byteArray1 = new byte [100];	// 콘솔에서 배열에 저장될 때 \r\n까지 들어간다. 
		int count1 = is.read(byteArray1); 	// count1은 100바이트씩. 100,100,30(100보다 작은 값은 작게 받아들임), -1(enter를 찔때까지 100byte)
		
			// new byte [100]이 배열에 넣어서 리드할 때는 100씩
		// count1 배열에서 읽은 값의 개수를 저장.
		
		for (int i = 0; i < count1; i++) {
			System.out.print((char)byteArray1[i]);
			System.out.println(" : count = " + count1); // \r\n이 배열 내부에 있어서 2byte가 더 출력 됨
		}
		
		System.out.println("======================");
		
		int count2;
		count2 = is.read(byteArray1);  // 배열 내부에 \r과 \n이 들어감
		System.out.println(new String(byteArray1,0,count2));
		
		
//		while((count2 = is.read(byteArray1)) != '\r') {  //콘솔에서는 -1을 사용하지 않고 , \r처리
//			System.out.println(new String(byteArray1));
//		}   // 
		// is.read(); // <== 버퍼에서 빼지 않아야 한다. (배열 내부에 \r\n이 들어가 있기 때문에)
			// byteStream의 경우 메모리에 저장되어 있기 때문에 끄집어 내줘야 함
		System.out.println("======================");
		
		// 3. n -byte 단위로 묶고 (length 만큼 일거와서 byte[] offset 위치에서 저장
		byte[] byteArray2 = new byte[8];
		int offset = 3;
		int length = 5;
		
		int count3 = is.read(byteArray2,offset,length);
		for( int i = 0; i < offset + length; i++) {
			System.out.print((char)byteArray2[i]);
		}
		
		is.close();  // 제일 마지막에 처리. 중간에 close()하면 다시 호출이 불가능
	}

}
