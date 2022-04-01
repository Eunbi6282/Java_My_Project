package chapter16.Ex05;

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

class Pencil{	// ���� Ŭ���� 
	String name;
	int price;
	Pencil(String name, int price){
		this.name = name;
		this.price = price;
	}
	public void bcd() {
		System.out.println("bcd() �޼��� ���");
	}
	@Override
	public String toString() {		/// ��ü ��ü�� ��½� ��ü�� �ּҰ� �����Ƿ� �ʵ��� ���� �������� toString()
		return "�̸� : " + name + " , ���� : " + price;
	}
}

// ���ʸ��� ����ؼ� ��ü�� ������ �� �о����
	// ���ʸ� Ŭ����
class Goods<T>{
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	
}

public class ObjectGeneric {

	public static void main(String[] args) {
		Goods<Apple> goods1 = new Goods<Apple>(); //goods1�� Apple������ Ÿ���̴�. 
		goods1.set(new Apple("���", 1000)); // ��ĳ������ �ƴ϶� �ٿ�ĳ���� �� �ʿ䰡 ����. (�� Ÿ������ ���� �� Ÿ������ return�Ǳ� ������)
		System.out.println(goods1.get());   // ���ʸ������� �ٿ�ĳ������ �� �ʿ䰡 ���� 
		goods1.get().abc(); 	// �ٿ��ɽ��� ���� Apple��ü�� abc()ȣ��
		
		Goods<Pencil> goods2 = new Goods<Pencil>();
		goods2.set(new Pencil("����", 700));
		System.out.println(goods2.get());
		goods2.get().bcd();
		

	}

}
