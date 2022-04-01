package chapter16.Ex04;

// 제너릭 클래스 : 매개변수(Arguments 2개)
class KeyVaule<K,V>{
	private K key;
	private V value;
	
	//getter setter 생성
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}

public class TwoGenericAruguments {
	public static void main(String[] args) {
		
		// 1
		KeyVaule<String, Integer> kv1 = new KeyVaule<String, Integer>();
		// KeyVaule<String, Integer> kv1 = new KeyVaule();  ==> 생성자에서는 생략가능
		kv1.setKey("사과");
		kv1.setValue(2000);
		System.out.print(kv1.getKey() + " ");
		System.out.println(kv1.getValue());
		
		System.out.println("============================");
		
		// 2 
		KeyVaule<Integer,String> kv2 = new KeyVaule();
		kv2.setKey(404);
		kv2.setValue("Not Found(요청한 페이지를 찾을 수 없습니다.)");
		System.out.print(kv2.getKey() + " ");
		System.out.println(kv2.getValue());
		
		System.out.println("==============================");
		
		//3 
		KeyVaule<String, Double> kv3 = new KeyVaule();
		kv3.setKey("평균값");
		kv3.setValue(95.58);
		System.out.print(kv3.getKey() + " ");
		System.out.println(kv3.getValue());
		
		// 특정 타입을 사용하지 않을 경우 void 키를 사용합니다.
		KeyVaule<String,Void> kv4 = new KeyVaule();	// (대문자)Void -> 메서드에서 리턴이 없을 때 사용
		kv4.setKey("키값만 사용");
		// kv4.getValue(1111); 오류 -> Void로 처리하여 사용불가
		System.out.println(kv4.getKey()); 	//key 값만 가져올 수 있음~!~!
		
		
		

	}
}
