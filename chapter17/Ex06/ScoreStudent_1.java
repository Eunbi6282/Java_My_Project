package chapter17.Ex06;
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
	int score;
	
	public Student(int score) {
		this.score = score;
	}
	
	@Override
		public String toString() {
		String stringScore = Integer.toString(score);
		score =Integer.parseInt(stringScore);
			return stringScore;
		}
}

public class ScoreStudent_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

        boolean run = true;
        int studentNum = 0;
        int num1 = 0;
        int num2 = 0;
        ArrayList<Student> arr = new ArrayList<Student>();
        
     while(run) {
    	 System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("학생수를 입력하세요 : ");
                
                num1 = scanner.nextInt();
            	arr = new ArrayList<Student>(num1); //capacity 늘림
                System.out.println("입력완료");
               
            } else if(selectNo == 2) {
            	System.out.println("학생수 만큼 점수를 입력하시오 : " );
            	
            	for (int i = 0; i < num1; i++) {
            		System.out.println((i +1)+ "번 학생 점수를 입력하세요 : "  );
            		num2 = scanner.nextInt();
            		arr.add(new Student(num2));
            		System.out.println("입력완료");
            	} 
            	
            } else if(selectNo == 3) {
            	
            		for (int i = 0; i < arr.size(); i++) {
            			System.out.println(arr);
            			break;
					}
					
             
            } else if(selectNo == 4) {
            	
            		int maxScore = 0;
                	int sum = 0;
//                	Integer[] scores = arr.toArray(new Integer[0]);
                	studentNum = arr.size();
                	//최대값
                	for (int i = 0; i < arr.size(); i++) {
                		sum += arr.get(i).score;
                		
                		if(maxScore < arr.get(i).score) {
                			maxScore = arr.get(i).score;
                		}           
                	}
                	System.out.println("최고점수 : " + maxScore);
                	System.out.println("평균점수 : " + (float) sum / studentNum);
					
         
            } else if(selectNo == 5) {
            	//코드작성
            	break;
              }
        }
        System.out.println ("프로그램 종료");
	}
}
