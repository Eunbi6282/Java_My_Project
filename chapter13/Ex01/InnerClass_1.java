package chapter13.Ex01;
	//이너클래스 (inner Class) : 클래스 내부의 클래스 
		// 1. 인스턴스 이너클래스 : static이 없는 내부 클래스 (객체화 필요)
				// 외부 객체를 먼저 생성후 자신의 객체 생성 후 사용 가능
		// 2. static 이너클래스(정적)이너클래스 : static이 있는 내부 클래스 
		// 3. 지역 이너클래스 : 클래스의 인스턴스 메소드 내부에 있는 클래스 

		/* 특징 : 1. Outer Class의 접근 제어자 제한 없이 접근
		 		 2. 다른 객체를 생성하지 않고, 객체의 필드나 접근을 빠르게 하기 위해 사용
		*/

		//클래스 파일 : A.class, A$B.class <= byte코드 (중간언어로 컴파일 된 파일)

class A {
	public int a = 3;		// 다른 패키지에서 접근 가능, 같은 패키지에서 접근가능
	protected int b = 4;	// 다른 패키지에서 접근 가능, 단 상속이 구현된 자식 클래스에서 가능, 같은 패키지에서 접근 가능
	int c = 5;				// 다른 패키지에서 접근 불가능, 같은 패키지에서 접근 가능
	private int  d = 6;		// 다른 패키지에서 접근 불가능, 같은 패키지에서도 접근 불가능, 같은 클래스에서만 가능
	void abc() {
		System.out.println("A클래스 메소드 abc()");
	}
	
	//이너클래스
	class B{	// 인스턴스 내부 클래스 : 외부 클래스가 객체화 되어야 사용 가능
		void bcd() {	//Outer Class의 필드 접근 가능여부 확인
			System.out.println(a);	//this.a
			System.out.println(b);	// this.b
			System.out.println(c);	// this.c
			System.out.println(d);
			abc(); //Outer Class의 메소드 접근 가능 여부
		}
	}
}
public class InnerClass_1 {

	public static void main(String[] args) {
		// 1. Outer Class 객체 생성 (1단계) - 이너클래스 사용하기 위해서 외부클래스 객체를 먼저 생성
		A a = new A();
		
		// 2. 내부 클래스 객체 생성 (2단계) 
		
		A.B ab = a.new B(); 	//A.b :외부 클래스.내부클래스 ab : 내부 클래스 인스턴스 변수
								// a.new B();	<=== 외부 인스턴스명.new 내부 클래스 생성자 호출
		
		// 3. 내부 클래스의 메소드 호출
		ab.bcd();
		

	}

}
