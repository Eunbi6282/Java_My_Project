package practice;
	class Human{
		int age;
		String name;
		
		void eat() {
			System.out.println("사람은 먹습니다.");
		}
		void sleep() {
			System.out.println("사람은 잠을 잡니다.");
		}
	}
	
	class Student extends Human{
		int studentId;
		void goToSchool() {
			System.out.println("학생은 학교에 갑니다.");
		}
	}
	class Worker extends Human{
		int workerId;
		void goToCompany() {
			System.out.println("회사원은 직장에 갑니다. ");
		}
	}
public class Pratice_0314 {
	public static void main(String[] args) {
		Human human = new Human();
		human.name = "박은비";
		human.age = 25;
		human.eat();
		
		Human human2 = new Worker();
		human2.age = 24;
		human2.name = "정재현";
		
		//다운캐스팅
		if (human2 instanceof Worker) {
		Worker worker = (Worker) human2;
		worker.workerId= 20170033;	//자식메소드
		worker.name = "박은비";	//부모필드
		worker.goToCompany();
		}
		
		
	}
}
