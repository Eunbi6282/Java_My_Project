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
		
		//while 무한루트
//		while(true) {
//			System.out.println("무한루프");
//		}
		System.out.println();
		//while 무한루프탈출
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
