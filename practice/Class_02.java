package practice;

import javax.swing.AbstractAction;

class AA {
	int age;
	String name;
	String number;
	
	//get, set
	public int getAge() {		
		return age;	//retrun -> �޼��带 ȣ���ϴ� ������ ������ ���� ������
		// retrun ���� int -> ������ ���� ���
	}
	public void setAge(int age) {	//void -> return���� ����. 
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}


public class Class_02 {

	public static void main(String[] args) {
		//��ü ����(1���� Ŭ������ �������� ��ü ���� ����)
		AA aa = new AA();
		
		//��ü�� �޼ҵ� ȣ��
		System.out.println(aa.getAge());  // ���� �Ҵ� ���ؼ� �ʱⰪ�� 0��� ��
		System.out.println(aa.getName());	//string Ÿ�� -> �ʱⰪ null
		System.out.println(aa.getNumber());
		
		System.out.println("--------------------------");
		
		//��ü�� �ʵ� ȣ��
		System.out.println(aa.age);
		System.out.println(aa.name);
		System.out.println(aa.number);
		
		System.out.println("------------------------------");
		
		//�޼ҵ� ȣ��
		//setters : ��ü�� �޸𸮿� ���� �Ҵ� , 
		//���� ����� �� ���� �Ҵ縸 �� �� getter�̿��� �޸𸮰� ���
		aa.setAge(25);	// ��ü�� ���� ���� �Ҵ�
		aa.setName("������");
		aa.setNumber("010-2055-6282");
		
		//getters : ��ü�� �޸��� ���� ������ �� ��
		System.out.println(aa.getAge());
		System.out.println(aa.getName());
		System.out.println(aa.getNumber());
		
		System.out.println("========2��° ��ü ����======");
		
		AA bb = new AA();
		
	}

}
