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
		return "이름 : " + name + " , 학번 : " + studentId + " , 국어 : " + kor + " , 영어 : " + eng + " , 수학 : " + math
				+ " , 합계 : " + sum + " , 평균 : " + avg;
	}
}

class 영현 extends Student3{
	영현 (String name, int studentId, int kor, int eng, int math){
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
		System.out.println("영현의 취미는 베이스입니다.");
	}
	
}
class 미희 extends Student3{
	미희 (String name, int studentId, int kor, int eng, int math){
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
		System.out.println("미희의 취미는 베이스입니다.");
	}
	
}
public class Practice_Quiz3_0314 {
	public static void main(String[] args) {
		Student3 student = new Student3();
		Student3 영현 = new 영현("강영현", 910219, 25, 35, 45);
		Student3 미희 = new 미희("김미희", 980222, 23, 56, 89);
		Student3[] students = {영현, 미희};
		for (Student3 k : students) {
			System.out.println(k);
			k.hobby();
			
		}
		
		
	}
}
