package chapter16.Ex07;

// ���ʸ� �޼��� ���ο��� ��� ������ �޼��� : Object Ŭ������ �޼��常 ��밡���ϴ�.	

class A{
	
	public <T> void method(T t) {
		//System.out.println(t.length()); // ���� -> t.length(): StringŬ�������� ���ڼ��� �������ش�. 
		System.out.println(t.equals("�ȳ�")); // ���� -> t.equals("�ȳ�") : ObjectŬ������ �޼���� ��� ����
	}
	public <T extends Object> void method2 (T t){		// <T [extend object]>�� �����Ǿ� �ִ�. 
		System.out.println(t.equals("�ݰ����ϴ�"));	// ObjectŬ������ �޼��常 ��� �����ϴ�. 
		//System.out.println(t.); -> Object�� �޼��� ��� ����
	}
	public <T extends String> void method3 (T t) {		//StringŸ������ �����Ǿ� .lenght��� ����
		System.out.println(t.length());
		//System.out.println(t.); -> String �޼��� ��� ����
	}
}

public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a= new A();
		a.<String>method("�ȳ�");

	}

}
