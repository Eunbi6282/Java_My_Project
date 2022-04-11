package chapter19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream1_1 {

	public static void main(String[] args) {
		
		File inFile = new File("src\\chapter19\\files\\FiileInputStream");
		
		//����ó�� : ���� ó��
		InputStream iStream1 = null ;  // �������� �ʱ�ȭ �ʿ�
		
		try {
			iStream1 = new FileInputStream(inFile);
		} catch (FileNotFoundException e) { 
			//"src\\chapter19\\files\\FiileInputStream" �� ��ο� ������ ���� �� ����� ���� ó��
			System.out.println("������ �������� �ʽ��ϴ�. ");
		}
		
		int data = 0;		// �������� �ʱ�ȭ �ʿ�
		// iStream ��ü�� try catch ���ȿ� ������ �ν� ���ϴϱ� �̸��� ������ ���� �صα�
		try {
			while((data = iStream1.read()) != -1) {   // IOException �߻�(input,output�� ���� Exception)
				System.out.println((char)data); 
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���ϴ� ���ܰ� �߻��Ǿ����ϴ�.");
		}
		
		// �ݾ��ֱ�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		try {
			if (iStream1 != null) {
				iStream1.close();
			}
		} catch (IOException e) {
		}
		
		System.out.println("====================================");
		
		//����ó�� : 2���� ���ܿ� ���ؼ� �Ѳ����� ó��
		InputStream iStream2 = null ;
		int data2 = 0;
		
		
		try {
			iStream2 = new FileInputStream(inFile);
			
			while((data = iStream2.read()) != -1) {   // IOException �߻�(input,output�� ���� Exception)
				System.out.println((char)data); 
			}
		} catch (IOException e) { //IOException�� FileNotFoundException ���� ���� EXception �̹Ƿ� ���������� ó��
			System.out.println("���ܰ� �߻��߽��ϴ� ");
		} finally {
			try {
				iStream2.close();
			} catch (IOException e) {
				System.out.println("���ܰ� �߻��߽��ϴ� ");
			}
		}
		

	}

}
