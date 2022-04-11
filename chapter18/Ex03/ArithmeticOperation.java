package chapter18.Ex03;

import java.util.Scanner;

// 1. 스캐너를 사용해서 double의 두 수를 인풋받습니다.
// 2. (1) 람다식사용해서 인풋받은 두 값을 + ,- ,* ,/ (사칙연산) 구현해서 출력
//	  (2) 인터페이스를 구현한 자식객체를 사용해서 인풋받은 두 값을 + ,- ,* ,/ (사칙연산) 구현해서 출력
//	  (3) 익명 이너클래스를 사용해서 인풋받은 두 값을 + ,- ,* ,/ (사칙연산) 구현해서 출력

@FunctionalInterface
interface Arithmetic{
	void arithmeticOpr(double a, double b);
}

class B_arithmetic implements Arithmetic{
	@Override
	public void arithmeticOpr(double a, double b) {
		System.out.println("<자식클래스> 두 수의 합은 : " + (a + b));
		System.out.println("<자식클래스> 두 수의 차는 : " + (a - b));
		System.out.println("<자식클래스> 두 수의 곱은 : " + (a * b));
		System.out.println("<자식클래스> 두 수의 나눈 값은 : " + (a / b));
	}
}


public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("double타입의 두 수를 입력하세요>>>");
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		
		// 1. 람다식 : 인터페이스의 추상 메서드를 익명클래스로 생성한 것의 약식표현
		Arithmetic arithmetic1 = (double a, double b) -> {System.out.println("<람다식> 두 수의 합은 : " + (a + b));};  //전체구문
		Arithmetic arithmetic2 = (double a, double b) -> {System.out.println("<람다식> 두 수의 차는 : " + (a - b));};
		Arithmetic arithmetic3 = (double a, double b) -> {System.out.println("<람다식> 두 수의 곱은 : " + (a * b));};
		Arithmetic arithmetic4 = (double a, double b) -> {System.out.println("<람다식> 두 수의 나눈 값은 : " + (a / b));};
		
		arithmetic1.arithmeticOpr(num1, num2);
		arithmetic2.arithmeticOpr(num1, num2);
		arithmetic3.arithmeticOpr(num1, num2);
		arithmetic4.arithmeticOpr(num1, num2);
		
		// 2. 인터페이스를 구현한 자식객체를 사용
		Arithmetic arithmetic11 = new B_arithmetic();
		
		arithmetic11.arithmeticOpr(num1, num2);
		
		// 3. 익명 자식 클래스를 사용
		Arithmetic arithmetic111 = new Arithmetic() {
			@Override
			public void arithmeticOpr(double a, double b) {
					System.out.println("<익명자식클래스> 두 수의 합은 : " + (a + b));
					System.out.println("<익명자식클래스> 두 수의 차는 : " + (a - b));
					System.out.println("<익명자식클래스> 두 수의 곱은 : " + (a * b));
					System.out.println("<익명자식클래스> 두 수를 나눈 값은 : " + (a /b));
			}
		};
		arithmetic111.arithmeticOpr(num1, num2);
	}
}