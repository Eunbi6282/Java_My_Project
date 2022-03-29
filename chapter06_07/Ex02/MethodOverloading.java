package chapter06_07.Ex02;

import java.security.PublicKey;

class B{
	 static String name = "������";		//static Ű�� �Ҵ��� �Ǹ� ��ü �������� ȣ��
	
	 static void print() {
		System.out.println(name);
		System.out.println("static�� ���� �޼ҵ� �Դϴ�.");
	}
	
}
public class MethodOverloading {

	public static void main(String[] args) {
		//�޼ҵ� �����ε�: �ϳ��� �޼ҵ�� �ް������� Ÿ��, ������ ���� ȣ���ϴ� �� (Java)
		//�޼ҵ� �������̵�: ��ӿ��� �θ� Ŭ������ �޼ҵ带 �������ؼ� ���

		// static : ��ü ���� ���� �ٷ� ȣ���ؼ� ��� �����ϵ��� �� �� �ִ� Ű����
		//��ü �̸��� �ƴ� Ŭ���� �̸����� ȣ���ؼ� ��� ����
		
		System.out.println(B.name);	//��ü �̸��� �ƴ� Ŭ���� �̸����� ȣ���� ����
		B.print();					//Ŭ���� �̸����� ȣ��
		
		System.out.println("==================");
		
		//static�� �� �ְ� ������ Ŭ������ ������ �޼ҵ�� �ٷ� ȣ���� �����ϴ�
		print1();		
		print1(3);		//�Ű������� 1���̰� ����Ÿ���� �޼ҵ� ȣ��
		print1(30.8);	//�Ű������� 1���̰� doubleŸ���� �޼ҵ� ȣ��
		print1(2, 5); //�Ű������� 2���̰� ���� Ÿ���� �޼ҵ� ȣ��
		print1(2, 5.8);
		}
	
		//�޼ҵ� �������̵� : �޼ҵ� �̸��� ����/ �Ű� ���� Ÿ��, �Ű� ���� ������ ���� �ش� �޼ҵ带 ȣ��
			//JVM�� ������ �޼ҵ� �̸��� ������ Ÿ���̳� ������ ���� �ش� �޼ҵ带 �۵�
		//void print1() {		//�����߻�
		public static void print1() {		//�޼ҵ� �̸� �տ� static :
			System.out.println("�����Ͱ� �����ϴ�.");
		}
		public static void print1(int a) {
			System.out.println("���� : " + a);
		}
		public static void print1 (double a) {
			System.out.println("�Ǽ� : " + a);
		}
//		public static void print1(double k) {		-> ����, ������ �Ű�����Ÿ��(double), ������ �Ű����� ����(1��)
//			System.out.println(k);
//		}
		public static void print1(double k, double g) {		
			System.out.println(k);
		}
		
		public static void print1 (int a, int b) {
			System.out.println("a : " + a + " , b : " + b);
		}
		public static void print1 (int c, double d) {
			System.out.println(c + " " + d);
		}
		//���� : ������ �Ű�����Ÿ�԰� ������ ������ ���� �߻�
		
		
		
}
