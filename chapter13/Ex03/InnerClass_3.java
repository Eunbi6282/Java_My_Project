package chapter13.Ex03;


// static 이너클래스 : 외부 클래스의 인스턴스 필드, 인스턴스 메서드는 접근이 불가
	// 외부 클래스의 static 필드나 static메서드는 접근 가능

class A{
	int a = 3;		//인스턴스 필드, 객체화 해야 접근 가능
	static int b = 4;	// static필드, 객체 생성없이 클래스 이름으로 접근 가능, 객체 생성도 가능
	void method1() {	//인스턴스 메소드, 객체 생성 후 접근 가능
		System.out.println("인스턴스 메소드");
	}
	static void method2() {	//static 메소드, 객체 생성하지 않고 접근, 객체 생성후 접근 
		System.out.println("static 메소드");
	}
	static class B{
		void bcd() {
			// 1. static 클래스에서 외부 클래스의 인스턴스 필드 접근 (접근 불가)
			//System.out.println(a); //외부 클래스의 인ㅅ터스필드
			System.out.println(b); 	// static 이너 클래서에서 외부클래스의 static 필드나 메소드 접근 가능
			
			// 2. 메소드호출 
			//method1(); 	//인스턴스 메서드 호출 불가
			method2();	// static 메서드 호출 가능
		}
	}
}
public class InnerClass_3 {

	public static void main(String[] args) {
		// 1. Static 이너 클래스 객체 생성
		A.B b = new A.B();	//static 이너 클래스는 외부 객체 생성없이 객체 생성
		b.bcd();
		System.out.println();
		A.method2();	//static메서드 호출
		

	}

}
