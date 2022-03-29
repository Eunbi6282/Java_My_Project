package chapter10.Ex05;
class A{
	A (){} 	//기본생성자 : 클래스내의 다른 생성자가 존재하지 않을 경우 생략가능 
	//인스턴스 메소드 오버라이딩 : 상속관계에서 메소드 오버라이딩은 인스턴스 메소드만 오버라이딩된다.
		// 상속관계에서 인스턴스 필드, stack 필드, static 메소드는 오버라이딩 되지 않습니다. 
		// 오버라이딩 할 때는 시그니처가 같아야 헌다. 리턴타입, 메소드명, 매개변수타입, 매개변수 개수
	void print() {
		System.out.println("Class A 출력");
	}
}

class B extends A{
	@Override
	void print() {
		System.out.println("Class B 출력");
	}
}

class C extends A{
	@Override
	void print() {
		System.out.println("Class C 출력");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		//1. A 타입, A 생성자
		A a = new A();
		a.print();
		
		//2. B타입, B생성자
		B b = new B();
		b.print();
		
		//3. C타입, C생성자
		C c = new C();
		c.print();
		
		System.out.println("==================");
		//4. A타입, B생성자(오버라이딩 적용됨)	
			//클래스 A의 print()호출 시 B의 print() 출력됨
		A ab = new B();
		ab.print(); 	//A의 print()호출 , but 오버라이딩되어 B의 print()가 출력
		
		A ac = new C();
		ac.print();
		
		A[] arr = {ab,ac};	//배열에 A타입의 객체를 저장
		
		for(int i = 0 ; i <arr.length; i++) {
			arr[i].print();
		}	
		System.out.println("====enhacrd pointer");
		for (A a2 : arr) {
			
		}
		
		
	}

}
