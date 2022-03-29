package Ex_T;
public class Ex05 {
	public static void main(String[] args) {

		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		int sum =0;	//합하는 변수
		
		for(int i = 0; i < scores.length ; i++) {
			sum += scores[i];
		}
		System.out.println("배열의 1부터 10까지의 합은 : " + sum);
		
		
	}

}
