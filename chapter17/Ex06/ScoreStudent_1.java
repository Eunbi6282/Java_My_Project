package chapter17.Ex06;
/*
  1. �л��� :  ������ ���� �Է����� �� ArrayList�� capacity ũ�� ����

  2. ���� �Է� : �Է¹��� �л����� ���� ���� �Է�. ArrayList�� ���� ��ü�� ����
  3. ���� ����Ʈ : ArrayList�� ����� Student ��ü�� �����ͼ� score���
  4. �м� : �ְ��� :       , ��� ���� : 
  5. ����
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
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("�л����� �Է��ϼ��� : ");
                
                num1 = scanner.nextInt();
            	arr = new ArrayList<Student>(num1); //capacity �ø�
                System.out.println("�Է¿Ϸ�");
               
            } else if(selectNo == 2) {
            	System.out.println("�л��� ��ŭ ������ �Է��Ͻÿ� : " );
            	
            	for (int i = 0; i < num1; i++) {
            		System.out.println((i +1)+ "�� �л� ������ �Է��ϼ��� : "  );
            		num2 = scanner.nextInt();
            		arr.add(new Student(num2));
            		System.out.println("�Է¿Ϸ�");
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
                	//�ִ밪
                	for (int i = 0; i < arr.size(); i++) {
                		sum += arr.get(i).score;
                		
                		if(maxScore < arr.get(i).score) {
                			maxScore = arr.get(i).score;
                		}           
                	}
                	System.out.println("�ְ����� : " + maxScore);
                	System.out.println("������� : " + (float) sum / studentNum);
					
         
            } else if(selectNo == 5) {
            	//�ڵ��ۼ�
            	break;
              }
        }
        System.out.println ("���α׷� ����");
	}
}
