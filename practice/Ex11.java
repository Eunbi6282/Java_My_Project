package practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		String subject;
		
		
		do {
			System.out.println("���� �̸� >>> ");
			subject = sc.next();
			 if (subject.equals("�׸�")) {
				break;
			}
			for (int j = 0; j < score.length; j++) {
				if(subject.equals(course[j])) {
					System.out.println(course[j] + "�� ������ " + score[j]);
					break;
				}
					if(j == course.length-1){
					System.out.println("���� ���� �Դϴ�.");
					break;
				}
			} 
			 
			
			
		}while(true);
		
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
		
		
		
		
	}

}
