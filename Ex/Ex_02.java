package Ex;

public class Ex_02 {

	public static void main(String[] args) {
		//1 ~ 100 까지 합 프로그램을 작성 하시오.
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;		//sum += i
		}
		System.out.println(sum);
	}

}
