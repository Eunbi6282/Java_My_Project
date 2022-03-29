package chapter06_07.Ex04;

/*
 * 1. this가 키워드로 사용되는 경우 : this.m (필드의 m), this.init() (자기 자신의 메소드)
 * 
 * 2. this가 메소드로 사용되는 경우 : 
 * this();  <== 생성자 내에서 다른 생성자를 호출할 때
 * 			<== 반드시 생성자 내부의 첫줄에 와야한다.
 * 			<== 메소드 내부에서는 사용할 수 없다. (생성자 내부에서만 사용 가능)
 * 
 * 
 * */
class Abc {
	Abc() {			//생성자의 매개변수 값이 없는 생성자
		System.out.println("첫번째 생성자 입니다.");
	}
	Abc(int a){
		this();		//매개 변수가 없는 생성자 호출, this(); 생성자의 첫라인에 와야 한다. 
		System.out.println("두 번째 생성자 입니다.");
	}
	/* 오류발생(메서드 내부에서 사용 불가능, 생성자 내부에서 사용 가능(첫라인에 위치 해야 한다.))
//	void abc() {
//		this();		//메소드 내에서는 this(); 를 사용할 수 없다. 
					//
//	}
 * 
*/	
	Abc (int a, String b){
		this(30);		//this(30) :매개변수가 정수1개가 들어가는 생성자를 호출
		System.out.println("세번째 생성자입니다.");
	}
}
public class ThisMethod_1 {
	public static void main(String[] args) {
		Abc abc = new Abc();		//매개변수가 없는 생성자 호출
		System.out.println("==============================");
		
		Abc abc2 = new Abc(10);		// 매개변수가 정수 1개인 생성자를 호출, 
		System.out.println("===============================");
		
		Abc abc3 = new Abc(6, "집에 가고싶다");
	}

}
