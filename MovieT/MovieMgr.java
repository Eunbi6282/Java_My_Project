package MovieT;

public interface MovieMgr {
	abstract void add(MovieT m);
	MovieT[] search();	
	MovieT[] search(String title);	// 이름으로 찾기
	MovieT[] searchDirector(String director);	// 감독으로 찾기
	MovieT[] searchGenre(String genre);	// 장르로 찾기
	abstract void delete(String title); // 이름으로 영화 정보 삭제
	int getSize();
}

