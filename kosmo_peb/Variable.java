package kosmo_peb;

public class Variable {
	public static void main(String[] args) {
		int a=3; //변수 a 변수를 선언할 때 자료형 명칭해야함
		/* 
		 * int -> 정수
		 * String -> 문자열 
		 * */
		String b = "화면"; //변수 b
				
		System.out.println(a);
		System.out.println(b);
		System.out.println("===================");
		System.out.println(b + "출력");
		System.out.println(a + b + "출력");
		
		System.out.println("====================");
		System.out.println();
		a = 10;
		b = "오늘";
		System.out.println(a);
		System.out.println(b);
		System.out.println("===================");
		System.out.println(b + "출력");
		System.out.println(a + b + "출력");
		
//		a = "내일"; a는 반드시 정수형
//		b = 15 	b는 반드시 문자형
//				-> 변수에 각각 매칭되는 변수선언이 다르기 때문에 불가능 
		
				
	}

}
