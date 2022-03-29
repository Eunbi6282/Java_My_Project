package chapter16.Ex01;

// Generic ����� ������
// ��ü�� ���� Ŭ������ ������, �Ź� ��ü�� ������ �� ���� �� ��ü�� ���� Ŭ������ ����� ��� �Ѵ�. 
// ��ü�� ������ Ŭ������ �����ؼ� ��ü ������ ���� �� �ִ�. <== ���ο� ��ǰ�� �߰��� �� ���� �� ��ǰ�� ���� Ŭ������ ��������� �Ѵ�.
		// -> �ڵ尡 �ſ� ����������. 

class Apple{	//��� Ŭ���� ,  ����� ������ ���� ��ü
	String name;
	int price;
	
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {		/// apple ��ü ��ü�� ��½� ��ü�� �ּҰ� �����Ƿ� �ʵ��� ���� �������� toString()
		return "�̸� : " + name + ", ���� : " + price;
	}
}
// 1. Apple�� ���� �� �ִ� Ŭ���� ����
class Goods1 {		// ��ǰ�� ����� ���� Ŭ����
	private Apple apple = new Apple("���", 1000);  // private�� ����Ǿ��ֱ� ������ setter�� getter�� ���� �Ҵ��ϰ� ����ؾ� ��

	public Apple getApple() {	//getter : ��ü �ʵ��� ������ ���
		return apple;
	}

	public void setApple(Apple apple) {		//setter
		this.apple = apple;
	}
}

class Goods2{		//���� ��ǰ�� ���� Ŭ���� 
	private Pencil pencil = new Pencil("����", 1500);

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
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
public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		// Goods1��ǰ�� ����Ǿ� �ִ�. Apple��ü �߰� �� ��������
		Goods1 goods1 = new Goods1();		//�⺻������ ȣ��
		goods1.setApple(new Apple("���2", 2000));
		System.out.println(goods1.getApple()); // �ʵ��� ���� ���
		
		// Goods2 ��ǰ�� ����. Pencil ��ü�� ����
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil("����2", 3000));	//Setter�� Pencil��ü ���� �� �� �Ҵ�
		System.out.println(goods2.getPencil());  //goods2.getPencil()�� return������ ���ƿ��� ������ ��±��� �ȿ� �־�� ��

	}

}
