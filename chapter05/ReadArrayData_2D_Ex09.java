package chapter05;
public class ReadArrayData_2D_Ex09 {
	public static void main(String[] args) {
		// 1. 2���� ������ �迭�� ����
		int[][] array1 = new int [2][3];
		System.out.println(array1.length);  // 2���� �迭�� ��� :.length -> ���� ���� ���
		System.out.println(array1[0].length);	// ���� �ε��� 0�� ���� ����
		System.out.println(array1[1].length);	// ���� �ε��� 1�� ���� ����
		
		int[] array11 = new int [10];
		System.out.println(array11.length);	// 1���� �迭�� ��� :.length -> ���� ���� ���
		System.out.println();
		System.out.println("=========================");
		
		// 2���� �迭 ��� ��� 1
		int [][] array2 = new int [][] {{1,2},{3,4,5}};
		
		//2���� �迭���� ��, �� ����
		System.out.println(array2.length);		// 2 (���� ����)
		System.out.println(array2[0].length);	// 2 (0�� ���� ���� ����)
		System.out.println(array2[1].length);	// 3 (1�� ���� ���� ����)
		System.out.println("=========================");
		
		// �迭�� index ��ȣ��  ����ϴ� ���
		System.out.print(array2[0][0] + " " + array2[0][1]);
		System.out.println();
		System.out.print(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
		
		System.out.println();
		System.out.println("==========���� for���� ����ؼ� ���==================");
		
		//����for���� ����ؼ� ����ϴ� ��� (2�����迭�̱� ������ ����for�� ���)
		for (int i = 0; i < array2.length; i++) {		//�ٱ��� for�� : ���� loop����
			for (int j = 0; j < array2[i].length; j++) {	// i -> ���� ��ȣ , ���� for�� : ���� loop����
				 System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=============���� enhanced for ��=======================================");
		for (int[] array : array2) {	// 2���� �迭�� ���� ���� 1���� �迭 ����(array)�� ���  
			for (int k : array) {		//�迭�� ���� ������ ��Ƽ� ���
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		int [][] a = {{1,2,3,4,5},{1,2,3}};
		
		System.out.println(a.length);
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int[] is = a[j];
				
			}
		}
		
		
	}

}
