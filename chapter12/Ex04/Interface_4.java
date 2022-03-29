package chapter12.Ex04;

// 인터페이스 상속시 자식클래스 접근 지정자 오류  <<중요>>
interface A {
	public abstract void abc();
}

interface B{
	void abc();
}
class C implements A{
	public void abc() {  	//A 인터페이스의 abc()를 오버라이딩해서 구현한 메소드
					// 자식은 부모보다 접근지정자가 같거나 더 넓어야 한다. 
	}
}
class D implements B{
	public void abc() {  	//인터페이스의 메소드를 구현할 때는 반드시 public넣기
	}
}
//class E implements B{
//
//	@Override
//	void abc() {				=>public -> default 불가능
//	} 
class F implements A{ //F클래스는 완성된 메소가 구현되어 있어야 한다.
	@Override
	public void abc() {
	}
}	
public class Interface_4 {
	public static void main(String[] args) {

	}
}
