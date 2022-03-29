package chapter14.Ex03;

public class MutiCatch_2 {

	public static void main(String[] args) {
		
		// 1. Exception에서 모든 에외를 처리할 수 있다.
			//모든 예외는 Exception을 상속받기 때문에
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		} catch (Exception e) {
			//try{}블락에서 발생하는 모든 예외는 Exception클래스가 모두 처리
			System.out.println("예외 처리 (Exception)");
		}
		System.out.println("프로그램 종료");
		
		//2. catch 블락의 순서가 잘못된 경우
		/*
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		} catch (Exception e) {
			//try{}블락에서 발생하는 모든 예외는 Exception클래스가 모두 처리
				//Exception이 가장 먼저오면 안됨
			System.out.println("예외 처리 (Exception)");
		} catch (ArithmeticException e) {
		}catch (NumberFormatException e) {
		}
		*/
		
		//3. catch 블락의 올바른 순서 : 최상위 클래스는 catch블락의 마지막에 위치
				//세부적인 Exception들이 먼저 오도록
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		}catch (ArithmeticException e) { 	//최하위의 Exception3333333
			
		}catch (NumberFormatException e) {
		}catch (Exception e) {
			//Exception이 마지막으로 와서 처리하도록 위치시킴
		System.out.println("예외 처리 (Exception)");
		}
		
		//4. 여러개의 exception을 통합해서 적용
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		}catch (ArithmeticException | NumberFormatException e) { 	//최하위의 Exception3333333
			//여러개의 exception을 통합
		}catch (Exception e) {	
			
		}
		System.out.println("프로그램 종료");
	}

}
