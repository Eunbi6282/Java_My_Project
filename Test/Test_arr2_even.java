package Test;
public class Test_arr2_even {
	public static void main(String[] args) {
		
		int arr2[] = new int [300];
		//100���� 300���� Ȧ��
		
		
		
		for (int i = 100; i < arr2.length; i++) {
			arr2[i] = i;
			if (i % 2 == 1) {
				System.out.println(i + "��°���� ���� : " + arr2[i]);
			} 
		}
	}

}
