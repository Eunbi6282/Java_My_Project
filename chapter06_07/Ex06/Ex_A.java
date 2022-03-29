package chapter06_07.Ex06;


public class Ex_A {

	public static void main(String[] args) {
		
		//다른 패키지의 객체를 사용하는 방법 :
		// 1. 전체 클래스 이름을 사용하는 방법
		 
		chapter06_07.Ex05.A a = new chapter06_07.Ex05.A();		//풀네임(패키지명.클래스명)사용
		
		//a.a= 10;	//접근 불가 : default는 다른 패키지의 클래스에서는 접근 불가
		a.k = 50;	//public
		a.print2(); //public : 다른 패키지 접근 가능
		
		
		
	}

}
