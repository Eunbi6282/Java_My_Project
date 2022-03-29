package Ex;

public class Break {

	public static void main(String[] args) {
		//for문 안에서 if 와 함께 사용
		for(int i = 0; i < 10;i++) {
			if(i == 5) {	//i가 5가 되면 탈출
				break;
			}
			System.out.println(i);
		}
		
		//이중for문 내에서 break이용한 탈출
		int sum = 0;
		for( int i = 0; i < 10; i++) {
			for(int j = 0; j < 10 ; j++) {
				sum = i+j;
				if(j == 3) {
					break;
				}
				System.out.println(i + " + " + j + " = " + sum);
			}
		}
		System.out.println("===========");
		//변수값 조정해 이중for문 한번에 탈출
		for(int i =0; i < 10; i++) {
			for(int j = 0; j < 10;j++) {
				if(j == 3) {
					i = 100;
					break;
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("=======================");
		//레이블 이용
		out:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(j == 3) {
					break out;		//j가 3이되면 out이 있는 곳까지 탈출, 전체 for문 탈출
				}
				System.out.println(i + " " + j);	
			}
		}
		
		
		
	}

}
