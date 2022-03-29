package practice;

public class Apple{
	public void print() {
		System.out.println("안녕");
	}
	
	public int data() {
		return 3;
	}

	public double sum(int a, double b) {
		return a + b;	// a와 b를 합한값으로 리턴
	}
	
	public void printMonth(int m) {
		if (m < 0 || m > 12) {
			System.out.println("잘못된 입력");
		}
		System.out.println(m + "월 입니다");
	}
	
}
