package chapter10.Ex06.Ex01;

//�ڽ� ��ü�� ������ �� �θ� Ŭ������ �⺻ �����ڸ� ���� ȣ�� : �ڽ�Ŭ������ ù��° �ٿ� super()�� �����Ǿ� �ֱ� ���� 

class A{
	A(){
		System.out.println("AŬ������ �⺻������");
	}
	A(int a){
		System.out.println("AŬ������ �Ű����� ���� 1���� �޴� ������ : " + a);
	}
	A (int a, int b){
		System.out.println("AŬ������ �Ű����� ���� 2 : " + a + " , " + b);
	}
}
class B extends A{
	B(){
		super(5); //=> �����Ǿ� ����
		System.out.println("BŬ������ �⺻������");
	}
	B(String a){
		super(5,6);
		System.out.println("BŬ������ ���ڿ� 1 �Է� : " + a);
	}
}
class C extends B{
	C(){
		super("c���� ȣ��");	//�θ������ ȣ��
		System.out.println("CŬ������ �⺻ ������");
	}
}
public class SuperMethod_2 {

	public static void main(String[] args) {
		C c = new  C();

	}

}
