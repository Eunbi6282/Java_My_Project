package chapter16.Ex08;

 abstract class Fruit{
	public abstract void print();	// �߻� �޼���
}
 
 class Apple extends Fruit{
	 String name;
	 int price ;
	 public Apple(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ " + price;
	}
	@Override
	public void print() {
		System.out.println("���ִ� ���");
	}
 }
 
 class Strawberry extends Fruit{
	 String name;
	 int price ;
	 public Strawberry(String name, int price) {
		 this.name = name;
			this.price = price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ " + price;
	}
	@Override
	public void print() {
		System.out.println("���ִ� ����");
	}
 }
 

 class Banana extends Fruit{
	 String name;
	 int price ;
	 public Banana(String name, int price) {
		 this.name = name;
			this.price = price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ " + price;
	}
	@Override
	public void print() {
		System.out.println("���ִ� �ٳ���");
	}
 }
 
 class Pencil{
	 String name;
	 int price ;
	 public Pencil(String name, int price) {
		 this.name = name;
			this.price = price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ " + price;
	}
 }

public class Ex_Restric_Generic_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
