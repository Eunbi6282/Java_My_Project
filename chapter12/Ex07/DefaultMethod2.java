package chapter12.Ex07;

interface A{
	default void abc() {		//인터페이스에서 구현부가 있는 메소드를 정의 -> default사용
		System.out.println("A인터페이스의 abc()");
	}
}
class B extends Object implements A{
	public void abc() {
		A.super.abc(); 	//super.abc는 Object 클래스의 abc()를 호출하라는 뜻임 
							//-> interface의 메소드를 사용하기 위해선 
								//부모인터페이스이름.super.디폴트메서드이름
		System.out.println("B클래스의 abc()");
	}
}

public class DefaultMethod2 {

	public static void main(String[] args) {
		// 1. 객체 생성
		B b = new B();
		
		// 2. 메소드 호출
		b.abc();	//B의 abc()를 호출하기 위해서 타입을 B로 둠
		
		System.out.println("================");
		A a1 = new B(); 	//인터페이스는 객체 생성 불가, 타입은 가능
		a1.abc(); 	//오버라이딩 되어서 A의 abc가 출력되는것이 아닌 B의 abc()가 출력됨
		

	}

}
