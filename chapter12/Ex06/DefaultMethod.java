package chapter12.Ex06;

/*Interface의 default 메소드 : 인터페이스 내에서 구현부가 있는 메소드를 정의할 때 (public 생략되어있음)
  - 기존에 구현되어 있는 인터페이스에서 새로운 기능을 추가할 때 하위 클래스에서 재정의 필요없이 새로운 기능을 추가할 때
 
 * public default void bdc(){} 
	- 자바 1.8이상에서 새롭게 추가된 기능
	 default 키를 넣어야 한다. / 여기의 default는 접근 지정자가 아님!!!
*/


interface A{
	void abc();		//2005년에 생성한 메소드  , public abstract, 구현부가 없는 추상 메서드
	default void bcd() {	//2020년에 생성한 메소드
		System.out.println("A 인터페이스의 bcd()");
	}
	default void  ttt() {
		System.out.println("dd");
		}
	// void ttt(); -> 그냥 추상 클래스를 넣으면 오류남
}
class B implements A{		//2005년 생성된 클래스
	public void abc() {
		System.out.println("B클래스의 abc()");
	}
}
class C implements A{
	public void abc() {
		System.out.println("C클래스의 abc()");
	}
	public void bcd() {			//default메소드도 오버라이딩 할 수 있다. 
		System.out.println("C클래스의 bcd()");
	}
}

public class DefaultMethod {

	public static void main(String[] args) {
		//1. 객체 생성
		A a1 = new B();
		A a2 = new C();
		
		// 2. 메소드 호출
		a1.abc();	//B
		a1.bcd();
		
		a2.abc();
		a2.bcd();
		

	}

}
