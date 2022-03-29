package chapter06_07.Ex05;
	//접근 제어자(캡슐화 : 데이터를 외부로부터 보호) : public, protected, default(생략해서 사용), private
		// 클래스 이름, 필드명, 메소드명, 생성자명 앞에 
		// 클래스 이름 : public, default만 사용 가능
public class A {

	// private: 외부 클래스에서 접근 불가 
	private int m = 3;		
	private int n= 4;
	
	int a = 10;					//필드의 기본 접근 제어자는 default : 생략됨, 같은 패키지 내에서만 접근 가능
	int b = 50;					// default : 다른 패키지의 클래스에서는 접근 불가, 같은 패키지내 다른 																		클래스에서 접근 가능
	public int k = 10;			//public : 다른 패키지에서 접근 가능
	
	
	
	void print() {  //default : 같은 패키지 내의 클래스에서만 사용 가능
		System.out.println("임포트 성공" + m);
		System.out.println("임포트 성공" + n);
		
	}
	
	public void print2() {		//public : 다른 패키지에서 접근 가능
		System.out.println("외부 패키지의 다른 클래스에서 접근 가능" + k);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
