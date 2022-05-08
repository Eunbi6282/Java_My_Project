package MovieT;

import java.util.Arrays;
import java.util.Scanner;

public class MovieInput {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	MovieMethod movieMethod = MovieMethod.getInstance();
		
		boolean run = true;
		String movieName = null;
		String dir = null;
		int grade = 0;
		String genre;
		
		while(run) {
			System.out.println("========================================================================");
			System.out.print(" 1. ��ȭ ���� �߰� \t");
			System.out.println(" 2. ��ȭ ���� ��� ��� \t");
			System.out.print(" 3. �������� ��ȭ �˻� \t");
			System.out.println(" 4. �������� ��ȭ �˻� \t");
			System.out.print(" 5. ������� ��ȭ �˻� \t");
			System.out.println(" 6. �帣�� ��ȭ �˻� \t");
			System.out.print(" 7. ��ȭ ���� ���� \t");
			System.out.println(" 8. ��ȭ ���� ���� \t");
			System.out.println("=================================================");
			System.out.print("�����ϼ��� >>> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			
			// ��ȭ ���� �Է�
			case 1 : 
				System.out.println("��ȭ���� �Է��ϼ��� >>> ");
				movieName = scanner.next();
				System.out.println("������ �Է��ϼ��� >>> ");
				dir = scanner.next();
				System.out.println("����� �Է��ϼ��� >>> ");
				grade = scanner.nextInt();
				System.out.println("�帣�� �Է��ϼ��� >>> ");
				genre = scanner.next();
				movieMethod.add(new MovieT(movieName, dir, grade, genre));
				System.out.println("���������� �ԷµǾ����ϴ�.");
				break;
				
			// ��ȭ ���� ���
			case 2 : 
				System.out.println(Arrays.toString(movieMethod.search()));
				break;
			
			// ��ȭ �������� ��ȭ ã��
			case 3:
				System.out.println("�O�� ��ȭ���� �Է��ϼ��� >>> ");
				String mname = scanner.next();
				System.out.println(Arrays.toString(movieMethod.search(mname)));
				break;
			
			}
		}

	} // main
}	// class