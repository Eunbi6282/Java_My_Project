package practice;
class Student3{
	String name;
	int studentId;
	int eng;
	int kor;
	int math;
	
	int sum;
	double avg;
	
	void hobby() {
		
	}

	@Override
	public String toString() {
		return "�̸� : " + name + " , �й� : " + studentId + " , ���� : " + kor + " , ���� : " + eng + " , ���� : " + math
				+ " , �հ� : " + sum + " , ��� : " + avg;
	}
}

class ���� extends Student3{
	���� (String name, int studentId, int kor, int eng, int math){
		super.name = name;
		super.studentId = studentId;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor+math+eng;
		super.avg = (double) sum/3;
	}

	@Override
	void hobby() {
		System.out.println("������ ��̴� ���̽��Դϴ�.");
	}
	
}
class ���� extends Student3{
	���� (String name, int studentId, int kor, int eng, int math){
		super.name = name;
		super.studentId = studentId;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor+math+eng;
		super.avg = (double) sum/3;
	}

	@Override
	void hobby() {
		System.out.println("������ ��̴� ���̽��Դϴ�.");
	}
	
}
public class Practice_Quiz3_0314 {
	public static void main(String[] args) {
		Student3 student = new Student3();
		Student3 ���� = new ����("������", 910219, 25, 35, 45);
		Student3 ���� = new ����("�����", 980222, 23, 56, 89);
		Student3[] students = {����, ����};
		for (Student3 k : students) {
			System.out.println(k);
			k.hobby();
			
		}
		
		
	}
}
