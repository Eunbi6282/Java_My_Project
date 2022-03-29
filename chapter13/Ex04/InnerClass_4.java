package chapter13.Ex04;

// 지역 이너 클래스 : 클래스의 메서드 내부에 선언된 클래스
	// 메서드 내부의 필드는 final키가 생략됨. 값을 수정할 수 없다. 
	// 지역이너클래스에서 사용되는 지역변수는 자동으로 fianl로 선언된다. 생략시 컴파일러가 자동으로 할당해줌. 

class A{
	int a = 3;		//필드 : heap에 저장, 반드시 포기화 필요(초기화 강제 진행됨)
					// 필드의 초기값을 할당후에 값을 수정할 때는 객체화해서 수정해야 함
					// 생성자나 setter를 통해서 초기값을 할당후에 객체를 생성(가능)
	
	A(){}
	
	A(int a){		//생성자 통해서 a의 초기값 할당(가능)
		this.a = a;
	}
	public void setA(int a) {	//setter를 통해서 필드의 값을 초기화(가능)
		this.a =a;
	}
	
	void ccc() {	//지역변수 : 메서드 내부에 있는 변수(메모리의 스택 공간에 저장)
		int a = 3;	//지역변수 초기값 3
		a = 4;		// a 변수의 값을 4로 변경
		a= 10;		// a 변수의 값을 10으로 변경
		System.out.println(a);
		
		int b;
		// System.out.println(b); -> 오류 /b는 초기값을 할당하지 않아서 오류함
	}
	
	void abc() {
		int b = 3;	//지역변수 : 메서드 내부에 선언된 변수
					// 자동으로 final 키가 컴파일러에 의해서 자동으로 할당
		int c = 10;
		c= 20;
		
		
		class B{		//지역 이너 클래스(메서드 안에 있는 클래스)
			void bcd() {
				System.out.println(a);	// 필드
				System.out.println(b);	// 지역변수, final이 생략됨, 값수정 불가함
				a= 5;
				//b= 7;	//지역 클래스 내부에 선언된 지역변수는 자동으로 final키가 컴파일러에 의해서 할당됨
			}
		}
		
		B bb = new B();
		bb.bcd();
	}
}
public class InnerClass_4 {

	public static void main(String[] args) {
		// 1. 객체 생성 후 메서드 호출
		A a = new A();
		a.abc();
		System.out.println(a.a);
		
	}

}
