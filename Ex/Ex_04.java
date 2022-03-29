package Ex;
public class Ex_04 {
	public static void main(String[] args) {
		//[문항4] for 문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해 보
//		세요.
//		*
//		**
//		***
//		****
		
		
		for( int i = 1; i < 5; i++) {	//4번 돌아감
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		****
//		***
//		**
//		*
		System.out.println();
		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}	
}		
		
	


