package Ex;
public class Ex_10 {
	public static void main(String[] args) {
//		 반복문을 이용하여 369 게임에서 박수를 쳐야 하는 경우를 순서대로
//		 화면에 출력해보자. 1 부터 시작하며 99 까지만 한다. 실행 사례는 다음과 같다.
//		 3 박수 짝
//		 6 박수 짝
//		 9 박수 짝
//		 13 박수 짝
		
		//십의 자리도 배수, 일의 자리도 배수면 박수 2번
		for (int i = 1; i <= 99; i++) {
			if ((i % 10) == 3 || (i % 10) == 6 || (i % 10) == 9) { //3,6,9의 배수일 때
				if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) { 	
					System.out.println(i + "박수 짝짝");	//모든 자릿수에 들어있을 때
		        }else {
		        	System.out.println(i + "박수 짝"); 	//1의 자릿수만
				} 
			} else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				System.out.println(i + "박수 짝");			//10의 자릿수만
			}
		}
	}
}
