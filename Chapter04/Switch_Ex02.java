package Chapter04;
public class Switch_Ex02 {
	public static void main(String[] args) {
		
		// 1. Break를 처리하지 않았을 때 -> 해당 case로 이동한 후 switch 문을 빠져나오지 않고 하위의 case구문이 모두 출력됨
		int value1 = 2;
		
		switch (value1 ) {
		case 1:
			System.out.println("A학점");
		case 2 : 							// (value값에 해당하는)2가 들어가 있는 case구문을 실현시킴
			System.out.println("B학점");
		case 3 : 
			System.out.println("C학점");
		default :
			System.out.println("F학점");
		
		}
		System.out.println("=========================================");
		// 2.  Break가 포함된 경우
		int value2 = 3;
		
		switch (value2 ) {
		case 1:
			System.out.println("A학점");
			break;							// break -> 구문을 빠져나오도록 도와줌
		case 2 : 						
			System.out.println("B학점");
			break;
		case 3 : 
			System.out.println("C학점");
			break;
		default :
			System.out.println("F학점");		//switch의 마지막 case는 break 생략가능
		
		}
		System.out.println("===============================");
		value2 = 2; 	//기존에 int로 선언되어 있기 때문에 값만 할당해주면 됨
		
		if (value2 == 1 ) {
			System.out.println("A학점 (if)");
		} else if (value2 == 2) {
			System.out.println("B학점 (if)");
		} else if (value2 == 3) {
			System.out.println("C학점 (if)");
		} else {
			System.out.println("F학점 (if)");
		}
		
		/*
		 * switch문을 사용해서 점수가 7점 이상은 PASS, 7점 이하는 fAIL을 출력
		 */
		
		int a = 10;
		
		switch(a) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("PASS");
			break;
		default:
			System.out.println("FAIL");
		}
		
		
	}

}
