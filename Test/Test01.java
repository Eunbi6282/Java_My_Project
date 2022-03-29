package Test;

public class Test01 {

	public static void main(String[] args) {
		
		double sum = 0;		//더한 값을 저장하는 변수
		double j = 0;		//4의 배수를 카운트하는 변수
		for( int i = 1; i <=1000; i++) {
			if (i % 4 == 0) {
				sum += i;
				j++;
			}
		}
		System.out.println("합은 : " + sum);
		System.out.println("평균은 : " + sum / j );
		System.out.println(j);
		
		
		
		
	}
	
	
	
	
	
	

}
