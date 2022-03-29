package chapter06_07.Ex06;

class Aaa{
	int m = 3;			//필드 (인스턴스 필드)
	static int n = 4;	//필드 (static 필드) : 객체 생성없이 사용 가능, 객체 생성후에도 사용이 가능
							//모든 객체가 공유하는 변수
	void print1() {		//메소드  (인스턴스 메소드) : 객체 생성후 호출 가능
		//인스턴스 필드 static 필드 올 수 있음
		System.out.println("인스턴스 메소드 출력 : m " + m + " n : " + n);
	}
	
	static void print2() {	// 메소드 (static 메소드) : 객체 생성없이 사용 가능, 객체 생성 후에도 사용 가능
		//static메소드에서는 인스턴스 필드가 올 수 없다. static필드만 올 수 있음
			// -> static메소드는 객체 생성없이 호출이 되므로 인스턴스 필드가 올 수 없다.  
		
		System.out.println("static 메소드 출력 : m "  + " n : " + n);
	}
}

public class Static_1 {

	public static void main(String[] args) {

		//1. 객체 생성후 필드와 메소드 호출(인스턴스 필드, static필드, 인스턴스 메소드, static메소드)모두 호출
		Aaa aaa = new Aaa();
		aaa.m = 10;	//인스턴스 필드 호출
		aaa.n= 20;	//static 필드 호출
		aaa.print1();	//인스턴스 메소드 호출
		aaa.print2();	//static메소드 호출
		
		// 2. 객체 생성없이 클래스명으로 필드와 메소드 호출(static 필드와 static 메소드만 호출가능)
		Aaa.n = 100;	//static 필드 : 클래스명으로 호출
		Aaa.print2();	//static 메소드 : 클래스명으로 호출
		
		//static 필드-> 모든 객체가 공유
		Aaa bbb = new Aaa();
		System.out.println(bbb.n);	//100
		
		Aaa ccc = new Aaa();
		System.out.println(ccc.n);	//100
		
		Aaa ddd = new Aaa();
		System.out.println(ddd.n); //100 
		
		Aaa eee = new Aaa();
		eee.n= 300;
		System.out.println("=====static 필드가 적용된 필드는 모든 객체에서 공유해서 사용되는  변수=====");
		System.out.println(aaa.n);
		System.out.println(bbb.n);
		System.out.println(ccc.n);
		System.out.println(eee.n);
	}

}
