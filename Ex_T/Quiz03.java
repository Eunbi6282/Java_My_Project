package Ex_T;

class Student{
	//자바는 다중 상속이 불가, 자바의 모든 클래스는 Object 클래스의 자식클래스

	String nameString;		//학생이름
	int studentID;			//학번
	int eng;				//영어점수
	int kor;				//국어점수
	int math;				//수학점수
	
	int sum;				//점수합계
	double avg;				//평균
	
	void hobby() {
		System.out.println("각 학생의 취미는 입니다.");
	}
	
	@Override									//ALT+CTRL+S => OVERRIDINGMETHOD/ TOSTRING
	public String toString() {		//Object클래스의 메소드, 객체 자체를 출력할 때 [패키지명.클래스명@해쉬코드]
		return "이름 : " + nameString + " , 학번 : " + studentID + " , 국어 : " + kor + " , 영어 : " + eng + " , 수학 : " + math
				+ " , 합계 : " + sum + " , 평균 : " + avg;
	} 
}

class S_철수 extends Student{



	S_철수(String nameString, int studentID, int kor, int eng , int math){
		super.nameString = nameString;	//super : 부모클래스, this : 자신의 객체
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor + eng + math;
		super.avg = (double) sum/3;
	}
		
	
	@Override
	void hobby() {
		System.out.println("철수의 취미는 낚시입니다.");
	}

}

class S_미희 extends Student{

	S_미희(){}
	
	S_미희(String nameString, int studentID, int kor, int eng , int math){
		super.nameString = nameString;	//super : 부모클래스, this : 자신의 객체
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor + eng + math;
		super.avg = (double) sum/3;
	}
	@Override
	void hobby() {
		System.out.println("미희의 취미는 베이스입니다.");
	}

}

class S_영현 extends Student{

S_영현(){}
	S_영현 (String nameString, int studentID, int kor, int eng , int math){
		super.nameString = nameString;	//super : 부모클래스, this : 자신의 객체
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor + eng + math;
		super.avg = (double)sum/3;	//(double)처리를 하던가, sum/3.0 한쪽을 더블형태로 만들어줌
	}
	@Override
	void hobby() {
		System.out.println("영현의 취미는 베이스입니다.");
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		Student student = new Student();
		//String값 출력
		
		
	Student 영현 = new S_영현("강영현", 931219, 10, 100, 11);
	Student 미희 = new S_미희("김미희", 980222, 100, 11, 100);
	Student 철수 = new S_철수("김철수", 22, 33, 44, 55);
	
	Student[] arr = {영현, 미희,철수};
	//Student type

	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
		arr[i].hobby();
	}
	System.out.println();
	 for (Student student2 : arr) {
		System.out.println(student2);
		student2.hobby();
	}
	
	}
	

}


