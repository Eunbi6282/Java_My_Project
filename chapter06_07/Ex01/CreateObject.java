package chapter06_07.Ex01;

class AA {
	String name;	//�ʵ�(���) : �ν��Ͻ�ȭ ���Ѿ� ����� ���� [Heap]
	int age;		
	String email;
	
	public String getName() { 		//�޼ҵ�(���) : �ν��Ͻ�ȭ ���Ѿ� ��� ����
		return name;				// Heap������ �ּҸ� �����, ���� ���� Class ���� ���� �޼ҵ� ������ �����
	}
			//return : �޼��带 ȣ���ϴ� ������ ������ ���� �����ش�.
	
	public void setName(String name) {		//void : ���ϰ��� ���ٸ� �˷��ִ� �ĺ���
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
public class CreateObject {
	public static void main(String[] args) {
		
		AA aa = new AA();	//AAŬ����(���赵)�� aa(��ü)�� ����
		
		//��ü�� �޼ҵ� ȣ�� : �޼ҵ�� ()�� �������
		System.out.println(aa.getName());		//.get() �� �� �ڷ������� return����
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		System.out.println("--------------------------------------");
		
		// ��ü�� �ʵ�(�޸�) ȣ��
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		
		
		//�޼ҵ� ȣ��
		//setters : ��ü�� �޸𸮿� ���� �Ҵ��� ��
		aa.setName("������");		//��ü�� ������ ���� �Ҵ�
		aa.setAge(25);
		aa.setEmail("eunbi628268@gmail.com");

		
		
		// ��ü�� �ʵ�(�޸�) ȣ��
		// getters : ��ü�� �޸��� ���� ������ �� ��
		System.out.println(aa.getName()); 	//�޸� ���� ������ �Ͷ�
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		System.out.println("--------------------------------------");
		
		//setter�� �� ����
		AA bb = new AA();
		bb.setName("������");
		bb.setAge(26);
		bb.setEmail("jaehyun0214@gmail.com");
		
		//getter�� �� ȣ��
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		
		System.out.println("--------------------------------------");
		
		AA cc = new AA();
		cc.setName("�̵���");
		cc.setAge(28);
		cc.setEmail("dohyun0411@gmail.com");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		
	}

}
