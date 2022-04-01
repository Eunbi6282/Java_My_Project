package chapter16.Ex04;

// ���ʸ� Ŭ���� : �Ű�����(Arguments 2��)
class KeyVaule<K,V>{
	private K key;
	private V value;
	
	//getter setter ����
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
		// KeyVaule<String, Integer> kv1 = new KeyVaule();  ==> �����ڿ����� ��������
		kv1.setKey("���");
		kv1.setValue(2000);
		System.out.print(kv1.getKey() + " ");
		System.out.println(kv1.getValue());
		
		System.out.println("============================");
		
		// 2 
		KeyVaule<Integer,String> kv2 = new KeyVaule();
		kv2.setKey(404);
		kv2.setValue("Not Found(��û�� �������� ã�� �� �����ϴ�.)");
		System.out.print(kv2.getKey() + " ");
		System.out.println(kv2.getValue());
		
		System.out.println("==============================");
		
		//3 
		KeyVaule<String, Double> kv3 = new KeyVaule();
		kv3.setKey("��հ�");
		kv3.setValue(95.58);
		System.out.print(kv3.getKey() + " ");
		System.out.println(kv3.getValue());
		
		// Ư�� Ÿ���� ������� ���� ��� void Ű�� ����մϴ�.
		KeyVaule<String,Void> kv4 = new KeyVaule();	// (�빮��)Void -> �޼��忡�� ������ ���� �� ���
		kv4.setKey("Ű���� ���");
		// kv4.getValue(1111); ���� -> Void�� ó���Ͽ� ���Ұ�
		System.out.println(kv4.getKey()); 	//key ���� ������ �� ����~!~!
		
		
		

	}
}
