package Ex_T.ch19;
/*
 A -Z������ �ƽ�Ű�ڵ尪 ���
 ��°��
 ========================================
 A, 65
 B,66
 ...
 Z,97
 
 ��°��
 ========================================
 a, 65
 b,66
 ...
 z,97
 
 */
public class Charactor_Ex2 {
	public static void main(String[] args) {
		
		char[] ch = new char[26];
		
		System.out.println("��°��");
		System.out.println("======================");
		for (int i = 65; i < 91; i++) {
			ch[i] = (char)('A'+i);  //'A'+i => A���� �ϳ��� �����ؼ� �迭�� ����
			System.out.println((char)ch[i] + " , " + (int)ch[i]);
		}
		
		System.out.println();
		System.out.println("��°��");
		System.out.println("======================");
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)('a'+i);
			System.out.println((char)ch[i] + " , " + (int)ch[i]);
		}
	}
}
