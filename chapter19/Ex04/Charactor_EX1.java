package chapter19.Ex04;

public class Charactor_EX1 {

	public static void main(String[] args) {
		
		//1. char ==> int�� ��ȯ
		
		char ch1 = 'A';			// char : 2byte 
		System.out.println(ch1);
		System.out.println((int)ch1); // �ƽ�Ű�ڵ尡 ����
		
		char ch1_1 = 'a';
		System.out.println(ch1_1);
		System.out.println((int)ch1_1);
		
		char ch2 = 'Z';
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		//1-2. char�� ����(�ƽ�Ű�ڵ�)�� ������ �� �ִ�. 
		
		char ch3 = 66;   	// <== char�� ���������� ������ �����ϴ�.
		System.out.println(ch3);
		System.out.println((char) ch3);
		System.out.println((int) ch3); 	// �ƽ�Ű�ڵ�
		
		// 3. int ===> char
		int ch4 = 65;
		System.out.println(ch4);
		System.out.println((char) ch4);
		
		

	}

}