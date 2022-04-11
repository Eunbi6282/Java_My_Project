package chapter19.Ex04;
/*
 A -Z까지의 아스키코드값 출력
 출력결과
 ========================================
 A, 65
 B,66
 ...
 Z,97
 
 출력결과
 ========================================
 a, 65
 b,66
 ...
 z,97
 
 */
public class Charactor_Ex2 {
	public static void main(String[] args) {
		
		char[] ch = new char[26];
		
		System.out.println("출력결과");
		System.out.println("======================");
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)('A'+i);  //'A'+i => A부터 하나씩 증가해서 배열에 저장
			System.out.println((char)ch[i] + " , " + (int)ch[i]);
		}
		
		System.out.println();
		System.out.println("출력결과");
		System.out.println("======================");
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)('a'+i);
			System.out.println((char)ch[i] + " , " + (int)ch[i]);
		}
	}
}
