package chapter10.Ex07.Ex04;

class A{
	String nameString;
	A(String nameString){
		this.nameString = nameString;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nameString.toString();		//name�� toString()���ָ� �޸��� ���� return ���� -> ���� ����
	}
}

public class String_Ex {

	public static void main(String[] args) {
		
		String s0 = new String("�ȳ�");	//
		String s1 = "�ȳ�";		//String�� ��������
		
		System.out.println(s0);		//String�� ��ü�� ����� �� toString()�� ������ �Ǿ��ִ�. -> ��ġ���� �ƴ� ���� ��� ��
		System.out.println(s1);
		
		A a = new A("�ȳ�");			//A��ü�� �� ����ϸ� ��ĩ���� ���´�. but toStiring �����ؼ� ���� ����
		System.out.println(a);
	}

}
