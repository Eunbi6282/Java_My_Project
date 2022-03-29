package Ex;
class Studentt {
	int studentId;
	String name;
	int kor;
	int eng;
	
	Studentt(int studentId, String name, int kor, int eng) {
		this.studentId = studentId;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public boolean equals(Object obj) {		//��ü�� �Ű������� ���� �� objectŸ������ �ڵ����� ��ĳ����
		if (this.studentId == ((Studentt)obj).studentId) {	//StudenttŸ������ �ٿ�ĳ���� �� 
				//�� ��ü�� studentId�� ���� ��.
			return true;
		}else {
			return false;		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentId + " , " + name + " , " + kor + " , " + eng;
	}
}
class E extends Object{
	String name;
	
	E(){}		//�⺻������ : Ŭ�������� �ٸ� �����ڰ� ������ �� �ܺο��� �⺻�����ڸ� ȣ���� �� �����Ǿ� ������ �ȵ�
	
	E (String name){
		this.name = name;	//�Ű������̸�, �����ο��� �Ű������� �޴� ������, �ʵ��� �������� ��� ����
												// this : �ڽ��� ��ü
	}

	@Override
	public String toString() {
		return "�̸� : " + name ;  		//this.nameString
	}
	
	@Override
	public boolean equals(Object obj) {				//e2.equals(a3);
	
		if (this.name == ((E)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}	
	
	
public class Quiz_04 {
	public static void main(String[] args) {
			Studentt student1 = new Studentt(20170033, "������", 90, 90);
			Studentt student2 = new Studentt(19950411, "�̵���", 80, 80);
			Studentt student3 = new Studentt(19970214, "������", 100, 100);
			Studentt student4 = new Studentt(20170033, "������", 80, 80);
			
			System.out.println(student1);
			System.out.println(student2);
			System.out.println(student3);
			System.out.println(student4);
			
			/*��ü�� StudentId �÷��� ���ؼ� ���� ��� ���� �л��̴� ��� ���
			StudentId�� ���� ��� '���� �л��̴�' ��� ���
				 == : �⺻Ÿ�� (boolean, byte, short, int, long, double, float, char)
				    : ���� ��
				    : ����Ÿ��(�迭 ,��ü,String[Ư����]�� ��� ��ü�� �ּҸ� ��
				    	String : toString() , equals �� ������ �Ǿ� �ִ�.
				  
				   Object�� toString() ,equals()�� �������ؼ� ���� ����. 
				   		toString() - ��ü ��ü�� println()�Ҷ�/ ��Ű���̸�.Ŭ�����̸�@�ؽ��ڵ�
				   			//�������̵��ؼ� �ʵ��� ������ ���
				   	    equals() : == �� ���� , ��ü�� �ּҸ� ��
				   	     	//�������ؼ� ��ü���� �ʵ尪�� ��
			 */
			
			System.out.println(student1.equals(student2));
			System.out.println(student1.equals(student3));
			System.out.println(student1.equals(student4));
			
			if (student1.equals(student2)==true) {
				System.out.println("�����л��̴�");
			}
			if (student1.equals(student3)==true) {
				System.out.println("�����л��̴�");
			}
			if (student1.equals(student4) == true) {
				System.out.println("�����л��̴�");
			}
			
			E e1 = new E();		//�⺻������ ȣ�� : heap�� �ʵ��� ���� ���� �ʱ�ȭ ��
			System.out.println(e1.name);	//�����ʱ�ȭ -> null
			
			E e2 = new E("�ȳ�");
			System.out.println(e2.name);
			
			E e3 = new E("�ȳ�");
			
			System.out.println("========================");
			System.out.println(e2 == e3);	//����Ÿ�� (==) : ��ü�� �ּҸ� ��
			System.out.println(e2);
			System.out.println(e3);
			System.out.println(e2.equals(e3)); //Object�� equals() : (==) ��ü�� �ּҸ� ��
	}
}