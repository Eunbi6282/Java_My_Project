package Chapter04;
public class While_Ex03 {
	public static void main(String[] args) {
		
		//while  �� �⺻����
		int a = 0;		//�ʱⰪ
		while (a < 10) {	//���ǽ�
			System.out.print(a + " ");
			a++; 		//������
		} 	//0,1,2,3,4,5,6,7,8,9 : 10�� ���
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//while���� 10���� �����ؼ� 1�� ����
		int b = 10;
		while (b > 0) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println();
		
		//for���� 10���� �����ؼ� 1�� ����
		for( int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		
		//while���� ���ѷ���
//		while (true) {		//�׻� true���� �ǹǷ� ���ѷ���
//			System.out.println("while�� ���� ���� �߻�");
//		}
		System.out.println();
		//while�� ���� ���� ����
		int c = 0;
		while (true ) {
			if (c > 100) {
				break;
			}
			System.out.print(c + " ");
			c++;
		}
		
		
		
		
	}

}
