package chapter06_07.Ex04;
//반드시 this가 추가되어야 할 경우 
class Aa{							//this키를 사용하지 않는 경우 : 지역변수로 인식
	int m;
	int n;
	void init(int m, int n) {
		m = m;						// this 키워드를 사용하지 않으면 m을 지역변수로 인식 
		n = n;
	}
}

class Bb{							// this 키워드를 사용하는 경우
	int m;
	int n;
	void init(int m, int n) {
		this.m =m;						// this 키워드를 사용하여 m이 필드의 m이라고 알려줘야 한다. 
		this.n = n;
	}
}
public class ThisKeyword_2 {
	public static void main(String[] args) {
		
		// 1. 필드의 명과 지역변수의 명이 같은 경우 (this 키워드를 사용하지 않는 경우)
		Aa aa = new Aa();
		aa.init(4, 6);
		System.out.println(aa.m);		// 0
		System.out.println(aa.n);		// 0
		
		// 2. 필드의 명과 지역변수의 명이 같은 경우 (this 키워드를 사용한경우)
		Bb bb = new Bb();
		bb.init(2, 3);
		System.out.println(bb.m);
		System.out.println(bb.n);
	}
}

