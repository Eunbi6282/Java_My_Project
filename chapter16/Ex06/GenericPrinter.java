package chapter16.Ex06;

// ���ʸ� Ŭ���� : �پ��� Ÿ���� ����� �� �ִ� Ŭ����
public class GenericPrinter<T> { // �پ��� ���� �������ϴ� ������(�Ŀ��, �ö�ƽ, ��)
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
		//return (material.doprinting;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
