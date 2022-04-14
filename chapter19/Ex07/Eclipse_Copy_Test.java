package chapter19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Eclipse_Copy_Test {

	public static void main(String[] args) {
		// �� ������ ����, Buffered�� ������� �ʰ� ó���ϴ� ���,  Buffered�� ����ϴ� ��� �ӵ� ����. 
				File orgFile1 = new File("C:\\Temp\\copy_test\\eclipse_origin.exe"); //��������
				File copyFile1 = new File("C:\\Temp\\copy_test\\eclipse_copy1.exe"); 	//Buffered�� ������� �ʰ� ó���ϴ� ��� 
				File copyFile2 = new File("C:\\Temp\\copy_test\\eclipse_copy2.exe"); 	//Buffered�� ����ؼ� ó��
				
				// ���� ������ �ϱ� ���� ���� ����
				long start, end , time1, time2;	//time1 : Buffered�� ������� �ʴ� ��� , time2 : Buffered�� ����ϴ� ���
				
				// 1. Buffered�� ������� �ʰ� ó���ϴ� ���(BuffredInputStream, BuffredOutputStream)
				start = System.nanoTime(); // ���۽ð�
				
				try (InputStream is = new FileInputStream(orgFile1); // Auto close()
					OutputStream os = new FileOutputStream(copyFile1)// Auto close()
					) {
					// ������ ���� �ڵ� ����
					int data;
					 while ((data = is.read()) != -1) { //InputStream���� �ѹ���Ʈ�� ���� ���� data�� ����. 
						os.write(data); // �� ���� OutputStream�� 1byte�� ���� , -1(������������)  => copyFile1���� ������
					} 
				} catch (IOException e) {}
					end = System.nanoTime();
					time1 = end - start;
					System.out.println("Without BufferedXXXStream : " + time1); // Buffered�� ������� �ʰ� ����. copy1.jpg
				
				
				// 2. Buffered�� ����ؼ� ó���ϴ� ���(BuffredInputStream, BuffredOutputStream)
				start = System.nanoTime();
				
				try (InputStream is = new FileInputStream(orgFile1);  //��� ��Ʈ��
					 BufferedInputStream bis = new BufferedInputStream(is)	;	//�߰� ����� �����ϴ� ��Ʈ��. ������ ������ ó��(Buffered ���)
					OutputStream os = new FileOutputStream(copyFile2);	// ��� ��Ʈ��
						BufferedOutputStream bos = new BufferedOutputStream(os); // �߰� ����� ����(����)
					)
				{	 // ������ �����ϱ� ���� 
					// InputStream�� �о�ͼ�  OutoutStream�� ����
					
				// ������ �ڵ� ����
					int data;
					while ((data = bis.read()) != -1) {  // ���۸� ����ؼ� �б�
						bos.write(data);		// ���۸� ����ؼ� ����
					}
				}  
					
				catch (IOException e){}
				
				end = System.nanoTime();
				time2 = end - start;
				System.out.println("With BufferedXXXStream : " + time2); // Buffered�� ����ؼ� ����. copy2.jpg
				
				// Buffered ����� ��� (time2), ������� ���� ��� (time1)
				System.out.println("�ӵ� ���� �� �� ? " + (time1 / time2) + "�� ����");
			

	}

}
