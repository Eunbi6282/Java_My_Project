package chapter10.Ex05;
class AAAA{
	static void print() {		//static �޼ҵ� : �������̵� ���� �ʴ´�. 
		System.out.println("Class AAAA");
	}
}
class BBBB extends AAAA{
	static void print() {		//static �޼ҵ� : �������̵� ���� �ʴ´�. 
		System.out.println("Class BBBB");
	}
}
public class OverlapStaticMethod {

	public static void main(String[] args) {
		// 1. ��ü ���� ���� ȣ��
		AAAA.print();
		BBBB.print();
		System.out.println("==============");
		
		// 2. ��ü ���� �� ȣ��
		AAAA aaaa = new AAAA();
		BBBB bbbb = new BBBB();
		aaaa.print();
		bbbb.print();
		AAAA aabbAaaa = new BBBB();
		aabbAaaa.print(); //�������̵��� �ȵǱ� ������ AŬ���� ���

	}

}
