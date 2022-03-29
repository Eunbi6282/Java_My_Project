package chapter06_07.Ex05;
// 같은 패키지 내에서 class A접근

public class Ex_A {

	public static void main(String[] args) {
		// A class는 같은 패키지 내부에 존재하므로 import 없이 사용 가능
		
		A a = new A();		//import없이 사용 : A class가 같은 패키지 내에 존재
		
		//a.m = 10;		// 필드명에 private붙어서 다른 클래스에서 접근 불가
		//a.n = 20;
		
		a.print(); 		//default 접근 제어자이므로 접근 가능
		

	}

}
