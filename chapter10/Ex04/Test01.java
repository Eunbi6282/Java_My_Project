package chapter10.Ex04;

class Human{		//�θ�Ŭ����
	int age;		//�ν��Ͻ� �ʵ� : ��üȭ ���Ѿ� ���,Heap
	String name;	
	
	void eat() {	//�ν��Ͻ� �޼ҵ� : ��üȭ ���Ѿ� ���, Heap(pointer), Ŭ���� �������� �ν��Ͻ� �޼ҵ� ������ ���� �޼ҵ��� �ڵ� ����
		System.out.println("����� �Խ��ϴ�.");
	}
	void sleep() {
		System.out.println("����� ���� ��ϴ�.");
	}
}

class Student extends Human{
	int studentId ;
	void goToSchool() {
		System.out.println("�л��� �б��� ���ϴ�.");
	}
}
class Worker extends Human{
	int workerId;
	void goToCompany() {
		System.out.println("ȸ����� ���忡 ���ϴ�. ");
	}
}
public class Test01 {

	public static void main(String[] args) {
		Human human = new Human();	//�θ�Ŭ����
		human.name = "������";
		human.age= 25;
		human.eat();
		human.sleep();
	
		Student student = new Student();	//�ڽ�Ŭ���� : �ڽ�Ŭ������ �θ�Ŭ������ �ʵ�� �޼ҵ带 ��ӹ޴´�. 
		student.name="������2";	//�θ�Ŭ������ �ʵ�
		student.eat();	//�θ�Ŭ������ �޼ҵ�
		student.studentId=20170033;	//�ڽ�Ŭ������ �ʵ�
		student.goToSchool();//�ڽ� Ŭ������ �޼ҵ�
		
		Worker worker = new Worker();	//�ڽ�Ŭ����
		worker.name = "BTS";	//�θ�Ŭ���� �ʵ�
		worker.eat();			//�θ�Ŭ���� �޼ҵ�
		worker.workerId = 2222;
		worker.goToCompany(); 	//�ڽ�Ŭ������ �޼ҵ�
		
		Human h1 = new Student();	//��ĳ���� : �ڽ� -> �θ�
		human.name = "�̼���";
		human.eat();
		System.out.println("==============================");
		
		//�ٿ� ĳ���� : �θ� ==> �ڽ����� Ÿ�� ��ȯ
		System.out.println(h1 instanceof Student);
		System.out.println(h1 instanceof Human);
		
		if (h1 instanceof Student) {		//�ٿ�ĳ���� �� �� ��Ÿ�� ������ �����ϱ� ���� 
			Student student2 = (Student) h1;	//�ٿ�ĳ���� �� ������ Ÿ���� ������ ��
			student2.studentId = 3333;
			student2.goToSchool();
		}
		
		if (h1 instanceof Worker) {
			Worker worker2 = (Worker) h1;	//������ ������ �߻����� �ʴ´�. 
		}
										// ����� ���� �߻�, ��Ÿ�� ����
		System.out.println(h1 instanceof Worker); 	//false
	}
}
