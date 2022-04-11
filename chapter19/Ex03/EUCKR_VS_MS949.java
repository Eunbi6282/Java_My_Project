package chapter19.Ex03;

import java.io.UnsupportedEncodingException;

//EUC-KR  �ѱ� ǥ��, �ѱ�ǥ�� ���� ��ü�� ǥ�� ������ �͸� �����Ǿ� ����. �� 11,000�� --> 2200�� ������ ǥ�� ����, 8000�ڴ� ǥ�� �ȵ�
	// ���� : 1byte  <=== ����� UTF-8�� ó���ȴ�. 
	// �ѱ� : 2byte
	// ���������� ����� �� �ѱ��� ������ �ʵ��� ó���ϱ� ���ؼ� ���. �ٵ� ���� UTF-8 ���� ���

// MS-949(ANSI) - MicroSoft �翡�� ������ �ѱ� ǥ����. 11,000 ��� ǥ�� ����. Windows os�� �⺻ encoding Ÿ���� MS-949/ 
	// ���� : 1byte
	// �ѱ� : 2byte

//UTF-8 - ��� ����(��, FTP, Mail,DB ...)�� �⺻ Ÿ��, git, Mac, Linux�� �⺻ encoding
	// ���� : 1byte
	// �ѱ� : 3byte

//UTF-16 : <��������>
	//����, �ѱ� ��� 2byte�� ó��
	// BOM 2byte : ��� ������ �ĺ��ڵ�
	

// ���ڸ� �ش� encoding Ÿ������ ����Ʈ�� ��Ʈ������ �����ϴ� ���, �ش� encodingŸ������ ������ �ؾ� ������ �ʴ´�. 

// ��Ŭ�������� ���ڵ�Ÿ�� ���� 3����.
	// 1. �������� : 
	// 2. ������Ʈ���� ����
	// 3. ���Ͽ��� ����
	
	// �켱���� : ���� > ������Ʈ > ��������

public class EUCKR_VS_MS949 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//EUCKR vs MS949
		// 1. �����ڸ� byte�� �������� String���� ��ȯ // ������ �� encodingŸ�԰� ������ �� encodingŸ���� ���ƾ� ��
			//���ڸ� byte�� ��ȯ
			byte[] b1 = null;
			try {
				b1 = "a".getBytes("EUC-KR");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}  // ���ڸ� byte�� ��ȯ ==> ��Ʈ��ũ�� ���ڸ� byte��Ʈ������ ��ȯ�ؼ� ����
			//.getBytes() ���� ó�� �ʿ�( UnsupportedEncodingException ) -> ��Ÿ�� �߻��� ��� ���ڵ��� �� ���� ���ܰ� �߻���
			
			byte[] b2 = null;
			try {
				b2 = "a".getBytes("MS949");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			
			System.out.println(b1.length); // 1byte(������ 1byte�� ó��)
			System.out.println(b2.length); // 1byte
			
			// byte[]�� ���ڷ� ��ȯ
			try {
				System.out.println(new String(b1,"EUC-KR"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} //a
			
			try {
				System.out.println(new String(b2,"MS949"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} //a
			
			System.out.println();
		 
		// 2. �ѱ��� byte�� �������� String���� ��������  // ������ �� encodingŸ�԰� ������ �� encodingŸ���� ���ƾ� ��
			byte[]b3 = "��".getBytes("EUC-KR");  
			byte[]b4 = "��".getBytes("MS949");
			
			System.out.println(b3.length); // 2
			System.out.println(b4.length); //2
			
			//byte[] ==> ���ڿ��� �ٲ�
			System.out.println(new String(b3,"EUC-KR"));
			System.out.println(new String(b4,"EUC-KR")); //encodingŸ���� �ٸ��� ���ڰ� ���� �� ����
			
		// 3. EUC-KR�� ���� ��� ������ �͸� ǥ��, �� 2000��
			//MS949�� 11,000�� ��� ��� ����
			
			byte[]b5 = "�v".getBytes("EUC-KR");  //11,000�� �� 2000�� ǥ��, 8000(X)
			byte[]b6 = "�v".getBytes("MS949");	// 11,000�� ��� ó��
		
			System.out.println(b5.length); //1  ? 
			System.out.println(b6.length); //2
			
			//byte[] ==> ���ڿ��� �ٲ�
			System.out.println(new String(b5,"EUC-KR"));
			System.out.println(new String(b6,"MS949"));
		
		
		

	}

}
