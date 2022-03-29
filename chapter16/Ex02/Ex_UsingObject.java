package chapter16.Ex02;

// 4���� ��ü�� ObjectŸ���� ����ؼ� �����ϰ� ���
class Student {
	String name;
	String id;
	int pw;
	
	Student(String name, String id, int pw) {	// ���� �� Ȱ��ȭ
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	
	@Override
	public String toString() {			//toString()���� ��ü�� ����ϸ� �ּҸ� �����°� ���� �������� ��!
		return "�̸��� : " + name + " , ���̵� : " + id + " , �н����� : " + pw;
	}
}
class Professor{
	String name;
	int year;
	String email;
	
	Professor(String name, int year, String email) {
		this.name = name;
		this.year = year;
		this.email = email;
	}
	
	@Override
	public String toString() {			//toString()���� ��ü�� ����ϸ� �ּҸ� �����°� ���� �������� ��!
		return "�̸��� : " + name + " , �ٹ� ���� �⵵ : " + year + " , �̸��� : " + email;
	}
}
class Tiger{
	String name;
	String run;
	
	Tiger(String name, String run){
		this.name = name;
		this.run = run;
	}
	@Override
	public String toString() {
		return "�̸��� : " + name + " , �ٸ����� : " + run;
	}
}
class Banana{
	String name;
	String color;
	int price;
	
	Banana(String name, String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "�̸��� : " + name + " , �� : " + color + " , ���� : " + price;
	}
}

class Total {		//Object�� ����ؼ� ��� ��ǰ�� ������ �� �ִ�.
	private Object object = new Object();	//private��� -> setter�� �� �Ҵ�, getter�� �� ���

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;			// ObjectŸ������ ��ĳ���� ��
	}
}

public class Ex_UsingObject {
	public static void main(String[] args) {
		// 1. Student
		Total total1 = new Total();
		total1.setObject(new Student("������", "20170033", 6282));
		System.out.println((Student)total1.getObject());	// �ٿ�׷��̵� �ʿ�
		
		// 2. Professor
		Total total2 = new Total();
		total2.setObject(new Professor("������", 2017, "eun7292@ddd.ddd"));
		System.out.println((Professor)total2.getObject());
		
		// 3. Tiger
		Total total3 = new Total();
		total3.setObject(new Tiger("ȣ����", "��������"));
		System.out.println((Tiger)total3.getObject());
		
		//4. Banana
		Total total4 = new Total();
		total4.setObject(new Banana("�ٳ���", "�����",2500));
		System.out.println((Banana)total4.getObject());
		
		
	}

}
