package chapter06_07.Ex02;

public class EffectiveOfDataPrimaryArgument {
	int abc; 		//필드 : heap영역에 저잘, 객체화 필요
	
	static int twice(int a) {	//정수를 받아서 *2한 값을 return
		a = a * 2;
		return a; 		//a : 변수는 메소드가 종료될 때 삭제 됨
	}

	public static void main(String[] args) {
		int a = 3;		//지역변수 (stack영역에 변수면과 같이 저장)
		int result1 = twice(3);
		System.out.println(result1); 	//6
		
		int result2 = twice(a);
		System.out.println(result2);	//6
		System.out.println(a); 			//3 	<==
	}

}
