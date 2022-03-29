package practice;

public class Switch {
	public static void main(String[] args) {
		//100점 만점에 80점 이상은 pass, 나머지는 fail
		
		int a = 77;
		switch(a / 10){
		case 10:
		case 9:
		case 8:
			System.out.println("PASS"); break;
		default:
			System.out.println("Fail");
		}
	}

}
