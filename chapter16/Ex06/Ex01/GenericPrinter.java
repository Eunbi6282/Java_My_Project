package chapter16.Ex06.Ex01;

// ���ʸ� Ŭ���� : �پ��� Ÿ���� ����� �� �ִ� Ŭ����
public class GenericPrinter<T extends Material> { // �پ��� ���� �������ϴ� ������(�Ŀ��, �ö�ƽ, ��)
							// T�� Ÿ�� ���� -> Material ������ ���� Ŭ������ Ÿ������ ���� �� �ִ�. 
	
	private T material;	// material : �������� , ��ü , �ν��Ͻ�, 

	public T getMaterial() {	// ��ü�� ����
		return material;
	}

	public void setMaterial(T material) {	// ��ü�� Ȱ��ȭ
		this.material = material;
	}
	public String toString() {
		return material.toString(); 	//�ش� ��ü�� toString()�޼��� ȣ��
	}
	
	public void printing() {
		material.doPrinting();	//Material�ȿ� �ִ� doPrinting
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
