package practice;
	// ������ �����ε� : �ϳ��� �����ڸ� ������Ÿ��, ���������� �ٸ� �����ڰ� ȣ��
		// ���� : ������ Ÿ�Ե� ����, ������ ���� ��� �ΰ� �̻� ������ ����
class Abc{
	int a,b,c;
	String d;
	
	Abc(){
		System.out.println(a + " " + b + " " + c);
	}
	
	Abc(int a){
		this.a = a;
		System.out.println(a);
	}
	
	Abc (int a, int b){
		this.a = a;
		this.b = b;
		System.out.println(a + " " + b);
		System.out.println();
	}
	
	Abc(String d){
		this.d = d;
		System.out.println(d);
	}
}
public class EX02_ConstructorOverloading {

	public static void main(String[] args) {
		Abc abc = new Abc();
		
		Abc abc2 = new Abc(3);
		Abc abc3 = new Abc("�߰�");

	}

}
