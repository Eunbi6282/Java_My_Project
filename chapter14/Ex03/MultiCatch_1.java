package chapter14.Ex03;

//여러 개의 Exception이 동시에 발생될 경우
public class MultiCatch_1 {

	public static void main(String[] args) {
		
		// 1.단일 Exception처리 try catch 처리
		
		// ArithmeticException
		try {
			System.out.println(10 / 0);
			
		} catch (ArithmeticException e) {
			// catch블락에 아무 내용이 없어도 예외 처리
			System.out.println("정상출력(ArithmeticException)");
		}
		
		// NumberFormatException
		try {
			
			int num = Integer.parseInt("10A"); //문자열은 정수타입 불가
		} catch (NumberFormatException e) {
			System.out.println("정상 출력(NumberFormatException)");
		}
		
		
		// 2. 다중 Exception 처리
		try {
			System.out.println(10/0);
			int num2 = Integer.parseInt("10A");
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic 출력");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("NumberFormat 출력");
		} 
		
		// 3. 다중 Exception 처리2
		try {
			
			System.out.println(10/0);
			int num3 = Integer.parseInt("10A");
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("다중 예외 처리");
		}
		
		
		System.out.println("프로그램 종료");
	}

}
