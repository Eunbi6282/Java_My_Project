package chapter10.Ex05;
class AAAA{
	static void print() {		//static 메소드 : 오버라이딩 되지 않는다. 
		System.out.println("Class AAAA");
	}
}
class BBBB extends AAAA{
	static void print() {		//static 메소드 : 오버라이딩 되지 않는다. 
		System.out.println("Class BBBB");
	}
}
public class OverlapStaticMethod {

	public static void main(String[] args) {
		// 1. 객체 생성 없이 호출
		AAAA.print();
		BBBB.print();
		System.out.println("==============");
		
		// 2. 객체 생성 후 호출
		AAAA aaaa = new AAAA();
		BBBB bbbb = new BBBB();
		aaaa.print();
		bbbb.print();
		AAAA aabbAaaa = new BBBB();
		aabbAaaa.print(); //오버라이딩이 안되기 때문에 A클래스 출력

	}

}
