package chapter12.Ex01;

class AA {		//일반 클래스 : 객체 생성시 필드와 메소드는 heap메모리 영역에 저장
					// Heap : 반드시 초기화된 값을 가진다. 
						// 필드 : heap에 필드명과 값
						// 인스턴스 메소드 : class영역의 인스턴스 메소드 영역에 메소드의 구현코드까지 저장
							// heap에는 포인터 정보만 가진다. 
	
	int a;
	double b;
	char c;
	boolean d;
	byte e;
	float f;
	String g;
	
	void cry() {}	//완전한 메소드
	@Override
		public String toString() {
			return a + " , " + b + " , " + c + " , " + d + " , " + e +" , " + g;
		}
}

/* 
	  1. 추상 클래스를 객체화 해서 출력하는 방법1 -> 많은 객체 생성시 사용(계속 사용할 경우)
	  상속을 통해서 자식 클래스를 생성 후, 자식 클래스에서 추상 메소드를 재정의하고 , 자식 클래스를 객체로 생성후 출력
  
   	  2. 추상 클래스를 객체화 해서 출력하는 방법2 -> 임시로 한번만 사용할 때 자식없이 임시로 사용할 경우
   	  자식 클래스 생성없이 main메소드에서 익명 개체를 생성해서 출력하는 방법
   		//이벤트 처리할 때(임시)
  
 */

abstract class A{		//추상클래스 : 미완성 메소드를 포함하므로 객체 생성이 불가함
	
	abstract void abc();		// 추상메소드 : 미완성 메소드(구현부가 존재하지 않는 메소드)
}

class B extends A{ 	//추상 클래스를 구현한 객체 : 빈번하게 사용할 경우

	@Override
	void abc() {
		System.out.println("방법1 : 자식클래스 생성 및 추상 클래스 구현");
		
	} 	
	
}
public class AbstractClass_1 {

	public static void main(String[] args) {
		//1. AA클래스는 객체화가 가능
		AA aa = new AA();	//필드 : 초기화, 일반 메소드(구현부가 존재하는 메소드)
		System.out.println(aa);	//객체를 생성하려면 heap공간에 값이 반드시 들어가 있어야 한다. 
		
		//2. 추상 메소드는 객체 생성 불가 : 메솓가 미완성 메소드이기 때문에 객체 생성 불가
		//A a= new A(); 		//객체 생성 불가, 추상메소드를 포함하고 있기 때문에
		
		//3. 추상 클래스가 구현된 자식클래스 생성 , 객체를 여러개 생성할 때
		A a1  = new B(); 	//자식 클래스 생성, 부모타입
		A a2 = new B();
		A a3 = new B();
		
		//4 . 만들어진 객체의 메소드 호출
		a1.abc();	//A의 abc()호출 ==> 오버라이딩 통해 B의 abc()작동
		a2.abc();
		a3.abc();
		
		
		
	}

}
