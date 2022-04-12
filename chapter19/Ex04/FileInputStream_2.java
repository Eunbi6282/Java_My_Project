package chapter19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {

	public static void main(String[] args) throws IOException {
		// 1. �Է����� ���� ,��� ����
		File inFile = new File("src\\chapter19\\Ex04\\FileinputStream1.txt");
		InputStream is1 = null;  //��ü ����
		
		// 2. (1) byte���� �б� (�ѹ���Ʈ�� �о ó��)
		try {
			is1= new FileInputStream(inFile); // ��ü ����, ������ ���� ���� ->finally������� close�ϱ� ���ؼ� 
			int data;
			while ( (data=is1.read()) != -1) {  // ������ �����Ƿ� read()�޼��常 ���, �ѱ��� ��� read(byte�迭)
				System.out.print((char)data);
				
			}
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		}finally {
			if (is1 != null) {
				try { //null �ε� close�ϸ� IOException�߻�
					is1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println();
		System.out.println("=========try(weith resorce){}�� �����ϱ�==================");
		
		try (InputStream is2 = new FileInputStream(inFile)){
				//try(with rescource : ��ü �Ļ�) <==FileInpurSrtreame �� closable�������̽��� ����
			int data;
			while ( (data=is2.read()) != -1) {  // ������ �����Ƿ� read()�޼��常 ���, �ѱ��� ��� read(byte�迭)
				System.out.print((char)data);
				
			}
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		}
		
		// 3. (2) n-byte������ �б� (byte[]�� ó�� ��ġ�������� ���� ������ ����) : ���� ����Ʈ�� �迭�� ��� ���ÿ� �о ó�� �ӵ��� ����
				// �迭�� ���� ũ�⸸ŭ �о� �鿩�� byte�迭�� ����
				// �ѱ�ó�� ����
			
			System.out.println();
			System.out.println();
			System.out.println("==================================");
		
			InputStream is12= new FileInputStream(inFile);  //throws�� ó��
			byte[] byteArray1 = new byte[9]; //�迭�� 9��, 0~8���� //9byte���д´�. 
			int count1;
		
			while ( (count1=is12.read(byteArray1)) != -1) {   // �Ű������� �迭 ��
						//is2.read() : 1byte�� �д´�.  //�ѱ�ó�� ���Ѵ�. 
						//is2.read(byteArray1) : 9byte�� �д´�.  byteArray1�� ����
						//count1 : 9 , 9, 2 
				//count1 : �迭����
				for (int i = 0; i < count1; i++) {
					System.out.print((char)byteArray1[i]);
				}
				System.out.println(" : count1 = " + count1);
				
				/*
				System.out.println();
				System.out.println("=================");
				String str = new String(byteArray1,Charset.forName("MS949"));
				System.out.println(str);
				*/
			}
			is12.close();
			
			System.out.println(" -======�ѱ�ó��=======");
			
			// 2_1 (3) n-byte ������ �о �ѱ�ó�� �迭������ �о �ѱ�ó��
			InputStream is3 = new FileInputStream(inFile);
			byte[] byteArray2 = new byte[100];
			
			int count2;
			
			while ( (count2 = is3.read(byteArray2)) != -1) { // ���ڼ� 100���� �о����
				System.out.println(new String(byteArray2,0,count2,Charset.forName("MS949")));
			}
			is3.close();
		
		// 4. 3 . n-byte ������ �о ����. offset, length���.
			InputStream is4 = new FileInputStream(inFile);
			byte[] byteArray4 = new byte[9];
			int offset = 3;
			int length = 6;
			int count4 = is4.read(byteArray4,offset,length);	//length��ŭ �տ��� �о�ͼ� byteArray4�� offset��ġ�� �����ض�
				// 6�ڸ� �о�ͼ� index 3���濡 �迭�� ����
			
			for (int i = 0; i < offset + count4; i++) {
				System.out.print((char) byteArray4[i]);
			}
			
			is4.close();
			
			
			
		
		
		
	}

}
