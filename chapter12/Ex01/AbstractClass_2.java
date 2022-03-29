package chapter12.Ex01;

//2. 추상메소드를 사용하는 2번째 방법 : 자식 객체 생성없이 익명 클래스를 활용하는 방법
	// 1번만 임시적으로 사용할 때, 이벤트 처리 시 사용
	// 장점 : 자식 클래스 생성을 하지 않는다. 임시적으로 사용할 경우 유용
	// 단점 : 여러개의 객체를 생성해야 할 경우 코드가 길어짐. (1번 방법)

abstract class AAA{			//추상 메소드는 객체화 할 수 없다. 
	abstract void abc();
}

public class AbstractClass_2 {

	public static void main(String[] args) {
		// 1. 익명 개체 생성 -> 생성자 뒤에 {}넣어서 익명 클래스 생성
		AAA aaa = new AAA() {	//익명 개체를 활용한 추상 메소드를 클래스 생성없이 구현
			void abc() {
				System.out.println("방법2번 : 객체 생성 없이 익명 클래스로 추상 메소드 구현");
			}
		};
		
		AAA aaa1 = new AAA() {		//추상 클래스는 객체생성 불가능, 익명 클래스생성 후 메소드를 재정의해서 출력 가능
			void abc() {
				System.out.println("방법2번 : 객체 생성 없이 익명 클래스로 추상 메소드 구현");
			}
		};	
		
		AAA aaa2 = new AAA() {
			void abc() {
				System.out.println("방법2번 : 객체 생성 없이 익명 클래스로 추상 메소드 구현");
			}
		};
		
		//2. 메소드 호출
		aaa.abc();
		aaa1.abc();
		aaa2.abc();
	}
}
