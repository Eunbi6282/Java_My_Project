package chapter06_07.Ex02;

public class EffectiveOfDataPrimaryArgument {
	int abc; 		//�ʵ� : heap������ ����, ��üȭ �ʿ�
	
	static int twice(int a) {	//������ �޾Ƽ� *2�� ���� return
		a = a * 2;
		return a; 		//a : ������ �޼ҵ尡 ����� �� ���� ��
	}

	public static void main(String[] args) {
		int a = 3;		//�������� (stack������ ������� ���� ����)
		int result1 = twice(3);
		System.out.println(result1); 	//6
		
		int result2 = twice(a);
		System.out.println(result2);	//6
		System.out.println(a); 			//3 	<==
	}

}
