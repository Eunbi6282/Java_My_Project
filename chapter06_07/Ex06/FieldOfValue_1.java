package chapter06_07.Ex06;

/* ��ü�� �ʵ忡 ���� �Ҵ��ϴ� ������ 
 * 1. �ʵ忡 ��������
 * 	  ==> ��ü ���� ��
 * 2. setter�� ���� ��ü�� �ʵ忡 ���� �ο�(���� ���ϴ� ���� ��Ʈ�� ����)
 *    ==> ��ü ���� �� 'new'
 * 3. �����ڸ� ���ؼ� ��ü�� �ʵ� ���� �ο�(���� ���ϴ� ���� ��Ʈ�� ����)
 *    ==> ��ü�� ������ �� �ʱⰪ���� �ʵ忡 ���� �Ҵ�
 * 
 * */

class Aa{	//��ü ������ ���� �ʵ忡 ���� �Ҵ��ϴ� ���
	String nameString; //�̸�
	int age;		   //����				
	String mailString; //�����ּ�
	
	void print() {
		System.out.println("name : " + nameString + " age : " + age + " mail : " + mailString);
	}
}

class Bb{
	String nameString; //�̸�
	int age;		   //����				
	String mailString; //�����ּ�
	
	public void setName(String nameString) {
		this.nameString = nameString;
	}	
	public void setAge(int age) {
		this.age = age;
	}
	public void setMail(String mailString) {
		this.mailString = mailString;
	}
	
	void print() {
		System.out.println("name : " + nameString + " age : " + age + " mail : " + mailString);
	}
}

class Cc{
	String nameString; //�̸�
	int age;		   //����				
	String mailString; //�����ּ�
	
	Cc(String a,String b, int c) {
		nameString = a;
		mailString = b;
		age = c;
	}
		
	void print() {
		System.out.println("name : " + nameString + " age : " + age + " mail : " + mailString);
	}
}
public class FieldOfValue_1 {

	public static void main(String[] args) {
		// 1. ��ü�� �ʵ忡 ���� ���� �Ҵ�.
		Aa aa = new Aa();
		
		aa.age = 25;
		aa.mailString = "eunbi628268@gmail.com";
		aa.nameString = "������";
		aa.print();
		
		//2. ��ü�� setter�� ����ؼ� �ʵ��� ���� �ο�
		Bb bb = new Bb();
		
		bb.setAge(25);
		bb.mailString = "eunbi628268@gmail.com";
		bb.nameString = "������";
		bb.print();
		
		//3. �����ڸ� ����ؼ� �ʵ��� ���� �ο�
		Cc cc = new Cc("������", "eun628268@gmail.com", 25);
		cc.print();
		
		

	}

}
