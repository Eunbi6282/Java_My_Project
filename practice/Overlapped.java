package practice;
public class Overlapped {
	public static void main(String[] args) {

		//if -if
		int value1 = 5;
		int value2 = 3;
		if(value1 > 4) {
			if(value2 < 2) {
				System.out.println("실행1");
			}else {
				System.out.println("실행2");
			}
		}else {
			System.out.println("실행3");
		}
		
		//switch - if중복
		int value3 = 2;
		switch(value3) {
		case 1:
			for(int k = 0; k < 10; k++) {
				System.out.println(k + " ");
			}
			break;
		case 2 : 
			for(int k = 10; k > 0; k--) {
				System.out.print(k + " ");
			}
			break;
		}
		System.out.println();
		System.out.println();
		
		//for-for중복
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(i + " " + j );
				if(i == j) {
					System.out.println("i = j");
				}
			}
			
		}
		
		
		
	}

}
