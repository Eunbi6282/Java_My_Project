package practice;
public class Do_While {
	public static void main(String[] args) {
		
		//������ false�� ���
		int a; 
//		a = 0;
//		while(a < 0) {
//			System.out.print(a + " ");
//			a++;
//		}
//		System.out.println();
		
		//do - while : �ϴ� ���๮�� �ѹ� ������ �� ���� �Ǵ�
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		}while(a < 0);
		
		System.out.println("======1ȸ �̻� �ݺ�========");
		int b; 
		b = 0;
		while(b < 10) {
			System.out.print(b + " ");
			b++;
		}
		System.out.println();
		
		b = 0;
		do {
			System.out.print(b + " ");
			b++;
		}while(b < 10);
		 System.out.println();
		 
		//�ݺ�Ƚ���� 1�� �� 
		a = 0;
		while(a < 1) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a < 1);
	}

}
