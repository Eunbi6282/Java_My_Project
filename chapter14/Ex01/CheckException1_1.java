package chapter14.Ex01;

public class CheckException1_1 {

	public static void main(String[] args) {
		
		try {
		System.out.println( 10 / 0);		//프로그램이 비정상 종료됨
				// 예외에 대한 처리
		}catch (ArithmeticException e) {
			// try블락에 오류가 발생할 경우에 작동됨
			// catch블락을 설정하지 않더라도 예외 처리가 된거임
			e.printStackTrace();		//오류에 대한 자세한 정보를 출력
			System.out.println("0을 넣을 수 없습니다.");
		} finally {
			//try{} 오류가 없어도 작동되고 , 오류가 있어도 작동 됨
			//try{}가 작동되면 항상 작동
			//객체를 사용 후 객체의 메모리를 제거할 때 ex) sc.close();[스캐너 중단 구문]
			System.out.println("Finally{}은 항상 호출 됨");
			
		}
										
		System.out.println("프로그램을 정상 종료합니다.");	//정상 종료

	}

}
