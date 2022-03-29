package chapter10.Ex03;
// instanceof : ��ü ������ ĳ���� ���� ���θ� �� �� �ֵ��� �ϴ� Ű����
	// ��ĳ���� �� ��ü ���ο� � Ÿ���� �����ϴ��� True, False�� ����
	// �ٿ�ĳ���ý� ��Ÿ�� ������ �߻��� �� �ִ�.
	// �ٿ� ĳ���ý� �ش� Ÿ���� ��ü�� ������ �� �ٿ� ĳ�����ϵ��� ���� 

class A {
	int m;
	void a(){
		System.out.println(m);
	}
}
class B extends A{
	int n;
	void b() {
		System.out.println(n);
	}
}
public class InstanceOf {

	public static void main(String[] args) {
		// 1. instanceof : ��ü�� instanceof Ÿ��
		A aa = new A();		//aa�� AŸ�Ը� ������ ���� 
		A ab = new B();		//aa�� A,B�����ϰ� , A�� ��� ����
		
		System.out.println(aa instanceof A); 	//true
		System.out.println(ab instanceof A); 	//true
		System.out.println(aa instanceof B);   //false
		System.out.println(ab instanceof B);
		
		if (aa instanceof B) {		//aa��ü�� BŸ���� �����Ǿ����� ��쿡�� ->
			B b = (B)aa;
			System.out.println("aa�� B�� ĳ���� �߽��ϴ�.");// �ٿ� ĳ�����Ѵ�. 
		}else {
			System.out.println("aa�� BŸ������ ĳ���� �Ұ�");
		}
		
		if(ab instanceof B ) {
			B b = (B)ab;
			System.out.println("ab�� BŸ������ ĳ���� �߽��ϴ�. ");
		}else {
			System.out.println("ab�� BŸ������ ĳ���� �Ұ�");
		}
		
		if("�ȳ�" instanceof String) {
			System.out.println(" \"�ȳ�\" �� String Ŭ���� �Դϴ�.");
		}else {
			System.out.println(" \"�ȳ�\" �� String Ŭ���� �Դϴ�. ");
		}
	}

}
