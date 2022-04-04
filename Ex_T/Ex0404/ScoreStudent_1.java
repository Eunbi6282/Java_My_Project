package Ex_T.Ex0404;
/*
  1. 학생수 :  임의의 값을 입력했을 때 ArrayList의 capacity 크기 지정

  2. 점수 입력 : 입력받은 학생수에 따라서 점수 입력. ArrayList에 각각 객체를 저장
  3. 점수 리스트 : ArrayList에 저장된 Student 객체를 가져와서 score출력
  4. 분석 : 최고점 :       , 평균 점수 : 
  5. 종료
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Student{
	int score; // 점수를 입력, 필드의 값 할당( 1. 객체 생성후 직접 2. private(생성자, getter,setter)
	
	Student(){}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}

public class ScoreStudent_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

        boolean run = true;
        int studentNum = 0; //while블락 밖에서 선언, 전역변수
        ArrayList<Student> arr = new ArrayList<Student>();
        
     while(run) {  // run : true일 동안 루프
    	 System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("학생수를 입력하세요 : ");
                
                studentNum = scanner.nextInt();
                System.out.println("입력완료");
               
            } else if(selectNo == 2) {
            	System.out.println("학생수 만큼 점수를 입력하시오 : " );
            	
            	if (studentNum == 0) {  //학생수를 할당 받아야 for문의 범위를 지정할 수 있다.
					System.out.println("학생수를 먼저 입력하세요");
				}else {
					//for문을 통해 인풋받은 학생수만큼 점수를 입력
					for (int i = 0; i < studentNum; i++) {
						//객체 생성후 인풋받은 값을 Student 객체의 score 변수에 할당.
						Student student = new Student(); // 기본 생성자를 사용해서, 직접score필드 값을 할당
						System.out.print((i + 1) + "번째 학생 점수를 입력하세요.");
						student.score = scanner.nextInt(); //학생 점수를 입력받아서 필드에 값을 할당
						arr.add(student); //score에 값 할당 후 ArrayList에 안에 저장
						System.out.println("입력완료"); //입력완료라고 출력하고 개행
					}
				}
            	
            } else if(selectNo == 3) {
            	// 코드 작성, 점수 리스트 출력, ArrayList가 각 점수가 할당된 객체가 저장
            	// 1. 객체 생성후 필드의 값 직접 출력 2. getter통해서 출력
            	if (studentNum == 0) {
					System.out.println("학생수를 먼저 입력하세요");
				}else {
					for (int i = 0; i < studentNum; i++) { 	//ArrayList객체를 가져와서 Student.score필드의 값을 출력
						Student student = arr.get(i); //ArrayList의 get()사용 -> 각 방의 Student rorcp4
						System.out.println(student.score); // 필드의 값을 객체로 직접 출력
						//System.out.println(student.getScore()); //필드의 값을 getter로 출력
						
					}
				}
            } else if(selectNo == 4) {
            	
            		if (studentNum == 0) {
						System.out.println("학생수를 먼저 입력하세요");
					} else {
						int maxScore = 0 ; // 최대 점수 지역 변수 선언 <초기값 할당>
						int sum = 0; // 힙계를 저장하는 지역변수 <초기값 할당>
						// 1. ArrayList의 객체를 가지고 온다. 2. Student객체의 score필드의 값을 가져와서 처리
						for (int i = 0; i < studentNum; i++) {
							Student student = arr.get(i);
							//최대 값을 변수에 할당
							maxScore = (student.score > maxScore) ? student.score : maxScore;//3항 연산자를 사용해서 최대값을 변ㅅㅜㅇㅔ 할당
							sum += student.score; //sum = sum +student.score
						}
						//maxScore,  sum : 모든 sCore값을 더한 값을 변수에 담아서 
						System.out.println("최고점수 : " + maxScore);
						System.out.println("평균점수 : " + (float) sum / studentNum);
						
					}
					
         
            } else if(selectNo == 5) {
            	//코드작성
            	break;
            	// run = false;
              }
        }
     scanner.close();
        System.out.println ("프로그램 종료");
	}
}
