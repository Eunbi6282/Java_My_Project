package chapter10.Ex07.Ex02;
class A{
	String nameString;
	A (String nameString){
		this.nameString = nameString;
	}
}
class B{
	String nameString;
	B (String nameString){
		this.nameString = nameString;
	}
	@Override		//b1.equals(b2) 
	public boolean equals(Object obj) {		//객체를 매개변수로 넣을 때 object타입으로 자동으로 업캐스팅
		if (this.nameString == ((B)obj).nameString) {	//B타입으로 다운캐스팅 후 각 객체의 name필드의 값을 비교.
			return true;
		}else {
			return false;
		}
	}
}
public class ObjectMethod_equals {

	public static void main(String[] args) {
		// 1. 객체 생성
		A a1 = new A("안녕");
		A a2 = new A("안녕");
		
		/* 두 객체 비교 ( == , equals() )
			 ==  : 기본타입일 경우 값을 비교해서 true,false를 리턴
			 	 : 참조 타입일 경우 객체의 번지를 비교
			 equals() : 기본적으로 object클래스의 equlas()객체의 번지를 비교 ( =)
			 	객체 내부의 특정 필드의 값을 비교하기 위해 재정의해서 사용한다.
	 	*/
		System.out.println(a1);
		System.out.println(a2); 
		
		System.out.println(a1 == a2);	//false -> 참조 타입일 경우 객체의 번지를 비교 
		System.out.println(a1.equals(a2));
		
		System.out.println("=====================================");
		B b1 = new B("안녕");
		B b2 = new B("안녕");
		
		System.out.println(b1 == b2); 	//false
		System.out.println(b1.equals(b2)); 	//true -> equals()를 재정의 하면서 name 필드의 값을 비교.
		
		
		
	}

}
