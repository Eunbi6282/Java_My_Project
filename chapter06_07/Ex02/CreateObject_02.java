package chapter06_07.Ex02;
class Aaa{
	String nameString;	//�ʵ� : ��üȭ ���Ѿ� ��� ����
	int age;			//�ʵ��� ������ heap������ ����, Heap������ �������� ���� �ʱ�ȭ
	String emailString;// �ʵ�� ���� �ǰ� ���� �Ҵ��� ���� �ʴ� ��� :
						//�������� : Null , int : 0; double: 0.0
	double weigth;
	boolean man;
	
	//�޼ҵ�
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String na) {	//��ǲ�Ǵ� ����, �޴� ���� �̸�, �޸� �̸��� ��� ���� �� ���
		nameString = nameString;				// �޸� �̸��� this ������ ��� ��: �ڽ��� Ŭ���� ����
	}										
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	public boolean getMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
}

public class CreateObject_02 {

	public static void main(String[] args) {

		Aaa aaa = new Aaa();	//��ü����(aa)
		
		//�ʵ��� �ʱⰪ ���
		System.out.println(aaa.nameString);
		System.out.println(aaa.age);
		System.out.println(aaa.weigth);
		System.out.println(aaa.man);
		System.out.println(aaa.emailString);   // ���� �Ǿ��ְ� ���� �Ҵ����� ���� -> heap������ ����Ǿ� 
												//-> heap������ ����Ǿ� �ʱⰪ ���
		System.out.println("---------------------");
		//������ ���� ��������[Heap] , ���Ȼ� �޸𸮿� ���� ���� �״����� �ʴ´�. ĸ��ȭ
		aaa.nameString = "������";
		aaa.age = 30;
		aaa.weigth = 55.0;
		aaa.man = false;
		aaa.emailString = "eunbi6282@gmail.com";
		
		//������ ���� ���
		System.out.println(aaa.nameString);
		System.out.println(aaa.age);
		System.out.println(aaa.weigth);
		System.out.println(aaa.man);
		System.out.println(aaa.emailString);

		//setter�� ���ؼ� ���� ����, �޸𸮿� ���� ���� �� ��� �� ���ִ�.
		//���� �����ϴ� ����(1��~12��)
		aaa.setNameString("������");
		aaa.setAge(26);
		aaa.setEmailString("jaehyun0214@gmail.com");
		aaa.setMan(true);
		aaa.setWeigth(75.5);
		
		//getter�� ���ؼ� ���� ���
		System.out.println(aaa.getNameString());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmailString());
		System.out.println(aaa.getMan());
		System.out.println(aaa.getWeigth());
	}

}
