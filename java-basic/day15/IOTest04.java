package day15;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest04 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("data/file_out.txt");
			// ���� ���뿡 �߰�
//			fos = new FileOutputStream("data/file_out.txt", true);
			fos.write('��');
			fos.write(97);
			fos.write('b');
			fos.write(99);
			fos.write('��');
			System.out.println("���Ͽ� ���� ��� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}






