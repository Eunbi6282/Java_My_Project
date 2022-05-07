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
			m = movies[index++];
	}
	
	// 영화 정보 모두 출력
	@Override
	public MovieT[] search() {
		MovieT[] ms = null;
//		for (int i = 0; i < index; i++) {
//			if (movies[i] != null) {
//				ms[i] = movies[i];
//			} 
//		}
//		return ms;
		
		for (int i = 0; i < ms.length; i++) {
			
		}

		return ms;
	}

	
	
	@Override
	public MovieT[] search(String title) {
		// TODO Auto-generated method stub
		return null;
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

	
	
}
