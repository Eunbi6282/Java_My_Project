package Ex_T;

class Student{
	//�ڹٴ� ���� ����� �Ұ�, �ڹ��� ��� Ŭ������ Object Ŭ������ �ڽ�Ŭ����

	String nameString;		//�л��̸�
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
		return "�̸� : " + nameString + " , �й� : " + studentID + " , ���� : " + kor + " , ���� : " + eng + " , ���� : " + math
				+ " , �հ� : " + sum + " , ��� : " + avg;
	} 
}

class S_ö�� extends Student{



	S_ö��(String nameString, int studentID, int kor, int eng , int math){
		super.nameString = nameString;	//super : �θ�Ŭ����, this : �ڽ��� ��ü
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor + eng + math;
		super.avg = (double) sum/3;
	}
		
	
	@Override
	void hobby() {
		System.out.println("ö���� ��̴� �����Դϴ�.");
	}

}

class S_���� extends Student{

	S_����(){}
	
	S_����(String nameString, int studentID, int kor, int eng , int math){
		super.nameString = nameString;	//super : �θ�Ŭ����, this : �ڽ��� ��ü
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor + eng + math;
		super.avg = (double) sum/3;
	}
	@Override
	void hobby() {
		System.out.println("������ ��̴� ���̽��Դϴ�.");
	}

}

class S_���� extends Student{

S_����(){}
	S_���� (String nameString, int studentID, int kor, int eng , int math){
		super.nameString = nameString;	//super : �θ�Ŭ����, this : �ڽ��� ��ü
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor + eng + math;
		super.avg = (double)sum/3;	//(double)ó���� �ϴ���, sum/3.0 ������ �������·� �������
	}
	@Override
	void hobby() {
		System.out.println("������ ��̴� ���̽��Դϴ�.");
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		Student student = new Student();
		//String�� ���
		
		
	Student ���� = new S_����("������", 931219, 10, 100, 11);
	Student ���� = new S_����("�����", 980222, 100, 11, 100);
	Student ö�� = new S_ö��("��ö��", 22, 33, 44, 55);
	
	Student[] arr = {����, ����,ö��};
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


