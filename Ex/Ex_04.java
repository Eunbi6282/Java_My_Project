package Ex;
public class Ex_04 {
	public static void main(String[] args) {
		//[����4] for ���� �̿��ؼ� ���� ����� ���� �ﰢ���� ����ϴ� �ڵ带 �ۼ��� ��
//		����.
//		*
//		**
//		***
//		****
		
		
		for( int i = 1; i < 5; i++) {	//4�� ���ư�
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		****
//		***
//		**
//		*
		System.out.println();
		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}	
}		
		
	


