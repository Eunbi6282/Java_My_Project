package chapter12.Ex02;

/*interface ������ Ŭ���� , 
 	Overriding : ������ �޼ҵ带 �ڽ� Ŭ�������� ����� ������ �ϴ� ��. 
 	Implements : (�������̽��� ����)�̿ϼ� �޼ҵ带 �ϼ� ��Ű�� ��.
 	  extends  : (���)�θ� Ŭ������ ����� ��ӹ޾Ƽ� �ڽ��� ����� �߰��ؼ� Ȯ�� 
 
 
 */
	
interface AA{
	void cry();		//�߻�޼ҵ�(�̿ϼ��� �޼ҵ�), public abstract����
	void run();		// �߻�޼ҵ�(�̿ϼ��� �޼ҵ�) , public abstract ����
}
class BB implements AA{			//BBŬ������ AA�������̽��� �̿ϼ��� �޼ҵ带 �����Ѵ�. 

	@Override
	public void cry() {
		System.out.println("�߿�");
	}

	@Override
	public void run() {
		AA aa = new BB();		//BB : �������̽��� �̿ϼ� �޼ҵ带 ������ Ŭ���� 
		aa.cry();
		aa.run();
		
	} 	
	
}
public class Interface_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
