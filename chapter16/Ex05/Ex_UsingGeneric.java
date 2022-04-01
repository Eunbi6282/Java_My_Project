package chapter16.Ex05;

// ���׸��� ����ؼ� 4���� ��ü�� �����ϰ� ����غ���

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

class Total<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class Ex_UsingGeneric {
	public static void main(String[] args) {
		//Student
		Total<Student> total1 = new Total<Student>();
		total1.setT(new Student("������", "20170033", 6282));
		System.out.println(total1.getT());
		
		//Professor
		Total<Professor>total2 = new Total<Professor>();
		total2.setT(new Professor("������", 2017, "eun6282@naver.com"));
		System.out.println(total2.getT());
		
		//Tiger
		Total<Tiger>total3 = new Total<Tiger>();
		total3.setT(new Tiger("ȣ����", "��������"));
		System.out.println(total3.getT());
		
		//Banana
		Total<Banana> total4 = new Total<Banana>();
		total4.setT(new Banana("�ٳ���", "���", 5000));
		System.out.println(total4.getT());
	}

}
