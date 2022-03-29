package chapter06_07.Ex04;

/*묵시적 this키워드 자동 추가*/
//1. 클래스 내부에서 필드, 메서드 이름 앞에 자동으로 this키워드가 붙음 
	// this 키는 객체의 필드과 객체의 메소드를 지칭, 
class A {
	int m;
	int n;
	
	// A() {}  	   -> 기본생성자 생략됨
	
	void initt (int a, int b) {		// 변수 a,b,c는 지역변수 (Stack 영역에 변수명과 값을 가짐), 
									// initt()메소드 생성시, stack영역에 생성이 되고 메소드가 끝나면 삭제됨
		int c;
		c = 3;
		this.m = a;			// this 키를 생략했을 때, 컴파일러가 자동으로 추가 
		this.n = b;			// this 키를 생략했을 때, 컴파일러가 자동으로 추가 
	}
	
	void work() {
		this.initt(2, 3);		//메소드 앞에 this -> 객체 자기자신 
		System.out.println(this.m + " " + this.n);  //this 생략가능, 생략시 컴파일러가 자동으로 추가 
	}
}
public class ThisKeyword_1 {
	public static void main(String[] args) {
		
		// 2. 객체 생성
		
		A a = new A();
		
		// 3. 메서드 호출
		a.work();
		
		
	}

}
