package Chapter04;
public class Break_Ex04 {
	public static void main(String[] args) {
		// 1. ���� loop�� ����� ������ break Ż��
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break;	//break�� ������ �ش� ������ ���� ������ ��, �ѹ��� ������ ����
		}	//0
		System.out.println("=======================");
		
		//2. for �� ������ if ������ ����ؼ� break�� �־ �ش籸���� ��������
		for( int i = 0; i < 10 ; i++) {
			if (i == 5) {
				break;	//i�� 5�� �Ǹ� break�� �ɷ� for���� �������´�. 5��� �ȵ� 
			}
		System.out.println(i + " ");
		}
		System.out.println("==========================");
		
		//3. ���� loop���� �� break Ż�� (�ϳ��� �ݺ����� �������´�.)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) { 		//i�� 2�� ���� ���������� ��(for�� �ϳ��� ���������� ��)) , �׸��� ������ ���� �ٽ� ����. 
					break;
				}
				System.out.println(i + " , " + j);
			}
		}
		System.out.println("==================");
		
		//4. ���� loop(�ݺ���)���� �Ѳ����� Ż��
		//1) �󺧻�� ( : )
		
		POST1:		for (int i = 0; i < 5; i++) {	// ���� ���� �� " : "���
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					break POST1;		//���� �ְ� �����ϸ� �ش���� �ִ� for������ ������ ��
				}
				System.out.println(i + " , " + j);
			}
		}
		System.out.println("=======================");
		
		//2) ������ ������ false�� ���� ���������� ���
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					i = 100;	//�������� false�� ����
					break;
				}
				System.out.println(i + " , " + j);
			}
			
		}
	
		
		
		
	}

}