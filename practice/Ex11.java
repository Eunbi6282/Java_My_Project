package practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		String subject;
		
		
		do {
			System.out.println("과목 이름 >>> ");
			subject = sc.next();
			 if (subject.equals("그만")) {
				break;
			}
			for (int j = 0; j < score.length; j++) {
				if(subject.equals(course[j])) {
					System.out.println(course[j] + "의 점수는 " + score[j]);
					break;
				}
					if(j == course.length-1){
					System.out.println("없는 과목 입니다.");
					break;
				}
			} 
			 
			
			
		}while(true);
		
		sc.close();
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
	}

}
