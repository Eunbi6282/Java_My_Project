package chapter10.Ex02;

class Aa{
	int m;
	void abc() {
		System.out.println("�θ� �޼ҵ�");
	}
}

class Bb extends Aa{
	int n;
	void bcd() {
		System.out.println("�ڽ� �޼ҵ�");
	}
}
public class Inheritance_1 {

	public static void main(String[] args) {
		// Ÿ�� ĳ������ ���� �ʴ� ���
		Bb b = new Bb();	//b�� Aa, Bb ����, ��� ����
		b.m = 10;	//�θ��ʵ�
		b.n = 20; 	//�ڽ� �ʵ�
		b.abc(); //�θ� �޼ҵ�
		b.bcd(); //�ڽ� �޼ҵ�
		
		//��ĳ���� : �ڽ� => �θ�
		Aa aa = new Bb();	//Bb ��ü�� ����鼭 type�� A��.
		aa.m = 100;
		// aa.n = 200; ���� -> AaŸ�԰� BbŸ�� ��� �������� Bb�� ����x , 
		
		Bb bb = (Bb)aa;	//AaŸ�Կ��� BbŸ������ �ٿ�ĳ����
		bb.m = 100;
		bb.n = 200;
		
	}

}
