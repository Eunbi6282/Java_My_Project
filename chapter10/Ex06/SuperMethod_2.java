package chapter10.Ex06;

//this()와 super()의 혼용  <== 생성자 호출, 생성자 내부, 첫라인
	//this() : 자신 객체의 생성자 호출
	//super() : 부모 객체의 생성자 호출
class AAAA {
	AAAA(){
		this(3);	//자기 자신의 매개변수 정수 1개를 받는 생성자 호출
		System.out.println("AAAA 생성자 1");
	}
	AAAA(int a){
		System.out.println("AAAA 생성자 2");
	}
}
class BBBB extends AAAA{
	BBBB(){
		this(3);
		System.out.println("BBBB 생성자 1");
	}
	BBBB(int a){
		//super(); 	-> super()가 생략되어 있음, 부모먼저 출력
		System.out.println("BBBB 생성자 2");
	}
}

public class SuperMethod_2 {

	public static void main(String[] args) {
		// 1. 객체 생성
		AAAA aaaa1 = new AAAA();		//기본 생성자 호출
		System.out.println("====================");
		
		AAAA aaaa2 = new AAAA(3);
		
		System.out.println("====================");
		
		// 2. 자식의 객체 생성
		BBBB bbbb1 = new BBBB();
		
		// 3. 자식의 객체 생성(매개변수 1개인 생성자 호출)
		BBBB bbbb2 = new BBBB(5);
		
	}

}
