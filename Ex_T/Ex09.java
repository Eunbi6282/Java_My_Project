package Ex_T;

public class Ex09 {

	public static void main(String[] args) {
		
		double c = (double) Math.random();	//난수 발생기 (임의의 수를 자동으로 발생시킴) 
		//Math의 random메소드
		// 0.0000000xxx ~ 0.99999xxx
		
		System.out.println(c);
		
		int d = (int) (Math.random() * 10);	// *10을 해서 0~9까지의 임의의 값
		int e = (int) (Math.random() * 10 + 1); //1~10까지의 랜덤한 값
		
		System.out.println("0부터 9까지의 랜덤한 값 : " + d);
		System.out.println("1부터 10까지의 랜덤한 값 : " + e);
		
		int f = (int) (Math.random() * 100 +1 );	//1 ~ 100까지 난수 발생
		
		
		
		
	}

}
