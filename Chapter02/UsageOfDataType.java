package Chapter02;
public class UsageOfDataType {
	public static void main(String[] args) {
		//변수 선언 : 
			//자료형 변수명 ; 선언하고 나중에 값 할당
			//자료형 
		
		int a = 3;
		int b;
		b = 4;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("==============");
		
		a = 10;
		b = 30;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("==============");
		
		//byte a ;  //오류 -> a는 이미 int로 선언되어있음, 선언된 변수는 재선언 할 수 없다.
		// a = 10.02 //오류 -> a에는 정수만 넣을 수 있음 , 실수 넣으면 오류, 다른 데이터 타입의 값을 넣을 수 없다.
		
		char c;				//char는 글자 1자만 저장할 수 있음,작은따옴표'' 사용
		c = 'A';
		System.out.println(c);
			
		String d;
		d = "오늘은 기온이 많이 떨어졌습니다.";
		System.out.println(d);
		
		String e ="11강의장";
		System.out.println(e);
		
		
	}

}
