package chapter06_07.Ex02;

public class Test_Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {		//RAM�� ���� �ο��� �� setter
		this.company = company;						// this : �ڽ��� ��ü
													// �޼ҵ忡 ��ǲ�Ǵ� ������ = ��ǲ�� ������ �޴� ������ =  �޸𸮿� �ε��� ���� -> this.�޸𸮿� �ε��� ����
 	}
	public String getModel() {
		return model;
	}
	public void setModel(String mo) {	//��ǲ, ��ǲ�� �޴� ���� , �޸𸮿� �ε��� ������ �̸��� ���� �ٸ��� -> this. ��������
		model = mo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}