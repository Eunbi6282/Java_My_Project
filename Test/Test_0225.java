package Test;

public class Test_0225 {

	public static void main(String[] args) {
		// continue�� ����ؼ� 1��~19�� ����ϴµ� Ȧ���ܸ� ���
		/*
		 *  1 * 1 =1
		 *  1 * 2 =2
		 *  
		 *  ==========
		 *  3 * 1 = 3
		 *  ..........
		 * */
		
POS:		for (int i = 1; i <= 19; i++) {
				for (int j = 1; j <= 9; j++) {
					if (i% 2 == 0) {
						System.out.println("===================");
						continue POS;
					}else 
					System.out.println(i + " * " + j +" = "+ i*j);
				}
			}
	}

}
