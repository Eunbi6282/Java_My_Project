package Ex;
class Student{
		//�ڹٴ� ���� ����� �Ұ�, �ڹ��� ��� Ŭ������ Object Ŭ������ �ڽ�Ŭ����
	
	String namString;		//�л��̸�
	int studentID;			//�й�
	int eng;				//��������
	int kor;				//��������
	int math;				//��������
	int sum;				//�����հ�
	double avg;				//���
	
	void hobby() {
		System.out.println("�� �л��� ��̴� �Դϴ�.");
	}

	@Override									//ALT+CTRL+S => OVERRIDINGMETHOD/ TOSTRING
	public String toString() {		//ObjectŬ������ �޼ҵ�, ��ü ��ü�� ����� �� [��Ű����.Ŭ������@�ؽ��ڵ�]
		return "�̸� : " + namString + " , �й� : " + studentID + " , ���� : " + kor + " , ���� : " + eng + " , ���� : " + math
				+ " , �հ� : " + sum + " , ��� : " + avg;
	} 
}

class S_ö�� extends Student{
	
	S_ö�� (){}
	
	S_ö��(String a, int b, int c, int d, int e){
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
		System.out.println("ö���� ��̴� �����Դϴ�.");
	}
	
}

class S_���� extends Student{
	
	S_����(){}
	
	S_����(String a, int b, int c, int d, int e){
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
		System.out.println("������ ��̴� �ǾƳ��Դϴ�.");
	}
	
}

class S_���� extends Student{
	
	S_����(){}
	S_����(String a, int b, int c, int d, int e){
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
		System.out.println("������ ��̴� ���̽��Դϴ�.");
	}
}
public class Quiz3 {

	public static void main(String[] args) {
		Student student = new Student();
			//String�� ���
		
		S_���� s_���� = new S_����("�迵��", 11, 22, 33, 44);
		S_ö�� s_ö�� = new S_ö��("��ö��", 22, 33, 44, 55);
		S_���� s_���� = new S_����("�迵��", 33, 44, 55, 66);
		
		S_ö�� s_ö��2 = new S_ö��();
		S_���� s_����2 = new S_����();
		S_���� s_����2 = new S_����();
		
		Student[] students = {s_����,s_����,s_ö��};
		Student[] students2 = {s_����2,s_����2,s_ö��2};
		
		System.out.println("=======================================");
		//�迭�� ��ü �ֱ�
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
			students2[i].hobby();
			
		}
		
		
	}
}
