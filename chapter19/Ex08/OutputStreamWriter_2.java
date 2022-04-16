package chapter19.Ex08;

import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
  Reader / Writer : �߻� Ŭ����, char�� ó��, ����(0), �̹���(O), MP#(X).../ ���ڸ� Ưȭ�ؼ� ó��
  
  FileReader / FileWriter : �ϼ��� Ŭ���� , Default Charset�� ���. 
  InputStreamReader , OutputStreamWriter : encoding Ÿ�� ���� ����
  
  ���� : System.in : �ֿܼ��� �Է�, System.out : �ֿܼ� ���  <== Application���� �ѹ� close()�Ǹ� ���� �ȵ�
  	// System.in, System.out ����Ʈ �б�, ����Ʈ ����
  
 */


public class OutputStreamWriter_2 {
	public static void main(String[] args) {
		
		// 1. �ܼ� ���(Application Default : MS949)
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "MS949");
			osw.write("OutputStreamWriter1 ���� �����Դϴ�.\n" .toCharArray());  //String�� char�迭�ȿ� ���� //�迭
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�.");  // String
			osw.write('\n');  // char����
			osw.write("Good Bye!!! \n\n");  //.flush() ���ϰ� .write�� �ϸ� �׳� ����(�⸮)�� �������� ��
			osw.flush();  // ���ۿ� ����� ���� �ֿܼ� ���.
			System.out.println(osw.getEncoding());
		} catch (Exception e) {}
		
		// 2. �ܼ���� (Application Default : MS949 => UTF-8)
		
		
		
		
	}

}
