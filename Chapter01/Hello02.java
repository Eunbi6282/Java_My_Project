package Chapter01;


public class Hello02 {
	//메소드 선언 -> 메인 메소드 위에 작성 (메소드란 : 객체치향언어(java)에서 함수(인풋값을 넣어서 프로그램에 따라 결과를 출력)를 메소드라고 칭함)
	public static int sum(int n , int m) { //int -> return타입 
		return n+m; //return 값을 int형으로 
	}
	
	public static void main(String[] args) {
		//변수 선언
		
		int i = 20;  //i변수는 정수만 가느, 초기값으로 20을 할당해서 넣음
		int s;		// s변수는 정수만 가능 , 
		char a; 	//char는 한글자만 넣을 수 있음(아스키값-영어, 숫자, 특수문자 한자리값만 가능 ,''사용)
		String b;
		
		b="오늘의 날씨는 맑습니다.";
		
		s = sum (i,10); //sum()메소드 호출
		a = '?'; 
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(b);
		
		
		
		
		
		
		

	}

}
