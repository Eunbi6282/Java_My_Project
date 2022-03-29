package practice;

public class While {

	public static void main(String[] args) {
		//while
		int num = 0, sum = 0;
		while(sum < 100) {
			sum += num;
			num++;
		}
		System.out.println(num-1 + "까지의 합" + sum);
		System.out.println();
		
		//for
		int sum2 = 0;
		int q = 0;
		for(q = 0; sum2 < 100; q++) {
			sum2 += q;
		}
		System.out.println(q-1 + "까지의 합 : " + sum2);
		
		
		//for문과 while 상호변환
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		System.out.println();
		int a = 0;
		while (a < 10 ) {
			System.out.print(a);
			a++;
		}
		
		
		
	}

}
