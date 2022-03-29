package chapter14.Ex08;

// 메서드에 throws를 전가, 전가, 전가해서 main 메서드까지 전가시킴
	// main() 까지 예외가 전가 된 경우 예외의 결과창을 띄우고 프로그램 종료
	//main()는 예외처리 하지 않는다.
class AA{
	public void abc() throws NumberFormatException{
		bcd();
	}
	public void bcd() throws NumberFormatException{
		cde();
	}
	public void cde() throws NumberFormatException{
		int num = Integer.parseInt("10A");		//Exception발생 -> NumberFormatException
	}
	
	
}
public class ExceptionMethod {
	public static void main(String[] args) throws NumberFormatException{
		// 1. 객체 생성
		AA aa = new AA();
		
		// 2. 메서드 호출
		// aa.abc();	//실행예외(컴파일단계에선 오류X, 실행했을 때 오류생김)
		//예외 처리를 미루고 미루다가 main()까지 옴
		
		//예외 처리 구문
//		try {
//			aa.abc();
//		} catch (NumberFormatException e) {
//			System.out.println("예외 발생");
//		}
		System.out.println("프로그램 종료");
		
		
		// public static void main(String[] args) throws NumberFormatException{ -> 메인메서드로도 미룰 수 있음 (예외 발생)
		aa.abc();
		
	}

}
