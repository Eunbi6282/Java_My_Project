package chapter11.Ex01;
/* Final : ������
 		- �ʵ��, ���������� �տ� final: ����� �ٲ� / final double PI = 3.14; (������x)
 				: ����� ���� ������ �� ����. 
 				: Ŭ���� �������� ��� ������ ���� ����. ��ü�� �޼ҵ尡 ����� ��쿡�� ȣ���� ����
 		- �޼ҵ�� �� : �������̵� �� �� ���� �޼ҵ� (�ڽ�Ŭ�������� �޼ҵ� �������̵� �Ұ�) 
 				/ final void print(){} 
 		
 		- Ŭ������ �� : ����� �Ұ���  / final class A{} (�ڽ��� ������ ����)
  
 */

class A1 {
	int a = 3;			//�ʵ��, ������������ �ҹ���, ���� ���ڰ� �̾��� ��� ù�ڸ� �빮��
	final int B = 5;	//final�� ����� ������ �빮�ڷ�, ������� �빮��
	A1(){}
	
}
class A2{
	int a = 3;			//�ʵ��, ������������ �ҹ���, ���� ���ڰ� �̾��� ��� ù�ڸ� �빮��
	final int B;	//final�� ����� ������ �빮�ڷ�, ������� �빮��
	A2(){
		a = 3;
		B = 5;
	}
}
class A3{
	int a= 3;
	final int B = 5;
	A3(){
		a = 5;
		// B= 10;	//final�� ���� ������ �� ����. 
	}
}
class B{
	void bcd(){		//��������(�޼��� �ȿ� �ִ� ����) -> stack�� ����
						//���������� ���� �޼ҵ� ȣ���� ������ �����
		int a = 3;
		final int B = 5;    //final�� �پ� ����� �� B -> ����� ��� ������ �����, �޼ҵ尡 �������� ��������� ��������
		a = 7;
		// b = 9;	//final�� ���� ������ �� ����. 
	}
}
public class FinalModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}