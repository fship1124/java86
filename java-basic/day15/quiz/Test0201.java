package day15.quiz;

import java.io.File;

public class Test0201 {
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
		File[] list = f.listFiles();
		for (File sub : list) {
			String type = "";
			if (sub.isFile()) {
				type = "����";
			} else if(sub.isDirectory()) {
				type = "���丮";
			} 
			System.out.println(type + " : " + sub.getName());
		}
	}
}










