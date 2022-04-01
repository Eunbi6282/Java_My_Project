package chapter16.Ex03;
// Object : 모든 객채를 저장할 수 있지만, 다운캐스팅이 필요하고 캐스팅 시 예외가 발생될 수 있다.(약한 타입 체크)
// 제너릭 클래스 : 하나의 클래스에서 다양한 데이터 타입을 처리할 수 있다. 
//  제너릭 타입 변수 : T (Type),  K (Key), V(Value), N (Number-숫자), E(Element-원소) 
	// A-Z 까지 임의로 넣을 수 있다. 
	// wrapper 클래스 : 기본타입을 객체화 시켜놓은 클래스
		// int(기본타입) ==> Integer(객체), boolean ==> Boolean , char ==> Character, 
		// double ==> Double, float ==> Float 
		// byte ==> Byte , short ==> Short , long ==> Long

class MyClass<T>{		//<  > 안에 데이터 타입 들어감
	private T t;
	public T get() {		// getter 필드의 값을 가져오기
		return t;
	}
	public void set(T t) {	//setter ->필드의 값을 할당
		this.t=t;
	}
}
public class SingleGenericArgunment {

	public static void main(String[] args) {
		// 1. 제너릭 클래스 객체 생성 <String>을 입력
		MyClass<String>mc1 = new MyClass<String>() ;	//wrapper클래스를 할당해야 한다.
		mc1.set("안녕");
		System.out.println(mc1.get());
		
		// 2. 제너릭 클래스 객체 생성 <Integer>을 입력
		MyClass<Integer> mc2 = new MyClass<Integer>();	//wrapper클래스를 할당해야 한다. 
		mc2.set(100);
		System.out.println(mc2.get());
		
		// 3. 제너릭 클래스 객체 생성 <Double>을 입력 
		MyClass<Double> mc3 = new MyClass();	// 생성자의 자료형은 생략 가능하다. 
		mc3.set(3330333.333);
		System.out.println(mc3.get());
		
		// 4. 강한 타입 체크 (컴파일 단계에서 오류를 출력)
		MyClass<Boolean> mc4 = new MyClass<Boolean>();	
		mc4.set(true);
		//mc4.set("안녕"); -> 오류 , Boolean엔 true false만 가능
			// 강한 타입 체크 -> 컴파일단계에서 오류 표시(실행시의 오류를 방지 시켜줌)
		
		
		
	}

}
