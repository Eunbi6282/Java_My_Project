package Test;

public class Test_0225_2 {

	public static void main(String[] args) {
		//continue ����ؼ� 1�� ~ 19�� ����ϴµ� 3�� ����ܸ� ���
POS1:		for (int i = 1; i <= 19; i++) {
				for (int j = 1; j <= 9; j++) {
					if (i % 3 == 0) {
						System.out.println(i + " * " + j +" = "+ i*j);
					}else {
						continue POS1;
					}
				}
				System.out.println("===================");
			}

		
		
		
		
	}

}
