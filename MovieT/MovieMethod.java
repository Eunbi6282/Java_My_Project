package MovieT;

import java.util.ArrayList;

public class MovieMethod implements MovieMgr{
	
	private MovieMethod() {};
	private static MovieT[] movies = new MovieT[100];
	private int index;
	private static MovieMethod mm = new MovieMethod();
	
	public static MovieMethod getInstance() {
		return mm;
	}
	
	// 영화 정보 추가
	@Override
	public void add(MovieT m) {
			m = movies[index++];
	}
	
	// 영화 정보 모두 출력
	@Override
	public MovieT[] search() {
		MovieT[] ms= new MovieT[index];
		for (int i = 0; i < index; i++) {
			if (movies[i] != null) {
				ms[i] = movies[i];
			} 
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

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
}
