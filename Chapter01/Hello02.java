package Chapter01;


public class Hello02 {
	//�޼ҵ� ���� -> ���� �޼ҵ� ���� �ۼ� (�޼ҵ�� : ��üġ����(java)���� �Լ�(��ǲ���� �־ ���α׷��� ���� ����� ���)�� �޼ҵ��� Ī��)
	public static int sum(int n , int m) { //int -> returnŸ�� 
		return n+m; //return ���� int������ 
	}
	
	public static void main(String[] args) {
		//���� ����
		
		int i = 20;  //i������ ������ ����, �ʱⰪ���� 20�� �Ҵ��ؼ� ����
		int s;		// s������ ������ ���� , 
		char a; 	//char�� �ѱ��ڸ� ���� �� ����(�ƽ�Ű��-����, ����, Ư������ ���ڸ����� ���� ,''���)
		String b;
		
		b="������ ������ �����ϴ�.";
		
		s = sum (i,10); //sum()�޼ҵ� ȣ��
		a = '?'; 
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(b);
		
		
		
		
		
		
		

	}

}
