package chapter19.Ex04;

public class Charactor_EX1 {

	public static void main(String[] args) {
		
		//1. char ==> int로 변환
		
		char ch1 = 'A';			// char : 2byte 
		System.out.println(ch1);
		System.out.println((int)ch1); // 아스키코드가 찍힘
		
		char ch1_1 = 'a';
		System.out.println(ch1_1);
		System.out.println((int)ch1_1);
		
		char ch2 = 'Z';
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		//1-2. char에 정수(아스키코드)로 저장할 수 있다. 
		
		char ch3 = 66;   	// <== char에 정수값으로 저장이 가능하다.
		System.out.println(ch3);
		System.out.println((char) ch3);
		System.out.println((int) ch3); 	// 아스키코드
		
		// 3. int ===> char
		int ch4 = 65;
		System.out.println(ch4);
		System.out.println((char) ch4);
		
		

	}

}
