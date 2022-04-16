package kosmo_peb;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterInfo;

// ��ü ���� ����
/*				�л��� �뵷 : 100,000
 	�л� 	:   			������ Ż �� (������ - 1000)  	����ö�� Ż ��(-1500)
 	���� 	: 1000��   		�°��� ����, ���� ����
 	����ö	: 1500��										�°��� ����, ���� ����
 	
 */

class Student{
	String studentName;	// �л��̸�
	int money;  // �л��� ���� ��, �ʱⰪ : 100,000
	
	public Student(String studentName , int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
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


	public void takeBus(Bus bus) {	// �л��� ������ ���� ��?  ������ ���� �����ؾ� �Ѵ�. 
		bus.take(1000);//1000���� ���̳ʽ� ��
	}
	
	public void takeOutBus(Bus bus) {	// �������� ���� =? ��
		//ffffffffffffbus.takeout();
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
	}
	
	public void takeOutSubwap (Subway subway) {	// ����ö���� ���� =? ��
		subway.takeOut();
	}
	
	@Override
	public String toString() {
		return studentName + "\t\t" + money  ;
	}
}

class Bus{
	int busName; 	// N�� ����		<= ��ǲ���� �޾Ƽ� �����ڿ��� �Ű������� ���� �̸� ����
	int passenagerCount;  // �°��� , �л��� ������ Ż���� �°��� �þ
	int money;  // ������ ����
	
	public int getBusName() {
		return busName;
	}
	public int setBusName(int busName) {
		return this.busName = busName;
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
	
	public void take(int money) {		//  ������ ������ ó��, �°��� ó��
		// �� money�� ������ ����,�°��� ������
		
	}
	public void takeOut(){	// �°����� ����
		
	}
}

class Subway{
	String lineNumber;  // 1ȣ�� 2ȣ�� 3ȣ��
	int passengerCount;		// �°���
	int money;		//����
	
	// �����ڸ� ���ؼ� ����ö ȣ���� ��ǲ�޾Ƽ� Ȱ��ȭ
	
	public void take (int money) {	//  ����ö�� ������ ó��, �°��� ó��
		
	}
	
	public void takeOut(){	// �°����� ����
		
	}
	
	
}



public class CooperationBetweenObject {
	public static ArrayList<Student> students = new ArrayList();
	public static Scanner scanner = new Scanner(System.in);
	static String Sname = null;
	static int leftMoney = 0;
	static int originMoney = 0;
	static int BpassengerCount;
	
	// 1�� �޼���
	public static void create() {
		System.out.println("�л� �̸��� �Է��ϼ��� >>>");
		String studentName = scanner.next();
		System.out.println("���� �Է��ϼ��� >>> ");
		int money = scanner.nextInt();
		
		students.add(new Student(studentName, money));
		System.out.println("�� �ԷµǾ����ϴ�. ");
	}
	
	// 2�� �޼���
	public static void printerInfo() {
		Student student = null;
		System.out.println("=====�л����� ���=====");
		System.out.println("�л��̸�\t\t ������\t\t");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		System.out.println("�л��� �����ϼ���(�̸� �Է�) >>>");
		Sname = scanner.next();
		
		System.out.println(Sname + "�� ������ �����߽��ϴ�.");
		
	}
	
	// ����� �л� �̸��� �Է��ϸ� �̸��� ���� 
	
	
	//3�� �޼���
	public static void rideBus() {
		Student student = searchMethod(Sname);
		System.out.println("������ȣ�� �Է��ϼ��� >>> ");
		int busNum = scanner.nextInt();
		Bus bus = new Bus();
		busNum = bus.setBusName(busNum);
		System.out.println(student.getStudentName() + "�� " + busNum + " �� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���^^");
		
		for (int i = 0; i < students.size(); i++) {
			originMoney = students.get(i).getMoney();
			leftMoney = originMoney - 1000;
		}
		System.out.println(Sname + "���� ���� ���� " + leftMoney + "�Դϴ�.");
		
		BpassengerCount = students.size();
		System.out.println(BpassengerCount);
		
		
		System.out.println("���� " + busNum + "���� �°��� 000���̰� ������000 �Դϴ�. ");
		
	}
	
	
	// ���� �л� ã�� �޼���
	public static Student searchMethod(String studentName) {
		Student student = null;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i) != null) {
				String	name = students.get(i).getStudentName();
				if (name.equals(studentName)) {
					student = students.get(i);
					return student;
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
				create();
			}else if (selectNum == 2) {
				printerInfo();
			}else if (selectNum == 3) {
				rideBus();
			}else if (selectNum == 4) {
				
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