package chapter10.Ex06;
//super Ű���� : �θ�Ŭ������ ����, �޼ҵ� ���ο��� ���, ������ ���ο����� ���.
// super() : ������ ���ο����� ���, �θ�����ڸ� ȣ���� �� ���.
			// �ݵ�� ù ���ο� ��ġ
// this() : ������ ���ο����� ���, �ڽ��� Ŭ������ �ٸ� �����ڸ� ȣ���� ��
			// �ݵ�� ù ���ο� ��ġ, 
class AAA{
	AAA(){
		System.out.println("AAA ������");
	}
}
class BBB extends AAA{
	BBB(){
		super();
		System.out.println("BBB ������");
	}
}
class CCC {
	CCC(){
		System.out.println("R");
	}
	CCC(int a){
		System.out.println("CCC ������ : " + a);
	}
}
class DDD extends CCC{
	DDD(){ 
		// super(); �⺻ �����ڿ� super()�� �����Ǿ�����
	}
	DDD(int a){
		super(3);		//�θ��� CCCŬ������ ���� �Ű������� 1�� �޴� ������ ���
		System.out.println("DDD ������ ���� 1 : " + a);
	}
}
public class SuperMethod_1 {

	public static void main(String[] args) {
		// 1. ��ü ����
		AAA aaa = new AAA();	//�⺻ ������ ȣ��
		System.out.println("=================");
		
		BBB bbb = new BBB();	//�⺻ ������ ȣ��
		System.out.println("=================");
		
		CCC ccc = new CCC();	//�⺻�����ڸ� ȣ���Ϸ��� �⺻�����ڰ� ����Ǿ��־�� ��
		
		DDD ddd = new DDD();
		System.out.println("==================");
		DDD ddd2 = new DDD(5);
		

	}

}
