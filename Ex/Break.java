package Ex;

public class Break {

	public static void main(String[] args) {
		//for�� �ȿ��� if �� �Բ� ���
		for(int i = 0; i < 10;i++) {
			if(i == 5) {	//i�� 5�� �Ǹ� Ż��
				break;
			}
			System.out.println(i);
		}
		
		//����for�� ������ break�̿��� Ż��
		int sum = 0;
		for( int i = 0; i < 10; i++) {
			for(int j = 0; j < 10 ; j++) {
				sum = i+j;
				if(j == 3) {
					break;
				}
				System.out.println(i + " + " + j + " = " + sum);
			}
		}
		System.out.println("===========");
		//������ ������ ����for�� �ѹ��� Ż��
		for(int i =0; i < 10; i++) {
			for(int j = 0; j < 10;j++) {
				if(j == 3) {
					i = 100;
					break;
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("=======================");
		//���̺� �̿�
		out:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(j == 3) {
					break out;		//j�� 3�̵Ǹ� out�� �ִ� ������ Ż��, ��ü for�� Ż��
				}
				System.out.println(i + " " + j);	
			}
		}
		
		
		
	}

}
