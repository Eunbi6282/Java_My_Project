package Chapter04;
public class Continue_Ex05 {
	public static void main(String[] args) {
		
		//1. 단일 루프에서 continue(밑에 구문을 실행하지 않고 증감으로 다시 간다. break 처럼 구문을 빠져나가는 것은 아님)
		
		for (int i = 0; i < 10; i++) {
			continue;
			// System.out.println("출력 구문 오류"); 	//continue는 조건없이 쓰지 않음
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			continue;		//continue를 조건없이 하위에 실행문을 사용하면 오류발생
			//System.out.println();
		}
		System.out.println();
		System.out.println("======continue처리=========");
		
		//2. 조건을 사용해서 continue 처리
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;		//i가 5가되면 실행문을 출력하지 않음, 5만 안나옴
								//continue는 구문을 빠져나가지 않고 5일때만 실행문을 출력하지 않고 다시 증가값으로 가서 다시 계산 시작
			}
			System.out.print( i + " ");
		}
		
		System.out.println();
		System.out.println("=======break처리=========");
		
		//2. 조건을 사용해서 break 처리
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;		//i가 5가되면 실행문을 출력하지 않음, 5가 되는 순간 구문을 아예 빠져나감
			}
			System.out.print( i + " ");
		}
		
		System.out.println();
		System.out.println("=======다중 루프문의 continue=========");
		
		//3. 다중 루프문에서 continue사용
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					continue;		//j가 3일때만 출력x
				}
				System.out.println(i + " , " + j);
			}
		}
		
		System.out.println();
		System.out.println("=======다중 루프문의 break=========");
		
		//3. 다중 루프문에서 break사용
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					break;		//j가 3뿐만 아니라 4일때도 출력x
				}
				System.out.println(i + " , " + j);
			}
		}
		
		System.out.println();
		System.out.println("=======continue에서 라벨 사용=========");
		
		//4. continue에서 라벨 사용
POS2:		for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (j == 3) {
						continue POS2;		//continue는 구문을 빠져나가지 않고 출력
					//j가 3,4일때 pos2로 간 후 다시 증감으로 간 후 계산을 이어감
					}
				System.out.println(i + " , " + j);
				}
	    	}
		
		System.out.println();
		System.out.println("=======break에서 라벨 사용=========");
		
		//4. break에서 라벨 사용
POS3:		for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (j == 3) {
						break POS3;		//j가 3이 될 때 모든 구문 종료
					}
					System.out.println(i + " , " + j);
				}
		    }
				
		
	}

}
