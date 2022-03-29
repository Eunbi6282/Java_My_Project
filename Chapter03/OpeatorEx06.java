package Chapter03;

public class OpeatorEx06 {

	public static void main(String[] args) {
		/*
		 * 논리 시프트를 이용해서 각 비트의 위치의 값을 알아내기
		 * */
		int flags = 0b10110110; //원래 인트는 32비트 24개의 0(24비트)생략되어있음
 		System.out.println(flags >>> 0 & 1); 	//0 : 0번째 비트값이 출력
 		System.out.println(flags >>> 1 & 1);	//1 : 1번째 비트값이 출력
 		System.out.println(flags >>> 2 & 1);	//1 : 2번째 비트값이 출력
 		System.out.println(flags >>> 3 & 1);	//0 : 3번째 비트값이 출력
 		System.out.println(flags >>> 4 & 1);	//1 : 4번째 비트값이 출력
 		System.out.println(flags >>> 5 & 1);	//1 : 5번째 비트값이 출력
 		System.out.println(flags >>> 6 & 1);	//0 : 6번째 비트값이 출력
 		System.out.println(flags >>> 7 & 1);	//1 : 7번째 비트값이 출력
 		
 		
 		
 		
	}
	
	
	
	
			
}
