package chapter14.Ex05;
//�ڵ� ���ҽ�(��ü) ����
	// 1. AutoCloseable �������̽� ����
	// 2. close()������
// �ʵ��� �� �Ҵ� -> ������ ȣ��� �� �Ҵ�
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
		
//		System.out.println("�̸� : " + name + " �й� : " + studentId + " ���� ���� : " + kor + " ���� ���� : " + eng  + " ���� ���� : " + math + " ��� : " + avg);
	}

	@Override
	public void close() throws Exception {
		System.out.println("�̸� : " + name + " �й� : " + studentId + " ���� ���� : " + kor + " ���� ���� : " + eng  + " ���� ���� : " + math + " ��� : " + avg);
		if (name != null || studentId != 0 || kor != 0 || eng != 0 || math != 0 || avg != 0.0) {
			name = null;
			studentId = 0;
			kor = 0;
			eng = 0;
			math = 0;
			avg = 0.0;
			System.out.println("�̸� : " + name + " �й� : " + studentId + " ���� ���� : " + kor + " ���� ���� : " + eng  + " ���� ���� : " + math + " ��� : " + avg);	
		}
			System.out.println("���ҽ��� �����Ǿ����ϴ�.");
			//�ʱ�ȭ Ȯ��
			System.out.println(avg);
			System.out.println(name);
		}
	}

public class Ex_TryWithResource3 {

	public static void main(String[] args) {
		//1. ��ü�� ��� �ʵ带 �ʱ�ȭ �ϰ� �ڵ����� close()ȣ��
		try (Abc a1 = new Abc("������", 20170033, 88, 88, 99)){
			
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}
		System.out.println("======================");
		
		
		//2. �������� close();-> finally������� close()ȣ��
		Abc a2 = null;
		
		try {
			a2 = new Abc("������", 20170033, 77, 44, 55);
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
