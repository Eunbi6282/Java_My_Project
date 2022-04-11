package chapter19.Ex04;
/*
 	ASCII 코드값 출력 : 1byte(= 8bit) , 제일 처음 비트는 부호비트, 7bit
 		 1 ~ 32bit 까지 : 특수하게 출력을 할 수 없는 특수한 코드 , 예 ) null, 헤더의 시작, 경고음(7번), 개행 LF(10번)....
 		 127 : delete.
 		 
 		 실제 출력 가능은 33번비트 ~ 126비트
 		 영문, 숫자, 특수문자 
 		 
 		 출력 
 		 ========================================
 		 ASCII(\t) 문자(\t)(\t) ASCII(\t) 문자
 		 ========================================
 		 33			!		  34		 &
 		 35 		#		  36         $
 		 .
 		 .
 		 .
 		 126
  */
public class Ascii_Code_Print {
	public static void main(String[] args) {
		
		System.out.println( "출력" + "\n" + "====================" + "\n" + "ASCII    문자            ASCII     문자" + "\n" + "====================" );
		char[] ch = new char[127];
		for (int i = 33; i < ch.length; i++) {
			ch[i] = (char)i;
		
		if (i%2 == 1) {
			System.out.print(i + "\t" + ch[i]);
		}else {
			System.out.println("\t \t" + i + "\t" + ch[i]);
		}
		
		}
		
//		
//		char[] ch = null ;
//		for (int i = 33; i <= 126; i +=2) {
//			ch = new char[126-33];  //방개수
//			ch[i] = (char) (i);
//			System.out.println((int)ch[i] + "\t" + (char)ch[i] + "\t" + "\t"+ (int)ch[i+1] + "\t" + (char)ch[i+1]);
//		}
		
		
	}

}
