package Ex_T;
public class Ex09_1 {
	public static void main(String[] args) {

	int[] num = new int[10];
	int sum = 0;
	double avg = 0;	//��� = ��ü���� ���ؼ�(sum) / ���� ����(num.length)
					// ����� ����� ���� �ݵ�� double������ ����
	
	System.out.println("������ ������ : " );
	
	//�迭�� �� �濡 ������ ��(1~10)�� �߻����Ѽ� �Է�
	for (int i = 0; i < num.length; i++) {
		num[i] = (int)(Math.random() * 10 + 1); 	
		//num�� 0������� 9������� :  1 ~ 10
		System.out.print(num[i] + " ");
	}
	
	System.out.println();
	System.out.println("==================");
	
	//��հ� : �迭�� �� ���� ������ ���� ���ؼ� ��ü ���� ������ ������
	for (int i = 0; i < num.length; i++) {
		sum += num[i];	//sum = sum + num[i];
	}
	avg = (double) sum / num.length;	//��� = �� / ���� ����
	// sum�� int�ϱ� double�� Ÿ�� ��ȯ
	
	System.out.println("����� : " + avg);
	System.out.println("���� : " + sum);
	System.out.println("���� ������ : " + num.length);

	}
}