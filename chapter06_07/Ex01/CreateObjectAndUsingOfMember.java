package chapter06_07.Ex01;

//Ŭ����(class) : ��ü�� �����ϱ� ���� Ʋ(���ø�), ���赵 (�ؾ�� Ʋ)
//��ü(Object) : Ŭ������ �����ؼ� �޸𸮿��� �۵��Ǵ� �����ڵ� (��, �ؾ)/ Ŭ������ �޸𸮿� �÷���
	//��ü = �ν��Ͻ�
	//�ν��Ͻ�ȭ (��üȭ) ��Ų��. (���� �޼ҵ忡�� ��ü�� �ν��Ͻ�ȭ ���� ��� �Ѵ�.)
	// A a = new A();  <== Ŭ������ ��üȭ ���Ѽ� �޸𸮿� �ε�





class A {				//�ܺ� Ŭ����
	int m = 3;			// m : �ʵ�(����) -> Ŭ�������� ����� ����(heap������ �����)
						// �ʵ�� �ν��Ͻ�ȭ(��ü) ���Ѿ� ����� ����
	
	
	void print() {		// �޼ҵ� : ������������ �Լ�, ��ü������� �Լ��� �޼ҵ��� ȣĪ��
						// �޼ҵ�� �ν��Ͻ�ȭ(��ü) ���Ѿ� ����� ����
		System.out.println("��ü ���� �� Ȱ��");
	}
}

class B {				//�ܺ� Ŭ����
	String name = "������";
	int age = 25;
	String phone = "010-2055-6282";
	
	void printName () {
		System.out.println(name);
	}
	void printAge(){
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
}



public class CreateObjectAndUsingOfMember {
	public static void main(String[] args) {	//��üȭ -> main �޼ҵ� �ȿ��� ��Ű��
		
	A a = new A();			//Class A�� ��üȭ(�ν��Ͻ�ȭ)��Ų��. (�޸𸮿� �ε��Ų��.)
	System.out.println(a.m);
	a.print();
	
	System.out.println("===============================");
		
	A b = new A();		//Class A�� ��üȭ(�ν��Ͻ�ȭ) ���Ѽ� �޸𸮿� �ε�
	System.out.println(b.m);
	b.print();
	
	A c = new A();
	System.out.println(c.m);
	c.print();
	
	//A �� �������� a,b,c��� ��ü�� �������/ �ϳ��� class�� �������� ��ü ����� ����
	
	System.out.println("===============================");
	
	B bb = new B();		//B class �� bb��� �̸����� ��üȭ ��Ų��. 
	bb.printAge();		//bb��ü�� �޼ҵ带 ȣ��
	bb.printName();		//bb��ü�� �޼ҵ带 ȣ��
	bb.printPhone();	//bb��ü�� �޼ҵ带 ȣ��
	
	B ccB = new B();
	ccB.printAge();
	ccB.printName();
	ccB.printPhone();
	
	
	
	
	
	
	}
}
