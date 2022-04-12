package Ex_T.ch19;
/* 
 *  p.jangwoo@gmail.com , 각 조의 팀장님에게도 전송, 완료 시간 : 11: 45분까지 
 *  힌트 : 배열의 방 26개 생성해서 for 문을 사용해서 출력. 
 A ~ Z 까지의 아스키 코드값 출력 
 
 출력결과 
 ======================
 A,65
 B,66
 ...
 Z,90
 
 
  a ~ z 까지의 아스키 코드값 출력 
 
 출력결과 
 ======================
a,97
b ,98
 ...
z,97
 
 
 */

public class Charator_EX2 {

	public static void main(String[] args) {
		
		//1. 대문자 :  A ~ Z 까지의 아스키 코드값 출력 

		System.out.println("1. 대문자 :  A ~ Z 까지의 아스키 코드값 출력 ");
		System.out.println("========================================");
		System.out.println();
		
		for (int i=65 ; i < 91 ; i++) {	
				System.out.println((char)i + " , " + i);	
		}
		System.out.println();
		System.out.println();
		System.out.println("2. 소문자 :  a ~ z 까지의 아스키 코드값 출력 ");
		System.out.println("========================================");
		System.out.println();
		
		for (int i=97 ; i < 123 ; i++) {	
			System.out.println((char)i + " , " + i);	
	}

	}

}
