package chapter10.Ex07.Ex01;

//Object클래스의 toString 메소드 : 객체를 출력할 때 Object toString()호출
	//toString() : 패키지명.클래스명@해쉬코드 
	// 해쉬 코드 : 객체가 가르키고 있는 힙메모리의 번지를 해쉬코드로 변환
	// 재정의해서 사용 : 객체의 정보를 출력,(필드값 , 메소드 호출)

class A{
	int m = 3;
	int n = 4;
}
class B{	//extends Object (생략)
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {		//b객체를 찍으면 출력됨
		return "a : " + a + " , b : " + b;
	}
}

public class ObjectMethod_toString {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);	//패키지명.클래스명.해쉬코드, chapter10.Ex07.Ex01.A@32d2fa64(16진수)
		System.out.println(a.toString());
		System.out.printf("%x\n" , a.hashCode());	//객체의 해쉬코드만
		// %x\n -> 16진수로 출력
		//printf("<인자>", );
		System.out.println(a.hashCode());  //10진수로 출력됨
		
		B b= new B();
		System.out.println(b);
	}

}
