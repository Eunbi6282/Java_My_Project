package practice;
public class Overlapped {
	public static void main(String[] args) {

		//if -if
		int value1 = 5;
		int value2 = 3;
		if(value1 > 4) {
			if(value2 < 2) {
				System.out.println("����1");
			}else {
				System.out.println("����2");
			}
		}else {
			System.out.println("����3");
		}
		
		//switch - if�ߺ�
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
		
		//for-for�ߺ�
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