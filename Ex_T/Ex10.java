package Ex_T;
public class Ex10 {
	public static void main(String[] args) {
		
		int a,b;	//a => 10���ڸ� ǥ��, b => 1�� �ڸ� ǥ��
		
		for (int i = 1; i <= 99; i++) {
			a = i/10 ; 	//a => 10���ڸ� ǥ��, i �� 10���� ������ �� ������
			b = i%10;	//b => 1���ڸ� ǥ��, i�� 10���� ���� ���������� ������
			
			if((a == 3 || a== 6 || a == 9) && (b == 3 || b == 6 || b == 9)) { //�����ڸ�, �����ڸ���� 3,6,9�� ���
				System.out.println(i + " : �ڼ� ¦¦");
			}else if ((a==3 || a==6 || a==9) && (b!=3 || b!=6 || b !=9)) {
				System.out.println(i + " : �ڼ� ¦");
			}else if((a!=3 || a!=6 || a !=9) && (b==3 || b==6 || b==9)) {
				System.out.println(i + " : �ڼ� ¦");
			}
		}
	}

}
