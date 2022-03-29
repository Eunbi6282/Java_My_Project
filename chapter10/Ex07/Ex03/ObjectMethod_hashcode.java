package chapter10.Ex07.Ex03;

import java.util.HashMap;
//HashMap : Key = ������ ����Ǵ� �ڷᱸ��.
	// Key�� ����� �ߺ� �� �� ����. 
	//HashMap�� Key�� ��ü�� ������ ���, Key�� ����Ǵ� ��ü�� �ߺ����� �ʴ� ������ ������ �����ؾ� �Ѵ�.
	//ObjectŬ������ hashcode()�� ����ؼ� ��ü�� key�� ����� ��� �ߺ��˵� �ʵ��� ����
class A{
	String nameString;
	A(String namesString){
		this.nameString = namesString;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this.nameString == ((A)obj).nameString) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return nameString;
	}
	
}
class B{		//hashCode() + equals() <- ������  
	String nameString;
	B(String namesString){
		this.nameString = namesString;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this.nameString == ((B)obj).nameString) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return nameString.hashCode();
	}
	@Override
	public String toString() {
		return nameString;
	}
}
public class ObjectMethod_hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hml= new HashMap<>();	
			//<Integer <==Key(Ű)
			// String <== Value(��)
		hml.put(1, "������1");
		hml.put(1, "������2");		
			//1 : ������1 ==> ������2�� �ٲ�(������ ������ �ٲ�)
		hml.put(2, "������3");
		System.out.println(hml);
		System.out.println("==========");
		
		//Key�� ��ü�� ������
		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("ù��°"), "������1");
		hm2.put(new A("ù��°"), "������2");
		hm2.put(new A("�ι�°"), "������3");
		
		System.out.println(hm2); 	//HashMap�� �߸� ������ ���{ù��°=������1, �ι�°=������3, ù��°=������2}
																//-> Key�� �ߺ��Ǿ ��µ�
		
		System.out.println("============");
		HashMap<B, String> hm3 = new HashMap<>();	//hashcode() + equals()������
		hm3.put(new B("ù��°"), "������1");
		hm3.put(new B("ù��°"), "������2");
		hm3.put(new B("�ι�°"), "������3");
		
		System.out.println(hm3); 	//HashMap�� ������ ����� �� ��� : Key�� �ߺ��Ǹ� �ȵȴ�. 
			//���� ��ü�� ������ ��ü�� �ּҸ� ��� �� but,
			//hm3(HashMap�� ��ü)�� toString()�� �����ǵǾ� �־� ��ü�� �� ���� ��µ�
		
		System.out.println("ù��°".hashCode());
		System.out.println("ù��°".hashCode());
		System.out.println("�ι�°".hashCode());
	}
	

}
