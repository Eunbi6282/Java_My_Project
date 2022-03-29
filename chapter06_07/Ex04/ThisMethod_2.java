package chapter06_07.Ex04;

import javax.crypto.AEADBadTagException;

//Aaa 클래스에 여러개의 생성자를 사용할 경우 this(); 없이 사용한 경우 -> 중복된 값을 매번 입력해야 함
class Aaa{					
	int m1, m2, m3, m4;		//필드 4개 선언
	
	Aaa(){					// 생성자 : 매개변수가 없는 생성자
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Aaa(int a) {
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Aaa(int a, int b){
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	
	void print() {					//각 메모리의 값을 출력.... V'.'V 
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
	// Aaa 클래스에 여러개의 생성자를 사용할 경우 this(); 없이 사용한 경우 -> 중복된 값을 매번 입력해야 함
}

// Aaa 클래스에 여러개의 생성자를 사용할 경우 this(); 사용한 경우 
class Bbb {
	int m1, m2, m3, m4;
	
	Bbb(){
		m1 = 1; m2 = 2; m3 = 3; m4 = 4; //초기값 할당
	}
	
	Bbb(int a) {
		this();
		m1 = a;
	}
	
	Bbb(int a, int b){
		this(a);			//매개변수 1인 생성자 호출
		m2 = b;
	}
	
	void print() {					//각 메모리의 값을 출력.... V'.'V 
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
}

public class ThisMethod_2 {

	public static void main(String[] args) {
		// 1. 세가지 객체 생성(this 미사용)
		Aaa a1 = new Aaa(); 	//매개변수가 없는 생성자 호출
		Aaa a2 = new Aaa(10);	// 매개변수가 하나인 생성자 호출
		Aaa a3 = new Aaa(10, 20); // 매개 변수가 2개인 생성자 호출
				
		a1.print();
		a2.print();
		a3.print();
		
		System.out.println("========================================");
		Bbb b1 = new Bbb();
		Bbb b2 = new Bbb(10); 		//Bbb에 매개변수 하나 들어간 생성자 호출
		Bbb b3 = new Bbb(10, 20);	//Bbb에 매개변수 두개인 생성자 호출
		
		b1.print();			// 1 2 3 4
		b2.print();			// 10 2 3 4
		b3.print();			// 
	}

}
