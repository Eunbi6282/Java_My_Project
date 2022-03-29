package practice;
public class Do_While {
	public static void main(String[] args) {
		
		//조건이 false인 경우
		int a; 
//		a = 0;
//		while(a < 0) {
//			System.out.print(a + " ");
//			a++;
//		}
//		System.out.println();
		
		//do - while : 일단 실행문을 한번 실행한 후 조건 판단
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		}while(a < 0);
		
		System.out.println("======1회 이상 반복========");
		int b; 
		b = 0;
		while(b < 10) {
			System.out.print(b + " ");
			b++;
		}
		System.out.println();
		
		b = 0;
		do {
			System.out.print(b + " ");
			b++;
		}while(b < 10);
		 System.out.println();
		 
		//반복횟수가 1일 때 
		a = 0;
		while(a < 1) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a < 1);
	}

}
