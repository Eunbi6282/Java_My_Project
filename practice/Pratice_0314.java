package practice;
	class Human{
		int age;
		String name;
		
		void eat() {
			System.out.println("����� �Խ��ϴ�.");
		}
		void sleep() {
			System.out.println("����� ���� ��ϴ�.");
		}
	}
	
	class Student extends Human{
		int studentId;
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
public class Pratice_0314 {
	public static void main(String[] args) {
		Human human = new Human();
		human.name = "������";
		human.age = 25;
		human.eat();
		
		Human human2 = new Worker();
		human2.age = 24;
		human2.name = "������";
		
		//�ٿ�ĳ����
		if (human2 instanceof Worker) {
		Worker worker = (Worker) human2;
		worker.workerId= 20170033;	//�ڽĸ޼ҵ�
		worker.name = "������";	//�θ��ʵ�
		worker.goToCompany();
		}
		
		
	}
}
