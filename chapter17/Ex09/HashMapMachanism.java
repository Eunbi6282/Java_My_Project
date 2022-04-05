package chapter17.Ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


// Map : Key는 중복되지 않아야 함 -> equals(), hashCode() 재정의 시켜줘야 함
	// Value는 중복되어도 됨.

//equals(), hashCode()를 재정의 하지 않는 클래스
class A{
	int data;
	public A(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return data + " "; // 리턴타입이 String이어서 공백 넣어주면 String으로 바뀜
	}
}

//equals()만 재정의한 클래스
class B{
	int data;
	public B(int data) {
		this.data = data;
	}
	
	@Override  // 객체의 필드(data필드)의 값을 비교해서 같으면 같은 값이다. 
	public boolean equals(Object obj) {
		if(obj instanceof B) { //obj가 B타입을 내포할 때
			if (this.data == ((B)obj).data){ // obj는 Object타입으로 들어오는 값의 data를 비교하려면 B타입으로 다운캐스팅해야 한다. ) 
			return true;
			}
		}
			return false;
	}
	
	@Override
	public String toString() {
		return data + " "; // 리턴타입이 String이어서 공백 넣어주면 String으로 바뀜
	}
	
}
//equals(), hachCode()를 재정의한 클래스 => Map의 Key로 사용할 수 있다. 
class C{
	int data;
	public C(int data) {
		this.data = data;
	}
	
	@Override  // 객체의 필드의 값을 비교해서 같으면 같은 값이다. 
	public boolean equals(Object obj) {
		if(obj instanceof C) { //obj가 B타입을 내포할 때
			if (this.data == ((C)obj).data){ // obj는 Object타입으로 들어오는 값의 data를 비교하려면 B타입으로 다운캐스팅해야 한다. ) 
			return true;
			}
		}
			return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data); // 권장 방법
	}
	@Override
	public String toString() {
		return data + " "; // 리턴타입이 String이어서 공백 넣어주면 String으로 바뀜
	}
}

public class HashMapMachanism {
	public static void main(String[] args) {
		
		// 1. 두 메서드 모두 오버라이딩 하지 않은 경우 , 두 객체 모두 Map의 Key로 등록된다. (같은 값이 아님)
		Map<A, String> hashMap1 = new HashMap<>();
		A a1 = new A(3); 
		A a2 = new A(3);
		System.out.println(a1 == a2); //false , stack비교
		System.out.println(a1.equals(a2)); //false -> 오버라이딩 안되어있기 때문에
		
		hashMap1.put(a1, "첫번째");
		hashMap1.put(a2, "두번째");
		
		System.out.println(hashMap1.size());
		System.out.println(hashMap1); //hashCode()오버라이딩 안했기 때문에 다른 주소값을 가지고 있음
		
		// 2. equals()만 오버라이딩 한 B클래스
		Map<B, String> hasMap2 = new HashMap<B, String>();
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1 == b2); // false
		System.out.println(b1.equals(b2)); //true -> 재정의해둠(data필드의 값이 같으면 true)
		
		hasMap2.put(b1, "첫번째");
		hasMap2.put(b2, "두번째");
		System.out.println(hasMap2.size()); // 2 -> hashCode()오버라이딩 안했기 때문에 각자의 객체로 인식
		System.out.println(hasMap2); //hashCode()오버라이딩 안했기 때문에 다른 주소값을 가지고 있음
		
		System.out.println("=======================");
		
		// 3. 두개 다 오버라이딩 된 경우(equals(), hashCode())
		Map<C, String> hashMap3 = new HashMap<>();
		C c1= new C(3);
		C c2 = new C(3);
		
		System.out.println(c1 == c2); //false  -> stack에 저장도니 값은 다름
		System.out.println(c1.equals(c2)); //true
		hashMap3.put(c1, "첫번째");
		hashMap3.put(c2, "두번째");
		System.out.println(c1.hashCode() + " , " + c2.hashCode()); //두 hashCode가 같다!! , // 34 -> 10진법 출력
		System.out.println(hashMap3.size()); // 1
		System.out.println(hashMap3); //22 -> 16진수 표시
		
		
		
		
	}

}
