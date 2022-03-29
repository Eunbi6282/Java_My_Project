package chapter14.Ex05;
//자동 리소스(객체) 제거
	// 1. AutoCloseable 인터페이스 구현
	// 2. close()재정의
// 필드의 값 할당 -> 생성자 호출시 값 할당
class Abc implements AutoCloseable{
	String name;
	int studentId;
	int kor;
	int eng;
	int math;
	double avg;
	
	Abc(String name, int studentId, int kor, int eng, int math){
		this.name = name;
		this.studentId = studentId;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (double) (kor + eng+ math)/3;
		
//		System.out.println("이름 : " + name + " 학번 : " + studentId + " 국어 점수 : " + kor + " 영어 점수 : " + eng  + " 수학 점수 : " + math + " 평균 : " + avg);
	}

	@Override
	public void close() throws Exception {
		System.out.println("이름 : " + name + " 학번 : " + studentId + " 국어 점수 : " + kor + " 영어 점수 : " + eng  + " 수학 점수 : " + math + " 평균 : " + avg);
		if (name != null || studentId != 0 || kor != 0 || eng != 0 || math != 0 || avg != 0.0) {
			name = null;
			studentId = 0;
			kor = 0;
			eng = 0;
			math = 0;
			avg = 0.0;
			System.out.println("이름 : " + name + " 학번 : " + studentId + " 국어 점수 : " + kor + " 영어 점수 : " + eng  + " 수학 점수 : " + math + " 평균 : " + avg);	
		}
			System.out.println("리소스가 해제되었습니다.");
			//초기화 확인
			System.out.println(avg);
			System.out.println(name);
		}
	}

public class Ex_TryWithResource3 {

	public static void main(String[] args) {
		//1. 객체의 모든 필드를 초기화 하고 자동으로 close()호출
		try (Abc a1 = new Abc("박은비", 20170033, 88, 88, 99)){
			
		} catch (Exception e) {
			System.out.println("예외가 발생되었습니다.");
		}
		System.out.println("======================");
		
		
		//2. 수동으로 close();-> finally블락에서 close()호출
		Abc a2 = null;
		
		try {
			a2 = new Abc("박은비", 20170033, 77, 44, 55);
		} catch (Exception e) {
		}finally {
			if (a2.name != null ||a2.studentId!= 0 || a2.kor != 0 || a2.eng != 0 || a2.math != 0 || a2.avg != 0.0) {
				try {
					a2.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
