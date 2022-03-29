
package chapter10.Ex04;

import java.util.Arrays;

import javax.naming.StringRefAddr;

class Animal3{		//�θ�Ŭ���� , ��� Ŭ������ Odject�� ����Ѵ�. 
	String nameString ;
	int age;
	
	void cry() {
		System.out.println("������ ��ϴ�.");
	}
	@Override		//Object.toString�޼���� ��ü ��ü�� ����� �� ��ü ��ü�� ����� �� ȣ���� �ȴ�. 
	public String toString(){	//��ü�� �ּҸ� ����մϴ�. [��Ű����.Ŭ������@��ü�� �޸��� �ؽ��ڵ�]
		return "�̸��� : " + nameString + "�̰� , ���̴� : " + age + "�Դϴ�." ;
	}
}

class Tiger3 extends Animal3{
	
	Tiger3(){}			//�⺻������: ������ �ʱ�ȭ ���� �Ҵ����� �ʰ� �ʱ�ȭ. 
	
	Tiger3(String a,int b ){	//������ : ��ü�� ������ �� �޸��� �ʱⰪ�� �Ҵ��� �� ���
		super.nameString=a;		// super : �θ�(super)Ŭ����, this :�ڱ� �ڽ��� ��ü 
		super.age = b;
		
	}
	
	@Override
	void cry() {
		//super.cry();	//superŰ����� �θ�Ŭ����, super : ��� ������ �� �θ�Ŭ����
						//this Ű����� �ڱ��ڽ��� ��ü
	System.out.println("ȣ���̴� �����ϰ� ��ϴ�.");
	
	}
}
class Cat3 extends Animal3{
	
	Cat3(){}
	
	Cat3(String a, int b){		//������
		super.nameString=a;		// super : �θ�(super)Ŭ����, this :�ڱ� �ڽ��� ��ü 
		super.age = b;
	}
	
	@Override
	void cry() {
		//super.cry();
		System.out.println("����̴� �߿��ϰ� ��ϴ�.");
	}
}
class Dog3 extends Animal3{
	
	Dog3(){}
	
	Dog3(String a, int b){	//������
		super.nameString = a;
		super.age =b;
	}
	@Override
	void cry() {
		//super.cry();
		System.out.println("���� �۸��ϰ� ��ϴ�.");
	}
}
public class Test02 {

	public static void main(String[] args) {	
		Animal3 animal3 = new Animal3();	//a3��ü ����
		
		System.out.println(animal3);	//��ü ��ü�� ����� ���, ObjectŬ������ toSting�޼��尡 ȣ��ȴ�. 
				// Object.toString() : ��ü�� �޸��ּ��� �ؽ��ڵ带 ���
				// chapter10.Ex04.Animal3@32d2fa64 <-- ��Ű����.��ü��.@�ؽ��ڵ�
		System.out.println(animal3.toString());
		
		// ��ü ��ü�� ����ϸ� Object Ŭ������ toString �޼��带 ȣ��
		 Animal3 tiger3 = new Tiger3();	//Tiger3�� Animal3�� ��ĳ����   
		 // �ٸ� �����ڰ� ���� �� ��������� �ٸ� �����ڸ� �����Ѵٸ� �⺻�����ڸ� ȣ���� �� �⺻�����ڸ� �����ؾ� ��
		 System.out.println("*�ٸ� �����ڰ� ���� �� ��������� �ٸ� �����ڸ� �����Ѵٸ� �⺻�����ڸ� ȣ���� �� �⺻�����ڸ� �����ؾ� ��*");
		 Animal3 cat3 = new Cat3();		//Cat3 fmf Animal3�� ��ĳ����
		 Animal3 dog3 = new Dog3();
		 
		 tiger3.cry();  //�θ���cry()�� ȣ���� ��� �������̵��� Tiger3�� cry()�� ȣ��
		 cat3.cry(); 	// Animal3.cry()ȣ�� ---> �������̵��� Cat3�� cry()ȣ��
		 dog3.cry();
		System.out.println("======================================");
		
		Animal3 [] arr = {tiger3, cat3, dog3};
		
		for ( int i = 0; i <arr.length; i++) {
			arr[i].cry();
		}
		System.out.println("=======================================");
		for (Animal3 k : arr) {
			k.cry();;
		}
		
		System.out.println("=======================================");
		Animal3 aa3 = new  Tiger3("ȣ����",4);
		Animal3 cc3 = new Cat3("�����", 3);
		Animal3 dd3 = new Dog3("��",10);
		
		System.out.println(aa3);	//��ü ��ü ��½�, �⺻������ ��ü�� �޸� �콬�ڵ尡 ���
										//Object�� toString()�޼��带 ������
		System.out.println(cc3);
		System.out.println(dd3);
		System.out.println("=======================================");
		
		//�迭�� ��ü �ֱ�
		Animal3[]arr2 = {aa3,cc3,dd3};		//�����ڸ� ���� �ʱⰪ�� �Ҵ��� �� �迭�� �־���
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);	//print�ƴ� String���̹Ƿ� ��¹����� ������ֱ�
			
		}

		System.out.println("----enhanced for----");
		for (Animal3 kAnimal3 : arr2) {
			System.out.println(kAnimal3);
		}
		
		System.out.println(Arrays.toString(arr2));
	}
	
	
	
	
	
	

}
