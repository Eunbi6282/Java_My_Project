package Test;

public class Test_Ex_Car {

	public static void main(String[] args) {
		// Test_Car �� ��üȭ�ؼ� 5���� ��ü�� �����ؼ� ���� �Ҵ��ؼ� ����ϱ�

		Test_Car sonata = new Test_Car();
		Test_Car miniCooper = new Test_Car();
		Test_Car bmw = new Test_Car();
		Test_Car genesis = new Test_Car();
		Test_Car benz = new Test_Car();
		
		//�� ������ ���� �Ҵ��ϰ� ���, ��������� �ƴ� -> �޸𸮿� ������ �ʴ� ���� �����Ҵ��� �� ����
		//���� �̸��տ� privateŰ���� ��� : ĸ��ȭ, ���� ������ ���� �Ҵ����� ���ϵ���
		//settter���� �� �Ҵ�: ������ �ԷµǴ� ���� ������ �� �ִ�.
		
		sonata.setColor("�Ͼ�");
		sonata.setCompany("����");
		sonata.setMaxSpeed(200);	//- �ȵ�, 700 �̻��� ���� �� ������ ����
		sonata.setModel("����");
		
		miniCooper.setColor("����");
		miniCooper.setCompany("bmw");
		miniCooper.setMaxSpeed(4);
		miniCooper.setModel("����");
		
		bmw.setColor("�Ͼ�");
		bmw.setCompany("bmw");
		bmw.setMaxSpeed(5);
		bmw.setModel("����");
		
		genesis.setColor("�Ͼ�");
		genesis.setCompany("����");
		genesis.setMaxSpeed(7);
		genesis.setModel("����");
		
		benz.setColor("ȸ��");
		benz.setCompany("benz");
		benz.setMaxSpeed(9);
		benz.setModel("����");
	
		// ���� ���
		System.out.println("===sonata===");
		System.out.println("Color : " + sonata.getColor());
		System.out.println("Company : " + sonata.getCompany());
		System.out.println("MaxSpeed : " + sonata.getMaxSpeed());
		System.out.println("Model: " + sonata.getModel());
		
		System.out.println("===miniCooper===");
		System.out.println("Color : " +miniCooper.getColor());
		System.out.println("Company : " +miniCooper.getCompany());
		System.out.println("MaxSpeed : " +miniCooper.getMaxSpeed());
		System.out.println("Model: " +miniCooper.getModel());
		
		System.out.println("===bmw===");
		System.out.println("Color : " +bmw.getColor());
		System.out.println("Company : " +bmw.getCompany());
		System.out.println("MaxSpeed : " +bmw.getMaxSpeed());
		System.out.println("Model: " +bmw.getModel());
		
		System.out.println("===genesis===");
		System.out.println("Color : " +genesis.getColor());
		System.out.println("Company : " +genesis.getCompany());
		System.out.println("MaxSpeed : " +genesis.getMaxSpeed());
		System.out.println("Model: " +genesis.getModel());
		
		System.out.println("===benz===");
		System.out.println("Color : " +benz.getColor());
		System.out.println("Company : " +benz.getCompany());
		System.out.println("MaxSpeed : " +benz.getMaxSpeed());
		System.out.println("Model: " +benz.getModel());
		
	}
				

}
