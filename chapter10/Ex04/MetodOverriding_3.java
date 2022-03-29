package chapter10.Ex04;
	//메소드 오버라이딩과 접근 지정자와의 관계
		//자식의 클래스에서 부모의 메소드를 재정의할 경우 접근 지정자는 부모와 같거나 넓어야 한다. 
class Aaa{
	protected void abc() {
	}
}
class B1 extends Aaa{
	@Override
	public void abc() {
		System.out.println("오버라이딩 성공: 부모 protected , 자식 public");
	}
}
class B2 extends Aaa{
	@Override
	protected void abc() {
		System.out.println("오버라이딩 성공: 부모 protected , 자식 protected");
	}
}
class B3 extends Aaa{
	//@Override
//	void abc() {   -> 오버라이딩할 메소드의 접근 지정자 문제
//		System.out.println("오류발생: 부모 protected , 자식 default");
//	}
}
class B4 extends Aaa{
	//@Override
//	private void abc() {	-> 오버라이딩할 메소드의 접근 지정자 문제
//		System.out.println("오류발생: 부모 protected , 자식 private");
//	}
}


public class MetodOverriding_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
