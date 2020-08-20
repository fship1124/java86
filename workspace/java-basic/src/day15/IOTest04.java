package day15;

import java.io.FileOutputStream;

public class IOTest04 {
    public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
//			fos = new FileOutputStream("data/file_out.txt");
			fos = new FileOutputStream("data/file_out.txt", true);
			
			fos.write('��');
			fos.write(97);
			fos.write('b');   //�ڵ�����ȯ�� ��Ʈ�� char Ÿ���� �������ִ�
			fos.write(99);
			fos.write('��');
			
			System.out.println("���Ͽ� ���� ��� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
