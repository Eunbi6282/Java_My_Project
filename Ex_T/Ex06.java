package Ex_T;

public class Ex06 {

	public static void main(String[] args) {
		int[] array = {4,5,1,8,3,10};
		int max = 0; 	//�ִ밪 �����ϴ� ����
		
		//��ȯ�ϸ鼭 �� �迭���� ���ϸ鼭 �� ū ���� max���� ���� ����
		for (int i = 0; i < array.length; i++) { // �� �濡�� ���� ������
			if(array[i] > max) {	//�� �濡 �ִ� ���� max���� Ŭ �� 
				max = array[i];		//max�� ū ���� ����
			}
		}
		System.out.println("�ִ밪�� : " + max);
	
		
		
		
	}

}
