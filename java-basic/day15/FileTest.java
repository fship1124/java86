package day15;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File f = new File("data/a/b/c");
		
		System.out.println(
				f.mkdirs() ? "���丮 ����" : "���� ����");
		/*
		System.out.println(
				f.mkdir() ? "���丮 ����" : "���� ����");
		*/
		
		
		/*
		File f = new File("data/file.txt");
//		System.out.println(f.exists());
		if (f.exists()) {
			// ���� ����� ���� �����ϱ�
			System.out.println(
					f.delete() ? "���� ����" : "���� ���� ����");
		}
		else {
			try {
				System.out.println(
						f.createNewFile() ? "���� ����" : "���� ����");
			} catch (IOException e) {
				System.out.println("���� ���� ����");
				e.printStackTrace();
			}
		}
		*/
	}
}





