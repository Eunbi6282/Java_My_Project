package Chapter03;
public class Operator05 {
	public static void main(String[] args) {
		
		//��Ȳ ������ : (����)? �� : ����
		int value1 = (3>5)? 6 : 9;	//���̸� 6, �����̸� 9
		System.out.println(value1);
		
		int value2 = (5 > 3)? 10:20;	//������ ���̹Ƿ� vlaue2�� 10�� �����
		System.out.println(value2);
		
		int value3 = 5;
		System.out.println((value3 % 2 == 0)? "¦��" : "Ȧ��"); // �������� 0�� �ƴϹǷ� false, "Ȧ��"���
		System.out.println("======================");
		
		//if ������ ó��
		if (value3 % 2 == 0) {
			System.out.println("¦��");
		}else {
				System.out.println("Ȧ��");
			}
		}
	}


