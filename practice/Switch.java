package practice;

public class Switch {
	public static void main(String[] args) {
		//100�� ������ 80�� �̻��� pass, �������� fail
		
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
