package chapter14.Ex06;

	//�Ϲݿ���(Checked Exception) : ������ �ܰ迡�� ����
		//1.���� ó���ϴ� ���
		// 2. thorws �̷�� ���

	//main �޼��忡 throws�� ������Ű�� ���,Exception�� �߻��� ��� : ������ ���(�����޼���)���ְ� ����. exceptionó���� x

public class ThrowsException_2 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//���������� ���� ���� -> ClassNotFoundException�߻���������
		Class cls = Class.forName("java.lang.Object");
		
		//������ �������� ���� -> ClassNotFoundException�߻�
		Class cls2 = Class.forName("java.lang.Object000");

	}

}
