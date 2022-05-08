package MovieT;

import java.util.ArrayList;

public class MovieMethod implements MovieMgr{
	
	private MovieMethod() {}; // 기본생성자
	private static MovieT[] movies = new MovieT[100];
	private int index;
	private static MovieMethod mgr = new MovieMethod();
		//MovieMethod 객체 생성
	
	public static MovieMethod getInstance() {
		return mgr;
	}
	
	// 영화 정보 추가
	@Override
	public void add(MovieT m) {
		movies[index++] = m;
	}
	
	// 영화 정보 모두 출력
	@Override
	public MovieT[] search() {
		MovieT[] ms = new MovieT[index]; //moviet타입의 배열 
		for (int i = 0; i < index; i++) {
			if (movies[i] != null) {
				ms[i] = movies[i];
			} 
		}
		return ms;
	}

	
	
	@Override
	public MovieT[] search(String title) {
		// equals()가 아닌 contains()로 키워드가 포함되면 검색에 걸림
		MovieT[] ms = new MovieT[index];
		int i = 0; int count = 0;
		MovieT movieT = searchTitleM(title);
		for (MovieT m : movies) {
			if (searchTitleM(title) == null) {
				System.out.println("입력한 영화 정보는 찾을 수 없습니다.");
				break;
			}else if (m.getMovieName().contains(title)) {
				ms[i++] = m;
				count++;
			}
		}
		return ms;
	}

	@Override
	public MovieT[] searchDirector(String director) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovieT[] searchGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void delete(String title) {
		// TODO Auto-generated method stub
		
	}
	
	// 
	@Override
	public int getSize() {
		return index;
	}
	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// 같은 영화 제목 찾기 메서드
	public static MovieT searchTitleM(String moviename) {
		MovieT movietitle = null;
		for (int i = 0; i < movies.length; i++) {
			if (movies[i] != null) {
				String name = movies[i].getMovieName();
				if (name.equals(moviename)) {
					movietitle = movies[i];
					return movietitle;
				}
			}
		}
		return null;
	}

	
	
}
