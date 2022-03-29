package chapter14.Ex01;

//Exception 이 예외의 최상위 클래스
// ArrayIndexOutOfBoundsException 도 Exception을 상속하고 있다.
public class ArrayException_2 {

	public static void main(String[] args) {
		int[] arr = new int[5]; // arr배열에 배열방 5개를 생성, index : 0,1,2,3,4
				
				try {
				
					for (int i = 0; i <=5; i++) {
						arr[i]= i;
						System.out.println(arr[i]);
					}
				}catch (Exception e) {	//하위에 있는 모든 Exception을 처리
					e.printStackTrace(); //예외에 대한 정보를 출력
					System.out.println("배역의 인덱스 방번호를 넘겼습니다.");
				}finally {
					System.out.println("출력(finally)");
				}
				
				System.out.println("프로그램 종료");
	}

}
