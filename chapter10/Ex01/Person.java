package chapter10.Ex01;

import chapter06_07.Ex02.A;

class Student extends Person{		// ���л� Ŭ����, Person : �θ�, Student : �ڽ�
	// �ڽ�Ŭ������ �θ�Ŭ������ �ʵ�, �޼ҵ�, �̳�Ŭ���� �� �״�� ��ӹ޴´�.
	
	int studentID;
	void goToSchool() {
	System.out.println("�ڽ� Ŭ������ Student �޼ҵ� goToSchool ȣ��");	
	}
}

class Student_sub extends Student{
	//Student_sub�� Student�� ��ӹް� �ִ�.Student�� �ʵ�� �޼ҵ带 ��ӹ޴´�. 
	//Student�� Person�� ��ӹް� �ִ�. Student�� Person�� �ʵ�� �޼ҵ带 ��ӹް� �ִ�. 
	
	//Student_sub : Person�� Student�� �ʵ�� �޼ҵ带 ��� ��ӹ޴´�. 
	
	String subString;
	void sub1() {
		System.out.println("Student_sub1 Ŭ���� �Դϴ�. �θ��� �ʵ�� �޼ҵ带 ���� �޽��ϴ�. ");
	}
}

class Worker extends Person{		// ������ Ŭ���� 
	int workerID;	//���
	void goToWork() {
		System.out.println("������ Ŭ������ �޼ҵ� ȣ��");
	}
}


public class Person {		//��� : �θ� Ŭ������ (�ʵ� , �޼ҵ�, ���� Ŭ���� )�� �ڽ�Ŭ�������� ����� �ش�. 
								// ����� ���� : 1. �ߺ��Ǵ� �ڵ� ����(�ڵ��� ����), 2. �ڵ尡 ����������, 3. ������(�޼ҵ� �������̵�)���� 
										//������ -> �ϳ��� �޼ҵ� �̸����� ���� �������� ����� �� �ִ�. 
	String nameString;
	int age;
	
	void eat() {
		System.out.println("�θ� Ŭ������ eat()�޼ҵ�");
	}
	
	void sleep() {
		System.out.println("�θ� Ŭ������ sleep() �޼ҵ�");	
	}
	
	public static void main(String[] args) {
		
		// 1. person ��ü ����
		Person person = new Person();
		person.nameString = "������";
		person.age = 25;
		person.eat();
		person.sleep();
		
		System.out.println("============================");
		
		// 2. Student ��ü ����
		Student student = new Student();
			//�ڽ� Ŭ������ �θ� Ŭ������ ����� �ʵ�� 
		
		//Person Ŭ������ �ʵ�
		student.nameString = "������";
		student.age =25;
		
		//Student Ŭ������ �ʵ�
		student.studentID = 20170033;
		
		//PersonŬ������ �޼ҵ�
		student.eat();
		student.sleep();
		
		//Student Ŭ������ �޼ҵ�
		student.goToSchool();
		
		System.out.println("============================");
		
		// 3. work ��ü ����
		Worker worker = new Worker();		//Person Ŭ������ ����Ѵ�. PersonŬ������ �ʵ�� �޼ҵ� ���
		
		//�θ� Ŭ������ �ʵ� : Person
		worker.nameString = "�������";
		worker.age=60;
		//�ڽ� Ŭ������ �ʵ� : Worker
		worker.workerID = 20220310;
		
		//�θ� Ŭ������ �޼ҵ�: Person
		worker.eat();
		worker.sleep();
		
		//�ڽ�Ŭ������ �޼ҵ� : Worker
		worker.goToWork();
		
		System.out.println("========��ü ������ Ÿ�� ��ȭ============");
		
		Person p1 =  new Person();		//Person()�� Person�̴�. (�ڽ��� �θ��)
		Person ps = new Student();  	// ��ĳ���� , student�� Person�̴�. (�ڽ��� �θ�� -> O)
		// Student sp = new Person(); => ���� : Person�� Student��.(�θ�� �ڽ��̴�. -> X)
		Person pwn = new Worker();	//��ĳ����, Worker�� Person�̴�. (�ڽ��� �θ�� -> O)
		//Worker wp = new Person();  => ���� : Person�� Worker��.(�θ�� �ڽ��̴�. -> X)
		
		System.out.println("========Person <== Student <== Student_sub===========");
		
		Student_sub sub = new Student_sub();  //����
		//Ŭ���� Ÿ��   ��ü��  new  �ڽ�Ŭ���� > 
		
			//Person Ŭ������ �ʵ�� �޼ҵ� ��� ����
			sub.nameString = "�Ż��Ӵ�";
			sub.age = 50;
			sub.eat();
			sub.sleep();
			
			//Student Ŭ������ �ʵ�� �޼ҵ�
			sub.studentID = 20220310;
			sub.goToSchool();
			
			//Student_sub�� �ʵ�� �޼ҵ�
			sub.subString = "�ڽ��� �ڽ� Ŭ����";
			sub.sub1();
		
		Person Person1 = new Student_sub();		//��ĳ���� (Student_sub�� Person�̴�)
														//��ĳ����: Student_sub(�ڽ�) ��ü�� ���� �� �θ� ������ Ÿ������ ����ȯ
			//Student_sub�� Person Ÿ������ ��ĳ���� -> PersonŬ������ ����� ��� ����
		
			//Person Ŭ������ �ʵ�� �޼ҵ常 ����
			Person1.nameString = "BTS";
			Person1.age = 30;
			Person1.eat();
			Person1.sleep();
			
			
			
		Student ss1 = new Student_sub();			//��ĳ���� (Student_sub�� Student�̴�) : Student_sub�� StudentŸ������ ��ĳ����
			//Person�� Student�� �ʵ�� �޼ҵ带 ��밡��
			
			//Person Ŭ���� ���
			ss1.nameString = "SES";
			ss1.age = 30;
			ss1.eat();
			ss1.sleep();
			
			//StudentŬ���� ���
			ss1.studentID = 20170033;
			ss1.goToSchool();
		
		
		Student_sub ss2 = new Student_sub();		//Person Student Student_sub��� ��� ����
		
			//Person Ŭ���� ���
			ss2.nameString = "������";
			ss2.age = 26;
			ss2.eat();
			ss2.sleep();
			
			//Student Ŭ���� ���
			ss2.studentID = 19970214;
			ss2.goToSchool();
			
			//Student_sub Ŭ���� ���
			ss2.subString = "�ڽ��� �ڽ� Ŭ����";
			ss2.sub1();
			
			//��� ���迡�� ��ü ���� �� �θ� ������ Ÿ������ ��ĳ���� ����
				//�θ� ������ Ÿ������ ��ĳ���� �� ��� �θ��� �ʵ�� �޼ҵ常 ��� ����
			
				// Person <== Student <== Student_sub
			
			Person ps4 = new Student_sub();
				//Student_sub��ü ������ Person Ÿ������ ��ĳ����
				//Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 ����
				//���߿��� ��ĳ����(Person ps4 = new Student_sub();)�� ����ϸ� Person Ŭ������ �ʵ�� �޼ҵ常 ���� ����
			
			Student ss4 = new Student_sub();
				//Student_sub��ü ������ Student Ÿ������ ��ĳ����
				//Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 ����
				//���߿��� ��ĳ����(Student ss4 = new Student_sub();)�� ����ϸ� Person �� StudentŬ������ �ʵ�� �޼ҵ常 ���� ����
			
			Student_sub ss5 = new Student_sub();
				//Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 ����
				//Person, Student, Student_sub Ŭ������ �ʵ�� �޼ҵ� ���� ����
			
			System.out.println("====�ٿ� ĳ����====");
			// �ٿ� �½��� : �θ����� Ÿ������ ��ĳ���� �� ���� �ڽ� ������ Ÿ������ ��ȯ(�������� ��ȯ)
			
			Student ps5 = (Student) ps4;		//ps4( Person, Student, Student_sub)�� ������ Ÿ��:Person
					//ps5�� Person, Student�� �ʵ�� �޼ҵ� ���� ����
			
			ps5.nameString = "�ٿ� ĳ����";
			ps5.age = 30;
			ps5.studentID = 20220314;	//Student �ʵ�� �޼ҵ� ��� ����
			
			Student_sub ps6 = (Student_sub) ps4;	//ps4�� Person������ Ÿ�Կ��� Student_sub�� �ٿ� ĳ����
				// Student_sub�� �ٿ� ĳ���� (Person, Student, Student_sub ��� ��� ����)
			ps6. nameString = "�̵���";
			ps6.studentID = 19950411;
			ps6.subString = "�ڽ��� �ڽ�";
			
		
	}
}