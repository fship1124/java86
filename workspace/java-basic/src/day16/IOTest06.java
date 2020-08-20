package day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest06 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;         // BufferedOutputStream �ӵ������� ����
		
		try {
		   fis = new FileInputStream("data/a.txt");
		   fos = new FileOutputStream("data/a2.txt");
		   // Buffered �ӵ�������
		   
		   // ���� �Ű��������� �⺻ (In/out)putStrea�� ������ �ȴ�.
		   bis = new BufferedInputStream(fis);            // fis�� ������� �ӵ������� �Ѵ�
		   bos = new BufferedOutputStream(fos);           // fos�� ������� �ӵ��� �����ϰڴ�.
		   
		   
		   
//		   byte[] buffer = new byte[]1024 * 16];             // �ٷ� �������� �ش������ �����ص� �ȴ�
		   
		   while (true) {
			   int ch = bis.read();
			   if (ch==-1) break;
			   bos.write(ch);
		   }
		   // ������ ������ ������ ����ϱ� - flush     : Buffered�� �׻� ���������� ��������� �� ä���� �ʾ������� �ұ��ϰ� �������� ������ ����ؾ��ϱ⶧��
		   bos.flush();
		   System.out.println("���۸� �̿��� ���� ����");
		   
		   
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		
			
			try {
				bis.close();   //  ���۵� Ŭ��� �ݵ�� �ؾ� ���ۿ� �ִ� ������ ���
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try{
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			try{
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
