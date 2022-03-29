package chapter12.Ex02;

//인터 페이스 (interface) : 외부와 내부를 연결시켜주는 접점
	// 모든 필드는 반드시 : public static final생략
	// 모든 메소드 : public abstract 생략 (1.8버전), (default 메소드 제외)

interface A{	//정식 표현
	public static final int A = 3;	//Interface필드의 정식 표현
	public abstract void abc() ; 	//Interface 메소드의 정식 표현
}
interface B{	//생략된 구현
	int A = 3;
	void abc();
}
abstract class C{			// 추상 클래스일 때는 abstract는 생략될 수 없다. 
abstract void abc();		//생략시 오류 발생
}

public class InterFace_1 {

	public static void main(String[] args) {


		// 1. 인터페이스의 static 필드의 내용을 출력
		System.out.println(A.A);	//인터페이스의 필드 출력 -> 객체 생성없이 출력 가능(static 때문에 가능)
		System.out.println(B.A);
		
		// 2. final이 적용되어있기 때문에 값을 수정할 수 없다. 
//		A.A = 5;	//final이 설정되어 있기 때문에 값을 수정할 수 없다. 
//		B.A = 6;
		
	}

}
