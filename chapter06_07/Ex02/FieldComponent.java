package chapter06_07.Ex02;
class Abc {
	int m = 3;		//�ʵ�(heap�� ����)
	int n = 4;
	
	void work1() {		//�޼ҵ� (��ǲ���� ���� �޼ҵ�)
		int k = 5;		//�������� (stack������ ����): �޼ҵ� �ȿ��� ����� ���� , �޼ҵ� ����� ��������. 
		System.out.println(k);
		work2(3);		//�ٸ� �޼ҵ� ȣ��
	}
	
	void work2(int i) {
		int j =4;	//��������(stack������ ������ ���� ����)
		System.out.println(i + j);
		
		int l;
		
		//System.out.println(l);  -> ��
		//���������� stack������ ����ǹǷ� ���� �ʱ�ȭ�� ������ �ʴ´�.
		//Heap������ ���� �ʱ�ȭ�� ��
	}							
}
public class FieldComponent {

	public static void main(String[] args) {
		
		//Ŭ������ Ȱ���ؼ� ��ü(abc) ����
		Abc abc = new Abc();
		
		System.out.println(abc.m);
		System.out.println(abc.n);
		
		//�޼ҵ� ȣ��
		abc.work1();
		abc.work2(0);
		
		
		
		
		
		
	}

}
