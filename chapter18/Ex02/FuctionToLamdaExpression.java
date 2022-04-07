package chapter18.Ex02;

// 람다식 문법 
// 아래 4개의 인터페이스는 람다식으로 처리 가능 :함수형 인터페이스이기 때문

@FunctionalInterface	//함수형 인터페이스라고 선언(메서드 1개만 올 수 있음)
interface A{  	//입력X, 리턴X
	void method1();
}

@FunctionalInterface	//함수형 인터페이스라고 선언(메서드 1개만 올 수 있음)
interface B{ 	// 입력O, 리턴X
	void method2(int a);
}

@FunctionalInterface
interface C{	// 입력X, 리턴O
	int method3();
}

@FunctionalInterface
interface D{	// 입력O, 리턴O
	double method4(int a , int b);
}

public class FuctionToLamdaExpression {
	public static void main(String[] args) {
		
		// 인터페이스의 함수구현 --> 람다식
		// 1. 입력X, 리턴X
			// (1) 익명 이너클래스
			A a1 = new A() {
				@Override
				public void method1() {
					System.out.println("메서드1_1 - 익명 이너클래스");
				}
			};
			a1.method1();
			
			//	(2) 람다식
				// 람다식은 리턴타입, 메서드 명이 제거됨
				// (인풋) -> {구현부};
			A a2 = () -> {System.out.println("메서드1_2 - 람다식");};  // 람다식의 축약되지 않은 전체 구문
			A a3 = () -> System.out.println("메서드1_3 - 람다식");  // 구현부에 한 라인만 있을 때 중괄호 생략 가능
			a2.method1();
			a3.method1();
			
		// 2. 입력O, 리턴X
			//(1) 익명 이너클래스
			B b1 = new B() {
				public void method2(int a) {
					System.out.println("메서드2_1 - 익명 이너클래스 : " + a);
				};
			};
			b1.method2(0);
			
			// (2) 람다식
			B b2 = (int a) -> {System.out.println("메서드2_2 - 람다식 : " + a);}; //전체구문
			B b3 = (a) -> {System.out.println("메서드2_3 - 람다식 : " + a); }; //축약구문 -> 입력매개변수 타입 생략가능
			B b4 = (a) -> System.out.println("메서드2_4 - 람다식 : " + a);  //축약구문 -> 실행문이 한라인(; 하나일 때)일 때 중괄호 생략 가능
			B b5 = a -> System.out.println("메서드2_5 - 람다식 : " + a);  //축약구문 -> 입력매개변수가 하나일 때 소괄호 생략 가능
			b2.method2(1);
			b3.method2(5);
			b4.method2(6);
			b5.method2(7);
		
		
		
		

	}

}
