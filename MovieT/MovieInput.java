package MovieT;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieInput {
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList <MovieT> movieArrayList = new ArrayList<MovieT>();

	public static void main(String[] args) {
		
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
		case 1 : 
			System.out.println("��ȭ���� �Է��ϼ��� >>> ");
			movieName = scanner.next();
			System.out.println("������ �Է��ϼ��� >>> ");
			dir = scanner.next();
			System.out.println("����� �Է��ϼ��� >>> ");
			grade = scanner.nextInt();
			System.out.println("�帣�� �Է��ϼ��� >>> ");
			genre = scanner.next();
			movieArrayList.add(new MovieT(movieName, dir, grade, genre));
		
		case 2 : 
			for (MovieT K : movieArrayList) {
				System.out.println(K);
			}
		}
		
		
		
		
		
		
		
		
		
		}
	}

}
