package cooperation;

import java.util.ArrayList;

//��ü���� ���� 
/*				�л��� �뵷 : 100,000
 		�л� 		: 			������ Ż��(-1000��)	����ö�� Ż�� (-1,500)
 		����		: 1,000��	�°��� ����, ���� ����	
 		����ö 	: 1,500�� 						�°��� ����, ���� ����
 
 */

class Student {
	String studentName ; 	//�л���
	int money; 				//�л��� ������, �ʱⰪ : 100,000
	
	public void takeBus (Bus bus) {		//�л��� ������ ������? ������ ���� ���� �ؾ� �Ѵ�. 
		bus.take(1000);
	}
	public void takeOutBus (Bus bus) {	//�������� ����. 
		bus.takeOut(); 
	}
	public void takeSubway(Subway subway) {		//����ö�� Ż��
		subway.take(1500); 
	}
	public void takeOutSubway(Subway subway) {	//����ö�� ������ 
		subway.takeOut();
	}
	
}
class Bus{
	 int busName; 	// 100�� ����, 200����		<== ��ǲ���� �޾Ƽ� , ������. 
	 int passengerCount; 	// �°��� 
	 int money;				// ������ ���� 
	 
	 public void take(int money) { 		//������ ������ ó��, �°����� ó�� 
		 
	 }
	 public void takeOut() {	//�°����� ���� 
		 
	 }
	 
	
}
class Subway{
	String lineNumber;     //"1ȣ��", 2ȣ��, 3ȣ��
	int passengerCount; 	//�°��� 
	int money; 				//���� 
	
	//�����ڸ� ���ؼ� ����ö ȣ���� ��ǲ �޾Ƽ� Ȱ��ȭ. 
	
	public void take(int money) {    //������ ó���ϴ� �޼ҵ�, �°��� 
		
	}
	public void takeOut() {		//����ö���� �°�����
			
	}
	
}


public class CooperationBetweenObject {
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>(); 
		
		/*
		�л� 5�� �Է� : �л��� 100,000���� �ʱⰪ �Ҵ�. 
		=============================================
		1. �л���ü ����  | 2. �л����� ��� �� ����  
		3. ������ Ž |  4.  ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����.   7. ����  
		=============================================
		����>> 1
		�л��̸�  : 
		�� �Է�   : 

		����>> 2 
		=====�л����� ���=====
		�л��̸�	������



		�л�����(�̸��Է�)>> 


		����>> 3
		000 �� 000 �� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
		000 ���� �������� 000 �Դϴ�. 
		���� 000���� �°��� 000���̰� ������000 �Դϴ�. 

		����>> 4
		000 �� 000 �� ������ ���Ƚ��ϴ�. �¹���~~~. 
		000 ���� �������� 000 �Դϴ�. 
		���� 00���� �°��� 000���̰� ������ 000 �Դϴ�. 

		����>> 5
		000 �� 000 ȣ�� ����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
		000 ���� �������� 000 �Դϴ�. 
		����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 

		����>> 6
		000 �� 000 ȣ�� ����ö�� ���Ƚ��ϴ�. �ȳ� ~~~
		000 ���� �������� 000 �Դϴ�. 
		����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 
		*/ 


		

	}

}