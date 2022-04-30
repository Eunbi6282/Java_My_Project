package MovieT;

public interface MovieMgr {
	abstract void add(MovieT m);
	MovieT[] search();	
	MovieT[] search(String title);	// �̸����� ã��
	MovieT[] searchDirector(String director);	// �������� ã��
	MovieT[] searchGenre(String genre);	// �帣�� ã��
	abstract void delete(String title); // �̸����� ��ȭ ���� ����
	int getSize();
}

