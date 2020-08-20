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
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("data/a.txt");
			fos = new FileOutputStream("data/a2.txt");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while (true) {
				int ch = bis.read();
				if (ch == -1) break;
				bos.write(ch);
			}
			// ������ ������ ������ ����ϱ�
			bos.flush();
			System.out.println("���۸� �̿��� ���� ����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				bis.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
//			try {
//				bos.close();
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}



