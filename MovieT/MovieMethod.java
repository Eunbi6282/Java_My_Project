package MovieT;

import java.util.ArrayList;

public class MovieMethod implements MovieMgr{
	
	private MovieMethod() {}; // �⺻������
	private static MovieT[] movies = new MovieT[100];
	private int index;
	private static MovieMethod mgr = new MovieMethod();
		//MovieMethod ��ü ����
	
	public static MovieMethod getInstance() {
		return mgr;
	}
	
	// ��ȭ ���� �߰�
	@Override
	public void add(MovieT m) {
			m = movies[index++];
	}
	
	// ��ȭ ���� ��� ���
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
