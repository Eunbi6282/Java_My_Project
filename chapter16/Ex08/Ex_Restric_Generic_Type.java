package chapter16.Ex08;

 abstract class Fruit{
	public abstract void print();	// 추상 메서드
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
		return name + "이고 가격은 " + price;
	}
	@Override
	public void print() {
		System.out.println("맛있는 사과");
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
		return name + "이고 가격은 " + price;
	}
	@Override
	public void print() {
		System.out.println("맛있는 딸기");
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
		return name + "이고 가격은 " + price;
	}
	@Override
	public void print() {
		System.out.println("맛있는 바나나");
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
		return name + "이고 가격은 " + price;
	}
 }

public class Ex_Restric_Generic_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
