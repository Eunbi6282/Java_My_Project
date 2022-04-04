package Ex_T.Ex0404;
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
	int score; // ������ �Է�, �ʵ��� �� �Ҵ�( 1. ��ü ������ ���� 2. private(������, getter,setter)
	
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
        int studentNum = 0; //while��� �ۿ��� ����, ��������
        ArrayList<Student> arr = new ArrayList<Student>();
        
     while(run) {  // run : true�� ���� ����
    	 System.out.println("----------------------------------------------------");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("�л����� �Է��ϼ��� : ");
                
                studentNum = scanner.nextInt();
                System.out.println("�Է¿Ϸ�");
               
            } else if(selectNo == 2) {
            	System.out.println("�л��� ��ŭ ������ �Է��Ͻÿ� : " );
            	
            	if (studentNum == 0) {  //�л����� �Ҵ� �޾ƾ� for���� ������ ������ �� �ִ�.
					System.out.println("�л����� ���� �Է��ϼ���");
				}else {
					//for���� ���� ��ǲ���� �л�����ŭ ������ �Է�
					for (int i = 0; i < studentNum; i++) {
						//��ü ������ ��ǲ���� ���� Student ��ü�� score ������ �Ҵ�.
						Student student = new Student(); // �⺻ �����ڸ� ����ؼ�, ����score�ʵ� ���� �Ҵ�
						System.out.print((i + 1) + "��° �л� ������ �Է��ϼ���.");
						student.score = scanner.nextInt(); //�л� ������ �Է¹޾Ƽ� �ʵ忡 ���� �Ҵ�
						arr.add(student); //score�� �� �Ҵ� �� ArrayList�� �ȿ� ����
						System.out.println("�Է¿Ϸ�"); //�Է¿Ϸ��� ����ϰ� ����
					}
				}
            	
            } else if(selectNo == 3) {
            	// �ڵ� �ۼ�, ���� ����Ʈ ���, ArrayList�� �� ������ �Ҵ�� ��ü�� ����
            	// 1. ��ü ������ �ʵ��� �� ���� ��� 2. getter���ؼ� ���
            	if (studentNum == 0) {
					System.out.println("�л����� ���� �Է��ϼ���");
				}else {
					for (int i = 0; i < studentNum; i++) { 	//ArrayList��ü�� �����ͼ� Student.score�ʵ��� ���� ���
						Student student = arr.get(i); //ArrayList�� get()��� -> �� ���� Student rorcp4
						System.out.println(student.score); // �ʵ��� ���� ��ü�� ���� ���
						//System.out.println(student.getScore()); //�ʵ��� ���� getter�� ���
						
					}
				}
            } else if(selectNo == 4) {
            	
            		if (studentNum == 0) {
						System.out.println("�л����� ���� �Է��ϼ���");
					} else {
						int maxScore = 0 ; // �ִ� ���� ���� ���� ���� <�ʱⰪ �Ҵ�>
						int sum = 0; // ���踦 �����ϴ� �������� <�ʱⰪ �Ҵ�>
						// 1. ArrayList�� ��ü�� ������ �´�. 2. Student��ü�� score�ʵ��� ���� �����ͼ� ó��
						for (int i = 0; i < studentNum; i++) {
							Student student = arr.get(i);
							//�ִ� ���� ������ �Ҵ�
							maxScore = (student.score > maxScore) ? student.score : maxScore;//3�� �����ڸ� ����ؼ� �ִ밪�� �����̤��� �Ҵ�
							sum += student.score; //sum = sum +student.score
						}
						//maxScore,  sum : ��� sCore���� ���� ���� ������ ��Ƽ� 
						System.out.println("�ְ����� : " + maxScore);
						System.out.println("������� : " + (float) sum / studentNum);
						
					}
					
         
            } else if(selectNo == 5) {
            	//�ڵ��ۼ�
            	break;
            	// run = false;
              }
        }
     scanner.close();
        System.out.println ("���α׷� ����");
	}
}
