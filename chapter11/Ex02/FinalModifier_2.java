package chapter11.Ex02;

//final 메서드와 final class의 특징
	//final 메서드 : 오버라이딩 불가 (아주 중요한 메서드는 자식에서 재정의 하지 못하도록 설정)
	//final 클래스 : 상속이 불가한 클래스
class A{
	void abc() {}
	final void bcd() {} //final이 할당된 멤서드는 자식 클래스에서 오버라이딩이 불가
}
class B extends A{
	void abc() {}	//메소드 오버라이딩 : 부모의 메서드 기능을 자식에서 새롭게 기능 구현 가능
	//void bcd() {}  -> 메소드 오버라이딩 불가능
}
final class c{}
// class D extends C{}	-> C가 final class이므로 상속불가

public class FinalModifier_2 {

	public static void main(String[] args) {

	}

}
