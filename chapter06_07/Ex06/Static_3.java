package chapter06_07.Ex06;

//정적 초기화 블록

/* 생성자와 static블락:
 * - 생성자 : 인스턴스 필드를 초기화, 정적필드도 초기화 가능
 * - 정적(static)블락  : static필드의 값을 초기화
 * 
 * 
 * */

class E{
	int a;
	static int b;	
	
	//정적 초기화 블록 : 생성자와 같이 static필드의 값을 호출할 때 초기화하는 역할을 한다. 
	static {	//정적(static) 초기화 블럭 : 객체 생성 없이 클래스 명으로 호출할 때 초기화 
//		a = 3; -> 오류발생(인스턴스 필드는 static블럭에서 초기화할 수 없음)
		b= 8;
		System.out.println("classE가 로딩 되었습니다. 변수 b의 값 : " + b);
	}
	
	E(){		//생성자 : 객체화 할 때 필드의 값을 초기화
		a = 3;		//인스턴스 필드
				//정적필드
	}
}

public class Static_3 {

	public static void main(String[] args) {
		System.out.println(E.b); 	//객체 생성없이 E.b 호출될 때 static블락이 작동됨 
										// :static 의 값을 초기화 함. 생성자 호출과 같음
		
		System.out.println();
		E.b = 8;
		System.out.println(E.b);

	}

}
