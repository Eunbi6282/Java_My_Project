package practice;

public class For {

	public static void main(String[] args) {

		for (int i = 0, j = 0; (i + j) < 10; i++ , j++) {
			System.out.println(i + j);		}
		System.out.println();
		// for���ѷ���
		for(int i = 0;; i++) {
			if (i > 10) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println("���ѷ���Ż��");
		
	}

}
