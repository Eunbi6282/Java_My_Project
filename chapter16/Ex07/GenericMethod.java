package chapter16.Ex07;


// 제너릭 클래스 : 클래스를 선언할 떄 타입변수는 선언<T> <<정의>>, 객체를 생성시 T에 적용할 타입을 지정

// 제너릭 메서드 : 일반 클래스 내부의 메서드 선언시 제너릭 타입변수를 사용

class ssGenericmethod{	//일반 클래스
	
	//3개의 제너릭 메서드
	public <T> T method1(T t) {
		return t;
	}
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);	//두 값을 비교 true, false 리턴
								// 기본 자료형일 때는 값을 비교, 참조 자료형일 때는 객체의 주소를 비교
								// *String일 경우 , equals가 재정의가 되어있으므로 값을 비교한다. 
									// String -> Integer, Double, equals 가 재정의 되어어있다. 
		
	}
	public <K,V> void method3(K k, V v) {	// 2개의 타입 들어옴
		System.out.println(k + " : " + v);
	}
	public <K,V> void method4 () {
		System.out.println("매개변수가 인풋값으로 없는 경우 생각시 오류");
	}
}

public class GenericMethod {
	public static void main(String[] args) {
		// 1. 일반 클래스 객체 생성후 제너릭 메서드 호출
		ssGenericmethod gm = new ssGenericmethod();
		String str1 = gm.<String>method1("안녕");	//T -> String// 매서드 호출하기 전에 <타입>을 지정해서 호출
		String str2 = gm.method1("안녕");		//타입을 알 수 있는 경우 호출할 때 생략가능 (매개변수로 값이 들어갈 때 생략가능)
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("==============================");
		
		Integer integer = gm.<Integer>method1(100);
		Integer integer2 = gm.<Integer>method1(200);
		System.out.println(integer);
		System.out.println(integer2);
		
		System.out.println("==============================");
		
		Boolean boolean1 = gm.<Boolean>method1(true);
		Boolean boolean2 = gm.<Boolean>method1(false);
		System.out.println(boolean1);
		System.out.println(boolean2);
		
		System.out.println("==============================");
		
		Boolean double1 = gm.<Double>method2(2.55, 2.55); //method2의 리턴타입이 boolean임
		Boolean double2 = gm.<Double>method2(2.55, 6.55); //method2의 리턴타입이 boolean임
		System.out.println(double1);
		System.out.println(double2);
		System.out.println("==============================");
		
		gm.<String, Integer>method3("국어",90);
		gm.method3("영어", 80); //매개변수로 인풋되는 데이터 타입를 수정할 수 있는 경우 생략가능
		
		gm.<Integer,String> method3(500, "서버에러입니다");
		gm.method3(402, "파일을 찾을 수 없습니다." );
		
		gm.method4();
		
		
				
		
	}

}
