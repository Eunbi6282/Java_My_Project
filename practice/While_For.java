package practice;

public class While_For {

	public static void main(String[] args) {
		
		int b = 10;
		while (b > 0) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println();
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		
		//while ���ѷ�Ʈ
//		while(true) {
//			System.out.println("���ѷ���");
//		}
		System.out.println();
		//while ���ѷ���Ż��
		int c = 0;
		while (true) {
			if(c > 10) {
				break;
			}
			System.out.print(c + " ");
			c++;
		}
		
		
	}

}
