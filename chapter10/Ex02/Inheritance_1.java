package chapter10.Ex02;

class Aa{
	int m;
	void abc() {
		System.out.println("부모 메소드");
	}
}

class Bb extends Aa{
	int n;
	void bcd() {
		System.out.println("자식 메소드");
	}
}
public class Inheritance_1 {

	public static void main(String[] args) {
		// 타입 캐스팅을 하지 않는 경우
		Bb b = new Bb();	//b는 Aa, Bb 내포, 사용 가능
		b.m = 10;	//부모필드
		b.n = 20; 	//자식 필드
		b.abc(); //부모 메소드
		b.bcd(); //자식 메소드
		
		//업캐스팅 : 자식 => 부모
		Aa aa = new Bb();	//Bb 객체를 만들면서 type을 A로.
		aa.m = 100;
		// aa.n = 200; 오류 -> Aa타입과 Bb타입 모두 가지지만 Bb에 접근x , 
		
		Bb bb = (Bb)aa;	//Aa타입에서 Bb타입으로 다운캐스팅
		bb.m = 100;
		bb.n = 200;
		
	}

}
