package practice;

public class Apple{
	public void print() {
		System.out.println("�ȳ�");
	}
	
	public int data() {
		return 3;
	}

	public double sum(int a, double b) {
		return a + b;	// a�� b�� ���Ѱ����� ����
	}
	
	public void printMonth(int m) {
		if (m < 0 || m > 12) {
			System.out.println("�߸��� �Է�");
		}
		System.out.println(m + "�� �Դϴ�");
	}
	
}
