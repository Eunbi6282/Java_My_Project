package chapter05;
public class PrimaryAndReferenceType_04 {
	public static void main(String[] args) {
		
		// 1. �⺻ ������ Ÿ���� ���� ���� (Stack ���� ����)
		int value1 = 3;
		int value2 = value1;
		
		value2 = 7;
		System.out.println(value1);		//3
		System.out.println(value2);		//7
		System.out.println("==================");
		
		// 2. ���� �ڷ����� ���� ���� (Stack�� ���� �ּ�(-> ���� �ڷ����� ���� �������� �����ϱ� ����)�� ����)
		int[] array1 = new int [] {3,4,5,7};
		int[] array2 = array1;		//array2�� ���ÿ������� array1�� heap������ �ּҸ� ī��
		array2[0] = 7;
		System.out.println(array1[0]);		//7
		System.out.println(array2[0]);		//7
		System.out.println(array1);
		System.out.println(array2);
		
		

		
	}

}
