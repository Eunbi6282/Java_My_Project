package chapter10.Ex06;
// super : �θ�Ŭ���� (��Ӱ��迡�� �θ�)
// this : �ڽ��� ��ü

// �������̵� : �θ��� �޼ҵ尡 ������ �ٲ� ���� �ƴ�. super.�� ���� �θ��� ���� �޼ҵ带 �ҷ��� �� �ִ�. 
class A{
	void abc() {
		System.out.println("Class A�� abc()");
	}
}
class B extends A{
	@Override
	void abc() {
		System.out.println("Class B�� abc()");
	}
	void bcd() {
		super.abc(); 	
		abc();			//this.abc //this�� �ڽ��� ��ü
	}
}
public class SuperKeyword_1 {

	public static void main(String[] args) {
		//1. ��ü����
		B bb = new B();
		
		//2. �޼ҵ� ȣ��
		bb.bcd();  	//BŬ������ 
	}

}
