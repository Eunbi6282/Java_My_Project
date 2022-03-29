package Chapter04;
public class Break_Ex04 {
	public static void main(String[] args) {
		// 1. 단일 loop가 적용된 곳에서 break 탈출
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break;	//break를 만나면 해당 구문을 빠져 나오게 됨, 한번만 찍히기 때문
		}	//0
		System.out.println("=======================");
		
		//2. for 문 내에서 if 조건을 사용해서 break를 넣어서 해당구문을 빠져나옴
		for( int i = 0; i < 10 ; i++) {
			if (i == 5) {
				break;	//i가 5가 되면 break가 걸려 for문을 빠져나온다. 5출력 안됨 
			}
		System.out.println(i + " ");
		}
		System.out.println("==========================");
		
		//3. 다중 loop문일 때 break 탈출 (하나의 반복문만 빠져나온다.)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) { 		//i가 2인 값만 빠져나오게 됨(for문 하나만 빠져나오게 됨)) , 그리고 나머지 값은 다시 돈다. 
					break;
				}
				System.out.println(i + " , " + j);
			}
		}
		System.out.println("==================");
		
		//4. 다중 loop(반복문)에서 한꺼번에 탈출
		//1) 라벨사용 ( : )
		
		POST1:		for (int i = 0; i < 5; i++) {	// 라벨을 붙일 때 " : "사용
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					break POST1;		//라벨을 넣고 정의하면 해당라벨이 있는 for문까지 나가게 됨
				}
				System.out.println(i + " , " + j);
			}
		}
		System.out.println("=======================");
		
		//2) 변수의 조건을 false로 만들어서 빠져나가는 방법
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					i = 100;	//변수값을 false로 조정
					break;
				}
				System.out.println(i + " , " + j);
			}
			
		}
	
		
		
		
	}

}
