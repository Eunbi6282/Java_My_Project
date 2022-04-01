package chapter16.Ex07;

// 제너릭 메서드 내부에서 사용 가능한 메서드 : Object 클래스의 메서드만 사용가능하다.	

class A{
	
	public <T> void method(T t) {
		//System.out.println(t.length()); // 오류 -> t.length(): String클래스에서 글자수를 리턴해준다. 
		System.out.println(t.equals("안녕")); // 가능 -> t.equals("안녕") : Object클래스의 메서드는 사용 가능
	}
	public <T extends Object> void method2 (T t){		// <T [extend object]>가 생략되어 있다. 
		System.out.println(t.equals("반갑습니다"));	// Object클래스의 메서드만 사용 가능하다. 
		//System.out.println(t.); -> Object의 메서드 사용 가능
	}
	public <T extends String> void method3 (T t) {		//String타입으로 지정되어 .lenght사용 가능
		System.out.println(t.length());
		//System.out.println(t.); -> String 메서드 사용 가능
	}
}

public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a= new A();
		a.<String>method("안녕");

	}

}
