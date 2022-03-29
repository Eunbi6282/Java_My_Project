package Ex_T;

import java.util.Scanner;

public class Ex11_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		
		String name = null;	//스캐너로 과목의 문자열을 받는 변수
		int i = 0;	//방번호를 담는 변수
		
		
		System.out.println("프로그램을 종료하려면 \"그만\" 을 입력하세요.");
		// 출력구문 ""안에서 "를 사용하기 위해서 \" 을 붙임
		while(true) {		//무한루프
			System.out.println("과목이름 >>> ");
			name = sc.next();		//스캐너로 과목 이름을 받아서 변수 name에 할당
			
			if(name.equals("그만")) {		//주의 : name은 참조변수 이므로 값을 비교할 때 ==이 아닌 .equlas 사용
				break;	//while구문을 빠져나감 -> 그래서 맨 밑 출력구문인 "프로그림을 종료합니다"와 함께 출력 됨				
			}
			
		//course의 각방을 돌면서 스캐너로 받은 name변수의 값이 같을 때 출력
			for (i = 0; i < course.length; i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i] + "점수는 : " + score[i]);
					break; //for문만 빠져나감 -> 다시 while문에서 true를 만나서 스캐너를 인풋받음(과목이름 >> 계속 출력)
				}
				//마지막 방까지 갔을 때 검색이 안된 경우
				if ( i == course.length -1)  {
					//i변수가 마지막 방까지 왔을 때 검색이 안된경우
					System.out.println("없는 과목 입니다.");
					break;
				}
			}		
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
		
			
		
	}

}
