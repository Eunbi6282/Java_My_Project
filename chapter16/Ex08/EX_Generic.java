package chapter16.Ex08;

//제ㅓ릭 클래스
public class EX_Generic <T extends Fruit>{	
	// getter, setter만 구현된 클래스
	//DTO(Data Transfer OBject) -getter
	// VO(Value Object) - getter
	// 데이터를 받아서 전송하는 중간자 역할, 캡술화 통해 보안화
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
