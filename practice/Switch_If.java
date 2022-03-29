package practice;

public class Switch_If {
	public static void main(String[] args) {
		
		int a = 8;
		switch(a) {
		case 10:
		case 9:
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7 :
			System.out.println("c"); break;
		default:
			System.out.println("D");
		}
		
		if (a == 9) {
			System.out.println("A");
		} else if (a == 8) {
			System.out.println("B");
		} else if (a == 7 ) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		
	}
}
