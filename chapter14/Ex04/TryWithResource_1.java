package chapter14.Ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource_1 {

	public static void main(String[] args){
		// 1. 수동 리소스 해제 (기존 프로그램 사용) --> 코드가 길고 지저분함
		System.out.println("문자를 입력하세요!");
		
		InputStreamReader isr2 = null; //사용후 반드시 메모리에서 객체를 삭제해줘야 함
		
		//system.in : 콘솔에서 입력을 받도록 처리 . 1번만 인풋받을 수 있음. 
		
		
		try {
			isr2 = new InputStreamReader(System.in);
			//system.in -> 콘솔통해서 인풋받겠다.
			
			char input = (char)isr2.read();  //일반예외(Checked 예외
			System.out.println("입력글자 = " + input);
			
		} catch (IOException e) {
			e.printStackTrace();//try()블락에서 예외가 발생될 경우 자세한 정보를 출력
		} finally {	//객체 사용후에 메모리 영역에서 삭제
			//리소스 해제 :isr2.close() -> 예외처리해주어야 함
			if (isr2 != null) {
				try {
					isr2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 		//일반 예외 : IOException
			}
			
		}
		System.out.println("=====위의 isr2이 한번 인풋을 받고 close()되었기 때문에 isr1은 오류가 발생. ");
		
		
		
		// 2. 자동 리소스 해제 (Java 1.7 자동으로 리소스를 해제할 수 있음) --> 코드가 간결하다.(필요조건 있음)
		
		/*  try(자동으로 리소스를 해제할 객체 선언){} catch{} finally{}
		 --아래의 두가지 조건을 만족할 때 자동 리소스 해제--
		 1. 사용하는 객체가 AutoCloseable인터페이스를 구현한 객체여야 한다. 		 2. 반드시 객체에 close()가 존재해야한다.
		*/
		
		//InputStreamReader는 AutoCloseable 인터페이스를 구현하고 있다.close메서드도 가지고 있다.
		//Try With Resource : try (with resource : 객체 메모리 로드) {}
		
		try(InputStreamReader isr1 = new InputStreamReader(System.in);){
			char input = (char)isr1.read();
			System.out.println("입력글자 = " + input);
		}catch (IOException e) {
			e.printStackTrace();
		} //finally블락에 close()를 선언안하더라도 객체를 자동으로 실행함


	}
}