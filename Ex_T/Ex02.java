package Ex_T;


public class Ex02 {

	public static void main(String[] args) {
	int sum = 0;	//합한 값을 저장하는 변수
	int num = 1;
	
	while(num <= 100) {
		sum += num;		//sum = sum + num
		num++;
	}
	System.out.println("1부터 100까지의 합은 :" + sum);
	
	}

}
