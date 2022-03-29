package chapter10.Ex06;
//super 키워드 : 부모클래스를 지정, 메소드 내부에서 사용, 생성자 내부에서도 사용.
// super() : 생성자 내부에서만 사용, 부모생성자를 호출할 때 사용.
			// 반드시 첫 라인에 위치
// this() : 생성자 내부에서만 사용, 자신의 클래스의 다른 생성자를 호출할 떄
			// 반드시 첫 라인에 위치, 
class AAA{
	AAA(){
		System.out.println("AAA 생성자");
	}
}
class BBB extends AAA{
	BBB(){
		super();
		System.out.println("BBB 생성자");
	}
}
class CCC {
	CCC(){
		System.out.println("R");
	}
	CCC(int a){
		System.out.println("CCC 생성자 : " + a);
	}
}
class DDD extends CCC{
	DDD(){ 
		// super(); 기본 생성자엔 super()가 생략되어있음
	}
	DDD(int a){
		super(3);		//부모인 CCC클래스에 가서 매개변수를 1개 받는 생성자 출력
		System.out.println("DDD 생성자 정수 1 : " + a);
	}
}
public class SuperMethod_1 {

	public static void main(String[] args) {
		// 1. 객체 생성
		AAA aaa = new AAA();	//기본 생성자 호출
		System.out.println("=================");
		
		BBB bbb = new BBB();	//기본 생성자 호출
		System.out.println("=================");
		
		CCC ccc = new CCC();	//기본생성자를 호출하려면 기본생성자가 선언되어있어야 함
		
		DDD ddd = new DDD();
		System.out.println("==================");
		DDD ddd2 = new DDD(5);
		

	}

}
