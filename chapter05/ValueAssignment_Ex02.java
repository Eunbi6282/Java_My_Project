package chapter05;
public class ValueAssignment_Ex02 {
	public static void main(String[] args) {
		//1. �迭 ������ �濡 �� �Ҵ��ϱ� ( 3���� )
		int[] array1= new int[3];	//�迭 ���� : array1, ��ũ�� : 3,    ���ȣ(index):0,1,2
					// array1[0] 0��° ��, array1[1] 1��° ��, arrary1[2] 2��° ��
		
		//�迭�� �� �濡 ���� �Ҵ�
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		
		System.out.println(array1[0] + " " + array1[1]+ " " + array1[2]);
		System.out.println("============================");
		
		int[] array2= new int[3];	//�迭 ���� : array1, ��ũ�� : 3,    ���ȣ(index):0,1,2
				// array1[0] 0��° ��, array1[1] 1��° ��, arrary1[2] 2��° ��
		
		//�迭�� �� �濡 ���� �Ҵ�
		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;
		
		System.out.println(array2[0] + " " + array2[1]+ " " + array2[2]);
			
		//�迭�� ���Ұ��� �����ϴ¹��2  : �迭�� ���� �ʱⰪ�� �� ��
		int[] array3 = new int[] {6,7,8,9,10};	//�迭 ���� ����� ���ÿ� ���Ҵ�, �ʱⰪ�� �� ��
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2] + " " +
		array3[3] + " " + array3[4]);
		
		System.out.println("===============");
		
		int[] array4;				//������ �ϰ� �� �ֱ�
		array4 = new int[] {3,4,5}; 
		System.out.println(array4[2]+ " ");  //2������ ���� ���a
		
		System.out.println("==================");
		
		//�迭�� ���Ұ��� �����ϴ� ���3
		int[] array5 = {10,11,12,13};	//new Ű���� ���� ���
		System.out.println(array5[0] + " " + array5[1] + " " + array5[2] + " " + array5[3]);
		
		//int[] array6;				//�� ���ο� �ٷ� ������ new int�����ص� ���������� �̷��� ������ �Ҵ��ϰ� new int�� �����ϸ� ���� �߻�
		// array4 = {3,4,5}; 
		//System.out.println(array6[2]+ " ");
		
		
	}

}
