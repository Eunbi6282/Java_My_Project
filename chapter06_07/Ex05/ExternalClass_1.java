package chapter06_07.Ex05;

class B{		//외부클래스 : public이 올 수 없다. default가 생략되어 있다.
				// 다른 패키지의 클래스에서는 접근이 불가, 같은 패키지 내에서만 접근 가능
	private int a = 1;			// private: 같은 클래스에서만 사용
	int b = 3;					// default : 같은 패키지내의 다른 클래스에서 접근가능
	protected int c = 3;		// protected : default 포함 + 다른 패키지에 접근 가능 (상속된 경우만 가능)
	public int d = 4;			// public : 다른 패키지에서 접근이 가능
	
	// private < default < protected < public
	
	private void print1() {		//같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	void print2() {		//같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	 protected void print3() {		//같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	public void print4() {		//같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
}
public class ExternalClass_1 {
	public static void main(String[] args) {
		B b = new B();		//default 접근 제어자가 class이름에 할당/ 같은 클래스에 존재하므로 B class를 생성할 수 있다.
		
		Bb bb = new Bb();	//public접근 제한자, 같은 패키지내에서 접근 
		
		// 같은 패키지의 다른 클래스에서 접근 <필드>
		// bb.a;  -> 오류발생 private : 해당 클래스 내부에서만 사용 
		bb.b = 20;	// default : 같은 패키지의 클래스에서 접근을 허용
		bb.c = 30;	// protected : default 를 포함 + 다른 패키지에서 접근이 가능하지만 상속관계일때만 
		bb.d = 40;	// public : protected를 포함 + 상속없이 다른 패키지에서 접근 가능
		
		// 같은 패키지의 다른 클래스에서 접근 <메소드>
		// bb.print1(); -> 오류발생 private : 해당 클래스 내부에서만 사용 
		bb.print2();	// default : 같은 패키지의 클래스에서 접근을 허용
		bb.print3();	// protected : default 를 포함 + 다른 패키지에서 접근이 가능하지만 상속관계일때만 
		bb.print4();	// public : protected를 포함 + 상속없이 다른 패키지에서 접근 가능
		
	}
}
