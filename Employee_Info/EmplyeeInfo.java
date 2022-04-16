package Employee_Info;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;


class Employee{
	// ����� ������ ���� Ŭ���� 
	private int empNo; 	// �����ȣ
	private String empName;  // ����̸�
	private String phone;	// ����ó
	private int age;		// ����
	private String dept;  // �μ�
	private String compRank; //����
	
	public Employee( int empNo, String empName, String phone, int age, String dept, String compRank) {
		this.empNo = empNo;
		this.empName = empName;
		this.phone = phone;
		this.age = age;
		this.dept = dept;
		this.compRank = compRank;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCompRank() {
		return compRank;
	}
	public void setCompRank(String compRank) {
		this.compRank = compRank;
	}
	
	@Override
	public String toString() {
		return " ��� : " + empNo + "/ �̸� : " + empName + "/ ����ó : " + phone + "/ ����  : " + age + "/ �μ� : " + dept + "/ ���� : " + compRank;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			if (this.empNo == ((Employee)obj).empNo) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(empNo);
	}
}

public class EmplyeeInfo {
	
	private static ArrayList<Employee> arrayList = new ArrayList<Employee>();
	
	private	static Scanner scanner = new Scanner(System.in);
	
	private static TreeSet <Employee> treeSet = new TreeSet<Employee>(new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {  //
			if (o1.getEmpNo() < o2.getEmpNo()) {
				return -1;
			}else if (o1.getEmpNo() == o2.getEmpNo()) {
				return 0;
			}else {
				return 1;
			}
		}
	});
	
	
	// ���� �޴� �޼���
	private static void createFirst(){
		int scNo = 0;
		String scName = null;
		String scPhone = null;
		int scAge = 0;
		String scDept = null;
		String scRank = null;
		
		System.out.println("-���");
		scNo = scanner.nextInt();
		
		System.out.println("-�̸�");
		scName = scanner.next();
		System.out.println("-����ó");
		scPhone = scanner.next();
		System.out.println("-����");
		scAge = scanner.nextInt();
		System.out.println("-�μ�");
		scDept = scanner.next();
		System.out.println("-����");
		scRank = scanner.next();
		
		treeSet.add(new Employee(scNo, scName, scPhone, scAge, scDept, scRank));
		arrayList.add(new Employee(scNo, scName, scPhone, scAge, scDept, scRank));
		System.out.println(scName + "���� ������ ���������� �ԷµǾ����ϴ�.");
		
	}
	
	//�Է����� ��� �޼���
	private static void printAll() {
		Employee employee = null;
		
		//arrayList���
		if (arrayList != null) {
			for (int i = 0; i < arrayList.size(); i++) {
				employee = arrayList.get(i);
				System.out.println(employee);
			}
		}
	}
	
	//���� ��� �޼���
	private static void updateEmpNo() {
		System.out.println("������ ��� ");
		int emp_sc = scanner.nextInt();
		System.out.println("������ �ʵ带 �����ϼ���  [1. ����ó, 2.����, 3. �μ�, 4.����");
		int selectNum2 =scanner.nextInt();
		
		// �ش� ��� ��ȣ�� �迭���� ã�� ��ü ���� �ޱ�
		Employee employee = findEmpNo(emp_sc);  // ���� arraylist�� �ٲ��� �ʰ� ���� ���� �����ȣ�� �ش��ϴ� ����ó, ����, �μ� , ���޸� �ٲ۴�. 
		
		if (employee == null) {
			System.out.println("��� : �ش� ����� �������� �ʽ��ϴ�. ");
			return;
		}else {
			if (selectNum2 == 1) {
				System.out.println("������ ����ó�� �Է��ϼ���");
				String phone_sc = scanner.next();
				employee.setPhone(phone_sc);
			}
			if (selectNum2 == 2) {
				System.out.println("������ ���̸� �Է��ϼ���");
				int age_sc = scanner.nextInt();
				employee.setAge(age_sc);
			}
			if (selectNum2 == 3) {
				System.out.println("������ �μ��� �Է��ϼ���");
				String dept_sc = scanner.next();
				employee.setDept(dept_sc);
			}
			if (selectNum2 == 4) {
				System.out.println("������ ������ �Է��ϼ���");
				String rank_sc = scanner.next();
				employee.setCompRank(rank_sc);
			}
		}
		
	}
	// ���� ��� �޼���
	private static void removeEmpNo() {
		System.out.println("������ ����� �Է��ϼ���");
		int de_sc = scanner.nextInt();
		Employee employee = findEmpNo(de_sc);
		
		if (employee == null) {
			System.out.println("�ش� ����� �����ϴ�. ");
			return;
		}else {// �ش� ����� �ִٸ� 
			arrayList.remove(employee);
		}
	}
	
	// ����� ��� ã�� �޼���
	private static Employee findEmpNo(int empNo) {
		Employee employee = null;
		
		for (int i = 0; i < arrayList.size(); i++) { //List���� ���� null�� �Ƥ��� ��쿡 ��ü�� �����ȣ
			if (arrayList.get(i) != null) { 
				int emp = arrayList.get(i).getEmpNo();
				if (emp == empNo) { //arrylist�ȿ� ����ִ� ���� ��ǲ���� ���� ���ٸ� 
					employee = arrayList.get(i); //employee������ ��ü�� �ּ� ������ ��´�.
					break;
				}
			}
		}
		return employee; // ����� �ش��ϴ� �迭�� ������ ��
	}
	
	
	public static void main(String[] args) {
		int selectNum = 0;
		while(true) {
			System.out.println("=======������� ���α׷�============\r\n"
					+ "# 1. ������� �űԵ��\r\n"
					+ "# 2. ������� �˻�\r\n"
					+ "# 3. ������� ����\r\n"
					+ "# 4. ������� ����\r\n"
					+ "# 5. ���α׷� ����\r\n"
					+ "===============================\r\n"
					+ "�޴��� �ش��ϴ� ���ڸ� �Է��ϼ��� >>> ");
			selectNum = scanner.nextInt();
			
			if(selectNum == 1) {
				createFirst();
			}else if (selectNum == 2) {
				printAll();
			}else if (selectNum == 3) {
				updateEmpNo();
			}else if (selectNum == 4) {
				removeEmpNo();
			}else if (selectNum == 5) {
				break;
			}
		}
		scanner.close();
		System.out.println("���α׷��� �����մϴ�.");
	}

}
