package chapter18.Ex01;

// 1. 자바는 객체 지향프로그램(OOP) : 모든 함수(메서드)는 객체 내부에 존재해야 한다. 함수는 클래스와 인터페이스 내부에 있을 수 있다. 
// 		람다식: 자바에서 함수형 프로그램이 가능하도록 지원해주는 하나의 기능. (함수형 인터페이스가 존재해야 함)
//			- 기존의 구현된 메서드를 재정의하는 것이 아니라 구현부가 없는 메서드에 람다식으로 기능을 부여해서 작동시키는 문법
//			- 람다식은 가능한 한 축약된 문법을 사용한다. (생략 가능한 것은 최대한 생략)
//			- 람다식은 자바에서 내부적으로 익명 클래스로 변환되어 처리된다. 
// 			- 람다식은 함수형 인터페이스에서 익명 클래스로 변환이 가능하다. 
//			- 람다식은 함수형 인터페이스의 구현된 익명클래스를 람다식으로 축약
//			- 함수형 인터페이스 : 인터페이스에 단 한개의 추상 클래스가 정의된 인터페이스
// 			- 자바는 새로운 함수 문법을 정의한 것이 아니라 이미 존재하는 인터페이스를 빌

@FunctionalInterface 	//@ : Annotation,  @FunctionalInterface : 함수형 인터페이스(추상메서드 1개)라고 선언함
interface A{ 		//함수형 인터페이스
	 void abc(); //모든 인터페이스의 메서드는 public abstract가 생략되어 있다. 
}

// 인터페이스에 정의된 메서드를 구현하는 방법  1 : 인터페이스의 메서드를 구현한 자식 클래스 생성
class B implements A{

	@Override
	public void abc() {		// 접근지정자가 반드시 public이 와야함
		System.out.println("메서드 내용1");
	}
}
public class OOP_VS_FP {
	public static void main(String[] args) {
	// 자바는 객체 지향 프로그램 이므로 모든 함수(메서드)는 클래스 내부에 있고 객체 생성후 호출이 가능하다. 객체 생성없이 바로 함수명으로 호출 불가
	// 1. 객체 지향 프로그램 문법 
		// (1) class를 생성해서 사용 : 모든 메서드는 객체 내부에 존재하며 객체를 생성후 호출이 가능
			A a1 = new B();
			a1.abc();  //오버라이딩 되어서 B의 abc()가 호출된다. 
			
		// (2) 익명이너 클래스 사용
			A a2 = new A() {	//인터페이스의 추상 메서드를 직접 구현한 클래스가 아닌 익명 이너 클래스를 사용해서 메서드 호출
				@Override
				public void abc() {
					System.out.println("메서드 내용2");
				}   
			}; 
			a2.abc(); //객체 생성 후 메서드 호출
			
	// 2. 람다식(함수적) 프로그래밍 문법(람다식)
			A a3 = () -> {System.out.println("메서드 내용3");};   //<== 람다식에 사용되는 인터페이스는 함수형 인터페이스여야 한다. 
			a3.abc();
			
			
			
	}

}
