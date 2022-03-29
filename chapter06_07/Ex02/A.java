package chapter06_07.Ex02;

import java.lang.reflect.InaccessibleObjectException;

public class A {
	// 1. 리턴타입이 없는 메소드 : void 메소드명 (){ 실행코드 }
	 public void print() {
		System.out.println("안녕");
	}
	
	//2. 리턴 타입이 int 
	public int data() {
		return 3;
	}
	
	//3. 리턴 타입 double
	public double sum(int a, double b) {
		return a + b;
	}
	
	//4. 리턴 타입 void(없음) + 메소드 내부에서 return 포함하는 경우
		// : 함수의 종료를 의미
	public void printMethod (int m) {
		if (m < 0 || m > 12) {
			System.out.println("잘못된 입력 값입니다. 1 ~ 12 까지만 입력가능합니다. ");
			return; 	// 메소드를 종료한다는 의미
		}
		System.out.println(m + "월 입니다.");
	}
	
 }
