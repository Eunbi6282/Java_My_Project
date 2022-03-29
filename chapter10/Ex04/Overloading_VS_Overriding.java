package chapter10.Ex04;
//메소드 오버로딩(Method Overloading) vs 메소드 오버라이딩(Method Overriding)

import javax.sql.rowset.JoinRowSet;

import chapter06_07.Ex05.Bb;

/*
 * 	1. 메소드 오버로딩 : 동일한 메소드 이름으로 (매개변수 타입, 매개변수 수)에 따라 해당 메소드가 호출
 * 			--상속과는 관련x, 생성자에서 많이 사용
 * 
 *  2. 메소드 오버라이딩 : 반드시 상속 관계에서 사용
 *  		--부모의 메소드를 자식에서 새롭게 정의해서 사용
 *  		1) 상속관계, 2) 메소드의 시그니처(메소드명, 매개변수 개수, 매개변수 타입)가 같아야 한다.
 *  		3) 자식에서 부모의 접근 제한자와 같거나 더 넓은 범위여야 함
 */

class Ab{
	void print1() {			//Overriding
		System.out.println("Ab클래스의 print1()입니다.");
	}
	void print2() {			//Overloading
		System.out.println("Ab클래스의 print2()입니다.");
	}
}

class Bc extends Ab{
	@Override
//	void print1(int a){				-> 오류 : 시그니처가 같아야 함, 매개변수 개수 다름
//		System.out.println();
//	}
	void print1() {
		System.out.println("Bc클래스의 print1입니다.");
	}
	
	void print2(int a) {
		System.out.println("Bc클래스의 print2입니다.");
	}
	
}
public class Overloading_VS_Overriding {

	public static void main(String[] args) {
		// 1. Ab타입 선언
		Ab aaAb= new Ab();
		aaAb.print1();
		aaAb.print2();
		System.out.println("================");
		
		// 2.Bc 타입 선언, 생성자 호출 
		Bc bbBc = new Bc();
		bbBc.print1();		//Bc클래스의 print1을 호출
		bbBc.print2();		// Ab클래스의 print2() 호출 : 부모클래스의 메소드 호출
		bbBc.print2(7);		//Bc 클래스의 print2(7) 호출 : 자식 클래스의 메소드 호출
		System.out.println("================");
		
		// 3. Ab타입으로 선언 + Bc타입 생성자 호출
		Ab abcAb= new Bc();
		abcAb.print1(); 	//메소드 오버라이딩 ->동적 바인딩에 의해서 Bc의 print1()을 호출
		abcAb.print2(); 	//Ab클래스의 메소드만 호출이 가능
	}

}
