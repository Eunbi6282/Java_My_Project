package Chapter02;

public class Changechar {
	public static void main(String[] args) {
		int data =10; 
		
		// 10���� ���� -> 2����/ 8����/ 16���� ���ڿ�
		System.out.println(Integer.toBinaryString(data));	//1010  2����
		System.out.println(Integer.toOctalString(data));	//12 	8����
		System.out.println(Integer.toHexString(data));    	//a 	16�����ˤä�	
		
	}

}
