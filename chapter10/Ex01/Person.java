package chapter10.Ex01;

import chapter06_07.Ex02.A;

class Student extends Person{		// 대학생 클래스, Person : 부모, Student : 자식
	// 자식클래스는 부모클래스의 필드, 메소드, 이너클래스 를 그대로 상속받는다.
	
	int studentID;
	void goToSchool() {
	System.out.println("자식 클래스의 Student 메소드 goToSchool 호출");	
	}
}

class Student_sub extends Student{
	//Student_sub는 Student를 상속받고 있다.Student의 필드와 메소드를 상속받는다. 
	//Student는 Person을 상속받고 있다. Student는 Person의 필드와 메소드를 상속받고 있다. 
	
	//Student_sub : Person와 Student의 필드와 메소드를 모두 상속받는다. 
	
	String subString;
	void sub1() {
		System.out.println("Student_sub1 클래스 입니다. 부모의 필드와 메소드를 물려 받습니다. ");
	}
}

class Worker extends Person{		// 직장인 클래스 
	int workerID;	//사번
	void goToWork() {
		System.out.println("직장인 클래스의 메소드 호출");
	}
}


public class Person {		//상속 : 부모 클래스의 (필드 , 메소드, 내부 클래스 )를 자식클래스에게 상속해 준다. 
								// 상속의 이점 : 1. 중복되는 코드 제거(코드의 재사용), 2. 코드가 간결해진다, 3. 다형성(메소드 오버라이딩)구현 
										//다형성 -> 하나의 메소드 이름으로 여러 형식으로 출력할 수 있다. 
	String nameString;
	int age;
	
	void eat() {
		System.out.println("부모 클래스의 eat()메소드");
	}
	
	void sleep() {
		System.out.println("부모 클래스의 sleep() 메소드");	
	}
	
	public static void main(String[] args) {
		
		// 1. person 객체 생성
		Person person = new Person();
		person.nameString = "박은비";
		person.age = 25;
		person.eat();
		person.sleep();
		
		System.out.println("============================");
		
		// 2. Student 객체 생성
		Student student = new Student();
			//자식 클래스는 부모 클래스의 선언된 필드와 
		
		//Person 클래스의 필드
		student.nameString = "박은비";
		student.age =25;
		
		//Student 클래스의 필드
		student.studentID = 20170033;
		
		//Person클래스의 메소드
		student.eat();
		student.sleep();
		
		//Student 클래스의 메소드
		student.goToSchool();
		
		System.out.println("============================");
		
		// 3. work 객체 생성
		Worker worker = new Worker();		//Person 클래스를 상속한다. Person클래스의 필드와 메소드 사용
		
		//부모 클래스의 필드 : Person
		worker.nameString = "세종대왕";
		worker.age=60;
		//자식 클래스의 필드 : Worker
		worker.workerID = 20220310;
		
		//부모 클래스의 메소드: Person
		worker.eat();
		worker.sleep();
		
		//자식클래스의 메소드 : Worker
		worker.goToWork();
		
		System.out.println("========객체 생성시 타입 변화============");
		
		Person p1 =  new Person();		//Person()은 Person이다. (자식은 부모다)
		Person ps = new Student();  	// 업캐스팅 , student는 Person이다. (자식은 부모다 -> O)
		// Student sp = new Person(); => 오류 : Person은 Student다.(부모는 자식이다. -> X)
		Person pwn = new Worker();	//업캐스팅, Worker는 Person이다. (자식은 부모다 -> O)
		//Worker wp = new Person();  => 오류 : Person은 Worker다.(부모는 자식이다. -> X)
		
		System.out.println("========Person <== Student <== Student_sub===========");
		
		Student_sub sub = new Student_sub();  //가능
		//클래스 타입   객체명  new  자식클래스 > 
		
			//Person 클래스의 필드와 메소드 사용 가능
			sub.nameString = "신사임당";
			sub.age = 50;
			sub.eat();
			sub.sleep();
			
			//Student 클래스의 필드와 메소드
			sub.studentID = 20220310;
			sub.goToSchool();
			
			//Student_sub의 필드와 메소드
			sub.subString = "자식의 자식 클래스";
			sub.sub1();
		
		Person Person1 = new Student_sub();		//업캐스팅 (Student_sub는 Person이다)
														//업캐스팅: Student_sub(자식) 객체를 생성 시 부모 데이터 타입으로 형변환
			//Student_sub를 Person 타입으로 업캐스팅 -> Person클래스의 멤버만 사용 가능
		
			//Person 클래스의 필드와 메소드만 접근
			Person1.nameString = "BTS";
			Person1.age = 30;
			Person1.eat();
			Person1.sleep();
			
			
			
		Student ss1 = new Student_sub();			//업캐스팅 (Student_sub는 Student이다) : Student_sub를 Student타입으로 업캐스팅
			//Person과 Student의 필드와 메소드를 사용가능
			
			//Person 클래스 요소
			ss1.nameString = "SES";
			ss1.age = 30;
			ss1.eat();
			ss1.sleep();
			
			//Student클래스 요소
			ss1.studentID = 20170033;
			ss1.goToSchool();
		
		
		Student_sub ss2 = new Student_sub();		//Person Student Student_sub모두 사용 가능
		
			//Person 클래스 요소
			ss2.nameString = "정재현";
			ss2.age = 26;
			ss2.eat();
			ss2.sleep();
			
			//Student 클래스 요소
			ss2.studentID = 19970214;
			ss2.goToSchool();
			
			//Student_sub 클래소 요소
			ss2.subString = "자식의 자식 클래스";
			ss2.sub1();
			
			//상속 관계에서 객체 생성 시 부모 데이터 타입으로 업캐스팅 가능
				//부모 데이터 타입으로 업캐스팅 된 경우 부모의 필드와 메소드만 사용 가능
			
				// Person <== Student <== Student_sub
			
			Person ps4 = new Student_sub();
				//Student_sub객체 생성시 Person 타입으로 업캐스팅
				//Student_sub는 Person과 Student와 Student_sub의 모든 필드와 메소드를 포함
				//그중에서 업캐스팅(Person ps4 = new Student_sub();)을 사용하면 Person 클래스의 필드와 메소드만 접근 가능
			
			Student ss4 = new Student_sub();
				//Student_sub객체 생성시 Student 타입으로 업캐스팅
				//Student_sub는 Person과 Student와 Student_sub의 모든 필드와 메소드를 포함
				//그중에서 업캐스팅(Student ss4 = new Student_sub();)을 사용하면 Person 과 Student클래스의 필드와 메소드만 접근 가능
			
			Student_sub ss5 = new Student_sub();
				//Student_sub는 Person과 Student와 Student_sub의 모든 필드와 메소드를 포함
				//Person, Student, Student_sub 클래스의 필드와 메소드 접근 가능
			
			System.out.println("====다운 캐스팅====");
			// 다운 태스팅 : 부모데이터 타입으로 업캐스팅 된 것을 자식 데이터 타입으로 변환(수동으로 변환)
			
			Student ps5 = (Student) ps4;		//ps4( Person, Student, Student_sub)의 데이터 타입:Person
					//ps5는 Person, Student의 필드와 메소드 접근 가능
			
			ps5.nameString = "다운 캐스팅";
			ps5.age = 30;
			ps5.studentID = 20220314;	//Student 필드와 메소드 사용 가능
			
			Student_sub ps6 = (Student_sub) ps4;	//ps4가 Person데이터 타입에서 Student_sub로 다운 캐스팅
				// Student_sub로 다운 캐스팅 (Person, Student, Student_sub 모두 사용 가능)
			ps6. nameString = "이도현";
			ps6.studentID = 19950411;
			ps6.subString = "자식의 자식";
			
		
	}
}