package day15.quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test0301 {
	public static void main(String[] args) {
		// ���� ���� �ϱ�
		// data/file.txt -> data/file_copy.txt
		FileInputStream fr = null;
		FileOutputStream fw = null;
		try {
			fr = new FileInputStream("data/test.avi");
			fw = new FileOutputStream("data/test_copy2.avi");
			
			long sTime = System.currentTimeMillis();
			
			byte[] buffer = new byte[32 * 1024];
			
			while (true) {
				int ch = fr.read(buffer);
				if (ch == -1) break;
				fw.write(buffer, 0, ch);
			}
			double time = (System.currentTimeMillis() - sTime) / 1000d;
			System.out.println("���翡 �ɸ� �ð�(��) : " + time);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}









