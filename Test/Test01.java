package Test;

public class Test01 {

	public static void main(String[] args) {
		
		double sum = 0;		//���� ���� �����ϴ� ����
		double j = 0;		//4�� ����� ī��Ʈ�ϴ� ����
		for( int i = 1; i <=1000; i++) {
			if (i % 4 == 0) {
				sum += i;
				j++;
			}
		}
		System.out.println("���� : " + sum);
		System.out.println("����� : " + sum / j );
		System.out.println(j);
		
		
		
		
	}
	
	
	
	
	
	

}
