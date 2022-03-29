package chapter13.Ex09;

// 매개변수로 받아서 처리 : 인터 페이스를 구현한 클래스가 (X), 
// 4. 자식 클래스가 존재하지 않는다. 

interface A{
	void abc();		//public abstract
}
class C{
	void cde(A a) {
		a.abc();
	}
}
public class AnonymousClass_4 {

	public static void main(String[] args) {
		C c = new C();
		
		// 3. 클래스(인터페이스를 구현한 클래스) X, 참조변수 생성(O)
		A a = new A() {		//인터페이스를 구현한 자식 익명 객체생성 후 타입을 A로 지정한 참조변수 생성
			@Override
			public void abc() {
				System.out.println("클래스(X), 참조변수(O)");
			}
		};	
		c.cde(a); 		//참조변수를 매개변수로 전달 
		
		// 4. 클래스(인터페이스를 구현한 클래스) X, 참조변수 생성(X) <==== 제일 많이 사용(임시로 한번만 사용할 때)
			// 이벤트 처리시 사용
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("클래스(X), 참조변수(X)");
			}
		});
	}

}
