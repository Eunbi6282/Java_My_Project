package chapter10.Ex04;
//�޼ҵ� �����ε�(Method Overloading) vs �޼ҵ� �������̵�(Method Overriding)

import javax.sql.rowset.JoinRowSet;

import chapter06_07.Ex05.Bb;

/*
 * 	1. �޼ҵ� �����ε� : ������ �޼ҵ� �̸����� (�Ű����� Ÿ��, �Ű����� ��)�� ���� �ش� �޼ҵ尡 ȣ��
 * 			--��Ӱ��� ����x, �����ڿ��� ���� ���
 * 
 *  2. �޼ҵ� �������̵� : �ݵ�� ��� ���迡�� ���
 *  		--�θ��� �޼ҵ带 �ڽĿ��� ���Ӱ� �����ؼ� ���
 *  		1) ��Ӱ���, 2) �޼ҵ��� �ñ״�ó(�޼ҵ��, �Ű����� ����, �Ű����� Ÿ��)�� ���ƾ� �Ѵ�.
 *  		3) �ڽĿ��� �θ��� ���� �����ڿ� ���ų� �� ���� �������� ��
 */

class Ab{
	void print1() {			//Overriding
		System.out.println("AbŬ������ print1()�Դϴ�.");
	}
	void print2() {			//Overloading
		System.out.println("AbŬ������ print2()�Դϴ�.");
	}
}

class Bc extends Ab{
	@Override
//	void print1(int a){				-> ���� : �ñ״�ó�� ���ƾ� ��, �Ű����� ���� �ٸ�
//		System.out.println();
//	}
	void print1() {
		System.out.println("BcŬ������ print1�Դϴ�.");
	}
	
	void print2(int a) {
		System.out.println("BcŬ������ print2�Դϴ�.");
	}
	
}
public class Overloading_VS_Overriding {

	public static void main(String[] args) {
		// 1. AbŸ�� ����
		Ab aaAb= new Ab();
		aaAb.print1();
		aaAb.print2();
		System.out.println("================");
		
		// 2.Bc Ÿ�� ����, ������ ȣ�� 
		Bc bbBc = new Bc();
		bbBc.print1();		//BcŬ������ print1�� ȣ��
		bbBc.print2();		// AbŬ������ print2() ȣ�� : �θ�Ŭ������ �޼ҵ� ȣ��
		bbBc.print2(7);		//Bc Ŭ������ print2(7) ȣ�� : �ڽ� Ŭ������ �޼ҵ� ȣ��
		System.out.println("================");
		
		// 3. AbŸ������ ���� + BcŸ�� ������ ȣ��
		Ab abcAb= new Bc();
		abcAb.print1(); 	//�޼ҵ� �������̵� ->���� ���ε��� ���ؼ� Bc�� print1()�� ȣ��
		abcAb.print2(); 	//AbŬ������ �޼ҵ常 ȣ���� ����
	}

}
