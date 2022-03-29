package chapter14.Ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource_1 {

	public static void main(String[] args){
		// 1. ���� ���ҽ� ���� (���� ���α׷� ���) --> �ڵ尡 ��� ��������
		System.out.println("���ڸ� �Է��ϼ���!");
		
		InputStreamReader isr2 = null; //����� �ݵ�� �޸𸮿��� ��ü�� ��������� ��
		
		//system.in : �ֿܼ��� �Է��� �޵��� ó�� . 1���� ��ǲ���� �� ����. 
		
		
		try {
			isr2 = new InputStreamReader(System.in);
			//system.in -> �ܼ����ؼ� ��ǲ�ްڴ�.
			
			char input = (char)isr2.read();  //�Ϲݿ���(Checked ����
			System.out.println("�Է±��� = " + input);
			
		} catch (IOException e) {
			e.printStackTrace();//try()������� ���ܰ� �߻��� ��� �ڼ��� ������ ���
		} finally {	//��ü ����Ŀ� �޸� �������� ����
			//���ҽ� ���� :isr2.close() -> ����ó�����־�� ��
			if (isr2 != null) {
				try {
					isr2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 		//�Ϲ� ���� : IOException
			}
			
		}
		System.out.println("=====���� isr2�� �ѹ� ��ǲ�� �ް� close()�Ǿ��� ������ isr1�� ������ �߻�. ");
		
		
		
		// 2. �ڵ� ���ҽ� ���� (Java 1.7 �ڵ����� ���ҽ��� ������ �� ����) --> �ڵ尡 �����ϴ�.(�ʿ����� ����)
		
		/*  try(�ڵ����� ���ҽ��� ������ ��ü ����){} catch{} finally{}
		 --�Ʒ��� �ΰ��� ������ ������ �� �ڵ� ���ҽ� ����--
		 1. ����ϴ� ��ü�� AutoCloseable�������̽��� ������ ��ü���� �Ѵ�. 		 2. �ݵ�� ��ü�� close()�� �����ؾ��Ѵ�.
		*/
		
		//InputStreamReader�� AutoCloseable �������̽��� �����ϰ� �ִ�.close�޼��嵵 ������ �ִ�.
		//Try With Resource : try (with resource : ��ü �޸� �ε�) {}
		
		try(InputStreamReader isr1 = new InputStreamReader(System.in);){
			char input = (char)isr1.read();
			System.out.println("�Է±��� = " + input);
		}catch (IOException e) {
			e.printStackTrace();
		} //finally����� close()�� ������ϴ��� ��ü�� �ڵ����� ������


	}
}