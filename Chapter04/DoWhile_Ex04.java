package Chapter04;
public class DoWhile_Ex04 {
	public static void main(String[] args) {
		
		//2. while ���� do While ���� �� : ������ 0�� ��� -> false �� ��� 
		System.out.println("=========�ݺ�Ƚ���� 0�� ���===========");
		int a = 0;
		while (a < 0 ) {
			System.out.println(a + " ");
			a++;
		}
		System.out.println("===========================");
		
		a = 0;
		do {
			System.out.println(a + " ");	// do while���� ������ 1���� �����, false ���� �ѹ��� ���� ��
			a++;
		} while (a < 0);		///������ false
		
		System.out.println("============�ݺ� Ƚ���� 1�� ���==================");
		
		//2. �ݺ� Ƚ���� 1�� ���
		a = 0;
		while (a < 1) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		} while (a < 1) ;		//�ʱⰪ 0�� ��µ����� 0���� 1�� ������ ���� false�̹Ƿ� ��� �ȵ���
		
		
		
		System.out.println("======�ݺ� Ƚ���� 10�� ���==========");
		a = 0;
		while (a < 10) {
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 10);
		
		
	}

}
