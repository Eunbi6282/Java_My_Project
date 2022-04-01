package chapter16.Ex02;

 
// Object�� ��� ��ü�� ������ �� �ִ�.
// ��ǰ�� �����ϴ� Ŭ������ ObjectŸ������ �����ϸ� ��� ��ü�� ���� �� �ִ�. <== ���ο� ��ǰ�� ���涧 ���� Ŭ������ �߰������ ��
// Object�� ����ؼ� ��� ��ǰ�� ������ �� �ִ�. 
	// Object�� ���� : ��� ��ü�� ���� �� �ִ�(ĳ���� ����). 
	// Object�� ���� : �Ź� �ٿ� ĳ������ �ؼ� ����ؾ� �Ѵ�, 
					//���� Ÿ�� üũ�� �ϱ� ������ ����� ������ ���� �� �ִ�. (ClassCastException)

class Apple{	//��� Ŭ���� ,  ����� ������ ���� ��ü
	String name;
	int price;
	
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	public void abc() {
		System.out.println("abc() �޼��� ���");
	}
	@Override
	public String toString() {		/// apple ��ü ��ü�� ��½� ��ü�� �ּҰ� �����Ƿ� �ʵ��� ���� �������� toString()
		return "�̸� : " + name + " , ���� : " + price;
	}
}

class Goods {		//Object�� ����ؼ� ��� ��ǰ�� ������ �� �ִ�. 
	private Object object = new Object();		//Object : ��� Ŭ������ ObjectŸ������ ��ȯ

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {	// ObjectŸ������ ��ĳ���� ��
		this.object = object;
	}
}

class Pencil{	// ���� Ŭ���� 
	String name;
	int price;
	Pencil(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {		/// ��ü ��ü�� ��½� ��ü�� �ּҰ� �����Ƿ� �ʵ��� ���� �������� toString()
		return "�̸� : " + name + " , ���� : " + price;
	}
}

public class Using_Object {
	public static void main(String[] args) {
		
		// 1. Apple�� ���� �� ��� Object
		Goods goods1 = new Goods();
		goods1.setObject(new Apple("���3", 4000));	//Setter�� ���� �Ҵ�
		System.out.println((Apple)goods1.getObject());	// Getter�� ��ü�� ��� : ObjectŸ���� ��ü�� �޾� ���� ������ Apple�� �ٿ�ĳ���� �ʿ�
		((Apple)goods1.getObject()).abc(); //abc()�޼��带 Ȱ���Ϸ��� -> �ٿ�ĳ����, 	
			// toString()�� Object�� toStirng()�� �������̵��� �� �ű� ������ �ٿ�ĳ���þ��ص� ��µƴ����� �ٵ� �� �������� �ٿ�ĳ���� �� ��!!!
			
		
		// 2. Pencil�� ������ ���. Object
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil("����3",5000));
		System.out.println((Pencil)goods2.getObject());
			// Getter�� ��ü�� ��� : ObjectŸ���� ��ü�� �޾� ���� ������ Apple�� �ٿ�ĳ���� �ʿ�
		
		// 3. �߸��� ĳ������ �� �� �ִ�.(���� Ÿ�� üũ) : Object�� ������
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("���4", 5000));
		System.out.println((Pencil)goods3.getObject());	//���� -> ���� Ÿ�� üũ : ����� ���� �߻�
		
	}

}
