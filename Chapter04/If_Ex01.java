package Chapter04;
public class If_Ex01 {
	public static void main(String[] args) {
		
		//if문 :
		/*
		 * if(조건) {
		 * 		 조건이 참일 때 실행될 코드 ; 
		 * }
		 * 
		 * */
		
		int value1 = 5;
		if (value1 > 3) {
			System.out.println("실행1 : 조건이 참일 때 실행");
		}
		/*
		 * if (조건) {
		 * 		조건이 참일 때 실행할 문장;
		 * } else{
		 * 		조건이 거짓일 때 실행할 문장;
		 * }
		 * */
		boolean bool1 = true;
		boolean bool2 = false;
		
		if (bool1) {
			System.out.println("실행3");		//조건이 true일 때 실행
		} else {
			System.out.println("실행4");		//조건이 false일 때 실행
			
		}
		
		if (bool2) {
			System.out.println("실행5");		//조건이 true일 때 실행
		} else {
			System.out.println("실행6");		//조건이 false일 때 실행
			
		}
		System.out.println("==============================");
		
		//if ~ else는 삼항 연산자로 변환이 가능
		
		System.out.println((bool1) ? "실행7":"실행8"); 	// 참이므로 "실행7"이 출력
		System.out.println((bool2) ? "실행7":"실행8");	// 거짓이므로 "실행8"이 출력
		
		/*
		 * if의 조건이 여러개일 때  -> 삼항 연산자로 변환 불가능
		 * 
		 * if (조건1) {
		 * 		조건1이 참일 때 실행코드;
		 * } else if (조건2) {
		 * 		조건2이 참일 때 실행코드;
		 * } else if (조건3){
		 * 		조건3이 참일 때 실행코드;
		 * } else {
		 * 		위의 조건이 모두 만족하지 않을 때 실행코드;
		 * }
		 * */
		int value3 = 95;
		
		if (value3 >= 90) {
			System.out.println("A학점 , 점수 : "  + value3);
		} else if (value3 >= 80) {
			System.out.println("B학점, 점수 : "  + value3); 		//실행후에 if문을 빠져나온다. 
		} else if (value3 >= 70) {
			System.out.println("C학점, 점수 : "  + value3);
		} else {
			System.out.println("F학점, 점수 : "  + value3);
		}
		
		/*
		 * if 문에서 조건의 순서가 바뀌어 있을 경우
		 * */
		value3 = 85;
		
		if (value3 >= 90) {
			System.out.println("A학점 , 점수 : "  + value3);
		} else if (value3 >= 70) {
			System.out.println("C학점, 점수 : "  + value3); 		//실행후에 if문을 빠져나온다. 
		} else if (value3 >= 80) {
			System.out.println("B학점, 점수 : "  + value3);
		} else {
			System.out.println("F학점, 점수 : "  + value3);
		}
		
		System.out.println("==============================");
		/*
		 * 조건을 부여할 때 세밀하게 적용해야 함
		 * */
		value3 = 75;
		if (value3 <= 100 && value3 >= 90) {
			System.out.println("A학점입니다.");
		} 	else if (value3 < 80 && value3 >= 70) {
			System.out.println("C학점입니다.");
		}	else if (value3 < 90 && value3 >= 80) { 	//두개 다 true로 만족 함
			System.out.println("B학점입니다.");
		}	else {
			System.out.println("F학점입니다.");
		}
		
		/*
		 * if 문에서 실행문의 {}을 생략할 수 있다.
		 * */
		System.out.println("=========================");
		
		if ( 3 < 5)
			System.out.println("안녕하세요");		//if에서 {}가 생략된 경우
		
		System.out.println("==========================");
		
		if (3 > 5)
			System.out.println("안녕하세요2");
			System.out.println("반갑습니다.");
		
	}

}
