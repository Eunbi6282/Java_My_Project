package chapter19.Ex04;
/*
 	ASCII �ڵ尪 ��� : 1byte(= 8bit) , ���� ó�� ��Ʈ�� ��ȣ��Ʈ, 7bit
 		 1 ~ 32bit ���� : Ư���ϰ� ����� �� �� ���� Ư���� �ڵ� , �� ) null, ����� ����, �����(7��), ���� LF(10��)....
 		 127 : delete.
 		 
 		 ���� ��� ������ 33����Ʈ ~ 126��Ʈ
 		 ����, ����, Ư������ 
 		 
 		 ��� 
 		 ========================================
 		 ASCII(\t) ����(\t)(\t) ASCII(\t) ����
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
		
		System.out.println( "���" + "\n" + "====================" + "\n" + "ASCII    ����            ASCII     ����" + "\n" + "====================" );
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
//			ch = new char[126-33];  //�氳��
//			ch[i] = (char) (i);
//			System.out.println((int)ch[i] + "\t" + (char)ch[i] + "\t" + "\t"+ (int)ch[i+1] + "\t" + (char)ch[i+1]);
//		}
		
		
	}

}
