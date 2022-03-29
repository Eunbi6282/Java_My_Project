package Chapter02;

public class Changechar {
	public static void main(String[] args) {
		int data =10; 
		
		// 10진수 정수 -> 2진수/ 8진수/ 16진수 문자열
		System.out.println(Integer.toBinaryString(data));	//1010  2진수
		System.out.println(Integer.toOctalString(data));	//12 	8진수
		System.out.println(Integer.toHexString(data));    	//a 	16진수ㅛㅓㅏ	
		
	}

}
