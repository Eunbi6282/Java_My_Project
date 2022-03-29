package chapter10.Ex02;

//다향성(Polymorphism) : 객체의 상속 관계에서 여러 데이터 타입으로 변환가능

class A{}
class B extends A{}
class C extends B{}
class D extends B{}


public class Polymorphism {
	public static void main(String[] args) {
		
		// 1. 업캐스팅 (자동으로 변환) : 생략시 컴파일러가 자동으로 추가
		A ac = new C();	// C -> A : C는 A이다. (C 객체를 만들면 A,B,C모두 상속받음  but 업캐스팅통해서 A만 접근가능)
		A ab = new B();	// B -> A : B는 A다.
		B bd = new D(); // D -> B : D는 B다. (D객체를 만들면 A,B,D모두 상속받음 but 업캐스팅통해서 A,B만 접근가능)
		C c = new C();	// C -> C : C는 C다.(C객체를 만들면 A,B,C모두 상속받음 but 업캐스팅통해서 A,B,C만 접근가능)
		
		// 2. 객체 생성을 할 수 없는 경우(상속)
		// B b = new A();  -> 오류 (부모 -> 자식 x)
//		C ccC = new B();
//		D dd1 = new B();
//		C cdC = new D(); 
		
		// 3. 다운 캐스팅 : 부모에서 자식 데이터 타입으로 변환(수동변환) : 캐스팅이 불가능하면 (실행시 오류 발생 : 런타임 오류)
				//다운 캐스팅이 불가능한 경우 : 다운 캐스팅 할 데이터 타입이 포함되어 있지 않는 경우
		A aa = new A();	//aa는 A타입만 내포하고 있다.
//		B b1 = (B)aa;	//aa(A타입)을 B타입으로 변환 <- 실행 시 오류
			//java.lang.ClassCastException : 다운캐스팅 시 객체 내의 해당 타입이 존재하지 않는 경우
//		C cc2 = (C) aa;	//aa(A타입)을 B타입으로 변환 <- 실행 시 오류, A안에 C가 없음
		
		//다운 캐스팅이 가능한 경우
		A ac3 = new C(); //C객체를 만들면 A,B,C상속 but A만 사용 가능(업캐스팅)
		B ac4 =(B) ac3;		// A -> B (다운캐스팅가능) , A,B사용 가능
		C ac5 = (C) ac3;	// A -> C (다운캐스팅 가능)
		
		A ad2 = new D();	//ad2는 A,B,D포함, A만 사용 가능
		B bb3 = (B) ad2; 	// 
		D dd4 = (D) ad2;
		
			
	}

}
