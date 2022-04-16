package Employee_Info;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;


class Employee{
	// 사원의 정보를 담은 클래스 
	private int empNo; 	// 사원번호
	private String empName;  // 사원이름
	private String phone;	// 연락처
	private int age;		// 나이
	private String dept;  // 부서
	private String compRank; //직급
	
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
		return " 사번 : " + empNo + "/ 이름 : " + empName + "/ 연락처 : " + phone + "/ 나이  : " + age + "/ 부서 : " + dept + "/ 직급 : " + compRank;
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
	
	
	// 정보 받는 메서드
	private static void createFirst(){
		int scNo = 0;
		String scName = null;
		String scPhone = null;
		int scAge = 0;
		String scDept = null;
		String scRank = null;
		
		System.out.println("-사번");
		scNo = scanner.nextInt();
		
		System.out.println("-이름");
		scName = scanner.next();
		System.out.println("-연락처");
		scPhone = scanner.next();
		System.out.println("-나이");
		scAge = scanner.nextInt();
		System.out.println("-부서");
		scDept = scanner.next();
		System.out.println("-직급");
		scRank = scanner.next();
		
		treeSet.add(new Employee(scNo, scName, scPhone, scAge, scDept, scRank));
		arrayList.add(new Employee(scNo, scName, scPhone, scAge, scDept, scRank));
		System.out.println(scName + "님의 정보가 정상적으로 입력되었습니다.");
		
	}
	
	//입력정보 출력 메서드
	private static void printAll() {
		Employee employee = null;
		
		//arrayList출력
		if (arrayList != null) {
			for (int i = 0; i < arrayList.size(); i++) {
				employee = arrayList.get(i);
				System.out.println(employee);
			}
		}
	}
	
	//수정 사번 메서드
	private static void updateEmpNo() {
		System.out.println("수정할 사번 ");
		int emp_sc = scanner.nextInt();
		System.out.println("수정할 필드를 선택하세요  [1. 연락처, 2.나이, 3. 부서, 4.직급");
		int selectNum2 =scanner.nextInt();
		
		// 해당 사원 번호를 배열에서 찾아 객체 리턴 받기
		Employee employee = findEmpNo(emp_sc);  // 굳이 arraylist를 바꾸지 않고 내가 적은 사원번호에 해당하는 연락처, 나이, 부서 , 직급만 바꾼다. 
		
		if (employee == null) {
			System.out.println("결과 : 해당 사번이 존재하지 않습니다. ");
			return;
		}else {
			if (selectNum2 == 1) {
				System.out.println("수정할 연락처를 입력하세요");
				String phone_sc = scanner.next();
				employee.setPhone(phone_sc);
			}
			if (selectNum2 == 2) {
				System.out.println("수정할 나이를 입력하세요");
				int age_sc = scanner.nextInt();
				employee.setAge(age_sc);
			}
			if (selectNum2 == 3) {
				System.out.println("수정할 부서를 입력하세요");
				String dept_sc = scanner.next();
				employee.setDept(dept_sc);
			}
			if (selectNum2 == 4) {
				System.out.println("수정할 직급을 입력하세요");
				String rank_sc = scanner.next();
				employee.setCompRank(rank_sc);
			}
		}
		
	}
	// 삭제 사번 메서드
	private static void removeEmpNo() {
		System.out.println("삭제할 사번을 입력하세요");
		int de_sc = scanner.nextInt();
		Employee employee = findEmpNo(de_sc);
		
		if (employee == null) {
			System.out.println("해당 사번이 없습니다. ");
			return;
		}else {// 해당 사번이 있다면 
			arrayList.remove(employee);
		}
	}
	
	// 공통된 사번 찾는 메서드
	private static Employee findEmpNo(int empNo) {
		Employee employee = null;
		
		for (int i = 0; i < arrayList.size(); i++) { //List방의 값이 null이 아ㅏ닐 경우에 객체의 사원번호
			if (arrayList.get(i) != null) { 
				int emp = arrayList.get(i).getEmpNo();
				if (emp == empNo) { //arrylist안에 들어있는 값과 인풋받은 값이 같다면 
					employee = arrayList.get(i); //employee변수에 객체의 주소 정보를 담는다.
					break;
				}
			}
		}
		return employee; // 사번에 해당하는 배열을 가지고 옴
	}
	
	
	public static void main(String[] args) {
		int selectNum = 0;
		while(true) {
			System.out.println("=======사원관리 프로그램============\r\n"
					+ "# 1. 사원정보 신규등록\r\n"
					+ "# 2. 사원정보 검색\r\n"
					+ "# 3. 사원정보 수정\r\n"
					+ "# 4. 사원정보 삭제\r\n"
					+ "# 5. 프로그램 종료\r\n"
					+ "===============================\r\n"
					+ "메뉴에 해당하는 숫자를 입력하세요 >>> ");
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
		System.out.println("프로그램을 종료합니다.");
	}

}
