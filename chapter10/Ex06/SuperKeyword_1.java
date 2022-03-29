package chapter10.Ex06;
// super : 부모클래스 (상속관계에서 부모)
// this : 자신의 객체

// 오버라이딩 : 부모의 메소드가 완전히 바뀐 것은 아님. super.을 통해 부모의 원래 메소드를 불러올 수 있다. 
class A{
	void abc() {
		System.out.println("Class A의 abc()");
	}
}
class B extends A{
	@Override
	void abc() {
		System.out.println("Class B의 abc()");
	}
	void bcd() {
		super.abc(); 	
		abc();			//this.abc //this는 자신의 객체
	}
}
public class SuperKeyword_1 {

	public static void main(String[] args) {
		//1. 객체생성
		B bb = new B();
		
		//2. 메소드 호출
		bb.bcd();  	//B클래스의 
	}

}
