package chapter10.Ex04;

class Human{		//부모클래스
	int age;		//인스턴스 필드 : 객체화 시켜야 사용,Heap
	String name;	
	
	void eat() {	//인스턴스 메소드 : 객체화 시켜야 사용, Heap(pointer), 클래스 영역내의 인스턴스 메소드 영역에 실제 메소드의 코드 저장
		System.out.println("사람이 먹습니다.");
	}
	void sleep() {
		System.out.println("사람이 잠을 잡니다.");
	}
}

class Student extends Human{
	int studentId ;
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
public class Test01 {

	public static void main(String[] args) {
		Human human = new Human();	//부모클래스
		human.name = "박은비";
		human.age= 25;
		human.eat();
		human.sleep();
	
		Student student = new Student();	//자식클래스 : 자식클래스느 부모클래스의 필드와 메소드를 상속받는다. 
		student.name="박은비2";	//부모클래스의 필드
		student.eat();	//부모클래스의 메소드
		student.studentId=20170033;	//자식클래스의 필드
		student.goToSchool();//자식 클래스의 메소드
		
		Worker worker = new Worker();	//자식클래스
		worker.name = "BTS";	//부모클래스 필드
		worker.eat();			//부모클래스 메소드
		worker.workerId = 2222;
		worker.goToCompany(); 	//자식클래스의 메소드
		
		Human h1 = new Student();	//업캐스팅 : 자식 -> 부모
		human.name = "이순신";
		human.eat();
		System.out.println("==============================");
		
		//다운 캐스팅 : 부모 ==> 자식으로 타입 변환
		System.out.println(h1 instanceof Student);
		System.out.println(h1 instanceof Human);
		
		if (h1 instanceof Student) {		//다운캐스팅 할 때 런타임 오류를 방지하기 위해 
			Student student2 = (Student) h1;	//다운캐스팅 할 데이터 타입이 존재할 때
			student2.studentId = 3333;
			student2.goToSchool();
		}
		
		if (h1 instanceof Worker) {
			Worker worker2 = (Worker) h1;	//컴파일 오류는 발생되지 않는다. 
		}
										// 실행시 오류 발생, 런타임 오류
		System.out.println(h1 instanceof Worker); 	//false
	}
}
