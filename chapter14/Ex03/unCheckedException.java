package chapter14.Ex03;

//���࿹��(unCjecked Exception, RunTime Exception) : ������ �ܰ迡���� ���� �߻����� ����

class AA{}
class BB extends AA{}
public class unCheckedException {
	public static void main(String[] args) {
		//���� ����
		
		// ArithmeticException : 0���� � ���� ������ ������ �߻�
		//System.out.println(10 / 0);
		
		// ClassCastException : Ŭ������ Ÿ���� ��ȯ�� �� ��ȯ���� �ʴ� ����
		AA aa = new AA();
		//BB bb = (BB) aa;  // ������ �ܰԿ��� ������ �߻����� �ʴ´�. -> AA�� BBŸ������ �ٿ�ĳ���� �Ұ�
		
		int[] array = {1,2,3};
		System.out.println(array[2]);
		// ArrayIndexOutOfBoundsException : �迭�� �������� �ʴ� ���ȣ�� ����� ��� 
		// System.out.println(array[3]);
		
		// NumberFormatException :�������� ���ڸ� ����Ÿ������ ��ȯ�� �� ���� ���� �߻�
		// int num = Integer.parseInt("10!");
		int num2 = Integer.parseInt("10"); //���ڿ� 10�� ������ ��ȯ
		System.out.println(num2);
		
		// NullPointerExceptio: ��ü��null���� �޼��带 ȣ���ϴ� ��� �߻�
		String string = null;
		System.out.println(string.charAt(4)); // ���ڿ����� index 4��° ���� ������ ��
		
		
	}
}
