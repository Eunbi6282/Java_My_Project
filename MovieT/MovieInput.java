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
			System.out.print(" 1. 영화 정보 추가 \t");
			System.out.println(" 2. 영화 정보 모두 출력 \t");
			System.out.print(" 3. 제목으로 영화 검색 \t");
			System.out.println(" 4. 감독으로 영화 검색 \t");
			System.out.print(" 5. 등급으로 영화 검색 \t");
			System.out.println(" 6. 장르로 영화 검색 \t");
			System.out.print(" 7. 영화 정보 삭제 \t");
			System.out.println(" 8. 영화 정보 수정 \t");
			System.out.println("=================================================");
			System.out.print("선택하세요 >>> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			
			// 영화 정보 입력
			case 1 : 
				System.out.println("영화명을 입력하세요 >>> ");
				movieName = scanner.next();
				System.out.println("감독을 입력하세요 >>> ");
				dir = scanner.next();
				System.out.println("등급을 입력하세요 >>> ");
				grade = scanner.nextInt();
				System.out.println("장르를 입력하세요 >>> ");
				genre = scanner.next();
				movieMethod.add(new MovieT(movieName, dir, grade, genre));
				System.out.println("성공적으로 입력되었습니다.");
				break;
				
			// 영화 정보 출력
			case 2 : 
				System.out.println(Arrays.toString(movieMethod.search()));
				break;
			
			// 영화 제목으로 영화 찾기
			case 3:
				System.out.println("찿을 영화명을 입력하세요 >>> ");
				String mname = scanner.next();
				System.out.println(Arrays.toString(movieMethod.search(mname)));
				break;
			
			}
		}

	} // main
}	// class