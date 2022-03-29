package Chapter04;
public class For_Ex03 {
	public static void main(String[] args) {

		
		//For 기본 작동
		
		int a; 			//전역 변수 : 블락 밖에서 선언된 변수, 선언 (0), 초기값(x)
		for( a = 0 ; a < 5 ; a++)	{
			System.out.print(a + " ");		// for
		}
		System.out.println("===================");
		System.out.println(a);		//a를 4까지 넣었으니 for문의 조건을 충족하지 못해 for문을 벗어나게 됨. 지금은 4에서 1을 더해서 5가 됨
		
		System.out.println("=====================");
		for (int b = 0 ; b <= 10 ; b++) {
			System.out.println( b );
		}
		// System.out.println(b);   -> 에러, 지역변수 b를 블락 밖에서 출력 했으므로 오류
		System.out.println("======================");
		
		int c;
		for (c = 10 ; c > 0 ; c--) {
			System.out.println(c);
		}
		
		// System.out.println(c);
	
		for ( int i = 0 ; i < 100 ; i += 2) { 	//2의 배수가 출력됨
			System.out.print(i + " ");
		}
		System.out.println("==============================");
		
		/* for문 내에서 초기값과 증가값은 여러 변수를 할당할 수 있다. (조건(T/F)은 하나만 가능)*/
		for(int i =0, j =0 ; i <10 ; i++, j++ ) {
			System.out.println(i + "*" + j + ":" + (i * j) );
		}
		
		// * for문을 사용해서 1부터 100가지 곱한 값 1*2*3*4*......*100
		int test1 = 1;
		for (int test2 = 1; test2 <= 10 ; test2++) {
			test1 *= test2;		//test1 = test1 * test2
		}
			System.out.println("1부터 10까지 곱한 값 : " + test1); 
		
		
//		System.out.println("==================================");
//		// * for문을 사용해서 1부터 100까지 더한 값 출력
		int sum = 0;		// 초기값 0으로 할당
		for(int i =1; i <= 100 ; i++) {
			sum += i;	// sum = sum + i
		}
			System.out.println("1부터 100가지 더한 값 : " + sum);
		
		/*
		 * 이중 for 문 : 1단 ~ 9단까지 구구단 출력
		 */
		System.out.println("======구구단 출력=======");
		for ( int i =1; i <= 9 ; i++) {		//i : 단을 출력
			for (int j = 1; j <= 9 ; j++)	{ 
				System.out.println( i + " * " + j + " = " + (i*j));
			} 
			System.out.println("================================"); // 각 단이 끝날 때 마다 구분선 
			
		} 	//for문 끝
			
		/*
		 * for 문에서 무한 루프 발생 -> 조건이 없을 경우 , 초기값 증가값 조건 없을 경우
		 */
		
//		for (int i = 0 ;; i++) {
//			System.out.print(i + " "); // 조건이 없어서 계속 돌아감
//		}
		
//		for ( ; ; ) {
//			System.out.println("무한 루프");
//		}
		System.out.println("====================================");
		//무한루프 탈출
		for (int i = 0; ;i++) {
			if ( i > 100 ) {
				break;		//무한루프 종료
			}
			System.out.println(i);
		}
		
		/* for문을 사용해서 1 -1000까지의 4의 배수만 더한 값
		 * 평균값 : double이용
		 */
		System.out.println("==================================");
	
	}
}
		
