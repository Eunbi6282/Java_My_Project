package practice;

class A{
	int m = 8;
	
	void print() {
		System.out.println("객체 생성 및 활용");
	}
}

class B {
	int n;
	
	void method() {
		System.out.println("B의 메서드");
	}
}

public class Class {
	public static void main(String[] args) {
		//클래스로 객체 생성
		A a = new A();
		// A -> 클래스, a -> 참조 변수 , new -> 생성자의 결과물로 나온 객체를 힙메모리에 넣어줌 
		// A() -> 생성자(생성자의 이름은 클래스의 이름과 동일해야 함)
		
		//클래스 활용
		//@필드 활용 : 필드에 값을 읽기/쓰기
		a.m=7;
		System.out.println(a.m); //a -> 위치값 , a.m -> 힙메모리에 저장되ㅓ있는 값(해당 위치에 있는 객체 안을 보라)
		
		//@메서드 활용
		a.print();
		
		System.out.println("====연습문제 풀이 -> class B이용====");
		
		// 참조변수 bb를 선언하고 클래스 B의 객체를 생성
		B bb = new B();
		
		//객체 내부의 필드 n에 5값을 대입하시오
		bb.n = 5;
		System.out.println(bb.n);
		
		//메서드 method 호출
		bb.method();
		
		
	}
	
	

}
