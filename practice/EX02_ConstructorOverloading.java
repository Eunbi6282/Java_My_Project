package practice;
	// 생성자 오버로딩 : 하나의 생성자명에 데이터타입, 갯수에따라 다른 생성자가 호출
		// 주의 : 데이터 타입도 같고, 갯수도 같은 경우 두개 이상 있으면 오류
class Abc{
	int a,b,c;
	String d;
	
	Abc(){
		System.out.println(a + " " + b + " " + c);
	}
	
	Abc(int a){
		this.a = a;
		System.out.println(a);
	}
	
	Abc (int a, int b){
		this.a = a;
		this.b = b;
		System.out.println(a + " " + b);
		System.out.println();
	}
	
	Abc(String d){
		this.d = d;
		System.out.println(d);
	}
}
public class EX02_ConstructorOverloading {

	public static void main(String[] args) {
		Abc abc = new Abc();
		
		Abc abc2 = new Abc(3);
		Abc abc3 = new Abc("잘가");

	}

}
