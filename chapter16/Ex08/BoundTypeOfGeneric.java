package chapter16.Ex08;

class A{}
class B extends A{}
class C extends B{}

//제너릭 타입의 클래스 : 제너릭 타입에 들어오는 객체를 제한, <> 외부에서 들어오는 타입을 지정
class D <T extends B> {		// T : classB, classC만 올 수 있다.
							// <T extends B> 의미 : T라는 타입에 접근을 제한
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}

public class BoundTypeOfGeneric {

	public static void main(String[] args) {
		
		// D<A> d1 = new D<A>(); 오류 -> <T>에 들어갈 객체를 제한을 둠, B클래스, C클래스만 들어갈 수 있음
		
		D <B> d2 = new D<B>(); //B,C를 타입으로 설정 가능
		
		D<C>d3 = new D<C>(); // C타입만 가능
		
		D d4 = new D(); 	// = D(B),D(C)  //타입을 지정하지 않고 객체를 만들면 최상위 타입으로 설정됨
							// = D <B> d2 = new D<B>();
		
		d2.set(new B()); 	// B객체 저장
		d2.set(new C());	// C객체 저장
		// d2.set(new A()); -> 오류
		
		//d3은 C타입만 넣을 수 있다.
		//d3.set(new B());
		d3.set(new C());
		//d3.set(new A());
		
		// d4.set(new A());
		d4.set(new B());
		d4.set(new C());
	}

}
