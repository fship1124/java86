package day15.quiz;

import java.io.File;

public class Test02 {
	public static void main(String[] args) {
		// data ���丮 ������ ���ϵ��� ������ �Ʒ��� ���� ���
		/*
		 *   ������� >
		 *   
		 *   ���丮 : a
		 *   ���� : a.txt
		 *   ���� : file.txt
		 */
		File f = new File("data");
		String[] list = f.list();
		for (String name : list) {
			// name �� ������ File Ŭ���� �ʿ�
			File sub = new File(f, name);
			String type = "";
			if (sub.isFile()) {
				type = "����";
			} else if(sub.isDirectory()) {
				type = "���丮";
			} 
			System.out.println(type + " : " + name);
			
			/*
			if (sub.isFile()) {
				System.out.println("���� : " + name);
			} else if(sub.isDirectory()) {
				System.out.println("���丮 : " + name);
			} 
			*/
			System.out.println();
		}
	}
}










