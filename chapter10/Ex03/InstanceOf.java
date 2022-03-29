package chapter10.Ex03;
// instanceof : 객체 내부의 캐스팅 가능 여부를 알 수 있도록 하는 키워드
	// 업캐스팅 한 객체 내부에 어떤 타입이 존재하는지 True, False로 리턴
	// 다운캐스팅시 런타임 오류가 발생될 수 있다.
	// 다운 캐스팅시 해당 타입이 객체에 존재할 때 다운 캐스팅하도록 설정 

class A {
	int m;
	void a(){
		System.out.println(m);
	}
}
class B extends A{
	int n;
	void b() {
		System.out.println(n);
	}
}
public class InstanceOf {

	public static void main(String[] args) {
		// 1. instanceof : 객체명 instanceof 타입
		A aa = new A();		//aa는 A타입만 가지고 있음 
		A ab = new B();		//aa는 A,B포함하고 , A만 사용 가능
		
		System.out.println(aa instanceof A); 	//true
		System.out.println(ab instanceof A); 	//true
		System.out.println(aa instanceof B);   //false
		System.out.println(ab instanceof B);
		
		if (aa instanceof B) {		//aa객체에 B타입이 내포되어있을 경우에만 ->
			B b = (B)aa;
			System.out.println("aa를 B로 캐스팅 했습니다.");// 다운 캐스팅한다. 
		}else {
			System.out.println("aa는 B타입으로 캐스팅 불가");
		}
		
		if(ab instanceof B ) {
			B b = (B)ab;
			System.out.println("ab를 B타입으로 캐스팅 했습니다. ");
		}else {
			System.out.println("ab는 B타입으로 캐스팅 불가");
		}
		
		if("안녕" instanceof String) {
			System.out.println(" \"안녕\" 은 String 클래스 입니다.");
		}else {
			System.out.println(" \"안녕\" 은 String 클래스 입니다. ");
		}
	}

}
