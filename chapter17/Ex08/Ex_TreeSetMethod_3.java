package chapter17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

import chapter06_07.Ex04.ThisKeyword_1;

// �̸��� ���̸� �Է����� �� �̸��� ������������ ����ϵ��� �����ϴ�. TreeSet�� name�÷��� ���Ľ�Ŵ
// 1. Comparable<E>�������̽��� compareTo()�޼��� ������ (���� ��ü ���� �ʿ�)
// 2. Comparator<E>�� compare()���� (���� ��ü ���� X)

class Abc{
	String name;  //  << �����÷�. ������������: �����ٶ�...��/ ������, �̼���, ȫ�浿 ó�� ������ ����
	int age;  // ����
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}
}

class Abc_T implements Comparable<Abc_T>{
	
	String name;  //  << �����÷�. ������������: �����ٶ�...��/ ������, �̼���, ȫ�浿 ó�� ������ ����
	int age;  // ����
	
	public Abc_T(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
	@Override
	public String toString() {
		return name + " " + age;
	}




	@Override
	public int compareTo(Abc_T o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}




}


public class Ex_TreeSetMethod_3 {
	public static void main(String[] args) {
		// 1. Comparable<E>�������̽��� compareTo()�޼��� ������ (���� ��ü ���� �ʿ�)
		TreeSet<Abc_T> treeSet1 = new TreeSet<Abc_T>();
		Abc_T at1 = new Abc_T("ȫ�浿", 80);
		Abc_T at2 = new Abc_T("������", 70);
		Abc_T at3 = new Abc_T("�̼���", 100);
		
		treeSet1.add(at1);
		treeSet1.add(at2);
		treeSet1.add(at3);
		System.out.println(treeSet1);
		
		// 2. Comparator<E>�� compare()���� (���� ��ü ���� X)
			//�͸� ���� Ŭ���� ����
		TreeSet<Abc> treeSet2 = new TreeSet<Abc>(new Comparator<Abc>() {

			@Override
			public int compare(Abc o1, Abc o2) {
				return o1.name.compareTo(o2.name);
							}
			
		});
		Abc a1 = new Abc("ȫ�浿", 80);
		Abc a2 = new Abc("������", 70);
		Abc a3 = new Abc("�̼���", 100);
		treeSet2.add(a1);
		treeSet2.add(a2);
		treeSet2.add(a3);
		System.out.println(treeSet2);
		
		
		

	}

}
