package Chapter04;
public class For_Ex03 {
	public static void main(String[] args) {

		
		//For �⺻ �۵�
		
		int a; 			//���� ���� : ��� �ۿ��� ����� ����, ���� (0), �ʱⰪ(x)
		for( a = 0 ; a < 5 ; a++)	{
			System.out.print(a + " ");		// for
		}
		System.out.println("===================");
		System.out.println(a);		//a�� 4���� �־����� for���� ������ �������� ���� for���� ����� ��. ������ 4���� 1�� ���ؼ� 5�� ��
		
		System.out.println("=====================");
		for (int b = 0 ; b <= 10 ; b++) {
			System.out.println( b );
		}
		// System.out.println(b);   -> ����, �������� b�� ��� �ۿ��� ��� �����Ƿ� ����
		System.out.println("======================");
		
		int c;
		for (c = 10 ; c > 0 ; c--) {
			System.out.println(c);
		}
		
		// System.out.println(c);
	
		for ( int i = 0 ; i < 100 ; i += 2) { 	//2�� ����� ��µ�
			System.out.print(i + " ");
		}
		System.out.println("==============================");
		
		/* for�� ������ �ʱⰪ�� �������� ���� ������ �Ҵ��� �� �ִ�. (����(T/F)�� �ϳ��� ����)*/
		for(int i =0, j =0 ; i <10 ; i++, j++ ) {
			System.out.println(i + "*" + j + ":" + (i * j) );
		}
		
		// * for���� ����ؼ� 1���� 100���� ���� �� 1*2*3*4*......*100
		int test1 = 1;
		for (int test2 = 1; test2 <= 10 ; test2++) {
			test1 *= test2;		//test1 = test1 * test2
		}
			System.out.println("1���� 10���� ���� �� : " + test1); 
		
		
//		System.out.println("==================================");
//		// * for���� ����ؼ� 1���� 100���� ���� �� ���
		int sum = 0;		// �ʱⰪ 0���� �Ҵ�
		for(int i =1; i <= 100 ; i++) {
			sum += i;	// sum = sum + i
		}
			System.out.println("1���� 100���� ���� �� : " + sum);
		
		/*
		 * ���� for �� : 1�� ~ 9�ܱ��� ������ ���
		 */
		System.out.println("======������ ���=======");
		for ( int i =1; i <= 9 ; i++) {		//i : ���� ���
			for (int j = 1; j <= 9 ; j++)	{ 
				System.out.println( i + " * " + j + " = " + (i*j));
			} 
			System.out.println("================================"); // �� ���� ���� �� ���� ���м� 
			
		} 	//for�� ��
			
		/*
		 * for ������ ���� ���� �߻� -> ������ ���� ��� , �ʱⰪ ������ ���� ���� ���
		 */
		
//		for (int i = 0 ;; i++) {
//			System.out.print(i + " "); // ������ ��� ��� ���ư�
//		}
		
//		for ( ; ; ) {
//			System.out.println("���� ����");
//		}
		System.out.println("====================================");
		//���ѷ��� Ż��
		for (int i = 0; ;i++) {
			if ( i > 100 ) {
				break;		//���ѷ��� ����
			}
			System.out.println(i);
		}
		
		/* for���� ����ؼ� 1 -1000������ 4�� ����� ���� ��
		 * ��հ� : double�̿�
		 */
		System.out.println("==================================");
	
	}
}
		
