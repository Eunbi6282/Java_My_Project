package chapter16.Ex09;

// 제너릭 메서드의 범위지정 : 
class A{ 	// 일반 클래스 내의 제너릭 메서드
	
	//Number : Boolean, Character을 제외한 6개의 타입(Byte, Short, Integer, Long, Float, Double)
	public<T extends Number> void method1(T t) {
		System.out.println(t.intValue()); 	//Number타입의 메서드 (t에 들어오는 정수값을 출력해라) 		
	}
}

interface MyInterface{
	void print();	// public abstract 생략
}
class B{	// 제너릭 타입 내부에서 인터페이스를 적용할 때는 extends키를 사용한다. 
	public <T extends MyInterface> void method2(T t) {		
		//T에 타입이 올 수 있는 것 -> !!!!!!!!!!MyInteface를 구현한 클래스만 올 수 있다. !!!!!!!1
		t.print();
	}
}

class C implements MyInterface{		// 인터페이스를 구현한 클래스
	@Override
	public void print() {		// 하위 구현 클래스의 메서드 접근제어자는 부모의 접근제어자와 같거나 더 커야 한다. 
		System.out.println("인터페이스를 구현한 클래스 - 출력");
	}
}

class D {
	public <T extends String> void abc(T t) {
			// T는 String값만 들어올 수 있다. 
		System.out.println(t); 		// String은 toString()가 재정의 되어있음. 따로 toString()정의 안해도 됨.
											// => 객체만 찍어도 toString()이 적용되어 값이 출력 됨
		System.out.println(t.toString());  // = System.out.println(t);
		
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A a = new A();		// 일반클래스 객체 생성 후 재너릭 메서드 호출(재너릭 메서드는 일반 클래스 안에 있기 때문에)
		a.<Double>method1(5.8);
		a.method1(22.5); 	// 매개변수로 던지는 값이 타입을 식별할 수 있는 경우 생략가능
		a.<Long>method1(100000L); 	//Long
		a.<Float>method1(100.0004F);	//Float
		// a.<Boolean>method1(true); 오류 -> Boolean, Character는 Number 타입에 속해있지 않다.
		
		B b = new B();	// 일반클래스 객체 생성 후 제너릭 메서드 호출
		//b.<MyInterface> method2();	//method2에 매개변수로 올 수 있는 것은 인터페이스 타입,
			// but 객체화는 못시키므로 인터페이스를 구현한 자식클래스 사용 -> 익명 내부 클래스 사용
		
		// 방법1. 인터페이스를 구현한 내부 익명 클래스사용 => 가장 많이 사용
		b.<MyInterface> method2(new MyInterface() {

			@Override
			public void print() {
				System.out.println("print() 메서드 구현");
			}
		});
		
		// 방법2. 자식 클래스 C만들어서 사용
		b.<MyInterface> method2(new C()); //매개변수로 인터페이스를 구현한 자식객체 생성
		
		System.out.println("=====================================");
		
		// 익명 클래스로 제너릭 메서드 호출 후 매개변수로 던져주기 => 가장 많이 사용
		b.<MyInterface>method2(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("익명으로 처리된 클래스 - 출력");
			}
		});
		
		D d = new D();
		d.<String>abc("안녕");
		d.abc("하세요"); //매개변수로 던지는 값이 타입을 식별할 수 있는 경우 생략가능
		
		
		
		

	}

}
