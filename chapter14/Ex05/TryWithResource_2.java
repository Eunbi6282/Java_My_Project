package chapter14.Ex05;
//���� ������ ��ü���� AutoCloseable ���
	// try(��ü ���� ����){} catch{} : �ڵ����� close()	//try(with resource)
	// 1. AutoCloseable �������̽��� close()�޼��带 �������̵� ���� �ؾ� �Ѵ�.

	//java.lang.AutoClosable : java.lang <=== import���� ������� �ʾƵ� �ȴ�.
	//java.lang.Object

	//���ܸ� ó���ϴ� ��� 
		// 1. try catch  : �ڽ��� ���� ���� ó��
		// 2. throws�� ���ؼ� ���� ó���ϴ� ��� : ���ܸ� ���� ó������ �ʰ� ȣ���ϴ� ������ ó���ϵ��� ���ܸ� ó���ϵ���
				//(���� ����, �ż��� ���� ����)
				// throw :  ���ܸ� ������ �߻� ��Ű��.

class A implements AutoCloseable{
	String resource;	//resource = null
	
	A (String resource){	//�������� �Ű������� String���� �޾Ƽ� �޸𸮷� �ε�
		this.resource = resource;
	}

	@Override
	public void close() throws Exception {	//close()�� �ڵ����� ȣ��
		System.out.println(resource);
		
		if (resource != null) {
			resource = null;
			System.out.println("���ҽ��� ���� �Ǿ����ϴ�.");
			System.out.println(resource);
		}
		
	}
}
public class TryWithResource_2 {
	public static void main(String[] args) {
		// 1. �ڵ� ���ҽ� ���� ���
		try(A a1 = new A("Ư�� ����");){
			
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
				// finally ����� a1.close()�޼��带 �ڵ����� ȣ��
		}	//catch����� ����Ǹ� �ڵ����� AŬ������ close()�� ȣ���
		
		System.out.println("==================");
		//2. �������� ���ҽ� ����
		A a2 = null;
		try {
			a2= new A("������ �ʱⰪ �Ҵ�");
		} catch (Exception e) {
				
		} finally {
			if (a2.resource != null) {		//ȣ���ϴ� ������ Exception���� ó���� �̷�� ������ ����ó�� ����� ��
				//public void close() throws Exception
				
				try {							
					a2.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			
		}
		
	}

}
