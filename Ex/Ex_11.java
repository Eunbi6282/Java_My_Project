package Ex;
import java.util.Scanner;

public class Ex_11 {
	public static void main(String[] args) {
//		 
//		 �׸��� ���� ���ÿ� ���� ���� �̸��� �Է¹޾� ������ ����ϴ� ���α׷��� ��
//		 ���϶�. "�׸�"�� �Է¹����� �����Ѵ�. (Java �� �ε��� 0 �� �����Ƿ� score[0]
//		 �� ���)
//		 ���� �̸� >> Jaba
//		 ���� �����Դϴ�.
//		 ���� �̸� >> Java
//		 Java �� ������ 95
//		 ���� �̸� >> �ȵ���̵�
//		 �ȵ���̵��� ������ 55
//		 ���� �̸� >> �׸�
//		 [Hint] ���ڿ��� ���ϱ� ���ؼ��� String Ŭ������ equals()�޼ҵ带 �̿��ؾ�
//		 �Ѵ�.
//		 String name;
//		 if(course[i].equals(name)) {
//		  int n = score[i];
//		  ...
//		 }
		
		Scanner sc = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		
		System.out.println("�����̸� >> ");
		String name = sc.next();
		
		for (int i = 0; ; i++) {
			if(name.equals("�׸�")) {
			break;
			} 
		
		for (int j = 0; j < course.length; j++) {
			if(course[j].equals(name)) {
				System.out.println(course[j] + "������ : " + score[j]);
				break;
			}
		}
		
		}
		System.out.println("���α׷� ����");
		
//				else if (course[i].equals("�׸�")) {
//				System.exit(0);
//			} else {
//				System.out.println("����");
//			}
	
		
			
		
		
			
			
			
		sc.close();	
	}
}
