package chapter16.Ex12;


class Parent {
	
	//Number : Boolean, Character�� ������ Wrapper(�⺻ ������ Ÿ���� ��ü������ �ٲ�)Ÿ���� Ŭ������ �� �� �ִ�. 
		// Byte, Short, Integer , Long, Float, Double
	<T extends Number> void print(T t) {	// ���ʸ� �޼��� : �Ϲ�Ŭ���� ���� �־�� ��
		System.out.println(t);
	}
}

class Child extends Parent{
	
}
public class InheritanceGenericMethod {

	public static void main(String[] args) {
		//1. �θ� Ŭ������ ���ʸ� �޼��� ���
		Parent parent =new Parent();
		parent.<Integer>print(10);
		parent.<Double>print(100.855);
		//parent.<String>print("�ȳ�"); 	// ���� �߻�, Number�� �� �� �ִ�.
		parent.print(300); // �Ű������� ���� ���� Ÿ���� �� �� �ִ� ��� ��������/
		parent.print(300.5555);
		
		// 2. �ڽ� Ŭ�������� ���ʸ� �޼��� ���.
		Child child = new Child();
		child.<Integer>print(200);
		child.<Double>print(200.12345);
		

	}

}
