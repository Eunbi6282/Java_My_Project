package kosmo_peb.EE;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String studentName;
	int money;  // 학생이 가진돈 , 초기값 : 100,000
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public Student() {}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void takeBus (Bus bus) {		//학생이 버스를 탔을때? 버스에 돈을 지불 해야 한다. 
		bus.take(1000);  // 1000원씩 증가
		this.money -= 1000;
	}
	
	public void takeOutBus (Bus bus) {	//버스에서 내림. 
		bus.takeOff(); 
	}
	public void takeSubway(Subway subway) {		//지하철을 탈때
		subway.take(1500); 
	}
	public void takeOutSubway(Subway subway) {	//지하철을 내릴때 
		subway.takeOff();
	}
	public void studentInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다. ");
	}
	
	@Override
	public String toString() {
		return studentName + "\t\t" + money;
	}
}

class Bus{
	int busName; //N번 버스 <= 인풋값을 받아서 생성자에서 매개변수로 버스 이름 지정
	int passenagerCount;  // 승객수, 학생이 버스에 탈수록 승객스 늘어남  
	int money;	// 버스의 수입 // 1000원씩 증가
	
	public Bus(){}
	
	public Bus(int busName) {
		this.busName = busName;
	}
	
	public void setBusName(int busName) {
		this.busName = busName;
	}

	public int getBusName() {
		return busName;
	}
	
	public int getPassenagerCount() {
		return passenagerCount;
	}
	public void setPassenagerCount(int passenagerCount) {
		this.passenagerCount = passenagerCount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void take(int money) {	// 버스의 수입을 처리, 승객수 처리
		// 버스를 타면? 승객수 늘어남, 수입 늘어남
		this.money += money;		//money(버스의 수입)은 들어오는 만큼 늘어남.
		passenagerCount++;		// 돈이 인풋될수록 승객도 1명씩 늘어남.
		
	}
	public void takeOff() {		// 승객수만 감소
		passenagerCount --;
	}
	
	public void busInfo() {
		System.out.println("버스 " + busName + "번의 승객은 " + passenagerCount + "명이고 수입은 " + money + "입니다.");
	}
	
}

class Subway{
	String lineNumber;		//N호선
	int passengerCount;		// 승객수
	int money;	// 수입
	
	public void take(int money) { // 지하철의 수입을 처리, 승객수 처리
		
	}
	
	public void takeOff() {	// 승객수만 감소
		
	}
	
}
public class CooperationBetweenObject {
	public static ArrayList<Student> students = new ArrayList<Student>();
	public static ArrayList<Bus> buses = new ArrayList<Bus>();
	public static Scanner scanner = new Scanner(System.in);
	static String sName;
	static int money;
	static int busN;
	static String sName2;
	
	// 1번 메서드
	
	public static void createInfo() {
		Student student = new Student();
		System.out.println("학생 이름을 입력하세요 >>>");
		sName = scanner.next();
		System.out.println("돈을 입력하세요 >>> ");
		money = scanner.nextInt();
		student.setMoney(money);
		student.setStudentName(sName);
		
		
		students.add(new Student(sName, money));
		System.out.println("정상적으로 입력되었습니다.");
	}
	
	// 2번 메서드
	public static void printInfo() {
		Student student = new Student();
		System.out.println("=====학생정보 출력=====");
		System.out.println("학생이름\t\t 가진돈\t\t");
		for (Student k : students) {
			System.out.println(k);
		}
		
		System.out.println("학생을 선택하세요(이름 입력) >>>");
		sName2 = scanner.next();
		student.setStudentName(sName2);
		
		
		if (searchStudent(sName2) == null)  {
			System.out.println("선택한 이름의 학생은 없습니다. ");
		}else {
			System.out.println(sName2 + "의 정보를 선택했습니다.");
		}
	}
	
	// 3번 메서드
	
	public static void takeBus() {
	Student student = new Student();
	System.out.println("버스 번호를 입력하세요 >>>");
	Bus bus = new Bus();
	busN = scanner.nextInt();
	
	buses.add(new Bus(busN));
	
	student.takeBus(bus);
	System.out.println(sName2 + "님" + busN + "번 버스를 탔습니다. 즐거운 하루 되세요.");
	student.studentInfo();
	bus.busInfo();
	
	
	
	
	}
	
	// 4번 메서드
	public static void takeoffBus() {
		Student student = new Student();
		Bus bus = new Bus();
		System.out.println(sName2 + "님 " + busN + "번 버스를 내렸습니다. 굿바이~");
		student.takeOutBus(bus);
	}
	
	// 같은 이름 학생 찾는 메서드
	public static Student searchStudent(String studentName) {
		Student student = null;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i) != null) {
				String stu = students.get(i).getStudentName();
				if (stu.equals(studentName)) {
					student = students.get(i);
					return student;
				}
			}
		}
		return null;
	}
	
	// 같은 버스 이름 찾기 메서드
	public static Bus searchBus (int busName) {
		Bus bus = null;
		for (int i = 0; i < buses.size(); i++) {
			if(buses.get(i) != null) {
				int busn = buses.get(i).busName;
				if (busn == busName) {
					bus = buses.get(i);
					return bus;
				}
			}
				
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("========================================================================\r\n"
					+ "1. 학생객체 생성  | 2. 학생정보 출력 및 선택  \r\n"
					+ "3. 버스를 탐 |  4.  버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림.   7. 종료  \r\n"
					+ "========================================================================");
			System.out.println("선택 >>> ");
			int selectNum = scanner.nextInt();
			if (selectNum == 1) {
				createInfo();;
				
			}else if (selectNum == 2) {
				printInfo();
			}else if (selectNum == 3) {
				takeBus();
			}else if (selectNum == 4) {
				takeoffBus();
			}else if (selectNum == 5) {
				
			}else if (selectNum == 6) {
				
			}else if(selectNum == 7) {
				break;
			}
			
		}
		scanner.close();
		System.out.println("프로그램을 종료합니다. ");

	}

}
