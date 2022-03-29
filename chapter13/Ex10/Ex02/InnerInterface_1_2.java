package chapter13.Ex10.Ex02;
class Abc {		
	// 1. ��ü ���� �� �ʵ忡 ���� ���� �Ҵ�(d1), 
	// 2. �����ڸ� ���ؼ� ���Ҵ�(d2) 
	// 3. setter�� ���ؼ� �� �Ҵ�
	Def d; 				//�ʵ� ��� ���� ����
	
	//�⺻������
	Abc(){}
	
	//�����ڷ� ���Ҵ�
	Abc(Def d){
		this.d = d;
	}
	
	
	
	//setter�� ���Ҵ�
	public void setDef(Def d) {
		this.d = d;
	}
	
	interface Def{
		void run();
		void fly();
	}
	
	void ghi() {
		d.run();
		d.fly();
	}
}
public class InnerInterface_1_2 {
	public static void main(String[] args) {
		// 1. ��ü ���� �� �ʵ忡 ���� ���� �Ҵ�(d1)
		Abc d1 = new Abc();
		d1.d = (Abc.Def) new Abc.Def() {		//Abc.DefŸ������
			
			@Override
			public void run() {
				System.out.println("���� �޷���");
			}
			
			@Override
			public void fly() {
				System.out.println("���� ���ư�");
			}
		};
		d1.ghi();
		// 2. �����ڸ� ���ؼ� ���Ҵ�(d2) 
		Abc d2 = new Abc(new Abc.Def() {		//DefŸ�� �Ҵ�
			
			@Override
			public void run() {
				System.out.println("���� �޷���");
			}
			
			@Override
			public void fly() {
				System.out.println("���� ���ư�");
			}
		}); 
		d2.ghi();
		// 3. setter�� ���ؼ� �� �Ҵ�
		d1.setDef(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("���� �޷���");
			}
			
			@Override
			public void fly() {
				System.out.println("���� ���ư�");
			}
		});
		d1.ghi();
		

	}

}
