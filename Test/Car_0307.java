package Test;

class Car{
	String companysString;		//�ʵ�(�ν��Ͻ��ʵ�)�� company�� �˷��ִ�  this, heap�޸𸮿� ����
	String modelString;				//�ν��Ͻ� : ��üȭ�� ���� �� ��� ������ �ʵ�.
	String colorString;			// [�ʵ�� : �ʵ��� ��]�� heap �����ȿ� �� 
	double maxSpeed;
	
	Car (String companysString, String modelString, String colorString, double max) {
		this.companysString = companysString;		
		this.modelString = modelString;
		this.colorString = colorString;
		maxSpeed = max; 	//this Ű���尡 ������ ����
	}
	
	void work() {			//�޼ҵ�(�ν��Ͻ� �޼ҵ�) : heap������ �޼ҵ��� �����͸� ����
		System.out.println("ȸ��� : " + companysString + " ���� : " + modelString + " ���� : " + colorString + " �ִ� �ӷ��� : " + maxSpeed);
		//�޼ҵ��� ���� ���� -> class ������  �޼ҵ� ������ ����
	}
}

public class Car_0307 {
	public static void main(String[] args) {
		//�����ڸ� ���ؼ� �⺻���� �Ҵ� �� �޸��� ������ work()�޼ҵ带 ����ؼ� ���
		
		//��ü ����
		Car car = new Car("����", "�׷���", "�Ͼ�", 250);
		//���
		car.work();
	}
}
