package chapter14.Ex08;

// 사용자 정의 예외 Exception
// 	1. Exception을 상속하는 예외 : 일반예외(Checked Exception) -> 컴파일 단계에서 예외처리 필요
//	2. RunTimeException을 상속하는 예외 : 실행예외(unChecked Exception) , RunTime Exception-> 실행시에 예외

class MyException extends Exception{	//일반예외
	public MyException () {		//기본 생성자
		super();
	} 	
	public MyException (String message) {	//예외메세지 출력시 사용
		super(message);
	}
}

class MyRTException extends RuntimeException{  //실행 예외
	public MyRTException () {	//기본생성자
		super();
	};
	public MyRTException(String message) {	//예외 발생시 메세지를 출력해주는 생성자
		super(message);
	}
}

//예외 처리 class
class A{
	
	// 1. 사용자 정의 예외 객체 생성(일반 예외 객체)
	MyException me1 = new MyException(); //기본생성자 호출
	// 예외 발생시 예외 메세지 출력하는 생성자
	MyException me2 = new MyException("예외 메세지 : MyException"); 
	// public MyException (String message) 	<== message가 이 쪽으로 들어감, Stirng 을 받는 예외일경우 e.getMessage() 경우 출력
		//super(message);

	
	// 2. 런타임 예외 객체
	MyRTException mre1 = new MyRTException();	//기본생성자 호출
	// 예외 발생시 예외 메세지 출력하는 생성자
	MyRTException mre2 = new MyRTException("예외 메세지 : MyRTException");
	
	// (1) 예외를 강제로 발생시키기(throw) : 
	void abc_1(int num) {
		try {
			if (num > 70) {
				System.out.println("정상작동");
			}else {
				throw me1;		//예외를 강제로 발생시킴
			}
		} catch (MyException e) {  //me1에 throw를 사용해서 강제로 예외를 발생시킴.
			System.out.println("70이하입니다. 70이상 값을 넣으세요");
			System.out.println(e.getMessage()); // 기본생성자에 찍으면 값이 안찍히고 String값이 있는 곳에서 찍으면 메세지가 찍힘
				//me1이 기본생성자라서 예외가 생길경우 e.getMessage()은 null값임
			
		}
	}
	
	void abc_12(int num) {
		try {
			if (num > 70) {
				System.out.println("정상작동");
			}else {
				throw me2;		//예외를 강제로 발생시킴
			}
		} catch (MyException e) {  //me2에 throw를 사용해서 강제로 예외를 발생시킴.
			System.out.println("70이하입니다. 70이상 값을 넣으세요");
			System.out.println(e.getMessage()); // 기본생성자에 찍으면 값이 안찍히고 String값이 있는 곳에서 찍으면 메세지가 찍힘
				// String 값으로 들어간 message를 String으로 받아서 에러가 발생됐을 떄 출력
		}
	}
	
	// (2) 예외를 전가  (throws) : abc_2()메서드를 호출하는 곳에서 예외처리를 해줘야 함
	void abc_2(int num) throws MyException {
		if (num > 70) {
			System.out.println("정상작동");
		}else {
			throw me1;	//throw는 강제 예외 발생
		}
	}
	
	void bcd_1() {
		abc_1(65); 	//예외 발생
	}
	
	void bcd_2() {	//abc_2()메서드를 호출하는 곳에서 예외처리를 해줘야 함
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("70이하입니다. 70이상 값을 넣으세요");
			System.out.println(e.getMessage());  // 기본생성자에 찍으면 값이 안찍히고 String값이 있는 곳에서 찍으면 메세지가 찍힘
		}
	}
	
	void bcd_3() {
		abc_12(65); 	//예외 발생
	}
	
}
public class CreateUserException_1 {
	public static void main(String[] args) {
		A a = new A();
		a.bcd_1();		// 예외를 직접 구현
		a.bcd_2();		// throws로 예외를 전가시켜서 호출하는 쪽에서 예외를 처리함.
		System.out.println("========");
		a.bcd_3();
		
		
	}
}
