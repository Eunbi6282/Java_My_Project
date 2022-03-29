package chapter14.Ex08;

public class ExceptionMessage {

	public static void main(String[] args) {
		// 1. 예외 객체 생성 시 메세지 전달하지 않는 경우
		
		try {
			throw new Exception(); //강제 예외 발생, Exception의 기본생성자 호출 시 메세지는 출력 X 
				//throw에 애초에 객체 생성해서 보내기(기본생성자 호출, 생성)
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=================");
		
		// 2. 예외 객체 생성 시 메세지 전달하는 경우
		try {
			throw new Exception("예외 메세지 출력");	
			//throw에 애초에 객체 생성해서 보내기(매개변수 Stirng 1개 받는 생성자 호출, 생성)
			// Exception 객체 생성자에 String값을 넣어주면 catch블락에서 예외 메세지를 출력
		} catch (Exception e) {
			System.out.println(e.getMessage()); 	// d=
		}	
	}

}
