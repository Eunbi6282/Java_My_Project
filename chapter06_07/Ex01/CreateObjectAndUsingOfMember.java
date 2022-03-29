package chapter06_07.Ex01;

//클래스(class) : 객체를 생성하기 위한 틀(템플릿), 설계도 (붕어빵의 틀)
//객체(Object) : 클래스를 복사해서 메모리에서 작동되는 실행코드 (집, 붕어빵)/ 클래스를 메모리에 올려둠
	//객체 = 인스턴스
	//인스턴스화 (객체화) 시킨다. (메인 메소드에서 객체를 인스턴스화 시켜 줘야 한다.)
	// A a = new A();  <== 클래스를 객체화 시켜서 메모리에 로드





class A {				//외부 클래스
	int m = 3;			// m : 필드(변수) -> 클래스에서 선언된 변수(heap영역에 저장됨)
						// 필드는 인스턴스화(객체) 시켜야 사용이 가능
	
	
	void print() {		// 메소드 : 절차지향언어의 함수, 객체지향언어에서 함수를 메소드라고 호칭함
						// 메소드는 인스턴스화(객체) 시켜야 사용이 가능
		System.out.println("객체 생성 및 활용");
	}
}

class B {				//외부 클래스
	String name = "박은비";
	int age = 25;
	String phone = "010-2055-6282";
	
	void printName () {
		System.out.println(name);
	}
	void printAge(){
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
}



public class CreateObjectAndUsingOfMember {
	public static void main(String[] args) {	//객체화 -> main 메소드 안에서 시키기
		
	A a = new A();			//Class A를 객체화(인스턴스화)시킨다. (메모리에 로드시킨다.)
	System.out.println(a.m);
	a.print();
	
	System.out.println("===============================");
		
	A b = new A();		//Class A를 객체화(인스턴스화) 시켜서 메모리에 로드
	System.out.println(b.m);
	b.print();
	
	A c = new A();
	System.out.println(c.m);
	c.print();
	
	//A 를 기준으로 a,b,c라는 객체를 만들었음/ 하나의 class로 여러개의 객체 만들기 가능
	
	System.out.println("===============================");
	
	B bb = new B();		//B class 를 bb라는 이름으로 객체화 시킨다. 
	bb.printAge();		//bb객체의 메소드를 호출
	bb.printName();		//bb객체의 메소드를 호출
	bb.printPhone();	//bb객체의 메소드를 호출
	
	B ccB = new B();
	ccB.printAge();
	ccB.printName();
	ccB.printPhone();
	
	
	
	
	
	
	}
}
