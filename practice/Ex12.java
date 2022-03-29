package practice;


import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
//		[문항 12] 컴퓨터와 독자 사이의 가위 바위 보 게임을 만들어보자. 예시는 다음
//		그림과 같다. 독자부터 먼저 시작한다. 독자가 가위 바위 보 중 하나를 입력하고
//		<Enter>키를 치면, 프로그램은 가위 바위 보 중에서 랜덤하게 하나를 선택하고
//		컴퓨터가 낸 것으로 한다. 독자가 입력한 값과 랜덤하게 선택한 값을 비교하여
//		누가 이겼는지 판단한다. 독자가 가위 바위 보 대신 "그만"을 입력하면 게임을
//		끝난다.
//		컴퓨터와 가위 바위 보 게임을 합니다.
//		가위 바위 보! >> 바위
//		사용자 = 바위 , 컴퓨터 = 가위 사용자가 이겼습니다.
//		가위 바위 보! >> 가위
//		사용자 = 가위 , 컴퓨터 = 가위 비겼습니다.
//		가위 바위 보! >> 그만
//		게임을 종료합니다...
//		[Hint] 
//		다음과 같은 문자열 배열을 만든다.
//		String str[] = {"가위", "바위", "보"};
//		컴퓨터가 내는 것을 랜덤하게 선택하기 위해서는 다음 코드를 이용한다.
//		int n = (int)(Math.random()*3); // n 은 0, 1, 2 중에서 랜덤하게 결정
//		컴퓨터가 낸 것이 "바위" 인지 비교하는 코드는 다음과 같이 한다.
//		if(str[n].equals("바위")) //컴퓨터가 낸 것이 "바위"인지 비교하는 문
		
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String str[] = {"가위", "바위", "보"};
		String user;	//사용자가 내는 값(스캐너)
		String computer; //컴퓨터
		int n;
		
		while (true) {
			System.out.println("가위 바위 보! >>> ");
			user = sc.next();
			
			if (user.equals("그만")) {
				break;
			}
			
			n = (int)(Math.random()*3);
			computer = str[n];
			
			if (user.equals("가위")) {
				if(computer.equals("가위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 비겼습니다.");
				}else if (computer.equals("바위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 컴퓨터가 이겼습니다.");
				}else if (computer.equals("보")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 사용자가 이겼습니다.");
				}
			}else if (user.equals("바위")) {
				if(computer.equals("가위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 사용자가 이겼습니다.");
				}else if (computer.equals("바위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 비겼습니다.");
				}else if (computer.equals("보")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 컴퓨터가 이겼습니다.");
				}
			}else if (user.equals("보")) {
				if(computer.equals("가위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 컴퓨터가 이겼습니다.");
				}else if (computer.equals("바위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 사용자가 이겼습니다.");
				}else if (computer.equals("보")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer + " 비겼습니다.");
				}
			}	
		}
		sc.close();
		System.out.println("게임을 종료합니다.");
	}

}
