package chapter19.Ex03;

import java.nio.charset.Charset;

public class CreateCharSetObject {

	public static void main(String[] args) {
		// ���� encoding������ �����ϴ� ���1
		// 1. Charset.defaultCharset() -> �ý����� �⺻������ �ε� (encoding type)
			//CharsetŬ������ defaultCharset()�޼���
		
		Charset cs1 = Charset.defaultCharset(); // ��ü �������� �޼��� �Ҷ�� -> �����޼���, �ý����� �⺻ ������ chrarset�� �ε�
		System.out.println(cs1); //MS949 (Ȯ��)--> x-windows-949
								// UTF-8
		
		// 2. Charset.forName("encoding Type") -> encodingŸ���� ���� �Ҵ��ؼ� ���
		Charset cs2 = Charset.forName("MS949");
		System.out.println(cs2);
		Charset cs3 = Charset.forName("UTF-8");
		System.out.println(cs3);
		//Charset cs4 = Charset.forName("EUC-KRr"); 
			//�������� �ʴ� encodingŸ���� ������ UnsupportedCharsetException���� �߻�
		
		System.out.println();
		
		System.out.println(Charset.isSupported("MS949")); // ���� �Ǹ� true, �ƴϸ� false
		System.out.println(Charset.isSupported("UTF-8"));
		System.out.println(Charset.isSupported("EUC-KR"));
		
		
	}

}
