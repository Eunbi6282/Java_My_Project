package Ex_T;

public class Ex04 {

	public static void main(String[] args) {

		int lineCount;	//다음 라인으로 개행/라인출력
		int statCount;	//별을 출력하는 변수
		
		for(lineCount = 0; lineCount < 4 ; lineCount++) {	//라인 4개 이므로 4번 돌아감
			for(statCount = 0; statCount <= lineCount;statCount++) {
				System.out.print("*");
			}
			System.out.println();	//한번 나가면서 enter
		}
		
		
		
		
	}

}
