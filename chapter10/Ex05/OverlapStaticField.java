package chapter10.Ex05;
class AAA{
	static int m = 3;
}
class BBB extends AAA{
	static int m =4;			//자식과 부모가 같은 필드 이름을 가지고 있다고 해도 
								//별개의 공간에 변수들이 만들어져 필드는 오버라이딩 되지 않는다. 
}
public class OverlapStaticField {

	public static void main(String[] args) {
		// 1. 객체 생성 없이 호출(클래스 이름으로 호출 가능) <= 권장사항
		System.out.println(AAA.m);	//3
		System.out.println(BBB.m);	//4
		
		
		// 2. 객체 생성 후 호출
		AAA aaa = new  AAA();
		BBB bbb = new BBB();
		AAA abb = new BBB();
		
		System.out.println(aaa.m);	//3
		System.out.println(bbb.m);	//4
		System.out.println(abb.m);	//3   //static필드 : 오버라이딩 되지 않는다.
	}

}
