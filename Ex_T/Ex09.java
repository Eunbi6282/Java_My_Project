package Ex_T;

public class Ex09 {

	public static void main(String[] args) {
		
		double c = (double) Math.random();	//���� �߻��� (������ ���� �ڵ����� �߻���Ŵ) 
		//Math�� random�޼ҵ�
		// 0.0000000xxx ~ 0.99999xxx
		
		System.out.println(c);
		
		int d = (int) (Math.random() * 10);	// *10�� �ؼ� 0~9������ ������ ��
		int e = (int) (Math.random() * 10 + 1); //1~10������ ������ ��
		
		System.out.println("0���� 9������ ������ �� : " + d);
		System.out.println("1���� 10������ ������ �� : " + e);
		
		int f = (int) (Math.random() * 100 +1 );	//1 ~ 100���� ���� �߻�
		
		
		
		
	}

}
