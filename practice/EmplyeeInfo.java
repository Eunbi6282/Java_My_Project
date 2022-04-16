package practice;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	private int empNo; 	// 사원번호
	private String empName;  // 사원이름
	private String phone;	// 연락처
	private int age;		// 나이
	private String dept;  // 부서
	private String compRank; //직급
	
	// 생성자
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
			return -1;	//오름차순
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
				// 내 자신의 enpNo와 변수로 들어온 obj(Employee타입으로 다운캐스팅 해줌)이 같다면
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

//TreeSet사용
public class EmplyeeInfo {
	private static Scanner scanner = new Scanner(System.in);
	
	private static TreeSet<Employee> treeSet = new TreeSet<Employee>();
	
	// 1번 메서드(신규등록)
	private static void newMem() {
		
		System.out.println("사원번호를 입력하세요 >>>");
		int empNo = scanner.nextInt(); 	// 사원번호
		
		System.out.println("사원이름을 입력하세요 >>>");
		String empName = scanner.next();  // 사원이름
		
		System.out.println("연락처를 입력하세요 >>>");
		String phone = scanner.next();	// 연락처
		
		System.out.println("나이를 입력하세요 >>>");
		int age = scanner.nextInt();		// 나이
		
		System.out.println("부서를 입력하세요 >>>");
		String dept = scanner.next();  // 부서
		
		System.out.println("직급을 입력하세요 >>>");
		String compRank = scanner.next(); //직급
		
		// 내용을 Treeset에 담기
		treeSet.add(new Employee(empNo, empName, phone, age, dept, compRank));
		System.out.println(empName + "사원님의 정보가 잘 입력되었습니다.");
	}
	
	// 두번째 메서드 (TreeSet안의 내용 출력)
	
	private static void printInfo() {
		Iterator<Employee> iterator = treeSet.iterator();
		
		
		while (iterator.hasNext()) {
			Employee employee;
			employee = iterator.next();
			System.out.println("사번\t이름\t연락처\t나이\t부서\t직급");
			
			//iterator가 Treeset을 돌면서 .get()값을 가지고 옴
			System.out.print(employee.getEmpNo()); 	// 사번 출력
			System.out.print("\t");
			System.out.print(employee.getEmpName());  //이름 출력
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
	
	//세번째 메서드 (수정 메서드)
	private static void reviseInfo() {
		
		System.out.println("수정할 사번을 입력하세요.");
		int num = scanner.nextInt();
		Employee employee = searchempNo(num);  //입력한 num의 값과 TreeSet에 있는 .getempNo비교해서 true 이면 출력,
		
		System.out.println("수정할 필드 선택 [1. 연락처, 2.나이, 3. 부서, 4.직급] : ");
		if (employee == null) {
			System.out.println("");
		}else {
			int selec = scanner.nextInt();
			if (selec == 1) {
				System.err.println("수정할 연락처를 입력해 주세요 >>>");
				String phone = scanner.next();
				employee.setPhone(phone);  //phone의 값을 set을 통해 변경 employe(Empolyee타입)
			}else if (selec == 2) {
				System.err.println("수정할 나이를 입력해 주세요 >>>");
				int age = scanner.nextInt();
				employee.setAge(age);  
			}else if (selec == 3) {
				System.err.println("수정할 부서를 입력해 주세요 >>>");
				String dept = scanner.next();
				employee.setDept(dept);;  
			}else if (selec == 4) {
				System.err.println("수정할 직급를 입력해 주세요 >>>");
				String rank = scanner.next();
				employee.setCompRank(rank);;  
			}
		}
	}
	
	// 네번째 메서드 (삭제 메서드)
	private static void deleteMethod() {
		System.out.println("삭제할 사번을 입력하세요 >>> ");
		int num = scanner.nextInt();
		Employee employee = searchempNo(num);
		
		treeSet.remove(employee);
		System.out.println("정보가 삭제되었습니다.");
	}
	
	// 공통 사원번호 찾는 메서드 (TreeSet에 있는 값, 인풋받는 값)
	private static Employee searchempNo (int emp) {  //emp : 들어오는 사원번호 값  !!!Employee타입!!!!
		Iterator<Employee> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next(); // employee : Treeset에 있는 값들 (Employee타입)
			if (emp == employee.getEmpNo()) {  // 들어오는 값(emp)와 Treeset에 있는값중 .getEmpNo해서 가져온 사원번호가 같으면
				return employee;		// employee출력 (Employee타입)
			}
		}
		return null;
	}
	
	

	public static void main(String[] args) {
		
		int selectNum;
		while (true) {
			System.out.println("=======사원관리 프로그램============\r\n"
					+ "# 1. 사원정보 신규등록\r\n"
					+ "# 2. 사원정보 검색\r\n"
					+ "# 3. 사원정보 수정\r\n"
					+ "# 4. 사원정보 삭제\r\n"
					+ "# 5. 프로그램 종료\r\n"
					+ "===============================\r\n"
					+ "메뉴에 해당하는 숫자를 입력하세요 >>> ");
			selectNum = scanner.nextInt();
			if (selectNum == 1) {
				newMem();  //static키를 포함하므로 객체 생성없이 호출 가능
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
		System.out.println("프로그램을 종료합니다. ");
	}

}
