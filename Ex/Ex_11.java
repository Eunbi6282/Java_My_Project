package Ex;
import java.util.Scanner;

public class Ex_11 {
	public static void main(String[] args) {
//		 
//		 그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작
//		 성하라. "그만"을 입력받으면 종료한다. (Java 는 인덱스 0 에 있으므로 score[0]
//		 을 출력)
//		 과목 이름 >> Jaba
//		 없는 과목입니다.
//		 과목 이름 >> Java
//		 Java 의 점수는 95
//		 과목 이름 >> 안드로이드
//		 안드로이드의 점수는 55
//		 과목 이름 >> 그만
//		 [Hint] 문자열을 비교하기 위해서는 String 클래스의 equals()메소드를 이용해야
//		 한다.
//		 String name;
//		 if(course[i].equals(name)) {
//		  int n = score[i];
//		  ...
//		 }
		
		Scanner sc = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		
		System.out.println("과목이름 >> ");
		String name = sc.next();
		
		for (int i = 0; ; i++) {
			if(name.equals("그만")) {
			break;
			} 
		
		for (int j = 0; j < course.length; j++) {
			if(course[j].equals(name)) {
				System.out.println(course[j] + "점수는 : " + score[j]);
				break;
			}
		}
		
		}
		System.out.println("프로그램 종료");
		
//				else if (course[i].equals("그만")) {
//				System.exit(0);
//			} else {
//				System.out.println("없음");
//			}
	
		
			
		
		
			
			
			
		sc.close();	
	}
}
