package chapter06_07.Ex03;

//������ �����ε� : �ϳ��� ������ �� ������Ÿ��. ������ ���� �ٸ� �����ڰ� ȣ��
	//���� : ������ Ÿ�Ե� ����, ������ ���� ��� �ΰ� �̻� ������ ����
class Abc{
	int a,b,c;
	String d;
	
	Abc(){
		System.out.println(a + " , " + b + " , " + c + " , ");
	}		//�⺻ ������
	
	Abc(int a){
		this.a = a;
		System.out.println(a);
	}
	
	Abc(int a, int b){					//�Ű������� 2���� ������
		this.a = a;
		this.b = b;
		System.out.print(a + " " + b);
		System.out.println();
	}
	
	Abc (int a, int b, int c){				//�Ű������� 3���� ������
		this.a = a; this.b = b; this.c = c;
		System.out.println(a + " , " + b + " , " + c);
	} 
	
	Abc (String d) {
		this.d=d;
		System.out.println(d);
	}
}


public class ConstructorOverloading {

	public static void main(String[] args) {
		Abc abc = new Abc(4);
		
		Abc abc2 = new Abc(58, 99);
		
		Abc abc3 = new Abc(333555, 333, 5);
		
		Abc abc4 = new Abc("�����ڵ���");		//�Ű������� ������ ������ Ÿ���� �ٸ��� �ش� �޼ҵ带 ȣ��
		
		

	}

}
