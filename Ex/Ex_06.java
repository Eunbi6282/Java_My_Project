package Ex;

public class Ex_06 {

	public static void main(String[] args) {
		//�־��� �迭�� �׸񿡼� �ִ밪�� ���غ����� (for ���� �̿��ϼ���)
		int max = 0;
		int[] array = {4,5,1,8,3};
		
		for ( int i = 0; i < array.length; i++) {
			if (array[i] > max  ) {		
				max = array[i];
			}
		}
		System.out.println("max: " + max);
	}				
}
			


