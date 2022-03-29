package Chapter04;
public class While_Ex03 {
	public static void main(String[] args) {
		
		//while  의 기본문법
		int a = 0;		//초기값
		while (a < 10) {	//조건식
			System.out.print(a + " ");
			a++; 		//증감식
		} 	//0,1,2,3,4,5,6,7,8,9 : 10번 출력
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//while문의 10부터 시작해서 1씩 감소
		int b = 10;
		while (b > 0) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println();
		
		//for문의 10부터 시작해서 1씩 감소
		for( int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		
		//while에서 무한루프
//		while (true) {		//항상 true값이 되므로 무한루프
//			System.out.println("while의 무한 루프 발생");
//		}
		System.out.println();
		//while의 무한 루프 중지
		int c = 0;
		while (true ) {
			if (c > 100) {
				break;
			}
			System.out.print(c + " ");
			c++;
		}
		
		
		
		
	}

}
