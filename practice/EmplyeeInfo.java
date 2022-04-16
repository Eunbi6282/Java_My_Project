package practice;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	private int empNo; 	// �����ȣ
	private String empName;  // ����̸�
	private String phone;	// ����ó
	private int age;		// ����
	private String dept;  // �μ�
	private String compRank; //����
	
	// ������
	public Employee(int empNo, String empName,String phone, int age, String dept, String compRank) {
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
	public int compareTo(Employee o) {
		
		if (this.empNo < o.empNo) {
			return -1;	//��������
		}else if (this.empNo == o.empNo) {
			return 0;
		}else {
			return 1;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Employee) {
			if (this.empNo == ((Employee)obj).getEmpNo()) {	
				// �� �ڽ��� enpNo�� ������ ���� obj(EmployeeŸ������ �ٿ�ĳ���� ����)�� ���ٸ�
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

//TreeSet���
public class EmplyeeInfo {
	private static Scanner scanner = new Scanner(System.in);
	
	private static TreeSet<Employee> treeSet = new TreeSet<Employee>();
	
	// 1�� �޼���(�űԵ��)
	private static void newMem() {
		
		System.out.println("�����ȣ�� �Է��ϼ��� >>>");
		int empNo = scanner.nextInt(); 	// �����ȣ
		
		System.out.println("����̸��� �Է��ϼ��� >>>");
		String empName = scanner.next();  // ����̸�
		
		System.out.println("����ó�� �Է��ϼ��� >>>");
		String phone = scanner.next();	// ����ó
		
		System.out.println("���̸� �Է��ϼ��� >>>");
		int age = scanner.nextInt();		// ����
		
		System.out.println("�μ��� �Է��ϼ��� >>>");
		String dept = scanner.next();  // �μ�
		
		System.out.println("������ �Է��ϼ��� >>>");
		String compRank = scanner.next(); //����
		
		// ������ Treeset�� ���
		treeSet.add(new Employee(empNo, empName, phone, age, dept, compRank));
		System.out.println(empName + "������� ������ �� �ԷµǾ����ϴ�.");
	}
	
	// �ι�° �޼��� (TreeSet���� ���� ���)
	
	private static void printInfo() {
		Iterator<Employee> iterator = treeSet.iterator();
		
		
		while (iterator.hasNext()) {
			Employee employee;
			employee = iterator.next();
			System.out.println("���\t�̸�\t����ó\t����\t�μ�\t����");
			
			//iterator�� Treeset�� ���鼭 .get()���� ������ ��
			System.out.print(employee.getEmpNo()); 	// ��� ���
			System.out.print("\t");
			System.out.print(employee.getEmpName());  //�̸� ���
			System.out.print("\t");
			System.out.print(employee.getPhone()); 
			System.out.print("\t");
			System.out.print(employee.getAge()); 
			System.out.print("\t");
			System.out.print(employee.getDept()); 
			System.out.print("\t");
			System.out.print(employee.getCompRank());
			System.out.println();
		}
	}
	
	//����° �޼��� (���� �޼���)
	private static void reviseInfo() {
		
		System.out.println("������ ����� �Է��ϼ���.");
		int num = scanner.nextInt();
		Employee employee = searchempNo(num);  //�Է��� num�� ���� TreeSet�� �ִ� .getempNo���ؼ� true �̸� ���,
		
		System.out.println("������ �ʵ� ���� [1. ����ó, 2.����, 3. �μ�, 4.����] : ");
		if (employee == null) {
			System.out.println("");
		}else {
			int selec = scanner.nextInt();
			if (selec == 1) {
				System.err.println("������ ����ó�� �Է��� �ּ��� >>>");
				String phone = scanner.next();
				employee.setPhone(phone);  //phone�� ���� set�� ���� ���� employe(EmpolyeeŸ��)
			}else if (selec == 2) {
				System.err.println("������ ���̸� �Է��� �ּ��� >>>");
				int age = scanner.nextInt();
				employee.setAge(age);  
			}else if (selec == 3) {
				System.err.println("������ �μ��� �Է��� �ּ��� >>>");
				String dept = scanner.next();
				employee.setDept(dept);;  
			}else if (selec == 4) {
				System.err.println("������ ���޸� �Է��� �ּ��� >>>");
				String rank = scanner.next();
				employee.setCompRank(rank);;  
			}
		}
	}
	
	// �׹�° �޼��� (���� �޼���)
	private static void deleteMethod() {
		System.out.println("������ ����� �Է��ϼ��� >>> ");
		int num = scanner.nextInt();
		Employee employee = searchempNo(num);
		
		treeSet.remove(employee);
		System.out.println("������ �����Ǿ����ϴ�.");
	}
	
	// ���� �����ȣ ã�� �޼��� (TreeSet�� �ִ� ��, ��ǲ�޴� ��)
	private static Employee searchempNo (int emp) {  //emp : ������ �����ȣ ��  !!!EmployeeŸ��!!!!
		Iterator<Employee> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next(); // employee : Treeset�� �ִ� ���� (EmployeeŸ��)
			if (emp == employee.getEmpNo()) {  // ������ ��(emp)�� Treeset�� �ִ°��� .getEmpNo�ؼ� ������ �����ȣ�� ������
				return employee;		// employee��� (EmployeeŸ��)
			}
		}
		return null;
	}
	
	

	public static void main(String[] args) {
		
		int selectNum;
		while (true) {
			System.out.println("=======������� ���α׷�============\r\n"
					+ "# 1. ������� �űԵ��\r\n"
					+ "# 2. ������� �˻�\r\n"
					+ "# 3. ������� ����\r\n"
					+ "# 4. ������� ����\r\n"
					+ "# 5. ���α׷� ����\r\n"
					+ "===============================\r\n"
					+ "�޴��� �ش��ϴ� ���ڸ� �Է��ϼ��� >>> ");
			selectNum = scanner.nextInt();
			if (selectNum == 1) {
				newMem();  //staticŰ�� �����ϹǷ� ��ü �������� ȣ�� ����
			}else if (selectNum == 2) {
				printInfo();
			}else if (selectNum == 3) {
				reviseInfo();
			}else if (selectNum ==4) {
				deleteMethod();
			}else if (selectNum ==5) {
				break;
			}
			
		}
		scanner.close();
		System.out.println("���α׷��� �����մϴ�. ");
	}

}
