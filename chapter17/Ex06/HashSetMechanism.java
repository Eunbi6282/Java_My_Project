package chapter17.Ex06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// Set : 중복된 값을 넣을 수 없다. 
	// equals() , hashCode() 메서드가 정의되어 있어야 한다. 
	// String, Integer 클래스들은 equals() 메서드와 hashCode()가 재정의 되어 있다.
	// 특정 객체를 Set에 저장할 경우 중복 저장을 하지 못하도록 하기 위해서는 equals() 와 hashCode()메서드를 재정의 해야 한다. 
	// Object클래스의 equals() 와 hashCode() 
		// Object 클래스의 equals()메서드는 == 과 같다. 
			// == 은 Stack 메모리의 값을 비교
 
//equals(), hashCode() 메서드가 재정의 되지 않은 상태
class A{
	int data;
	public A(int data) {
		this.data = data;
	}
}

// equals()만 재정의, hashCode 재정의 x
class B{
	int data;   	// 두개의 객체가 data필드의 값이 같을 때 , 동일하다라고 식별자를 넣어주어야 함
						// equals(), hashCode()
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { // 객체의 주소를 비교하는 것이 아니라 객체의 내부의 특정 필드의 값을 비교
		
		if(obj instanceof B) { //obj에 b타입을 내포하고 있을 떄만 다운 캐스팅
			
			if(this.data == ((B)obj).data) // 객체안의 data field가 같은지 비교// 주의 : 잘못 다운캐스팅을 할 경우 : 얘외가 바랭함
			 return true;
		}
		return false;
	}
}

//equals()재정의 O, hashCode() 재정의 O
class C{
	int data;   	// 두개의 객체가 data필드의 값이 같을 때 , 동일하다라고 식별자를 넣어주어야 함
						// equals(), hashCode()
	public C(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { // 객체의 주소를 비교하는 것이 아니라 객체의 내부의 특정 필드의 값을 비교
		
		if(obj instanceof C) { //obj에 b타입을 내포하고 있을 떄만 다운 캐스팅
			
			if(this.data == ((C)obj).data) // 객체안의 data field가 같은지 비교// 주의 : 잘못 다운캐스팅을 할 경우 : 얘외가 바랭함
			 return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {		//Objects.hash(필드명, 필드명, 필드명) <= 여러개의 필드의 해시코드를 같게 설정할 수 있다. 
		//return Objects.hash(data);
		
		return data; 		//data필드의 값이 같으면 hashCode를 동일하게 생성.
	}
}

public class HashSetMechanism {
	public static void main(String[] args) {
		
		// 1. equals(), hashCode() 메서드가 재정의 되지 않은 상태
		Set<A> hashSet1 = new HashSet<>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2); //false
		
			// == : 스택(stack)메모리의 값을 비교
		System.out.println(a1); 	//객체명을 출력 : 패키지명.클래스명@힙메모리주소의 해쉬코드(16진수)
		System.out.println(a2);
		
		System.out.println(a1.equals(a2)); //false
			// 재정의안한 equals()< -Object의 equals() 는 ==와 같다. 
		
		System.out.println(a1.hashCode() + " , " + a2.hashCode()); // 해쉬코드 출력 (10진수)
		
		hashSet1.add(a1);  //Set은 중복된 값을 넣지 못한다. 
		hashSet1.add(a2);
		
		System.out.println(hashSet1.size()); // 2출력 => equals()와 hashCode()메서드가 재정의 되어있지 않다. 
		
		// 2. equals()재정의 (객체의 data필드의 값을 비교), hashCode()메서드가 재정의 되지 않은 상태
		Set<B> hashSet2 = new HashSet<B>();
		// Set안엔느 B객체만 가능
		
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2);  //Stack 메모리의 값을 비교(각각다른 공간에 위치해 다른 위치값을 가지고 있음) -> false
		System.out.println(b1.equals(b2)); // 매개변수로 b2던져줌 
			//if(obj instanceof B) { 
			//		if(this.data == ((B)obj).data) 
			//		 return true;
			//	}
			//	return false;
 		// -> equals는 값을 비교하도록 재정의 해둠 -> true
		
		hashSet2.add(b1);
		hashSet2.add(b2);
		
		System.out.println(hashSet2.size());  	//equals()만 재정의 -> 2(두 값이 동일하지 않음을 의미)
		System.out.println(b1.hashCode() + " , " + b2.hashCode());
		
		// 3. equals(), hashCode() 모두 재정의 
		Set<C> hashSet3 = new HashSet<C>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1 == c2); // false -> 스택의 주소값 비교
		System.out.println(c1.equals(c2)); // true -> 객체의 data필드의 값을 비교하도록 재정의 되어있음
		System.out.println(c1.hashCode() + " , " + c2.hashCode());
			//두 객체는 동일한 객체
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size()); // 1개만 입력됨 -> 두 값이 동일함을 의미(equals()와 hashCode()가 정의되었기 때문)
		
		
		
	}

}
