package chapter16.Ex08;

//���ø� Ŭ����
public class EX_Generic <T extends Fruit>{	
	// getter, setter�� ������ Ŭ����
	//DTO(Data Transfer OBject) -getter
	// VO(Value Object) - getter
	// �����͸� �޾Ƽ� �����ϴ� �߰��� ����, ĸ��ȭ ���� ����ȭ
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
