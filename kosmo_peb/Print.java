package kosmo_peb;

public class Print {

	public static void main(String[] args) {
		System.out.println("화면출력");
		// 자바의 한라인 주석
		/*
		 * 자바 여러라인 주석
		 * 
		 * 
		 */
		System.out.println("화면" + "출력"); // '+' ->문자열일 때 연결연산자
		System.out.println(3.8); // 정수 ,실수를 출력할 때는 ""를 넣지 않는다.
		System.out.println(3 + 5);// +는 정수나 실수일 대 +)더하기)
		System.out.println("3" + "5");
		System.out.println("화면 : " + 3);
		System.out.println("화면 " + 3 + 5);// 문자열이 들어가 있으면 +가 연결 연산자로 됨
		System.out.println("화면" + 3); //연결연산자 필요
	}
}
