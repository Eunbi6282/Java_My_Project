package kosmo_peb.EE;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String studentName;
	int money;  // �л��� ������ , �ʱⰪ : 100,000
	
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
	
	public void takeBus (Bus bus) {		//�л��� ������ ������? ������ ���� ���� �ؾ� �Ѵ�. 
		bus.take(1000);  // 1000���� ����
		this.money -= 1000;
	}
	
	public void takeOutBus (Bus bus) {	//�������� ����. 
		bus.takeOff(); 
	}
	public void takeSubway(Subway subway) {		//����ö�� Ż��
		subway.take(1500); 
	}
	public void takeOutSubway(Subway subway) {	//����ö�� ������ 
		subway.takeOff();
	}
	public void studentInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�Դϴ�. ");
	}
	
	@Override
	public String toString() {
		return studentName + "\t\t" + money;
	}
}

class Bus{
	int busName; //N�� ���� <= ��ǲ���� �޾Ƽ� �����ڿ��� �Ű������� ���� �̸� ����
	int passenagerCount;  // �°���, �л��� ������ Ż���� �°��� �þ  
	int money;	// ������ ���� // 1000���� ����
	
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
	public void take(int money) {	// ������ ������ ó��, �°��� ó��
		// ������ Ÿ��? �°��� �þ, ���� �þ
		this.money += money;		//money(������ ����)�� ������ ��ŭ �þ.
		passenagerCount++;		// ���� ��ǲ�ɼ��� �°��� 1�� �þ.
		
	}
	public void takeOff() {		// �°����� ����
		passenagerCount --;
	}
	
	public void busInfo() {
		System.out.println("���� " + busName + "���� �°��� " + passenagerCount + "���̰� ������ " + money + "�Դϴ�.");
	}
	
}

class Subway{
	String lineNumber;		//Nȣ��
	int passengerCount;		// �°���
	int money;	// ����
	
	public void take(int money) { // ����ö�� ������ ó��, �°��� ó��
		
	}
	
	public void takeOff() {	// �°����� ����
		
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
	
	// 1�� �޼���
	
	public static void createInfo() {
		Student student = new Student();
		System.out.println("�л� �̸��� �Է��ϼ��� >>>");
		sName = scanner.next();
		System.out.println("���� �Է��ϼ��� >>> ");
		money = scanner.nextInt();
		student.setMoney(money);
		student.setStudentName(sName);
		
		
		students.add(new Student(sName, money));
		System.out.println("���������� �ԷµǾ����ϴ�.");
	}
	
	// 2�� �޼���
	public static void printInfo() {
		Student student = new Student();
		System.out.println("=====�л����� ���=====");
		System.out.println("�л��̸�\t\t ������\t\t");
		for (Student k : students) {
			System.out.println(k);
		}
		
		System.out.println("�л��� �����ϼ���(�̸� �Է�) >>>");
		sName2 = scanner.next();
		student.setStudentName(sName2);
		
		
		if (searchStudent(sName2) == null)  {
			System.out.println("������ �̸��� �л��� �����ϴ�. ");
		}else {
			System.out.println(sName2 + "�� ������ �����߽��ϴ�.");
		}
	}
	
	// 3�� �޼���
	
	public static void takeBus() {
	Student student = new Student();
	System.out.println("���� ��ȣ�� �Է��ϼ��� >>>");
	Bus bus = new Bus();
	busN = scanner.nextInt();
	
	buses.add(new Bus(busN));
	
	student.takeBus(bus);
	System.out.println(sName2 + "��" + busN + "�� ������ �����ϴ�. ��ſ� �Ϸ� �Ǽ���.");
	student.studentInfo();
	bus.busInfo();
	
	
	
	
	}
	
	// 4�� �޼���
	public static void takeoffBus() {
		Student student = new Student();
		Bus bus = new Bus();
		System.out.println(sName2 + "�� " + busN + "�� ������ ���Ƚ��ϴ�. �¹���~");
		student.takeOutBus(bus);
	}
	
	// ���� �̸� �л� ã�� �޼���
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
	
	// ���� ���� �̸� ã�� �޼���
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
					+ "1. �л���ü ����  | 2. �л����� ��� �� ����  \r\n"
					+ "3. ������ Ž |  4.  ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����.   7. ����  \r\n"
					+ "========================================================================");
			System.out.println("���� >>> ");
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
		System.out.println("���α׷��� �����մϴ�. ");

	}

}
