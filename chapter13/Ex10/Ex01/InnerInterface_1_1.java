package chapter13.Ex10.Ex01;

class A{
	
	A(){}  // �⺻ ������
	A(B b) {		//BŸ���� ���� 
		this.b = b;
	}
	B b;		//B : �������̽� Ÿ��, b :�������� <���� �Ҵ��ϴ� ���>
					//b : �ʱⰪ(null)
						// 1. ��ü ���� �� ���� �Ҵ�
						// 2. �����ڸ� ���ؼ� ���� �Ҵ�
						// 3. setter�� ���ؼ� ���� �Ҵ�
	
	//setter ���ؼ� ���� �Ҵ�
	public void setB (B b) {
		this. b = b;	}
	
	interface B{
		void play();
		void stop();
	}
	
	void abc() {		//play()������,stop()������
		b.play();
		b.stop();
	}
}

public class InnerInterface_1_1 {
	public static void main(String[] args) {
		A a = new A();
		

		//setter ���ؼ� ���� �Ҵ�
		a.setB(new A.B() {
			@Override
			public void stop() {
				System.out.println("�����մϴ�.");
			}
			
			@Override
			public void play() {
				System.out.println("�����մϴ�.");
			}
		});
		a.abc();
		System.out.println("==============");
		// 1. ��ü ������ �ʵ��� ���� �Ҵ�
		A a1 = new A();
		a1.b = (A.B) new A.B() {		//�������̽� A��ü ���� B�������̽�(A.B)
			public void play() {
				System.out.println("play");
			};
			public void stop() {
				System.out.println("stop");
			};
		}; 
		a1.abc();
		
		System.out.println("====================");
		// 2. �����ڸ� �̿��ؼ� ���� �Ҵ�
		A a2 = new A(				//������ ���ο� A.BŸ���� ��ü ���� �� ����
				new A.B() {			//A������ ���ο� 

					@Override
					public void play() {
						System.out.println("����");
					}

					@Override
					public void stop() {
						System.out.println("����");
					}
					}
				);
		a2.abc();
		
		// 3. 
		
		
	}
}
