package chapter10.Ex06.Ex01;

//자식 객체를 생성할 때 부모 클래스의 기본 생성자를 먼저 호출 : 자식클래스의 첫번째 줄에 super()이 생략되어 있기 때문 

class A{
	A(){
		System.out.println("A클래스의 기본생성자");
	}
	A(int a){
		System.out.println("A클래스의 매개변수 정수 1개를 받는 생성자 : " + a);
	}
	A (int a, int b){
		System.out.println("A클래스의 매개변수 정수 2 : " + a + " , " + b);
	}
}
class B extends A{
	B(){
		super(5); //=> 생략되어 있음
		System.out.println("B클래스의 기본생성자");
	}
	B(String a){
		super(5,6);
		System.out.println("B클래스의 문자열 1 입력 : " + a);
	}
}
class C extends B{
	C(){
		super("c에서 호출");	//부모생성자 호출
		System.out.println("C클래스의 기본 생성자");
	}
}
public class SuperMethod_2 {

	public static void main(String[] args) {
		C c = new  C();

	}

}
