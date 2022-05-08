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
		movies[index++] = m;
	}
	
	// ��ȭ ���� ��� ���
	@Override
	public MovieT[] search() {
		MovieT[] ms = new MovieT[index]; //movietŸ���� �迭 
		for (int i = 0; i < index; i++) {
			if (movies[i] != null) {
				ms[i] = movies[i];
			} 
		}
		return ms;
	}

	
	
	@Override
	public MovieT[] search(String title) {
		// equals()�� �ƴ� contains()�� Ű���尡 ���ԵǸ� �˻��� �ɸ�
		MovieT[] ms = new MovieT[index];
		int i = 0; int count = 0;
		MovieT movieT = searchTitleM(title);
		for (MovieT m : movies) {
			if (searchTitleM(title) == null) {
				System.out.println("�Է��� ��ȭ ������ ã�� �� �����ϴ�.");
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
	
	// ���� ��ȭ ���� ã�� �޼���
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
