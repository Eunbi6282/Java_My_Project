package Chapter04;
public class DoWhile_Ex04 {
	public static void main(String[] args) {
		
		//2. while 문과 do While 문의 비교 : 실행이 0인 경우 -> false 인 경우 
		System.out.println("=========반복횟수가 0인 경우===========");
		int a = 0;
		while (a < 0 ) {
			System.out.println(a + " ");
			a++;
		}
		System.out.println("===========================");
		
		a = 0;
		do {
			System.out.println(a + " ");	// do while에서 무조건 1번은 실행됨, false 여도 한번은 실행 됨
			a++;
		} while (a < 0);		///조건이 false
		
		System.out.println("============반복 횟수가 1인 경우==================");
		
		//2. 반복 횟수가 1인 경우
		a = 0;
		while (a < 1) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		} while (a < 1) ;		//초기값 0은 출력됐지만 0에서 1이 더해진 값은 false이므로 출력 안됐음
		
		
		
		System.out.println("======반복 횟수가 10인 경우==========");
		a = 0;
		while (a < 10) {
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 10);
		
		
	}

}
