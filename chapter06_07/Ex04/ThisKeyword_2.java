package chapter06_07.Ex04;
//�ݵ�� this�� �߰��Ǿ�� �� ��� 
class Aa{							//thisŰ�� ������� �ʴ� ��� : ���������� �ν�
	int m;
	int n;
	void init(int m, int n) {
		m = m;						// this Ű���带 ������� ������ m�� ���������� �ν� 
		n = n;
	}
}

class Bb{							// this Ű���带 ����ϴ� ���
	int m;
	int n;
	void init(int m, int n) {
		this.m =m;						// this Ű���带 ����Ͽ� m�� �ʵ��� m�̶�� �˷���� �Ѵ�. 
		this.n = n;
	}
}
public class ThisKeyword_2 {
	public static void main(String[] args) {
		
		// 1. �ʵ��� ��� ���������� ���� ���� ��� (this Ű���带 ������� �ʴ� ���)
		Aa aa = new Aa();
		aa.init(4, 6);
		System.out.println(aa.m);		// 0
		System.out.println(aa.n);		// 0
		
		// 2. �ʵ��� ��� ���������� ���� ���� ��� (this Ű���带 ����Ѱ��)
		Bb bb = new Bb();
		bb.init(2, 3);
		System.out.println(bb.m);
		System.out.println(bb.n);
	}
}

