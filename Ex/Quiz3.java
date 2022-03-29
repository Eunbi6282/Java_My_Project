package Ex;
class Student{
		//자바는 다중 상속이 불가, 자바의 모든 클래스는 Object 클래스의 자식클래스
	
	String namString;		//학생이름
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
		return "이름 : " + namString + " , 학번 : " + studentID + " , 국어 : " + kor + " , 영어 : " + eng + " , 수학 : " + math
				+ " , 합계 : " + sum + " , 평균 : " + avg;
	} 
}

class S_철수 extends Student{
	
	S_철수 (){}
	
	S_철수(String a, int b, int c, int d, int e){
		super.namString = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double) sum/3;
	}
		
	
	@Override
	void hobby() {
		System.out.println("철수의 취미는 낚시입니다.");
	}
	
}

class S_영희 extends Student{
	
	S_영희(){}
	
	S_영희(String a, int b, int c, int d, int e){
		super.namString = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double) sum/3;
	}
	@Override
	void hobby() {
		System.out.println("영희의 취미는 피아노입니다.");
	}
	
}

class S_영식 extends Student{
	
	S_영식(){}
	S_영식(String a, int b, int c, int d, int e){
		super.namString = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double) sum/3;
		
	}
	@Override
	void hobby() {
		System.out.println("영식의 취미는 베이스입니다.");
	}
}
public class Quiz3 {

	public static void main(String[] args) {
		Student student = new Student();
			//String값 출력
		
		S_영식 s_영식 = new S_영식("김영식", 11, 22, 33, 44);
		S_철수 s_철수 = new S_철수("김철수", 22, 33, 44, 55);
		S_영희 s_영희 = new S_영희("김영희", 33, 44, 55, 66);
		
		S_철수 s_철수2 = new S_철수();
		S_영식 s_영식2 = new S_영식();
		S_영희 s_영희2 = new S_영희();
		
		Student[] students = {s_영식,s_영희,s_철수};
		Student[] students2 = {s_영식2,s_영희2,s_철수2};
		
		System.out.println("=======================================");
		//배열에 객체 넣기
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
			students2[i].hobby();
			
		}
		
		
	}
}
