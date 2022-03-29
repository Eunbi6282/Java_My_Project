package chapter06_07.Ex06;

// import chapter06_07.Ex05.B;		//class B는 클래스 접근 제어자가 default이기 때문에 다른 패키지에서 접근 불가.  
import chapter06_07.Ex05.Bb;		//다른 패키지의 클래스에서 임포트 되기 위해서 -> public 접근 제한자 필요

public class ExternalClass_2 {

	public static void main(String[] args) {

		// B b = new B();
		
		//다른 패키지의 클래ㅡㅅ에서 Bb클래스를 접근하는 경우
			// 1. import를 먼저 사용
			// 2. Bb클래스의 클래스 접근 제한자는 public
			// 3. 필드, 메소드의 접근 제한자에 따라서 접근이 가능 (protected(상속관계), public) , 불가능(private, default)
		
		Bb bb = new Bb();		//다른 패키지의 클래스 1. 클래스 접근 제어자에 public
		bb.d = 40;
		// bb.a = 10; -> 오류, 접근 불가능
		
		
		
		// bb.a; // 변수 a는 private 이므로 Bb클래스에서만 사용가능
		//bb.b; 
		

	}

}
