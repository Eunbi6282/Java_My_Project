package practice;
class Airplane{
	int m;
	void work() {
		System.out.println(m);
	}
//	A(){				// 생성자를 포함하지 않으면 컴파일러가 기본생성자를 자동으로 추가
//		
//	}
}

class Banana{
	int m ;
	void work() {
		System.out.println(m);
	}
}

//객체 생성시 생성자를 통해서 필드의 초기값을 할당하고 객체 생성
class C{
	int m;
	void work() {
		System.out.println(m); 	//생성로조 넘어온 값
	}
	C(int c){
		m = c;
	}
}
class D {
	int m,n,l,k;
	
	D () {}	// Class D의 기본 생성자
	
	D (int m , int n, int l, int k){	//매개변수 4개인 생성자
		this.m = m;			//this 사용 -> 매개변수 값 = 인풋받는 변수 = 메모리에 올리는 변수 
		this.n = n;
		this.l = l;
		this.k = k;
	}
	
	D(int a, int b, int c){		//매개변수가 3개인 생성자
		m = a;
		n=b;
		k = c;
	}
	
	void work() {		//work()를 호출시 메모리 값을 출력
		System.out.println("변수 m의 값 : " + m);
		System.out.println("변수 n의 값 : " + n);
		System.out.println("변수 l의 값 : " + l);
		System.out.println("변수 k의 값 : " + k);
	}
}
public class Ex01_DefaultConstructor {
	public static void main(String[] args) {
		
		//객체 생성 -> 메인 메소드 안에서
		
		Airplane a = new Airplane();		//기본 생성자 호출
		a.work();
		
		Banana banana = new Banana();		//기본생성자 호출
		banana.work();
		
		C c = new C(3);		// 정수 1개를 매개변수로 받는 생성자 호출
							// 생성자 호출 시 기본값을 인풋해서 메모리 필드에 초기값 구성
		c.work();
		
		C ccC = new C(30);
		ccC.work();
		
		D d = new D();		//class D의 기본생산자
		d.work();
		
		D d2 = new D(3, 5, 7); 	// 매개 변수로 정수 세개를 받는 생성자 호출
		d2.work();
		
		D d3 = new D(55, 33, 90, 2);	//매개변수로 정수 네개를 받는 생성자 호출
		d3.work();
		//오버로딩: 메소드명은 같고( 생성자명, 데이터 타입, 매개변수 갯수)에 따라서 해당 메소드를 로드한다.
	
	}

}
