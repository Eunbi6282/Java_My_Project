package chapter17.Ex06;

import java.util.HashSet;
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

// equals()만 재정의, hashcode 재정의 x
class B{
	int data;
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { // 객체의 주소를 비교하는 것이 아니라 객체의 내부의 특정 필드의 값을 비교
		
		if(obj instanceof B) { //obj에 b타입을 내포하고 있을 떄만 다운 캐스팅
			
		this.data = ((B)obj).data; // 주의 : 잘못 다운캐스팅을 할 경우 : 얘외가 바랭함
		return true;
		}
		return false;
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
		
		hashSet1.add(a1);
		hashSet1.add(a2);
		
		System.out.println(hashSet1.size()); // 2출력 => 
		
		
		
	}

}
